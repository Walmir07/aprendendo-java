package secao8;
import java.lang.Math;

public class FuncoesBuiltIn {
    public static void main(String[] args) {
        
        // 10 - Funções built in de string:

        String frase = "Java é muito legal";

        //length: Retorna o comprimento.
        System.out.println(frase.length());

        //substring: Extrai uma sequência da String.
        System.out.println(frase.substring(0, 4));

        //toUpperCase: Converte todos os caracteres em maiúculo. 
        System.out.println(frase.toUpperCase());

        //toLowerCase: Converte todos os caracteres em minúculo. 
        System.out.println(frase.toLowerCase());

        //replace: Substitui caracteres específicos por outros.
        System.out.println(frase.replace("a", "e"));

        //Atribuição de com variável modificada:
        String fraseModificada = frase.toUpperCase();
        System.out.println(fraseModificada);

        // 11 - Funções built in em números (Math):

        //Math.sqrt(): Raiz quadrada.
        System.out.println(Math.sqrt(30));
        System.out.println(Math.sqrt(25));

        //Math.pow: Eleva um número a á potência b.
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, 3));

        //Matn.abs(): Retorna o valor absoluto de um número.
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));

        //Math.max(): Retorna o maior de dois números.
        System.out.println(Math.max(15, 50));
        System.out.println(Math.max(150, 10));

        double raizQuadrada = Math.sqrt(25);
        System.out.println("A raiz quadrada de 25 é: " + raizQuadrada);
    }
}
