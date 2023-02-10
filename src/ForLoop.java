import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min and max numbers");
        int min = sc.nextInt();
        int max = sc.nextInt();
        for(int i =min;i<max ;i++){
           if(i%2==0)
                System.out.println(i+" is even number");
           // else System.out.println(i+" is odd number");
        }
        System.out.println("****************");
    }
}
