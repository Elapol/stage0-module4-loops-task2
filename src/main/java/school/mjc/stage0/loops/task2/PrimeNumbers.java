package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(25);
    }

    public static void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive != 0 || printToInclusive != 1) {
            int counter = 2;
            int divider = 1;
            int flag = 0;
            while (counter <= printToInclusive) {
                while (divider <= counter) {
                    if (counter % divider == 0) {
                        flag++;
                    }
                    if (counter == divider && flag <= 2) {
                        System.out.println(counter);
                    }
                    divider++;
                }
                counter++;
                divider = 1;
                flag = 0;
            }
        }
    }
}