
package DAO;

import Engine.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelos.cliente;



public class Editar {
    cliente objCli = new cliente();
public boolean Atualizar(cliente objCli) throws SQLException
    {
        Conexao conexao = new Conexao();
        int registros;
        try(PreparedStatement pstmt = conexao.getConnection().prepareStatement("UPDATE cliente set nome = ?, telefone = ?, ENDERECO = ? where id = ?"))
        {
            pstmt.setString(1, objCli.getNome().trim());
            pstmt.setString(3, objCli.getEndereco().trim());
            pstmt.setString(2, objCli.getTelefone().trim());
            String ids = "" + objCli.getId();
            pstmt.setString(4, ids);
            
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
