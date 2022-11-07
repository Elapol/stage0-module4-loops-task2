package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void main(String[] args) {
        printPower(5);
    }
    public static void printPower(int power) {
        int counter=0;
        while(counter<=power) {
            System.out.println("2^" + counter);
            counter++;
        }

    }
}
