package armazenamentoDados;

import eda.*;

public interface InterfaceMemoria {
    public Usuarios getUsuario(String login, String senha);
    public boolean cadastrarUsuario(Usuarios u);
    public boolean procurarCpf(String cpf);

    
}
