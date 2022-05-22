
package basesort;

public class BubbleSort extends BaseSort {

    @Override
    public int[] sort(int[] regVec) {
        int i, j, k;
        int temp;
        for (j = 0; j < regVec.length; j++) {
            for (i = 0; i < regVec.length - 1; i++) {
                if (regVec[i] < regVec[i + 1]) { //ordem decrescente é só alterar o sinal
                    temp = regVec[i];
                    regVec[i] = regVec[i + 1];
                    regVec[i + 1] = temp;
                }
            }
        }
        return regVec;
    }
}

