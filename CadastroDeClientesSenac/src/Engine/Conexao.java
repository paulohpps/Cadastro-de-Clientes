package Engine;
//Imports
import java.sql.Connection; 
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException; 

public class Conexao {
    public Connection getConnection() {
        try {
            //Configuração da Conexão com Banco de Dados
            return DriverManager.getConnection("jdbc:mysql://localhost/CadastroDeClientes","root","1234");              
            }         
	catch(SQLException excecao) {
		throw new RuntimeException(excecao);
            }
     }
}
