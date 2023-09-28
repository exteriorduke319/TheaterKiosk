import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;

        System.out.print("Please enter your age: ");
        age = scan.nextInt();
        if (age >= 21) {
            System.out.println("Please pick up your paper wristband");
        }
    }
}