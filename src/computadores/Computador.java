package computadores;

public class Computador {

    private Processador processador;
    private String tamanhoHD;
    private String memoriaRAM;
    private double preco;

    public Computador(Processador processador, String tamanho, String memoria, double preco) {
        this.processador = processador;
        this.tamanhoHD = tamanho;
        this.memoriaRAM = memoria;
        this.preco = preco;
    }

    public void setProcessador(Processador p) {
        this.processador = p;
    }

    public void setTamanho(String t) {
        this.tamanhoHD = t;
    }

    public void setMemoria(String m) {
        this.memoriaRAM = m;
    }

    public void setPreco(double p) {
        this.preco = p;
    }

    public Processador getProcessador() {
        return this.processador;
    }

    public String getTamanho() {
        return this.tamanhoHD;
    }

    public String getMemoria() {
        return this.memoriaRAM;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Processador: " + processador + ", HD: " + tamanhoHD + ", RAM: " + memoriaRAM
                + ", Preço: R$" + preco;
    }

}
