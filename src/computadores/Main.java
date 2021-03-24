package computadores;

public class Main {

    public static void main(String[] args) {
        Processador i5 = new Processador("i5 - 7gen");
        Processador i7 = new Processador("i7 - 10gen");

        Computador pc1 = new Computador(i5, "500gb", "2x 4gb", 1500.00);
        Computador pc2 = new Computador(i7, "1000gb", "2x 8gb", 2500.00);
        Computador pc3 = new Computador(i7, "500gb", "1x 4gb", 2000.00);

        LojaComputadores loja = new LojaComputadores(7);

        loja.adiciona(pc1);
        loja.adiciona(pc3);
        loja.adiciona(pc2);
        loja.adiciona(pc3);
        loja.adiciona(pc1);
        loja.adiciona(pc3);
        loja.adiciona(pc2);

        System.out.println(loja);
        
        System.out.println("===========");
        loja.ordenaPreco();
        System.out.println(loja);
        
        System.out.println("Mais caro |> "+loja.maisCaro());
        System.out.println("Mais barato |> "+loja.maisBarato());
    }

}
