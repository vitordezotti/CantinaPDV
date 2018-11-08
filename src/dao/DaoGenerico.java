package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoGenerico {

    protected Connection connection;

    public DaoGenerico() {
    	conectar();
    }
    
   /* public void conectar(){    
    if (connection == null){
         try {  
                Class.forName("com.mysql.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection
                	("jdbc:mysql://cantinadb.cantinadb.ck18prolmzbc.sa-east-1.rds.amazonaws.com:3306/CANTINADOALUNO","master","Cantina2018");
            } catch (ClassNotFoundException | SQLException ex) {
             System.out.println(ex);
        } 
    }
    }    */
    
    public void conectar(){    
    if (connection == null){
         try {  
                Class.forName("com.mysql.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection
                	("jdbc:mysql://cantinadb.c4qaigehu7wu.sa-east-1.rds.amazonaws.com:3306/CANTINADOALUNO","master","Cantina2018");
         System.out.println("OI");   
         } catch (ClassNotFoundException | SQLException ex) {
             System.out.println(ex);
        } 
    }
    }
    /*
    public void conectar(){    
    if (connection == null){
         try {  
             
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection
                                ("jdbc:postgresql://localhost/DB","postgres","root");
                	//("jdbc:mysql://localhost:3306/test","admin","root");
                        System.out.println("OI");   
            } catch (ClassNotFoundException | SQLException ex) {
             System.out.println(ex);
        } 
    }
    }*/

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
