package secao2;

public class Exercicios {
    /*   
    EXERCÍCIO 1:

    Crie uma variável int para armazenar o valor 10. 
    Crie uma segunda variável int que armazene o dobro do valor da primeira variável
    usando operadores aritméticos. 
    Exiba o resultado.

    EXERCÍCIO 2:

    Declare uma variável char que armazene a letra 'B'. 
    Faça o casting explícito dessa variável para int e exiba o valor numérico correspondente.

    EXERCÍCIO 3:

    Declare duas variáveis double para armazenar os valores 15.75 e 20.40. 
    Some os valores dessas variáveis e armazene o resultado em uma nova variável double. 
    Exiba o resultado.

    EXERCÍCIO 4:

    Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000). 
    Em seguida, declare uma variável int e faça o casting explícito do valor long para int. 
    Exiba o resultado.

    EXERCÍCIO 5:

    Escreva um programa que crie uma variável String com o valor "Olá, Mundo!". 
    Em seguida, crie outra variável String que concatene a primeira variável com o texto 
    " Bem-vindo ao Java!". 
    Exiba o resultado.

 */

    public static void main(String[] args) {
        
        // Exercicio 1:

        int var = 10;
        int var2 = var * 2;
        
        System.out.println(var2);

        // Exercício 2

        char letraChar = 'B';
        int valorAscii = (int) letraChar;

        System.out.println(valorAscii);

        // Exercício 3

        double valor1 = 15.75;
        double valor2 = 20.40;
        double soma = valor1 + valor2;

        System.out.println(soma);

        // Exercício 4

        long valorAlto = 2_000_000_000L;
        int castValorAlto = (int) valorAlto;

        System.out.println(castValorAlto);

        // Exercício 5

        String frase = "Olá, Mundo!";
        String fraseConcat = frase + " Bem vindo ao Java!";

        System.out.println(fraseConcat);

    }
}
