package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args){

        /*calcular a média das notas de uma turma
        * não se sabe quantos alunos têm na turma
        * o usuário vai digitar uma nota de 0 a 10
        * armazenar a nota na variável total
        * criar uma variável para definir quantas notas válidas
        * foram digitadas
        * calcular a média das notas
        * se o usuário digitar -1, sair do programa*/

        Scanner entrada = new Scanner(System.in);

        double nota;
        double total = 0;
        double media;
        int notasValidas = 0;

        do{
            System.out.println("Digite a nota de 0 a 10 " +
                    "(ou -1 para sair): ");
            nota = entrada.nextDouble();
            if(nota >= 0 && nota <= 10){
                notasValidas++;
                total += nota;
            }
            else if(nota != -1){
                System.out.println("Nota inválida!");
            }
        }while(nota != -1);

        media = total / notasValidas;

        System.out.printf("O total das notas foi %.2f, foram digitadas %d notas válidas" +
                " e a média das notas foi de %.2f", total, notasValidas, media);

        entrada.close();
    }
}
