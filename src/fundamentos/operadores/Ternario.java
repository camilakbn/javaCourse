package fundamentos.operadores;

public class Ternario {

    public static void main(String[] args){

        double media = 6.5;

        String resultado = media >= 7.0 ? "aprovado" : "em recuperação";

        System.out.println("O aluno está " + resultado);

        double nota = 7.3;
        boolean bomComportamento = false;
        boolean passouPorMedia =  nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultadoFinal = temDesconto? "sim" : "não";

        System.out.println("Tem desconto? " + resultadoFinal);
    }
}