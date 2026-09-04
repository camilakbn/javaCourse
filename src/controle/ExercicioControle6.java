package controle;

import java.util.Scanner;

public class ExercicioControle6 {

    public static void main(String[] args) {

        /*6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
        Armazene um numero aleatório em uma variável.
        O Jogador tem 10 tentativas para adivinhar o número gerado.
        Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
        e imprima se o número inserido é maior ou menor do que o número armazenado.*/
        //OK

        Scanner entrada = new Scanner(System.in);

        double numAdivinhar = 54;
        double numero = 0;
        int tentativas = 10;

        System.out.println("Olá!\nBem vinda ao jogo de adivinhação!\n");

        do {

            for (int i = 1; i <= 10; i++) {
                System.out.println("Digite um número entre 0 e 100: ");
                numero = entrada.nextDouble();

                if (numero <= 0 || numero >= 100) {
                    System.out.println("Número inválido, tem que digitar um número entre 0 e 100!");
                }
                else {
                    tentativas--;

                    if (numero > numAdivinhar) {
                        System.out.println("O número que você digitou é maior que o número que você quer adivinhar!");
                    }
                    else if (numero < numAdivinhar) {
                        System.out.println("O número que você digitou é menor que o número que você quer adivinhar!");
                    }
                    else {
                        System.out.printf("Muito bem, você acertou! O número é %.1f\n", numAdivinhar);
                        break;
                    }
                }

                System.out.printf("Você tem %d tentativas\n", tentativas);
            }
        } while (numero <= 0 || numero >= 100);

        System.out.println("Fim!");

        entrada.close();
    }
}
