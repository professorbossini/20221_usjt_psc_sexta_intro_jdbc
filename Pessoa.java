import java.sql.Connection;
import java.sql.PreparedStatement;
public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;

    public Pessoa(String nome, String fone, String email){
        this.nome = nome;
        this.fone = fone;
        this.email = email;    
    }

    public void inserir() throws Exception{
        //1. Especificar o comando SQL
        String sql = "INSERT INTO tb_pessoas (nome, fone, email) VALUES (?, ?, ?)";
        //2. Abrir uma conexão com o SGBD
        Connection conexao = ConnectionFactory.getConnection();
        //3. Por meio da conexão, "preparar o comando"
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. Substituir eventuais placeholders
        ps.setString(1, nome);
        ps.setString(2, fone);
        ps.setString(3, email);
        //5. Executar o comando
        ps.execute();
        //6. Fechar os recursos
        ps.close();
        conexao.close();
    }
}
