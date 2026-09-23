package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(){ //se colocar void Produto, ele deixa de ser construtor e se torna metodo

    }

    Produto(String nomeInicial, double precoInicial){ //construtor explícito
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto * descontoDoGerente);
    }
}
