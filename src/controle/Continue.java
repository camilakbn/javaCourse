package controle;

public class Continue {

    public static void main(String[] args){

        for(int i = 0; i < 10; i++){
            if(i % 2 == 1){
                continue; //ele vai pular o número ímpar
            }
            System.out.println(i);
        }
    }
}
