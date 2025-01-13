package secao17_poo;

public class Carro {

    //Atributos ou propriedades:
    
    String marca;
    String modelo;
    int ano;

    double velocidadeAtual = 0;
    boolean motorLigado = false;

    //Métodos

    void acelerar(){
        System.out.println("O carro está acelerando");
    }

    void exibirInfo(){
        System.out.println("Marca: " + marca + ", modelo: " + modelo + ", ano: " + ano);
    }

    // 3 - Métodos:

    void ligarMotor(){
        if(!motorLigado){
            motorLigado = true;
            System.out.println("Ligando motor...");
        } else {
            System.out.println("Motor já está ligado!");
        }
    }

    void aumentarVelocidade(double incremento){
        if(motorLigado){
            velocidadeAtual += incremento;
            System.out.println("A velocidade atual é: " + velocidadeAtual);
        } else {
            System.out.println("Primeiro precisa ligar o motor.");
        }
    }

}
