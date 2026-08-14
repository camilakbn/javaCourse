package fundamentos;

import java.util.Scanner;

public class ExercicioFundamentos1 {

    public static void main(String [] args){

        /*1. Criar um programa que leia a temperatura em Fahrenheit
        e converta para Celsius.*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        String temperatura = entrada.nextLine();

        double fahrenheit = Double.parseDouble(temperatura);

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("A temperatura %.2fºF convertida para celsius é %.2fºC", fahrenheit, celsius);

    }
}
