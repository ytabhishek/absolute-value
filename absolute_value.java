package conditional;
import java.util.Scanner;
public class absolute_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int n = sc.nextInt();
        if(n < 0){
            n = n*(-1);

        }
        System.out.println("Your number is absoulte : " +n);
    }
}
