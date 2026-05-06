import java.util.Scanner;
public class Recursion {
    static int sum(int n) {
        if(n ==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = sum(num);
        System.out.println("The sum of first " + num + " natural numbers is: " + result);
    }
}