
package dao;

import factory.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory;


public class consultaDAO {
    public static ResultSet CarregarTabela() throws SQLException
    {
        ConnectionFactory conexao = new ConnectionFactory();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement("SELECT ID, NOME, CPF, EMAIL, TELEFONE FROM USUARIO");
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }
    public static ResultSet filtrar(String tipo, String arg) throws SQLException
    {
        String argumento= tipo+" "+"like '"+arg+"%'";
        ConnectionFactory conexao = new ConnectionFactory();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement("SELECT ID, NOME, CPF, EMAIL, TELEFONE FROM USUARIO where " + argumento);
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }
}
