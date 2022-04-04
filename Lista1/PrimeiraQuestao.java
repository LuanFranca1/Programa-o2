public class Q1 {
    
    public static void main(String[]args){ 
        int [] vet = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
    public static boolean primo(int n){
        for (int i = 2; i < n; i++) {
            if(n%2 ==0 ) { 
                return false;
            }
        }
        return true;
    }
    public static double [] NumerosPrimos(int[] vet){ 
        int [] vAux = new int[10];
        int nPrimos =0;
        
        for (int i = 0; i < vet.length; i++) {
        
            if(primo(vet[i])){
                nPrimos++;
                vAux[i] = vet[i];
            }else{
                vAux[i] =0;
            }
        }
        int[] vPrimos = new int[nPrimos];
        int posVazia=0;
        for (int i = 0; i < vAux.length; i++) {
            if(vAux[i] !=0 ) {
                vAux[posVazia++] =vAux[i];
            }
        }
        return vAux;
     }
}
