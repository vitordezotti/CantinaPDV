package dao;

import model.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao extends DaoGenerico{
        
    public boolean checkLogin(String login, String senha) throws SQLException {
        //inicia o result set com null
        ResultSet rs = null;
        Statement st = null;
        //variável que controla se o login é valido ou não
        boolean check = false;
        conectar();
        String sql = "SELECT nome, senha FROM funcionarios WHERE nome like '" +login+"' AND senha like '"+senha+"';";
        try {
        
       // System.out.println(sql);
        st = connection.createStatement();
        rs = st.executeQuery(sql);
        List<Funcionario> func = new ArrayList(); 

        //verifica o retorno do banco de dados
        if (rs.next()) {
                check = true;
            }            
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            check = false;
        }
        //System.out.println(check);
       return check;
    }    
}
