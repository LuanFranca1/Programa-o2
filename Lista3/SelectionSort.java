
package basesort;

public class SelectionSort extends BaseSort {

    @Override
    public int[] sort(int[] regVec) {
        for (int i = 0; i < regVec.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < regVec.length; j++) {
                if (regVec[j] < regVec[index]) {
                    index = j;////procurando o índice mais baixo;
                }
            }
            int smallerNumber = regVec[index];
            regVec[index] = regVec[i];
            regVec[i] = smallerNumber;
        }
        return regVec;
    }
}

