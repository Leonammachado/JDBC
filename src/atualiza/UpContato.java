package atualiza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class UpContato {
    public static void main(String[] args) {
           try {
               Connection mysql = DriverManager.getConnection(
               "jdbc:mysql://localhost/agenda",
               "root",
               "123456"
               );
               
               
              
          
            String sql = "update contato set nome = ?, "
                    + "endereco = ?, "
                    + "email = ? "
                    + "where idContato = ?";
            
            PreparedStatement instrucao = mysql.prepareStatement(sql);
            
            instrucao.setString(1, "Marlindo Lindo");
            instrucao.setString(2, "av. feliciano coelho, 322");
            instrucao.setString(3, "lindo.mar@gmail.com");
            instrucao.setInt(4, 4);
            
            int retorno = instrucao.executeUpdate();
            if (retorno > 0){
                System.out.println("Salvo!");
            }else{
                System.out.println("Não foi possível!");
            }
               
            
           }catch (SQLException e){
               System.out.println("Ocorreu um erro!");
               
           }
    }
}
