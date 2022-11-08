package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void main(String[] args) {
        printFactorialRow(5);
    }
    public static void printFactorialRow(int printToInclusive) {
        //1 2 6 24 120
        int counter = 1; // счетчик     5= 5*24 4=4*6 3 = 3*2  2=2*1 1=1*1 0=1
        int fact = 1; // произведение пред числа
        System.out.println(1);
        while (counter <= printToInclusive) {
            fact = fact * counter;
            System.out.println(fact);
            counter++;

        }
        }
    }