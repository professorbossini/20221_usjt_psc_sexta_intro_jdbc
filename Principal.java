import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        //1. Cadastrar nova pessoa
        //2. Atualizar dados de uma pessoa
        //3. Remover uma pessoa
        //4. Listar todas as pessoas
        String menu = "1-Cadastrar\n2-Atualizar\n3-Remover\n4-Listar\n0-Sair";
        int op = -1;
        do{
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (op){
                    case 1:{
                        String nome = JOptionPane.showInputDialog("Nome?");
                        String fone = JOptionPane.showInputDialog("Fone?");
                        String email = JOptionPane.showInputDialog("E-mail?");
                        Pessoa p = new Pessoa(nome, fone, email);
                        p.inserir();
                        JOptionPane.showMessageDialog(null, "Cadastro OK");
                        break;
                    }
                    case 2:{
                        String nome = JOptionPane.showInputDialog("Nome?");
                        String fone = JOptionPane.showInputDialog("Fone?");
                        String email = JOptionPane.showInputDialog("E-mail?");
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código?"));
                        Pessoa p = new Pessoa(codigo, nome, fone, email);
                        p.atualizar();
                        JOptionPane.showMessageDialog(null, "Atualização OK");
                        break;
                    }
                    case 3:
                        break;
                    case 4:
                        break;
                    case 0:
                        break;
                    default:
                        break;
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente mais tarde");
                e.printStackTrace();
            }
        }while (op != 0);
    }
}
