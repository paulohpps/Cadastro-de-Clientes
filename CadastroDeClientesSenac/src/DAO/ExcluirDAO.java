
package DAO;

import Engine.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ExcluirDAO {
public boolean Excluir(String id) throws SQLException
    {
        Conexao conexao = new Conexao();
        int registros;
        try(PreparedStatement pstmt = conexao.getConnection().prepareStatement("Delete FROM cliente where id = "+ id))
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
