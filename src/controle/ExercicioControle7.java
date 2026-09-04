package controle;

import java.util.Scanner;

public class ExercicioControle7 {

    public static void main(String[] args){

        /*7. Criar um programa que enquanto estiver recebendo números positivos,
        imprime no console a soma dos números inseridos, caso receba um número negativo,
        encerre o programa. Tente utilizar a estrutura do while.*/
        //OK

        Scanner entrada = new Scanner(System.in);

        double numero;
        double soma = 0;

        do{
            System.out.println("Digite um número: ");
            numero = entrada.nextDouble();
            if(numero >= 0){
                soma+=numero;
                System.out.println("A soma é " + soma);
            }
        } while(numero >= 0);

        System.out.println("Fim!");
        entrada.close();
    }
}
