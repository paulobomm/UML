import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println(" Digite uma numero e veja que dia da semana é:  ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Other Day");
        }
    }















}
