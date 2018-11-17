package inserir;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InserirContatos {
    public static void main(String[] args) {
        String conexao = "valor";
        
        try{
       
            Connection mysql = DriverManager.getConnection(
            "jdbc:mysql://localhost/agenda",
            "root",
            "123456"
  
            );
            
            
            
            String sql = "insert into contato," +
            "(nome, endereco, email)," + 
            "values (?, ?, ?)";
            
            PreparedStatement instrucao = mysql.prepareStatement(sql);
                mysql.prepareStatement(sql);
                
                instrucao.setString(1, "Pedro cookie");
                instrucao.setString(2, "av. fab, 60");
                instrucao.setString(3, "pedrocookie@gmail.com");
                
                instrucao.setString(1, "Leonam Machado");
                instrucao.setString(2, "av. fab, 1144");
                instrucao.setString(3, "leonam@gmail.com.br");
                
                instrucao.setString(1, "Mayane cookie");
                instrucao.setString(2, "renascer");
                instrucao.setString(3, "may@uol.com");
                
                instrucao.setString(1, "Bruna ");
                instrucao.setString(2, "infraero 2, 800");
                instrucao.setString(3, "bruninha@uol.gmail.outlook.br");
                
         
                instrucao.execute();
                
               
               
        }catch(SQLException e){
            System.out.println("Ocorreu um erro!");
            throw new RuntimeException(e.getMessage());
        }
    }
    
}
