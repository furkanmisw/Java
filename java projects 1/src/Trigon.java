import java.util.Scanner;

public class Trigon {
    public static void main(String[] args) {
        int getNumber;
        int startNumber = 1;
        Scanner scanner = new Scanner(System.in);
        getNumber = scanner.nextInt();
        while (startNumber < getNumber) {
            int inLoopNumber = 0;
            while (inLoopNumber < startNumber) {
                System.out.print("*");
                inLoopNumber++;
            }
            System.out.println("");
            startNumber++;
        }
        while (startNumber > 0) {
            int loopNumber = startNumber;
            while (loopNumber > 0) {
                System.out.print("*");
                loopNumber--;
            }
            System.out.println("");
            startNumber--;
        }
    }
}
