package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("\n\t - - MENU ESTACIONAMENTO - - \n\t");
            System.out.println("1. Registrar Entrada");
            System.out.println("2. Registrar Saída");
            System.out.println("3. Exibir vagas livres");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Usuário digitou a opção: "+opcao);
        }while( opcao !=4);
        System.out.println("Usuário saiu do sistema");
    }
}
