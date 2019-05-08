package armazenamentoDados;

import eda.*;
import java.util.ArrayList;

public class Memoria implements InterfaceMemoria{
    static Memoria instancia = null;
    ArrayList<Usuarios> usuarios = new ArrayList();
    ArrayList<Receitas> receitas = new ArrayList();
    ArrayList<Receitas> rec = new ArrayList();
    
    private Memoria(){
        init();
    }
  
    private void init(){
        Ingredientes i = new Ingredientes(0,0,0,0," ");
        Ingredientes ii = new Ingredientes(1,1,1,1, " ");
        Usuarios us = new Usuarios("09615847933", "Bruna", "1234", this.receitas, i);
        Usuarios u = new Usuarios("00000000000", "Mario", "12345", this.rec, ii);
        
      
        usuarios.add(us);
        usuarios.add(u);
    }
    
    public static Memoria getInstance(){
        if (instancia == null) {
            instancia = new Memoria();
        }
        return instancia;
    }

    @Override
    public Usuarios getUsuario(String login, String senha) {
        for(Usuarios u : usuarios){
            if(u.getCpf().equals(login) && u.getSenha().equals(senha)){
                return u;
            }
        }
        return  null;
    }

    @Override
    public boolean cadastrarUsuario(Usuarios u) {
        usuarios.add(u);
        return true;
    }

    @Override
    public boolean procurarCpf(String cpf) {
        for(Usuarios u : usuarios ){
            if(u.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }
    
}
