package secao9_conversorTemperatura;

/**
 * Objetivo: Criar um conversor de Celsius para Fahrenheit e de Fahrenheit para Celsius
 * 
 * Etapas do projeto
 * 
 * 1 - Obter do usuário se ele quer conveter Celsius ou Fahrenheit
 * 2 - Criar duas funções, uma para cada conversão
 * 3 - Obter a temperatura em cada uma das funções escolhidas
 * 4 - Exibir uma mensagem com a temperatura, ex: De x C para y F
 */

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para que temperatura você deseja converter?");
        System.out.println("1: Converter Celsius em Fahrenheit");
        System.out.println("2: Converter Fahrenheit em Celsius ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if(opcao == 1){
            System.out.println("Digite a temperatura em Celsius para Converter em fahrenheit: ");
            double celsius = scanner.nextDouble();
            System.out.println("A temperatuta: " + celsius + "C equivale a " + CelsiusParaFahrenheit(celsius) + "F");
        } else if(opcao == 2) {
            System.out.println("Digite a temperatura em fahrenheit para Converter em Celsius: ");
            double fahrenheit = scanner.nextDouble();
            System.out.println("A temperatuta: " + fahrenheit + "F equivale a " + CelsiusParaFahrenheit(fahrenheit) + "C");
        } else {
            System.out.println("Opção inválida");
        }

        scanner.close();        
    }

    public static double CelsiusParaFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }

    public static double FahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }
}
