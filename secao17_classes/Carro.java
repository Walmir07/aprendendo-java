package secao17_classes;

public class Carro {

    //Atributos ou propriedades:
    
    String marca;
    String modelo;
    int ano;

    //Métodos

    void acelerar(){
        System.out.println("O carro está acelerando");
    }

    void exibirInfo(){
        System.out.println("Marca: " + marca + ", modelo: " + modelo + ", ano: " + ano);
    }

}
