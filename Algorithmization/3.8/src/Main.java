import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numerator = new int[5];
        int[] denominator = new int[5];

        for (int i = 0; i < numerator.length; i++) {
            numerator[i] = (int) (Math.random() * 1 + 1);
            denominator[i] = (int) (Math.random() * 2 + 2);
        }

        System.out.println("numerators : "+ Arrays.toString(numerator));
        System.out.println("denominators : "+ Arrays.toString(denominator));

        for (int i = 0; i < numerator.length; i++){
            for (int j = 0; j < denominator.length; j++){
                if (i != j){
                    numerator[i] *= denominator[j];
                }
            }
        }

        int generalDenominator = 1;

        for (int k : denominator) {
            generalDenominator *= k;
        }

        Arrays.fill(denominator, generalDenominator);



        System.out.print("\nFractions with general denominator: ");
        for (int i = 0; i < numerator.length; i++){
            System.out.print(numerator[i] + "/" + denominator[i] + "; " );
        }


        for (int i = 0; i < numerator.length - 1; i++){
            int x;
            if (i > 0){
                if(numerator[i] > numerator[i + 1]){
                    x = numerator[i];
                    numerator[i] = numerator[i + 1];
                    numerator[i + 1] = x;
                    i -= 2;
                }
            } else {
                if (numerator[i] > numerator[i + 1]) {
                    x = numerator[i];
                    numerator[i] = numerator[i + 1];
                    numerator[i + 1] = x;
                }
            }
        }

        System.out.print("\nresult: ");
        for (int i = 0; i < numerator.length; i++){
            System.out.print(numerator[i] + "/" + denominator[i] + ", ");
        }

    }
}
