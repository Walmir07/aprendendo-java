package secao17_classes;

public class Produto {
    private String nome;
    private double preco;

    // REGRA DE NEGOCIOS = CÓDIGO
    // É como a empresa define que o software vai funcionar
    public void setNome(String nome) {

        if(nome != null && !nome.isEmpty() && nome.length() > 3) {
            this.nome = nome;
        } else {
            System.out.println("O nome enviado não atende os critérios.");
        }

    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setPreco(double preco) {
        if(preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço precisa ser positivo.");
        }
    }

    public String getPreco() {
        return String.format("R$%.2f", preco);
    }
}
