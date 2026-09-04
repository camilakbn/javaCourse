package controle;

import java.util.Scanner;

public class ExercicioControle3 {

    public static void main(String[] args){

        /*3. Criar um programa que receba duas notas parciais, calcular a média final.
        Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
        se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
        caso contrário imprime no console "Reprovado".*/
        //OK

        Scanner entrada = new Scanner(System.in);

        double nota;
        double soma = 0;
        double media;

        for(int i = 0; i < 2; i++){
            System.out.println("Digite a nota: ");
            nota = entrada.nextDouble();
            soma+=nota;
        }

        media = soma / 2;

        System.out.printf("A média foi %.2f\n", media);

        if(media >= 7.0){
            System.out.println("Aprovado");
        }
        else if(media < 7 && media > 4){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
