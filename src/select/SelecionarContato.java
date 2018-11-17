package select;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelecionarContato {
     public static void main(String[] args) {
               
         try {
            Connection mysql = DriverManager.getConnection(
            "jdbc:mysql://localhost/agenda",
            "root",
            "123456"
            );
            
         
          
          Statement contato = mysql.createStatement();
          
          
          String sql = "select * from contato";
          ResultSet result = contato.executeQuery(sql);
          
          while(result.next()) {
            
            System.out.println("" + result.getInt("id_contato"));
            System.out.println("Nome: " + result.getString("nome"));
            System.out.println("Endereço: " + result.getString("endereco"));
            System.out.println("E-mail: " + result.getString("email"));
            
        }
            }catch(SQLException e){
             System.out.println("Ocorreu um erro!");
            
            }
        }
    }

