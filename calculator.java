//package workstation;
import java.util.*;
public class calculator {
    public static void main(String[]args){
        Scanner mo = new Scanner(System.in);
        System.out.println("Welcome to Calculator in Java");
        System.out.println("+ is for addtion, - is for subtration , / for divison, * for multiplication, % for modulas");
        System.out.println("Enter your operation: ");
        String cal= mo.nextLine();
        System.out.println("Enter your first integer: ");
        int A = mo.nextInt();
        System.out.println("Enter your second integer: ");
        int B = mo.nextInt();
        switch(cal){
            case("+"):
            System.out.println(A+B);
            break;

            case("-"):
            System.out.println(A-B);
            break;

            case("*"):
            System.out.println(A*B);

            case("/"):
            System.out.println(A/B);

            case("%"):
            System.out.println(A%B);
        mo.close();

    }
    
}
}
