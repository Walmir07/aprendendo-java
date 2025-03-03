package secao20_poo_avancado;

public class POO {
    public static void main(String[] args) {
        
        // 1 - Object Composition:

        Motor motor1 = new Motor("V8", 450);

        Carro carro1 = new Carro("Ford", "Mustang", motor1);

        carro1.exibirInfo();

        carro1.motor.exibirInfo();

        // 2 - Herança:

        Cachorro turca = new Cachorro("Turca");

        turca.latir();

        turca.emitirSom();

        Animal leao = new Animal("Shark");

        leao.emitirSom();

        // a subclasse tem acesso a tudo da classe superclasse
        // e a superclasse NAO tem acesso a classe filha

        // 3 - Classe Object:
        
        Pessoa matheus = new Pessoa("Matheus", 33);
        Pessoa pedro = new Pessoa("Pedro", 20);

        System.out.println(matheus.toString());

        System.out.println(matheus.equals(pedro));

        System.out.println(matheus.hashCode());

    }
}
