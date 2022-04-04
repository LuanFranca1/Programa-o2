package lista1;

public class Lista1 {
    public static void main(String[] args) {
        
        int [] vetorTeste = {4,3,1,2}; 
        
        int[]vR = questao6(v);  
        questao6 =questao6(vet);
        for (int i = 0; i < vR.lenth; i++) {
            
        }
    }

    public static int[] questao6(int[] vet) {
        int n = vet.length;
        int[] vetorSaida = new int[2 * n];
        for (int i = 0; i < n; i++) {
            vetorSaida[2*i] =vet[i];
            vetorSaida[2*i + 1]= vet[i];
        }
        
        return vetorSaida;
    }

}
