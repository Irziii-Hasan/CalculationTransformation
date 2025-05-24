package consulnet;
import java.util.Scanner;



public class Calculator {

    int result;

    Scanner sc = new Scanner(System.in);

    public int calculatorAction(int num1, int num2, char symbol) {
        switch (symbol){
            case '+':
                result= num1 + num2;
                break;
            case '-':
                result= num1 - num2;
                break;
            case '*':
                result= num1 * num2;
                break;
            case '/':
                result= num1 / num2;
                break;
            default:
                System.out.println("Invalid Symbol");
        }

        return result;
    }
}
