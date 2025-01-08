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

        // 4 - Criando propriedades:

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("João");
        System.out.println("O nome da pessoa 1 é: " + pessoa1.getNome());

        pessoa1.setIdade(25);
        System.out.println("A idade da pessoa 1 é: " + pessoa1.getIdade());

        // 5 - Getters e Setters:

        ContaBancaria ContaDaAna = new ContaBancaria();

        ContaDaAna.setTitular("Ana");

        ContaDaAna.setSaldo(1000);

        ContaDaAna.exibirInfo();

        System.out.println(ContaDaAna.getTitular());

        System.out.println(ContaDaAna.getSaldo());

        // 6 - Logica em get e set

        Produto camisa = new Produto();

        camisa.setNome("Camisa regata");

        System.out.println(camisa.getNome());

        camisa.setPreco(29.99999999999999);


    }
}
