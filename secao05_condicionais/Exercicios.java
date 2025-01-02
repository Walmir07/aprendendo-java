package secao05_condicionais;

import java.util.Scanner;

/*
    > Exercício 1: Verificação de Categoria de Preço

    Peça ao usuário para inserir o preço de um produto. 
    Se o preço for menor que 50, categorize-o como "Barato". 
    Se estiver entre 50 e 100, categorize como "Médio". 
    Se for maior que 100, categorize como "Caro". Exiba a categoria correspondente.
    
    > Exercício 2: Validação de Login

    Peça ao usuário para inserir um nome de usuário e uma senha. 
    Verifique se o nome de usuário é "admin" e a senha é "1234". 
    Se ambos forem corretos, exiba "Acesso permitido". 
    Caso contrário, exiba "Acesso negado".
    
    > Exercício 3: Identificação de Paridade com Strings

    Peça ao usuário para inserir um número. 
    Verifique se o número é par ou ímpar, e exiba a palavra "Par" ou "Ímpar". 
    Use uma string para armazenar o resultado e exibi-la.

    Depois de avaliar o número, tu vai colocar se é par ou impar em uma var.
    
    > Exercício 4: Identificação de Dia Útil

    Peça ao usuário para inserir um número de 1 a 7, 
    representando os dias da semana (1 para domingo, 2 para segunda, etc.). 
    Use switch para verificar se o dia é um dia útil (segunda a sexta) 
    ou final de semana (sábado e domingo). 
    Exiba uma mensagem correspondente.
    
    > Exercício 5: Verificação de Intervalo com AND

    Peça ao usuário para inserir um número. 
    Verifique se o número está no intervalo de 10 a 20, inclusive. 
    Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba "Fora do intervalo".
    
    > Exercício 6: Classificação de Letra

    Peça ao usuário para inserir uma letra. 
    Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante. 
    Exiba "Vogal" ou "Consoante" de acordo com a entrada. 
    Considere tanto letras maiúsculas quanto minúsculas.

    */

public class Exercicios {

    public static void main(String[] args) {
    
    //Exercício 1 - Verificação de Categoria de Preço

    Scanner scanner = new Scanner(System.in);

/*  System.out.println("Digite o proço do produto: ");
    double preco = scanner.nextDouble();

    if(preco < 50){
        System.out.println("Categoria: Barato");
    }
    else if(preco >= 50 && preco <= 100){
        System.out.println("Categoria: Médio");
    } else{
        System.out.println("Categoria: Caro");
    }
*/
    
    // Exercício 2 - Validação de Login

/*  System.out.println("Digite o nome de usuário: ");
    String nome = scanner.next();

    System.out.println("Digite a senha: ");
    String senha = scanner.next();

    if(nome.equals("admin") && senha.equals("1234")){
        System.out.println("Acesso permitido");
    } else{
        System.out.println("Acesso negado");
    }
*/

    // Exercício 3 - Identificação de Paridade com Strings

/*   System.out.println("Insira um número para verificação: ");
    int numero = scanner.nextInt();

    String resultado = "";

    if(numero % 2 == 0){
        resultado = "Par";
    } else {
        resultado = "Ímpar";
    }

    System.out.println("O número é: " + resultado);
*/      

    //Exercício 4: Identificação de Dia Útil

/*  System.out.println("Digite um número de 1 a 7 (Referente aos dias da semana | 1 - Domingo, 2 - Segunda, 3 - Terça, etc...).");

    int dia = scanner.nextInt();

    switch(dia){
        case 1:
            System.out.println("Domingo: É final de semana");
            break;
        case 2:
            System.out.println("Segunda: É um dia útil");
            break;
        case 3:
            System.out.println("Terça: É um dia útil");
            break;
        case 4:
            System.out.println("Quarta: É um dia útil");
            break;
        case 5:
            System.out.println("Quinta: É um dia útil");
            break;
        case 6:
            System.out.println("Sexta: É um dia útil");
            break;
        case 7:
            System.out.println("Sábado: É final de semana");
            break;
        default:
            System.out.println("Número inválido");
            break;
    }
*/

    //Exercício 5: Verificação de Intervalo com AND

/*  System.out.println("Insira um número para ver o intervalo");
    int num = scanner.nextInt();

    if(num >= 10 && num <= 20){
        System.out.println("Dentro do intervalo");
    } else {
        System.out.println("Fora do intervalo");
    }
*/

    // Exercício 6: Classificação de Letra

    System.out.println("Insira uma letra: ");
    char letra = scanner.next().toLowerCase().charAt(0);

    switch (letra) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("Vogal");
            break;
        default:
            System.out.println("Consoante");
    }


    scanner.close();

    }

}
