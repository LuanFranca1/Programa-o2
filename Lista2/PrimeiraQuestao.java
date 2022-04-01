package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        int[] vet = {1, 2, 3, 10, 8, 9, 6, 7};
        int buscando=10;
        int n;
        System.out.println(buscaLinear(vet,buscando));
    }
     public static int buscaLinear(int[] vet, int buscando) {
        int i = 0;
        while (i <= vet.length) {
            if (i == vet.length) {
            } else if (vet[i] == buscando) {
                return i;

            }
            i++;
        }
        return -1;
    }

}

