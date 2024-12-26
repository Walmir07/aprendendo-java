package secao6_calculadoraIMC;

import java.util.Scanner;


public class CalculadoraIMC {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Seu IMC foi: " + imc + ". Classificação: Abaixo do peso!");
        } 
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Seu IMC foi: " + imc + ". Classificação: Peso normal!");
        } 
        else if(imc >= 25 && imc < 29.9){
            System.out.println("Seu IMC foi: " + imc + ". Classificação: Sobrepeso!");
        } else {
            System.out.println("Seu IMC foi: " + imc + ". Classificação: Obesidade!");
        }

        scanner.close();
    }
}
