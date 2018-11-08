
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ItemVenda;
import model.Venda;


public class VendaDao extends DaoGenerico{
    
    
    public boolean incluir(Venda vendas) {
        String sql = "insert into vendas_capa (pg,valor,quantidade,data_venda) values (?,?,?,?)";
       try ( // prepared statement para inserção
                    PreparedStatement stmt = connection.prepareStatement(sql)) {
                
              // seta os valores
                stmt.setString(1, vendas.getFormaPagamento());
                stmt.setDouble(2, vendas.getValorTotal());
                stmt.setString(3, vendas.getSituacao());
                stmt.setDate(4, (Date) vendas.getDataVenda());
                
              // executa
                stmt.execute();
                return true;
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public List<Venda> read() {
               
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Venda> vendas = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM venda_capa");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Venda venda = new Venda();

                venda.setCodVenda(rs.getInt("codvenda"));
                venda.setFormaPagamento(rs.getString("pg"));
                venda.setValorTotal(rs.getDouble("valor"));
                venda.setDataVenda(rs.getDate("data_venda"));
                venda.setSituacao(rs.getString("situacao"));
                vendas.add(venda);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vendas;

    }
    public List<Venda> readForData(String data) {

                
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Venda> vendas = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM vendas_capa WHERE data_venda LIKE ?");
            stmt.setString(1, "%"+data+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Venda venda = new Venda();

                venda.setCodVenda(rs.getInt("codvenda"));
                venda.setFormaPagamento(rs.getString("pg"));
                venda.setValorTotal(rs.getDouble("valor"));
                venda.setDataVenda(rs.getDate("data_venda"));
                venda.setSituacao(rs.getString("situacao")); 
                vendas.add(venda);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return vendas;

    }
        
}
