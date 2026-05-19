package org.example;

public class Vaga {

    private int numero;
    private Veiculo veiculo; // null = vaga livre

    public Vaga(int numero) {
        this.numero = numero;
        this.veiculo = null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return veiculo != null;
    }

    public void estacionar(Veiculo veiculo) {

        if (isOcupada()) {
            System.out.println("Vaga já ocupada!");
            return;
        }

        this.veiculo = veiculo;
    }

    public void liberar() {

        if (!isOcupada()) {
            System.out.println("A vaga já está livre.");
            return;
        }

        this.veiculo = null;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}