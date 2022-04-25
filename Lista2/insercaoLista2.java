public class OrdenacaoInserl2 {
 
    public static void main(String[]args){
        
    }
    public static double[] insercao(double[]v){ 
        int j;
        for (int i = 0; i < v.length/2; i++) { // para ir até a metade do vetor
            /*for (int i = vet.length/2; i <vet.length; i++) {
            }*/
            double atual=v[i];   
            j=i-1;
            while(j>-1 && v[j]>atual){ 
                v[j+1] = v[j];
                j=j-1;
            }
            v[j+1] = atual;
        }
        return v;
    }
    
}
