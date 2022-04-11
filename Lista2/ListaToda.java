public class Lista2 {

    public static int buscaLinear(int[] vetor, int chave){
        int posicao = 6;
        int i=0;
        while(i <= vetor.length){
        if(i==vetor.length){
            break;
        }else if(vetor[i] == posicao){
            return posicao;
        }
    }
    return -1;
}
    public static int buscaBinaria(double[] vetorOrdenado,double chave){
        int posicao = -1;
        double inicio =1;
        double fim = vetorOrdenado.length-1;
        double meio;

        while(inicio <= fim) {
            meio = ((inicio+fim)/2);
            if(vetorOrdenado[posicao] == chave){
                return posicao;
               /* inicio = meio + 1;
            }else {
                fim = meio - 1;
        }
        */
        }
    }
        return -1;
}
     public static int[][] ordenaMatrizL(int[][] matriz,int linha){
        int[][] matrizOrdenada = {{1, 3, 8}, {9, 2, 5}, {4, 6, 7}};
         int max;
         int aux;
         for (i = vet.length-1;i>0;i--) {
             max = i;
             for (int j = 0; j < i; j++) {
                 if (matirz[j][linha] > matriz[max][linha]) {
                     max = j;
                 }
             }
             for (int k = 0; k < matriz[i].length; k++) {

             }
         }
                return matrizOrdenada;
            }
    public static int[][] ordenaMatrizC(int[][] matriz,int coluna){
        int[][] matrizOrdenada = {{9, 5, 2}, {4, 7, 6}, {1, 8, 3}};
        int max;
        int aux;
        for (i = vet.length-1;i>0;i--) {
            max = i;
            for (int j = 0; j < i; j++) {
                if (matirz[j][coluna] > matriz[max][coluna]) {
                    max = j;
                }
            }
            for (int k = a; k < vet[i].length; k++) {
                aux = matriz[max][k];
                matriz[max][k] = matriz[i][k];
                matriz[i][k] = aux;
            }
        }
        return matriz;
    }

    public static double[] ordenaVetor(double[] vetor){
        double[] vetorOrdenado = {1.0, 3.0, 5.0, 6.0, 9.0, 8.0, 4.0, 2.0};
        int max;
        for(int i=matriz.length > -1 ; )
        return vetorOrdenado;
    }

}
