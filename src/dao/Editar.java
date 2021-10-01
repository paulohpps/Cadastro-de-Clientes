
package dao;

import factory.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;
import modelo.UsuarioAtualizar;


public class Editar {
    UsuarioAtualizar objuser = new UsuarioAtualizar();
public boolean Atualizar(UsuarioAtualizar objuser) throws SQLException
    {
        ConnectionFactory conexao = new ConnectionFactory();
        int registros;
        try(PreparedStatement pstmt = conexao.getConnection().prepareStatement("UPDATE usuario set nome = ?, cpf = ?, email = ?, telefone = ? where id = ?"))
        {
            pstmt.setString(1, objuser.getNome().trim());
            pstmt.setString(2, objuser.getCpf().trim());
            pstmt.setString(3, objuser.getEmail().trim());
            pstmt.setString(4, objuser.getTelefone().trim());
            pstmt.setString(5, objuser.getId().trim());
            
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
