package fundamentos;

import java.util.Scanner;

public class ExercicioFundamentos5 {

    public static void main(String[] args){

        /*Criar um programa que leia o valor da base e
        * da altura de um triângulo e calcule a área.
        * area = (b x a) / 2*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da base do triângulo: ");
        String b = entrada.nextLine();
        System.out.println("Digite o valor da altura do triângulo: ");
        String a = entrada.nextLine();

        double base = Double.parseDouble(b);
        double altura = Double.parseDouble(a);

        double area = (base*altura) / 2;

        System.out.printf("A área do triângulo é %.2f", area);

        entrada.close();
    }
}
