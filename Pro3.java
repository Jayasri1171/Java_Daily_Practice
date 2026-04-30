import java.util.Scanner;
public class Pro3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("Hello " + input + ", you are an adult.");
        } else {
            System.out.println("Hello " + input + ", you are a minor.");
        }
    }
}