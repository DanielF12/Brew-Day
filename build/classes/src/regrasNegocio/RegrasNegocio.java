package regrasNegocio;

import armazenamentoDados.InterfaceMemoria;
import armazenamentoDados.Memoria;
import eda.*;

public class RegrasNegocio {
    
    static InterfaceMemoria MEM = Memoria.getInstance();
    
     public static Usuarios validarUsuario(String login, String senha){
        Usuarios u = MEM.getUsuario(login, senha);
        return u;
    }
     public static boolean cadastrar(Usuarios usuarios){
        boolean i = MEM.cadastrarUsuario(usuarios);
        return i;
    }
     
     public static boolean verificarCpf(String cpf){
         boolean c = MEM.procurarCpf(cpf);
         if(cpf.length() == 11 && !c){
             return true;
         }
         return false;
     }
    
}
