package fundamentos;

import java.util.Scanner;

public class DesafioFundamentos2 {

    public static void main(String[] args){

        /*Criar um programa que leia a
        * temperatura em Celsius e converta para Fahrenheit.
        * f = (c * 1,8) + 32*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius que você quer converter: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("A temperatura %.2fºC convertida para fahrenheit é %.2fºF", celsius, fahrenheit);

        entrada.close();
    }
}
