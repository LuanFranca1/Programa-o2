
public class Q3 {

    public static void main(String[] args) {

        double[] vet = {10, 52, 6, 8, 9, 10};
        double[] vR = terceiraQ(vet);
        System.out.println(vR[0]);
        System.out.println(vR[1]);

    }

    public static double[] terceiraQ(double[] vet) {
        double[] mev = new double[2];

        double media = 0;
        int n = vet.length;

        for (int i = 0; i < n; i++) {
            media = media + vet[i];
        }
        media = media/n;
        mev[0] = media / n;
        double variancia = 0;
        for (int i = 0; i < n; i++) {
            //variancia = Math.pow(vet[i] - media) ;
            variancia = (vet[i] - media) * (vet[i] - media) ;
        }
        variancia = media /2;

        return mev;
    }
}
