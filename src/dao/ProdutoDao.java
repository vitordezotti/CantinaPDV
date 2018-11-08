
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;

public class ProdutoDao extends DaoGenerico{

    public ProdutoDao() {
        conectar();
    }

        
       public List<Produto> read() {
               
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodProduto(rs.getInt("codprod"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getFloat("preco"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;

    }
    public List<Produto> readForDesc(String desc) {

                
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM produtos WHERE descricao LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodProduto(rs.getInt("codprod"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getFloat("preco"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return produtos;

    }
    
    public List<Produto> readForCodigo(int cod) {

                
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM produtos WHERE codprod LIKE ?");
            stmt.setString(1, "%"+cod+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodProduto(rs.getInt("codprod"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getFloat("preco"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return produtos;

    }
    
    
        public boolean incluir(Produto produtos) {
            String sql = "insert into produtos (descricao,preco,codprod) values (?,?,?)";
            try ( // prepared statement para inserção
                      PreparedStatement stmt = connection.prepareStatement(sql)) {

                   // seta os valores
                     stmt.setString(1, produtos.getDescricao());
                     stmt.setFloat(2, produtos.getPreco());
                     stmt.setInt(3, produtos.getCodProduto());

                   // executa
                     stmt.execute();
                     return true;

             } catch (SQLException e) {
                 System.out.println(e.getMessage());
                 return false;
             }
         }
    
     public boolean alterar(Produto produtos) {
        String sql = "update produtos set descricao = ? ,preco = ?  where codprod = ?";
       try ( // prepared statement para inserção
                PreparedStatement stmt = connection.prepareStatement(sql)) {
               
              // seta os valores
                stmt.setString(1, produtos.getDescricao());
                stmt.setFloat(2, produtos.getPreco());
              //stmt.setInt(3, produtos.getCodProduto());
                
              // executa
                stmt.execute();
                return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
     
      public boolean excluir(Produto produtos) {
        String sql = "delete from produtos where codprod = ?";
       try ( // prepared statement para inserção
                PreparedStatement stmt = connection.prepareStatement(sql)) {
                // seta os valores
                stmt.setInt(1, produtos.getCodProduto());
                
                // executa
                stmt.execute();
                return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
