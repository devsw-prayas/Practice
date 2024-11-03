import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        double n = sc.nextDouble();

        if( n > 100){
            System.out.println("It is larger");
        } else if( n > 50) {
            System.out.println("Not too small");
        } else {
            System.out.println("Small");
        }
    }
}