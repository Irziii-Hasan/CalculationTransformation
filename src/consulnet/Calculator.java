package consulnet;
import java.util.Scanner;



public class Calculator {

    float firstNum, secondNum, result;
    char operator;


//    getting calculation details and set it in variables.
    public void getCalculationDetails(float num1, float num2 , char symbol){
        firstNum = num1;
        secondNum = num2;
        checkOperator(symbol);
    }


//    checking if operator is correct.
    public void checkOperator(char operator){
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/'){
            this.operator = operator;
        }else {
            System.out.println("Wrong operator usage");
        }
    }


//    performing calculation
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


//    sending calculated result.
    public float getCalculationResult(){
        return result;
    }
}
