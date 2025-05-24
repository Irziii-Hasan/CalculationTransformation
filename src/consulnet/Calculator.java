package consulnet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    public void calculatorAction(int num1, int num2, char symbol) {
        switch (symbol){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid Symbol");
        }
    }
}
