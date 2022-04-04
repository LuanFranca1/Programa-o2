public class QuintaQ {

    public static void main(String[] args) {
        double[][] vendaM = new double[12][4]; //valores declarados no teste;
       // double[] vR = {264,276,288,300}; na questão ele já vem preenchido
        double[] vR = questao5_1(vendaM);
        double [] vS = questao5_2(vendaM);
    }
    public static double[] questao5_1(double[][] vendaM) {

        double[] vetorPorM = new double[12];
        for (int i = 0; i < vetorPorM.length; i++) {
            for (int j = 0; j < 4; j++) {
                vetorPorM[i] = vetorPorM[i] + vendaM[i][j];
            }
        }
        return vetorPorM;
    }
    public static double[] questao5_2(double[][]vendaM){
        double[] vetorPorS = new double[4];
        for (int i = 0; i < vetorPorS.length; i++) {
            for (int j = 0; j < 4; j++) {
                vetorPorS[j] = vetorPorS[j] + vendaM[i][j];
            }
        }
        return vetorPorS;
        
    }
}
