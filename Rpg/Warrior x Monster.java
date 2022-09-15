mport java.util.Scanner;
import java.util.Random;

public class WarriorXMonster {
     public static Scanner entrada = new Scanner(System.in);
    public static void main(String[]args) {
        int cont=0;
        int jogada;
        int turno=0;
        Random random = new Random();

        System.out.print("Bem vindo,a sua partida irá começar...");
        System.out.print("\n Digite o seu nome: ");
        String nomeJogador = entrada.nextLine();

        Warrior jogador = new Warrior(nomeJogador);
        Monster monstro = new Monster("Monster");
        System.out.print("\n" + jogador.toString() + "\n");
        System.out.print("\n" + monstro.toString() + "\n");

        while (true) {
            turno++;

            if ((turno % 2) != 0) { //Como é obrigatório cada um jogar pelo menos 1x,colocar em um turno ímpar(ou par),como queria que o jogador começasse primeiro coloquei um número ímpar;
                System.out.println();
                System.out.println("" + jogador.getNome());
                System.out.println("Qual a play desse turno?");
                System.out.println("1- Atacar");
                System.out.println("2- Tomar porção de cura");
                System.out.println("3- Enfurecer");
                jogada = entrada.nextInt();
                entrada.nextLine();

                switch (jogada) {
                    case 1:
                        jogador.atacar(monstro);
                        System.out.println("Ataque Realizado!");
                        break;
                    case 2:
                        jogador.recuperarHP();
                        System.out.println("O jogador foi curado!");
                        break;
                    case 3:
                        jogador.endurecer(monstro, turno);
                        System.out.println("Enfurecido!");
                        break;
                    default:
                        System.out.println("Digite um comando válido.");
                }
            } else {
                System.out.println("\nMonstro:");

                jogada = ataqueAleatorio(random);
                switch (jogada) {
                    case 1:
                        monstro.atacar(jogador);
                        System.out.println("Ataque Realizado!");
                        break;
                    case 2:
                        monstro.recuperarHP();
                        System.out.println("O monstro se curou!");
                        break;
                    case 3:
                        monstro.endurecer(jogador, turno);
                        System.out.println("fortificado!");
                        break;

                    default:
                        System.out.println("Digite um comando válido.");
                }
                System.out.print("\n" + jogador.toString() + "\n");
                System.out.print("\n" + monstro.toString() + "\n");
            }
   /*         System.out.print("\n" + jogador.toString() + "\n");
            System.out.print("\n" + monstro.toString() + "\n");*/

            if ((jogador.getHp() <= 0 || (monstro.getHp() <= 0))) {
                System.out.println("O game terminou.");
                break;
            }
        }

        System.out.print("\n" + jogador.toString() + "\n");
        System.out.print("\n" + monstro.toString() + "\n");
    }
    private static int ataqueAleatorio(Random jogada) {
        double[] chancesDaAcao = {0.7, 0.1, 0.2};
        int[] numeros = {1, 2, 3};
        double soma = 0;
        double porcentagem = jogada.nextDouble();
        int i = 0;
        while (soma < porcentagem) {
            soma += chancesDaAcao[i];
            i = i + 1;
        }
        return numeros[i - 1];
    }
}
