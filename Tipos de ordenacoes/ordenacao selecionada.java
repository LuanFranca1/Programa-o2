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
        aux = vet[max];
        vet[max] = vet[1];
        vet[i] = aux;
        return vet;
    }

}
