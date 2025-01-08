package secao17_classes;

public class Livro {
    
    private String titulo;
    private String autor;
    private double preco;

    // Fallback
    public Livro() {
        this.titulo = "Título teste";
        this.autor = "Autor";
        this.preco = 16.99;
    }

    // Override
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", preço: " + preco);
    }

}
