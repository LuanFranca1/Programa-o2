
public class Ordencao {

    public static void main(String[] args) {

        int[] vet = {1, 6, 8, 4, 3, 9, 11, 10};
        
       vet=insercao(vet); // como puxar o return;
        for (int i = 0; i < vet.length; i++) { 
            System.out.println(vet[i]);
        }
    }
    public static int[] insercao(int[] vet) {
        int atual;
        int i, j;
       
        for (i = 2; i < vet.length; i++) {
            atual = vet[i];
            j = i - 1;
            while ((j > 0) && (vet[j] > atual)) {
                vet[j + 1] = vet[j];
                j = j - 1;
            }
            vet[j + 1] = atual;
            //System.out.println(atual);
        }
        return vet;
    }
}
//       while ((j >= 0) && (vet[j] < atual)) { (decrescendo);

// olhar o q o \t faz;
