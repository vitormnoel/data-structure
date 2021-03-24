package computadores;

public class LojaComputadores {

    Computador computador;
    private String[] lista;
    private int tamanho;
    private double[] preco;
    private String caro;
    private String barato;

    public LojaComputadores(int cap) {
        this.lista = new String[cap];
        this.tamanho = 0;
        this.preco = new double[cap];
    }

    public boolean adiciona(Computador comp) {

        if (this.tamanho < this.lista.length) {
            preco[tamanho] = comp.getPreco();
            lista[tamanho] = comp.toString();
            tamanho++;
            return true;
        }
        return false;
    }

    public void ordenaPreco() {
        for (int i = this.preco.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (this.preco[j - 1] > this.preco[j]) {
                    double aux = this.preco[j];
                    this.preco[j] = this.preco[j - 1];
                    this.preco[j - 1] = aux;

                    String aux1 = this.lista[j];
                    this.lista[j] = this.lista[j - 1];
                    this.lista[j - 1] = aux1;
                }
            }
        }
    }
    
    public String maisCaro(){
        ordenaPreco();
        
        this.caro = this.lista[this.tamanho-1];
        
        return this.caro;
    }
    
    public String maisBarato(){
        ordenaPreco();
        
        this.barato = this.lista[0];
        
        return this.barato;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public String[] getLista() {
        return lista;
    }

    public void setLista(String[] lista) {
        this.lista = lista;
    }

    public int getTamanhoLista() {
        return tamanho;
    }

    public void getPrecoComp() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println((i + 1) + " |> " + preco[i]);
        }
    }
    
    public void setPreco(double[] p){
        this.preco = p;
    }
    
    public double[] getPreco(){
        return this.preco;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < this.tamanho; i++) {
            s.append("\nComputador " + (i + 1));
            s.append("\n|");
            s.append(lista[i]);
            s.append("\n");
        }

        return s.toString();
    }
}
