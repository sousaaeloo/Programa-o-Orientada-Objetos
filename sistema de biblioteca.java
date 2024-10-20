package POO;

import java.util.ArrayList;
import java.util.List;

class Livro{
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void exibirInfo(){
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Ano de Publicação: " + anoPublicacao);
    }
}
class Bibliotec{
    private List<Livro> listaLivros;

    public Bibliotec(){
        listaLivros =  new ArrayList<>();
    }
    public void adicionarLivro(Livro livro){
        listaLivros.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' adicionando com sucesso!");
    }
    public void removerLivro(String titulo){
        Livro removerLivro = null;
        for (Livro livro : listaLivros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                removerLivro = livro;
                break;
            }
        }
        if (removerLivro != null){
            listaLivros.remove(removerLivro);
            System.out.println("Livro '" + titulo + "' removido com sucesso!");
        }else{
            System.out.println("Livro '" + titulo + "' não encontrado");
        }
    }
    public void listarLivros(){
        if (listaLivros.isEmpty()){
            System.out.println("Nenhum livro disponível na biblioteca");
        }else{
            System.out.println("\nLista de Livros Disponíveis: \n");
            for (Livro livro : listaLivros){
                livro.exibirInfo();
            }
        }
    }
    public void buscarPorAutor(String autor){
        boolean encontrou = false;
        System.out.println("Livros do autor '" + autor + "': ");
        for (Livro livro : listaLivros){
            if (livro.getAutor().equalsIgnoreCase(autor)){
                livro.exibirInfo();
                encontrou = true;
            }
        }
        if (!encontrou){
            System.out.println("Nenhum livro encontrado do autor '" + autor + "'");
        }
    }
}
public class Biblioteca {
    public static void main(String[] args) {
        Bibliotec b1 = new Bibliotec();

        b1.adicionarLivro(new Livro("Daisy Jones and The Six", "Taylor Jenkins", 2019));
        b1.adicionarLivro(new Livro("Melhor que nos filmes", "Lynn Painter", 2023));
        b1.adicionarLivro(new Livro("Leitura de Verão", "Emily Henry", 2023));
        b1.adicionarLivro(new Livro("Jantar Secreto", "Raphael Montes", 2019));

        b1.listarLivros();
        b1.buscarPorAutor("Lynn Painter");
        b1.removerLivro("Jantar Secreto");
        b1.listarLivros();
    }
}
