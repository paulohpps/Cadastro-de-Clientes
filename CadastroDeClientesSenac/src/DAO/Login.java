
package DAO;

import Engine.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login {
    Conexao conexao = new Conexao();
   public boolean logins(String login, String senha)
   {
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    boolean check = false;
    
    try
    {
        stmt = conexao.getConnection().prepareStatement("SELECT * FROM USUARIO WHERE LOGIN = ? AND SENHA = ?");
        stmt.setString(1, login);
        stmt.setString(2, senha);
        rs = stmt.executeQuery();
        
        if(rs.next())
        {
            check = true;
        }
        
    }
    catch(SQLException error)
    {
        JOptionPane.showMessageDialog(null, "Error: "+ error);
    } 
  
    return check;
   }
}
