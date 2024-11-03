import java.util.Scanner;

public class Algo {

    public void recur(int value){
        if(value == 1) System.out.print(value + " ");
        else if(value % 2 == 0){
            System.out.print(value + " ");
            recur(value/2);
        }
        else {
            System.out.print(value + " ");
            recur(3 * value  +1);
        }
    }

    public static void main(String[] args) {
        Algo a = new Algo();
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if(value < 1 || value > 1000000) System.exit(0);
        a.recur(value);
    }
}
