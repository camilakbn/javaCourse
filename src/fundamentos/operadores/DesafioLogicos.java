package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args){
        /*trabalho na terça (v ou f)
        * trabalho na quinta (v ou f)
        * se os dois trabalhos derem certo, vai no shopping comprar uma tv de 50 polegadas
        * se 1 dos trabalhos derem certo, comprar uma tv de 32 polegadas
        * se a familia for ou comprar a tv de 50 ou a de 32, a familia vai tomar sorvete no shopping
        * se nenhum dos dois trabalhos derem certo, a familia vai ficar em casa sem tomar sorvete*/

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean tv50 = trabalho1 && trabalho2;
        System.out.println("Comprou TV de 50? " + tv50);

        boolean tv32 = trabalho1 ^ trabalho2;
        System.out.println("Comprou TV de 32? " + tv32);

        boolean sorvete = trabalho1 || trabalho2;
        System.out.println("Comprou sorvete? " + sorvete);

        boolean maisSaudavel = !sorvete;
        System.out.println("Ficou mais saudável? " + maisSaudavel);

    }
}
