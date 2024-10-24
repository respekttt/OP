public class Work {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(long[] array) {
        strategy.sortingBSI(array);
    }
}
