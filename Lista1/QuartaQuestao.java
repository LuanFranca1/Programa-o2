public class Q4 {

    public static void main(String[] args) {

        int[][] m = {{2, 1, 3},{2, 5, 6},{3, 4, 6}};
        int [] vR=questao4(m);
    }
    public static int[] questao4(int[][] m) {

        int[] vetor = new int[6];

        vetor[0] = m[0][0];
        vetor[3] = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > vetor[0]) {
                    vetor[0] = m[i][j];
                    vetor[0] = i;
                    vetor[0] = j;
                }
                if (m[i][j] < vetor[j]) {
                    vetor[3] = m[i][j];
                    vetor[3] = i;
                    vetor[3] = j;
                }
            }
        }
        return vetor;

    }

}
