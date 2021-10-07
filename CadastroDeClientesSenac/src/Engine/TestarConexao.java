
package Engine;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TestarConexao {
    public static void main(String[] args) throws SQLException {
        //Sucesso ao Conectar
        try
        {
            Connection connection = new Conexao().getConnection();
            JOptionPane.showMessageDialog(null,"Conexão aberta!");
            connection.close();
        }
        //Erro ao Conectar
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(null,"Conexão Falhar!: " + error);  
        }
     }
}
