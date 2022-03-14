package porjeto1;

public class Quesito2 {

    public static void main(String[] args) {

        double[] vet = {4,7,8,10,11};

    }

    public static double[] media(double[] vet) {
        double[] vetMedia = new double[2];
        double soma = 0;
        double desvioP;
        int i;

        for (i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
            vetMedia[0] = soma / vet.length; //o vetor da média vai ser colocado na posição 0 do vetor;
            desvioP = vetMedia[0] -5;
            vetMedia[1] = Math.pow(desvioP, 2);//Já a posição 1 receberpa a variância dos números;
            
        }

        return vetMedia;
    }

}
