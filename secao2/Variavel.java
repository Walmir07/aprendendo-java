package secao2;

public class Variavel {
    public static void main(String[] args) {

        //Declaração de variáveis

        String nome = "Walmir";
        String nome2 = "Pedro";
        System.out.println(nome);
        System.out.println("A variável nome2 é " + nome2);

        //Declaração de variável com valor de outra

        String teste = "Isso é um teste";
        String testando = teste;
        
        System.out.println(teste); // Teste com variável normal
        System.out.println(testando); // Teste com variável com valor de outra variável

        // Testando alguns tipos numéricos

        int numero = 2147483647; // int só suporta de -2147483648 a 2147483647;
        byte numeroPequeno = 127; // byte só suporta de -128 a 127
        long numeroGrande = 999999999; // long é um dos tipops que mais suporta

        System.out.println(numero);
        System.out.println(numeroPequeno);
        System.out.println(numeroGrande);

        // 4 - Strings

        String firstName = "Walmir";
        String lastName = "Lima";

        System.out.println("Walmir Lima");

        System.out.println(firstName + " " + lastName);

        System.out.println("Meu nome é: " + firstName);

        String fullName = firstName + " " + lastName;

        System.out.println("Meu nome completo é: " + fullName);

        // 5 - char

        char letra = 'A'; // Deve usar aspas simples e não duplas
        char num = '7';
        char simbolo = '$';

        System.out.println(letra);
        System.out.println(num);
        System.out.println(simbolo);

        // 6 - int

        int valor = 15;

        System.out.println(valor);
        System.out.println(valor * 2);

        int soma = valor + 18;

        System.out.println(soma);

        // 7 - long

        long populacaoMundial = 8000000000L;
        long numSublinhado = 1_000_000_000;
        
        //Teste com long

        System.out.println(populacaoMundial + 1);
        System.out.println(numSublinhado * 5);

        // 8 - double

        double preco = 19.99;

        System.out.println(preco - 10);

        double pi = 3.141_592_123;

        System.out.println(pi);

        double valorComD = 15.99D;

        System.out.println(valorComD);

        // Operadores aritméticos:

        System.out.println(10 + 2);

        System.out.println(100 - 25);

        System.out.println(70 * 3);

        System.out.println(45.5 / 2);

        System.out.println(10 % 3);

        // Operadores aritméticos parte 2
        
        //Incremento
        int x = 10;

        x++;
        x++;
        x++;

        System.out.println(x);

        //Decremento

        int y = 15;

        y--;
        y--;
        y--;

        System.out.println(y);

        //Atribuição aditiva
        int  z = 20;

        z += 25;

        System.out.println(z);

        //Atribuição subtrativa
        int a = 50;

        a -= 20;

        System.out.println(a);

        // Type casting:

        //Implicito (widening)

        int numero2 = 42;

        long numeroLong = numero2;
        double numeroDouble = numero2;

        System.out.println(numeroLong);
        System.out.println(numeroDouble);

        //Explícito (Narrowing)

        double valorDouble = 9.72;

        int valorInt = (int) valorDouble;

        System.out.println(valorInt);

        // Casting de char para int 

        char valorChar = 'A';

        int codigoAscii = (int) valorChar;

        System.out.println(codigoAscii);

        // 12 - Constantes

        final int DIAS_DA_SEMANA = 7;
        final int MESES_DO_AN0 = 12;

        System.out.println(DIAS_DA_SEMANA);
        System.out.println(MESES_DO_AN0);

        // 13 - var

        var testeVar = 15;

        //testeVar = "Texte com texto" : Erro, pois com var só pode mudar o valor se for do mesmo tipo.

        testeVar = 10;



        System.out.println(testeVar);


    }
}
