package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void main(String[] args) {
        printPower(-5);
    }

    public static void printPower(int power) { //1 2 4 8 16 32
        //1 , 2*1 , 2*2, 2*2*2 , 2*2*2*2, 2*2*2*2*2
        int counter = 1;
        int result = 1; //прошлое произв
        if (power < 0) {
            System.out.println("too much power");
        } else {
            System.out.println(1);
            while (counter <= power) {
                result = result * 2;
                System.out.println(result);
                counter++;
            }

        }
    }
}

