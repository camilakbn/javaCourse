package fundamentos;

import java.util.Scanner;

public class ExercicioFundamentos3 {

    public static void main(String[] args){

        /*Criar um programa que leia o peso e
        * a altura do usuário e imprima no console o IMC.
        * peso / altura ao quadrado*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        String p = entrada.nextLine();
        System.out.println("Digite a sua altura: ");
        String a = entrada.nextLine();

        double peso = Double.parseDouble(p);
        double altura = Double.parseDouble(a);

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("O seu IMC é %.2f", imc);

        entrada.close();
    }
}
