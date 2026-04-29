import java.util.Scanner;
public class Pro2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int firstnumber = sc.nextInt();
        int secondnumber = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(firstnumber + secondnumber);
                break;  
            case '-':
                System.out.println(firstnumber - secondnumber);
                break;
            case '*':
                System.out.println(firstnumber * secondnumber);
                break; 
            case '/':
                if(secondnumber != 0){
                    System.out.println(firstnumber / secondnumber);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");  
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
        }
    }
}