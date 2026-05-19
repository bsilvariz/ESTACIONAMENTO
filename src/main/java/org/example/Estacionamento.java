package org.example;

public class Estacionamento {

    private Vaga[] vagas;

    public Estacionamento(int quantidadeVagas) {

        vagas = new Vaga[quantidadeVagas];

        for (int i = 0; i < quantidadeVagas; i++) {
            vagas[i] = new Vaga(i + 1);
        }
    }

    public void registrarEntrada(Veiculo carro) {

        for (Vaga vaga : vagas) {

            if (!vaga.isOcupada()) {
                vaga.estacionar(carro);
                System.out.println("Veículo estacionado na vaga " + vaga.getNumero());
                return;
            }
        }

        System.out.println("Estacionamento lotado!");
    }

    public void registrarSaida(int numeroVaga) {

        if (numeroVaga <= 0 || numeroVaga > vagas.length) {
            System.out.println("Vaga inválida!");
            return;
        }

        Vaga vaga = vagas[numeroVaga - 1];

        if (!vaga.isOcupada()) {
            System.out.println("A vaga já está livre.");
            return;
        }

        vaga.liberar();
        System.out.println("Vaga " + numeroVaga + " liberada.");
    }

    public void exibirVagasLivres() {

        System.out.println("\nVagas livres:");

        for (Vaga vaga : vagas) {

            if (!vaga.isOcupada()) {
                System.out.println("Vaga " + vaga.getNumero());
            }
        }
    }
}