package controle;

import java.util.Scanner;

public class ExercicioControle8 {

    public static void main(String[] args){

        /*8. Crie um programa que recebe 10 valores e ao final imprima o maior número.*/
        //OK

        Scanner entrada = new Scanner(System.in);

        double numero;
        double maiorNum = 0;

        for(int i = 1; i <=10; i++){
            System.out.println("Digite um número: ");
            numero = entrada.nextDouble();
            if(numero > maiorNum){
                maiorNum = numero;
            }
        }

        System.out.printf("O maior número digitado foi %.1f", maiorNum);

        entrada.close();
    }
}
