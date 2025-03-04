package secao08_funcoes;

public class Funcoes {
    public static void main(String[] args) {

        // 1 - Criando a primeira função

        // Deve nomear tanto funções, quanto variáveis

        saudacao();
        saudacao();
        saudacao();

        
        // 2 - Funções com parâmetros

        soma(2, 4);
        soma(8, 12);

        saudar("Matheus");

        // 3 - Funções com return

        dobrar(4);

        int numero = 10;

        int numeroDobrado = dobrar(numero);

        System.out.println("O numero dobrado é: " + numeroDobrado);

        System.out.println(dobrar(12));

        // 4 - Funções com retorno em variável

        String r1 = verificarPar(numero);

        String r2 = verificarPar(3);

        System.out.println(r1);

        System.out.println(r2);

        int x = dobrar(soma2(2, 4));

        System.out.println(x);

    }


    //Declaração de função:

    // public: Nível de acesso
    // static: Não preciso instanciar classe para executar
    // tipo de retorno: String, int, double, etc.
    // nome da função
    // parentesis (): define os parâmetros de argumentos
    // bloco {}: Onde será implementado o código da função
    // return: O resultado que será retornado pela função, presente no bloco 

    // Exemplo 1 - Criação

    public static void saudacao() {

        System.out.println("Olá, esta é a minha primeira função!");

    }

    // Exemplo 2 - Funções com parâmetros

    public static void soma(int a, int b) {
        int resultado = a + b;    
        System.out.println("O resultado da soma é: " + resultado);
    }

    public static void saudar(String nome) {

        System.out.println("Olá, " + nome + ", tudo bem?");

    }

    // 3 - Funções com return

    // Os parametros de funcoes diferentes podem ter o mesmo nome

    public static int dobrar(int n) {
        return n * 2;
    }

    public static String verificarPar(int n) {
        if(n % 2 == 0) {
            return "O numero " + n + " é par!";
        } else {
            return "O numero " + n + " NÃO é par!";
        }
    }

    // Exemplo 4 - Funções com retorno em variável

    public static int soma2(int a, int b) {
        return a + b;
    }
}
