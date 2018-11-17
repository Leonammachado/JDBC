package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



public class DeletarContato {
    public static void main(String[] args) {
        try{
            Connection mysql = DriverManager.getConnection(
            "jdbc:mysql://localhost/agenda",
            "root",
            "123456"
            
            );
           
         
            String sql = "delete from contato where idContato = 3";
            PreparedStatement del = mysql.prepareStatement(sql);
            
            del.execute();
            
            System.out.println("Registro deletado!");
            
        }catch(SQLException e){
            System.out.println("Ocorreu um erro!");
            throw new RuntimeException(e.getMessage());
        }
    }
}
