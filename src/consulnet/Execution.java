package consulnet;

public class Execution {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.getCalculationDetails(7,3,'=');
        calculator.calculatorAction();
        float result = calculator.getCalculationResult();

        System.out.println(result);

    }
}