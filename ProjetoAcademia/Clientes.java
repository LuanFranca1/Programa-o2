import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SistemaAcad {

    private Cliente[] clientes;
    private Random r = new Random();

    public SistemaAcad() {
        this.clientes = new Cliente[20];
    }

    public void addCliente() {
        Cliente c;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do Cliente: ");
        String nome = in.nextLine();
        System.out.println("Digite Matricula: ");
        int matricula = in.nextInt();
        System.out.println("Atividade realizada: ");
        in.nextLine();
        String atividade = in.nextLine();
        c = new Cliente(nome, matricula, atividade);

    }


    public void imprimirLista() {
        for (Cliente c : this.clientes) {
            if (!c.equals(null)) {
                System.out.println(c);
            }
            break;
        }
    }

    public void devedores() {
        for (int i = 0; i < this.clientes.length; i++) {
            if (clientes[i].getPagamento()) {
                return;
            } else {
                clientes[i].setQtdDevida(50.00);
                System.out.println("Cliente :" + clientes[i].getCliente() + "\nMatricula: " + clientes[i].getMatricula() + "\nDeve: R$" + clientes[i].getQtdDevida());

            }
        }
    }

    public void busca(int matricula) {

        for (Cliente c : this.clientes) {
            if (c.getMatricula() == matricula) {
                System.out.printf("Cliente: " + c.getCliente() + "\nMatricula: " + c.getMatricula() + "\nPagamento: " + c.pagamentoString() + "\nDívida: " + c.getQtdDevida() + "\nAtividade: " + c.getAtividadeReal());
            }
            break;
        }
    }

    public void contadorClientes() {
        int contPago = 0;
        int contDeve = 0;
        for (int i = 0; i < this.clientes.length; i++) {
            if (clientes[i].getPagamento()) {
                contPago++;
            } else {
                contDeve++;
            }
        }
        System.out.println("Quantidade de Pessoas quem pagaram: " + contPago + "Quantidade de Pessoas que estão devendo: " + contDeve);
    }

}

