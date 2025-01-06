package secao17_classes;

public class POO {
    public static void main(String[] args) {
        
        Carro fusca = new Carro();

        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.ano = 1964;

        fusca.acelerar();
        fusca.exibirInfo();

        Carro celta = new Carro();

        celta.marca = "Chevrolet";
        celta.modelo = "Celta";
        celta.ano = 2010;

        celta.acelerar();
        celta.exibirInfo();

    }
}
