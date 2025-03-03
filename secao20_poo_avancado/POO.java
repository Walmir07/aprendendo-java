package secao20_poo_avancado;

public class POO {
    public static void main(String[] args) {
        
        // 1 - Object Composition
        Motor motor1 = new Motor("V8", 450);

        Carro carro1 = new Carro("Ford", "Mustang", motor1);

        carro1.exibirInfo();

        carro1.motor.exibirInfo();

    }
}
