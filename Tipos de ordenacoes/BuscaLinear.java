package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
// buscar na posição que for digitada;

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int[] vet = {1, 2, 3, 10, 8, 9, 6, 7};
        int buscando;
        int n;
        System.out.println("Digite o valor: ");
        buscando = entrada.nextInt();
        System.out.println(buscaLinear(vet, buscando));
    }

    public static int buscaLinear(int[] vet, int buscando) {
        int i = 0;
        while (i <= vet.length) {
            if (i == vet.length) {
                break;
            } else if (vet[i] == buscando) {
                return i;

            }
            i++;
        }
        return -1;
    }

}
