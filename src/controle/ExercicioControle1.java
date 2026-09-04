package controle;

import java.util.Scanner;

public class ExercicioControle1 {

    public static void main(String[] args){
        /*1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;*/
        //OK

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = entrada.nextDouble();
        if(numero >= 0 && numero <= 10){
            System.out.println("O número está entre 0 e 10");
        }
        else{
            System.out.println("O número não está entre 0 e 10");
        }

        if(numero % 2 == 0){
            System.out.println("O número é par");
        }
        else{
            System.out.println("O número é ímpar");
        }

        entrada.close();
    }
}
