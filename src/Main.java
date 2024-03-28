import entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bem vindo à Info-Informática \nDeseje a quantidade de computadores que deseja cadastrar: ");
        int n = sc.nextInt();

        Computador[] computadores = new Computador[n];

        for (int i = 0; i < n; i++){
            System.out.println("Selecione o Tipo do Computador: ");
            System.out.println("1 - Servidor\n" +
                    "2 - Notebook\n" +
                    "3 - Desktop");
            char opcao = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Preencha os dados: ");
            System.out.print("Insira a marca do dispositivo: ");
            String marca = sc.nextLine();

            System.out.print("Insira o preço: ");
            double preco = sc.nextDouble();

            System.out.print("Insira a quantidade: ");
            int quantidade = sc.nextInt();

            System.out.println("A seguir insira os componentes: ");

            System.out.print("Insira o tipo de memória: ");
            String tipoMemoria = sc.nextLine();
            sc.nextLine();

            System.out.print("Insira a marca da memória: ");
            String marcaMemoria = sc.nextLine();

            System.out.print("Insira o tipo do HD: ");
            String tipoHd = sc.nextLine();

            System.out.print("Insira a marca do HD: ");
            String marcaHd = sc.nextLine();

            System.out.print("Insira a capacidade do HD: ");
            int capacidadeHd = sc.nextInt();

            System.out.print("Insira o tipo da fonte: ");
            String tipoFonte = sc.nextLine();
            sc.nextLine();

            System.out.print("Insira a marca da fonte: ");
            String marcaFonte = sc.nextLine();

            System.out.print("Insira a potência da fonte: ");
            int potenciaFonte = sc.nextInt();

            Componentes componentes = new Componentes(tipoMemoria, marcaMemoria, tipoHd, marcaHd, capacidadeHd, tipoFonte, marcaFonte, potenciaFonte);

            if (opcao == '1') {

                System.out.print("Insira a quantidade de HDs: ");
                int numeroHd = sc.nextInt();

                System.out.print("Insira a quantidade de slots de memória: ");
                int slotsMemoria = sc.nextInt();

                System.out.print("Insira a capacidade de memória RAM: ");
                int capacidadeMemoria = sc.nextInt();

                System.out.print("Insira o tipo do Gabinete: ");
                String tipoGabinete = sc.nextLine();
                sc.nextLine();

                System.out.print("Insira a marca do Gabinete: ");
                String marcaGabinete = sc.nextLine();

                computadores[i] = new Servidor(marca, preco, quantidade, numeroHd, slotsMemoria, capacidadeMemoria, tipoGabinete, marcaGabinete, componentes);
            }

            else if (opcao == '2'){

                System.out.print("Insira a quantidade de slots de memória: ");
                int slotsMemoria = sc.nextInt();

                System.out.print("Insira o tipo do monitor: ");
                String tipoMonitor = sc.nextLine();
                sc.nextLine();

                System.out.print("Insira a marca do monitor: ");
                String marcaMonitor = sc.nextLine();

                System.out.print("Insira a resolução do monitor: ");
                int resolucaoMonitor = sc.nextInt();

                computadores[i] = new Notebook(marca, preco, quantidade, slotsMemoria, resolucaoMonitor, tipoMonitor, marcaMonitor, componentes);
            }

            else if (opcao == '3'){

                System.out.print("Insira a quantidade e placa de vídeos: ");
                int numPlacaDeVideo = sc.nextInt();

                System.out.print("Insira a quantidad de slots de memória: ");
                int numSlotsMemoria = sc.nextInt();

                System.out.print("Insira o tipo do monitor: ");
                String tipoMonitor = sc.nextLine();
                sc.nextLine();

                System.out.print("Insira a marca do monitor: ");
                String marcaMonitor = sc.nextLine();

                System.out.print("Insira a resolução do monitor: ");
                int resolucaoMonitor = sc.nextInt();

                System.out.print("Insira a marca da placa de vídeo: ");
                String marcaPlacaDeVideo = sc.nextLine();
                sc.nextLine();

                computadores[i] = new Desktop(marca, preco, quantidade, numPlacaDeVideo, numSlotsMemoria, tipoMonitor, marcaMonitor, resolucaoMonitor, marcaPlacaDeVideo, componentes);
            }
            else {
                System.out.println("Opção inválida!! Tente novamente.");
                i--;
            }
        }

        for (Computador computador: computadores){
            if(computador != null){
                computador.imprimir();
            }
        }
    }
}