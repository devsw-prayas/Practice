import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UPrime {
    public static void main(String[] args) {
        LinkedHashSet<Integer> primes = new LinkedHashSet<>();
        boolean isPrime = true;
        for (int i = 1; i < 100000; i++) {
            for (int j = 2; j <= i / j; j++) {
                if(i % j == 0 || i == 1) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                primes.add(i);
            }
            isPrime = true;
        }

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        if(cases < 1 || cases > 1000) System.exit(0);
        

    }
}
