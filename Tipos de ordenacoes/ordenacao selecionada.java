public class Selecao {

    public static void main(String[] args) {

        double[] vet = {-2, 5, 7, -1, -6, 10};
        vet=ordenacaoS(vet);
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
      }
    }
    public static double[] ordenacaoS(double[] vet) {
        int i, j;
        int max = 0;
        double aux;
        for (i = vet.length-1; i > 0; i--) {
            max = i;
            for (j = 1; j < i - 1; i++) {
                if(vet[j] > vet[max]){
                    max=j;
                }
                vet[i] = vet[max];
            }
        }
        aux = vet[i];
        vet[i] = vet[max];
        vet[max] = aux;
        return vet;
    }

}

/*public class Teste {

    public static void main(String[] args) {
        int[][] matrizOrdenada = {{9, 5, 2}, {4, 7, 6}, {1, 8, 3}};
        int coluna = 2;
        int[][] ordenaMatrizC = ordenaMatrizC(matrizOrdenada, coluna);
        for (int i = 0; i < matrizOrdenada.length; i++) {
            for (int j = 0; j < matrizOrdenada[i].length; j++) {
                System.out.println(ordenaMatrizC[i][j]);
            }
        }
    }
    public static int[][] ordenaMatrizC(int[][] matriz, int coluna) {
        // int[][] matrizOrdenada = {{9, 5, 2}, {4, 7, 6}, {1, 8, 3}};
        int max;
        int aux;
        for (int i = matriz.length - 1; i > 0; i--) {
            max = i;
            for (int j = 0; j < i; j++) {
                if (matriz[j][coluna] > matriz[max][coluna]) {
                    max = j;
                }
                matriz[i][coluna] =  matriz[max][coluna];
            }
            for (int k = 0; k < matriz[i].length; k++) {
                aux = matriz[max][k];
                matriz[max][k] = matriz[i][k];//trocar essa 
                matriz[i][k] = aux;
            }
        }
        return matriz;
    }

}
*/
