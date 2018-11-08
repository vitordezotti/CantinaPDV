
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Venda;


public class VendaDao extends DaoGenerico{
    
    
    public boolean incluir(Venda vendas) {
        String sql = "insert into venda_capa (totalvenda, codaluno) values (?,?)";
       try ( // prepared statement para inserção
                    PreparedStatement stmt = connection.prepareStatement(sql)) {
                
              // seta os valores
    	   		stmt.setDouble(1, vendas.getTotalVenda());
                stmt.setInt(2, vendas.getCodAluno());
               
                
              // executa
                stmt.execute();
                return true;
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
//    public List<Venda> read() {
//               
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        List<Venda> vendas = new ArrayList<>();
//
//        try {
//            stmt = connection.prepareStatement("SELECT * FROM venda_capa");
//            rs = stmt.executeQuery();
//
//            while (rs.next()) {
//
//                Venda venda = new Venda();
//
//                venda.setCodVenda(rs.getInt("codvenda"));
//                venda.setFormaPagamento(rs.getString("pg"));
//                venda.setValorTotal(rs.getDouble("valor"));
//                venda.setDataVenda(rs.getDate("data_venda"));
//                venda.setSituacao(rs.getString("situacao"));
//                vendas.add(venda);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return vendas;
//
//    }
//    public List<Venda> readForData(String data) {
//
//                
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        List<Venda> vendas = new ArrayList<>();
//
//        try {
//            stmt = connection.prepareStatement("SELECT * FROM vendas_capa WHERE data_venda LIKE ?");
//            stmt.setString(1, "%"+data+"%");
//            
//            rs = stmt.executeQuery();
//
//            while (rs.next()) {
//
//                Venda venda = new Venda();
//
//                venda.setCodVenda(rs.getInt("codvenda"));
//                venda.setFormaPagamento(rs.getString("pg"));
//                venda.setValorTotal(rs.getDouble("valor"));
//                venda.setDataVenda(rs.getDate("data_venda"));
//                venda.setSituacao(rs.getString("situacao")); 
//                vendas.add(venda);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//        return vendas;
//
//    }
        
}
