package secao4_media;
import java.util.Scanner;

/* 
Obter nome do aluno e 3 notas
Exibir mensagem com nome e média final
Bônus: Se a nota for maior ou igual a 7, imprimir Aprovado, se não: Reprovado
*/

public class MediaAluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("O aluno " + nome + " obteve a média de: " + media);

        if(media > 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}
