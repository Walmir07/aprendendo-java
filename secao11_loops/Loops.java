package secao11_loops;

public class Loops {
    
    public static void main(String[] args) {
        
        // 1 - For

        // loop que vai rodar de 1 a 5:

        // Variavel de inicializacao = i, j, k.
        // Condição -> determina até quando ou quantas vezes, o loop vai rodar.
        // incremento -> a variável vai chegar na condição.

        for(int i = 1; i <= 5; i++) {
            System.out.println("Contador: " + i);
        } 

        // Mostrar cada caractere de uma string:

        String palavra = "Java";

        for(int i = 0; i < palavra.length(); i++) {
            System.out.println("Caractere: " + palavra.charAt(i));
        }

        // Contagem regressiva:

        for(int i = 5; i > 0; i--) {
            System.out.println("Contador: " + i);
        }

        // 2 - While

        int i = 0;

        while(i <= 5) {
            System.out.println("While contador: " + i);
            i++;
        }
        
        // Teste de loop infinito até chegar ao 7 aleatóriamente:

        int valor = 0;

        while(valor != 7) {

            valor = (int)(Math.random() * 100);

            System.out.println("Valor aleatorio: " + valor);

        }

        // 3 - loop infinito

        // while(true) {
        //     System.out.println("Infinito!");
        // }

        // for(int j = 0; j <= 5; j--) {
        //     System.out.println(j);
        // }

        // 4 - do while

        int j = 10;

        do {

            System.out.println("O valor de j é: " + j);

            j--;
        } while(j > 0);

        int numero = 0;

        do {

            numero = (int)(Math.random() * 10);

            System.out.println("numero aleatorio: " + numero);

        } while (numero != 1);

        // 5 - Break

        for(int x = 0; x <= 10; x++) {

            System.out.println("O valor de x é: " + x);

            if(x == 5) {
                System.out.println("Parando o loop!");
                break;
            }

        }

        // 6 - continue

        for(int x = 10; x > 0; x--) {

            System.out.println("teste");

            if(x % 2 == 0) {
                System.out.println("par!");
                continue;
            }

            // Quando ele pula, isso aqui nao executa

            System.out.println("Contador: " + x);

        }

        // 7 - Nested loops

        for(int m = 1;  m <= 3; m++) {

            System.out.println("EXTERNO!");

            for(int n = 1; n <= 3; n++) {

                System.out.println(m + " x " + n + " = " + (m * n));

            }

        }

        // 8 - Padrão de estrelas

        for(int o = 1; o <= 10; o++) {

            for(int p = 1; p <= o; p++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
