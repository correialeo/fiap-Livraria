import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LivroService livroService = new LivroService();
        Scanner leitor = new Scanner(System.in);
        boolean finish = false;

        do {
            System.out.println("""
                    Digite 1 para cadastrar um livro
                    Digite 2 para remover um livro
                    Digite 3 para mostrar os livros existentes
                    Digite 4 para encerrar o programa
                    """);
            String resposta = leitor.nextLine();
            switch (resposta){
                case "1":
                    livroService.cadastrarLivro();
                    break;
                case "2":
                    livroService.removeLivro();
                    break;
                case "3":
                    livroService.mostrarLivros();
                    break;
                case "4":
                    finish = true;
                    break;
                default:
                    System.out.println("Comando inválido!");
                    break;

            }

        }while (!finish);
    }
}