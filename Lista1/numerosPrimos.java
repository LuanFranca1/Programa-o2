package porjeto1;

public class Porjeto1 {

    public static void main(String[] args) {

        int[] vet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultados = new int[vet.length];
        resultados(numerosPrimos(vet));
        //System.out.println(numerosPrimos(vet));
    }

    public static int[] numerosPrimos(int[] vet) {
        int[] primos = new int[vet.length];
        int i;
        int aux;
        for (i = 1; i < vet.length; i++) {
            aux = vet[i];
            if (vet[i] % 1 == 0 && vet[i] % aux == 0) {
                primos[i] = vet[i];
            }

        }
        return primos;
    }
   
    public static void resultados(int[] numerosPrimos) {
        int i;
        for (i = 0; i < numerosPrimos.length; i++) {
           //resultados[i] =numerosPrimos[i];
            System.out.println(numerosPrimos[i]);
        }
    }
}
