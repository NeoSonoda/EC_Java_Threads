public class App {
    public static void main(String[] args) throws Exception {
        do{

        var nome="";
        do{
        System.out.println("Digite o nome do livro");
        nome = System.console().readLine();
        limpaTela();
        }while (nome.intern().length()==0);

        var genero="";
        do{
        System.out.println("Digite o genero do livro");
        genero = System.console().readLine();
        limpaTela();
        }while (genero.intern().length()==0);

        var preco="";
        do{
        System.out.println("Digite o preço do livro");
        preco = System.console().readLine();
        limpaTela();
        } while (!preco.matches("[0-9]*"));

        logDeSucesso();

        System.out.println("Deseja fechar a aplicação?");
        var resposta = System.console().readLine();

        if(resposta.intern().toLowerCase() == "s")
            break;
        }while(true);
    }

    public static void logDeSucesso(){
        new Thread() {
          @Override
          public void run() {
            System.out.println("Cadastro realizado com sucesso");
          }
        }.start();
    }
    public static void limpaTela() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
