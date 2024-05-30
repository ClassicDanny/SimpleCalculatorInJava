import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator.\n");
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("\nEnter second number");
        int b = sc.nextInt();
        System.out.println("\nEnter 1 for addition \nEnter 2 for substraction \nEnter 3 for multiplication \nEnter 4 for division \nEnter 5 for Modulo");
        int op = sc.nextInt();
        int c;
        switch (op){
            case 1: c = a + b;
            System.out.println(c);
            break;
            case 2: c = a - b;
            System.out.println(c);
            break;
            case 3: c = a*b;
            System.out.println(c);
            break;
            case 4: if (b==0){
                System.out.println("Operation cannot be perform");
            } else {
                c = a/b;
                System.out.println(c);
            }
            break;
            case 5: if (b==0){
                System.out.println("Operation cannnot be perform");
            } else {
                c = a%b;
                System.out.println(c);
            }
            break;
            default: System.out.println("Your have Entered Invalid value");
        }
        sc.close();
    }
}