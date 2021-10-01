package dao;
import com.sun.xml.internal.ws.wsdl.writer.UsingAddressing;
import factory.ConnectionFactory;
import java.awt.List;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
public class UsuarioDAO { 
    Usuario objuser = new Usuario();
  
    public int CadastrarUsuarios(Usuario objuser) throws SQLException
    {
        ConnectionFactory conexao = new ConnectionFactory();
        int registros;
        try(PreparedStatement pstmt = conexao.getConnection().prepareStatement("INSERT INTO usuario (nome, cpf, email, telefone) VALUES (?, ?, ?, ?)"))
        {
            pstmt.setString(1, objuser.getNome().trim());
            pstmt.setString(2, objuser.getCpf().trim());
            pstmt.setString(3, objuser.getEmail().trim());
            pstmt.setString(4, objuser.getTelefone().trim());
            
            registros = pstmt.executeUpdate();
        }
        PreparedStatement pstmtAux = conexao.getConnection().prepareStatement("Select @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;
        
        if((registros ==1)&& (rs != null))
        {
        rs.next();
        codigo = rs.getInt(1);
        return codigo;
        }
        else{
        return codigo;
        }
    }
    
    
    
}