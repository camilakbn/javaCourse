package controle;

public class DesafioFor {

    public static void main(String[] args){

        /*restrição: não pode usar valor numérico para controlar
        * o laço*/

        String valor = "#";

        for(int i = 1; i <= 5; i++){
            System.out.println(valor);
            valor += "#";
        }

        System.out.println("Desafio...");

        for(String v = "#"; !v.equalsIgnoreCase("######"); v += "#"){
            System.out.println(v);
        }
    }
}
