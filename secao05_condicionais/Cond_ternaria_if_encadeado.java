package secao05_condicionais;

public class Cond_ternaria_if_encadeado {

    public static void main(String[] args) {
        
        // 1 - Condicional ternária

        int numero = 11;

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println(resultado);

        // 2 - if encadeado

        int idade = 16;
        boolean temCarteira = false;

        if(idade >= 18) {

            if(temCarteira) {
                System.out.println("Pode dirigir!");
            } else {
                System.out.println("Precisa ter a habilitação para dirigir!");
            }

        } else {
            System.out.println("Você não pode dirigir ainda!");
        }

        // 3 - Precedencia

        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultado2 = a && b || c;

        System.out.println(resultado2);

        boolean resultado3 = a || b && c;

        System.out.println(resultado3);

        boolean resultado4 = !(a || b) && c;

        System.out.println(resultado4);

        boolean resultado5 = (!a || b) && c;

        System.out.println(resultado5); 

    }

}