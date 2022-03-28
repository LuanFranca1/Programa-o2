public class Bubblesort {
    
    public static void main(String[]args){ 
        
        double [] vet = {-2,-4,10,5,2,3};
        double [] result = new double[vet.length];
        
        vet = bubble(vet);
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
    public static double[] bubble(double [] vet){
        int i,j,k;
        double temp;
        for (j = 0; j < vet.length; j++) {
            for (i = 0; i < vet.length -1 ; i++) {
                if(vet[i] > vet[i+1]){ //ordem decrescente é só alterar o sinal
                    temp=vet[i];
                    vet[i] = vet[i+1];
                    vet[i+1] = temp;
                }
            }
        }
        return vet;
    }
}
