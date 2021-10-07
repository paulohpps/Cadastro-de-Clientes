
package DAO;

import Engine.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class consultaDAO {
    public static ResultSet CarregarTabela() throws SQLException
    {
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement("SELECT ID, NOME, CPF, TELEFONE, SEXO, DATADENASCIMENTO, ENDERECO FROM CLIENTE");
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }
    public static ResultSet filtrar(String tipo, String arg) throws SQLException
    {
        String argumento= tipo+" "+"like '"+arg+"%'";
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement("SELECT ID, NOME, CPF, TELEFONE, SEXO, DATADENASCIMENTO, ENDERECO FROM CLIENTE WHERE " + argumento);
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }
}
