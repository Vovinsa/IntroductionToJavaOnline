import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayFillSum(15, 12, 800)));

    }

    public static int [] arrayFillSum(int size, int sumNum, int maxVal){
        int [] array = new int[size];

        for (int i = 0; i < array.length; i++){
            int checkSum = 0;
            array[i] = (int) (Math.random() * maxVal);
            int checkNum = array[i];
            do {
                checkSum += checkNum % 10;
                checkNum /= 10;
            } while (checkNum > 0);
            if (checkSum != sumNum){
                i--;
            }
        }

        return array;
    }
}
