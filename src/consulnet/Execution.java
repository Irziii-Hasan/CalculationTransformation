package consulnet;

public class Execution {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.calculatorAction(3,7,'-');
        System.out.println(result);

    }
}