package org.example;

public class Estacionamento {

    private vaga[] vagas;

    // Construtor
    public Estacionamento(int quantidadeVagas) {

        vagas = new Vaga[quantidadeVagas];

        for (int i = 0; i < quantidadeVagas; i++) {
            vagas[i] = new Vaga(i + 1);
        }
    }

    // Registrar entrada
    public void registrarEntrada(veiculo carro) {

        for (vaga vaga : vagas) {

            if (!vaga.isOcupada()) {
                vaga.estacionar(carro);
                return;
            }
        }

        System.out.println("Estacionamento lotado!");
    }

    // Registrar saída
    public void registrarSaida(int numeroVaga) {

        if (numeroVaga > 0 && numeroVaga <= vagas.length) {

            vagas[numeroVaga - 1].liberar();

        } else {
            System.out.println("Vaga inválida!");
        }
    }

    // Exibir vagas livres
    public void exibirVagasLivres() {

        System.out.println("\nVagas livres:");

        for (vaga vaga : vagas) {

            if (!vaga.isOcupada()) {
                System.out.println("Vaga " + vaga.getNumero());
            }
        }
    }
}