package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data data1 = new Data();

        Data data2 = new Data(3,3,2020);

        /*data2.dia = 3;
        data2.mes = 3;
        data2.ano = 2021;*/


        System.out.printf(data1.obterDataFormatada());
        System.out.printf("\n%d/%d/%d\n", data2.dia, data2.mes, data2.ano);
        data1.imprimirDataFormatada();

        System.out.println("\n");
        data1.mostrarDados();
        System.out.println("\n");
        data2.mostrarDados();
    }
}
