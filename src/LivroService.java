import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivroService {
    Livro entity = new Livro();
    List<Livro> livros = new ArrayList<>();
    Scanner leitor = new Scanner(System.in);

    public void cadastrarLivro(){
        System.out.println("Qual o nome do livro que deseja registrar?");
        String livro = leitor.nextLine();
        System.out.println("Qual o autor do livro?");
        String autor = leitor.nextLine();
        System.out.println("Qual o resumo do livro?");
        String resumo = leitor.nextLine();
        System.out.println("Qual o valor desse livro?");
        Double valor = leitor.nextDouble();
        livros.add(new Livro(livro, autor, resumo, valor));
    }

    public void removeLivro(){
        System.out.println("Qual o nome do livro que você deseja remover?");
        String nomeARemover = leitor.nextLine();
        livros.removeIf(x -> x.getNome().equals(nomeARemover));
    }

    public void mostrarLivros(){
        livros.forEach(x-> System.out.println(x.getNome() + "\n"+ x.getAutor()
                + "\n"+ x.getResumo() + "\n" + x.getValor()));
    }
}
