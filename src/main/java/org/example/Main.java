package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Estacionamento estacionamento = new Estacionamento(5);

        int opcao;

        do {

            System.out.println("\n--- MENU ESTACIONAMENTO ---");
            System.out.println("1. Registrar Entrada");
            System.out.println("2. Registrar Saída");
            System.out.println("3. Exibir vagas livres");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Digite a placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Digite o modelo: ");
                    String modelo = scanner.nextLine();

                    Veiculo carro = new Veiculo(placa, modelo);

                    estacionamento.registrarEntrada(carro);

                    break;

                case 2:

                    System.out.print("Digite o número da vaga: ");
                    int numeroVaga = scanner.nextInt();

                    estacionamento.registrarSaida(numeroVaga);

                    break;

                case 3:

                    estacionamento.exibirVagasLivres();

                    break;

                case 4:

                    System.out.println("Saindo do sistema...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}