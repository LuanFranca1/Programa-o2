package javaapplication1;

public class BuscaBinaria {
    
    public static void main(String[]args){ 
        
        double [] a = {1.0,5.0,6.0,8.0,10.0,-8.0,-9.0,-4.0,-6.0, 4.0}; 
        double chave;
        double  buscaBinaria=buscaBinaria(a,5.0);
        System.out.println(buscaBinaria);
    }
    public static double  buscaBinaria(double[] a ,double chave){ 
        double inicio =1;
        double fim = a.length-1;
        double meio;
        while(inicio<= fim){
            meio = ((inicio + fim)/2);
            if(a[meio] == chave){
                return meio;
            }else if(chave>a[meio]){
                inicio = meio +1;
            }else{ 
                fim = meio -1;
            }
        }
        return -1;
    }
}
