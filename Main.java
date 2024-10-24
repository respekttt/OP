public class Main {
    public static void main(String[] args) {
        long[] array = new long[] { 200L, 500L, 100L, 300L, 800L };
        Work work = new Work();
        work.setStrategy(new BubbleSort());
        work.executeStrategy(array);
        System.out.println("BubbleSort: ");
        printArray(array);
        work.setStrategy(new SelectionSort());
        work.executeStrategy(array);
        System.out.println("SelectionSort: ");
        printArray(array);
        work.setStrategy(new InsertionSort());
        work.executeStrategy(array);
        System.out.println("InsertionSort: ");
        printArray(array);
    }

    public static void printArray(long[] array) {
        for (long numb : array) {
            System.out.print(numb + " ");
        }
        System.out.println();
    }
}
