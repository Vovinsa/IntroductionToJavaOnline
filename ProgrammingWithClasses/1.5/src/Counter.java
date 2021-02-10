public class Counter {

    private int countStat;
    private int countCycle;

    public Counter(int startPosition){
        get(startPosition);
    }

    private void get(int startPosition) {
        if (startPosition >= 0 && startPosition < 10) {
            countStat = startPosition;
            countCycle = 0;

        } else if (startPosition >= 10) {
            countStat = startPosition % 10;
            countCycle = startPosition / 10;
        }
    }

    public void printStat() {
        System.out.println(getCountCycle() + " " + getCountStat());
    }

    public int getCountStat() {
        return countStat;
    }

    public int getCountCycle() {
        return countCycle;
    }

    public void increase(int step) {
        for(int i = 0; i < step; i++) {
            if (countStat < 10) {
                countStat++;
            } else {
                countCycle++;
                countStat = 0;
            }
        }
    }

    public void decrease(int step){
        for (int i = 0; i < step; i++){
            if (countStat >= 0) {
                countStat--;
            } else {
                countCycle--;
                countStat = 9;
            }
        }
    }

}
