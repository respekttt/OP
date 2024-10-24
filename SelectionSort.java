public class SelectionSort implements Strategy {
    @Override
    public void sortingBSI(long[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            long temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
}
