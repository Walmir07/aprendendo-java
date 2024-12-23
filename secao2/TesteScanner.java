package secao2;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {

        //Testando scanner        
        Scanner scanner = new Scanner(System.in);

        //Mensagem para o usuário entender oque precisa digitar
        System.out.println("Digite seu nome: ");

        //Resgata o valor do terminal
        String nome = scanner.nextLine();

        //Exibe o valor 
        System.out.println("Meu nome é " + nome + "!");

        //Exemplo com número

        System.out.println("Digite a sua idade: ");

        int idade = scanner.nextInt();

        System.out.println("Tenho " + idade + " anos");

        //Fechamento de scanner para evitar memory leak
        scanner.close();

         // 2 - Problema do nextLine

         System.out.println("Digite um número: ");

         int n = scanner.nextInt();
 
         scanner.nextLine();
 
         System.out.println("Digite um texto: ");
 
         String txt = scanner.nextLine();
 
         System.out.println("Os dados são, n = " + n + " e txt = " + txt);
 
 
         // Fechamento do scanner, para evitar memory leak
         scanner.close();

    }
}
