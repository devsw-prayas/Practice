import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i <= n/i; i++){
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        int left = 0, right = 0;
        if (isPrime) {
            System.out.println("The given number is a prime number");
        }else{
            isPrime = true;
            //Find nearest
            for(int i = n+1;; i++ ){
                for(int j = 2; j <= i/j; j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    left = i;
                    break;
                }
                isPrime = true;
            }

            for(int i = n-1;; i--){
                for(int j = 2; j <= i/j; j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    left = i;
                    break;
                }
                isPrime = true;
            }

            if(Math.abs(n - left) >= Math.abs(n - right)) {
                System.out.println("Nearest prime is: "+right);
            }else System.out.println("Nearest prime is: "+left);
        }
    }
}