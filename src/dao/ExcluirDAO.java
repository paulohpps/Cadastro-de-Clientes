
package dao;

import factory.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.UsuarioAtualizar;


public class ExcluirDAO {
public boolean Excluir(String id) throws SQLException
    {
        ConnectionFactory conexao = new ConnectionFactory();
        int registros;
        try(PreparedStatement pstmt = conexao.getConnection().prepareStatement("Delete FROM usuario where id = "+ id))
        {
            
            registros = pstmt.executeUpdate();
        }
           if(registros == 1)
           {
               return  true;
           }
           else
           {
               return  false;
           }
    }
}
