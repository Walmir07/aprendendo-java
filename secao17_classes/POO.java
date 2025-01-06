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

        // 3 - Métodos:

        fusca.aumentarVelocidade(10.0);
        
        fusca.ligarMotor(); //R: "Ligando motor..."
        fusca.ligarMotor(); //R: "O motor já está ligado!"

        // Somando velocidade:
        fusca.aumentarVelocidade(10.0);
        fusca.aumentarVelocidade(20.0);
        fusca.aumentarVelocidade(30.0);

    }
}
