package fundamentos;

public class TipoString {

    public static void main(String[] args){
        System.out.println("Olá pessoal".charAt(2));
        //a string é um objeto imutável
        String s = "Boa tarde"; //não conseguimos modificar o valor da string, apenas substituir
        System.out.println(s.concat("!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("!"));
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.678;

        String outraFrase = "\nNome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario + "\n";
        System.out.println(outraFrase);

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f ao mês.\n", nome, sobrenome, idade, salario);

        String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f ao mês.\n", nome, sobrenome, idade, salario);
        System.out.println(frase);


    }
}