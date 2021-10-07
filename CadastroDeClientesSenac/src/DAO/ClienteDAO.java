
package DAO;
//Imports
import Engine.Conexao;
import Modelos.cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClienteDAO {
    //objetos
    cliente objCli = new cliente();
    
    public int CadastrarClientes(cliente objCli) throws SQLException
    {
        Conexao conexao = new Conexao();
        
        int registros;
        //Adicinar Cliente Cadastrado ao Banco de Dados
        try(PreparedStatement stmt = conexao.getConnection().prepareStatement("INSERT INTO CLIENTE(NOME, CPF, TELEFONE, SEXO, DATADENASCIMENTO, ENDERECO) VALUES (?,?,?,?,?,?)"))
        {
           stmt.setString(1, objCli.getNome().trim());
           stmt.setString(2, objCli.getCPF().trim());
           stmt.setString(3, objCli.getTelefone().trim());
           stmt.setString(4, objCli.getSexo().trim());
           stmt.setString(5, objCli.getDataDeNascimento().trim());
           stmt.setString(6, objCli.getEndereco().trim());
           
           registros = stmt.executeUpdate();
        }
        PreparedStatement stmtAux = conexao.getConnection().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = stmtAux.executeQuery();
        int codigo = 0;
        if((registros ==1)&& (rs != null))
        {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        }
        else
        return codigo;
    }
}
