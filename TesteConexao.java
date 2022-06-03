import java.sql.Connection;
import java.sql.DriverManager;
public class TesteConexao{
    public static void main(String[] args) {
        //try/catch
        try{
            Connection minhaConexao = DriverManager.getConnection(
                //String de conexão
                "jdbc:mysql://localhost:3306/20221_usjt_psc_sexta_pessoas",
                "root",
                "11234"    
            );
            System.out.println("Conexão OK!");
            minhaConexao.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Conexão OK");
        }
    }
}