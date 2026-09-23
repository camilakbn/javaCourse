package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        /*dia = 1;
        mes = 1;
        ano = 1970;*/
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void mostrarDados(){ //isso é um metodo
        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
    }

    public String obterDataFormatada(){
        //final String formato = "%d/%d/%d"; //é uma constante
        String formato = "%d/%d/%d"; //variável local
        return String.format(formato, this.dia, mes, ano);
    }

    public void imprimirDataFormatada(){
        //System.out.printf("%d/%d/%d", dia, mes, ano);
        System.out.println(this.obterDataFormatada());
    }
}
