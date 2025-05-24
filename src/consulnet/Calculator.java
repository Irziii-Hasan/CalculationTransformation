package consulnet;
import java.util.Scanner;



public class Calculator {

    int firstNum, secondNum, result;
    char operator;

//    Scanner sc = new Scanner(System.in);

    public void getCalculationDetails(int num1, int num2 , char symbol){
        firstNum = num1;
        secondNum = num2;
        operator = symbol;

    }

    public void calculatorAction() {
        switch (operator){
            case '+':
                result= firstNum + secondNum;
                break;
            case '-':
                result= firstNum - secondNum;
                break;
            case '*':
                result= firstNum * secondNum;
                break;
            case '/':
                result= firstNum / secondNum;
                break;
            default:
                System.out.println("Invalid Symbol");
        }
    }


    public int getCalculationResult(){
        return result;
    }
}
