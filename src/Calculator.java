import contracts.ICalculator;
import exceptions.InvalidDivisionException;

public class Calculator implements ICalculator {
    @Override
    public double add(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public double subtract(double n1, double n2) {
        return n1 - n2;
    }

    @Override
    public double multiply(double n1, double n2) {
        return n1 * n2;
    }

    @Override
    public double divide(double numerator, double denominator) throws InvalidDivisionException {    
        if (denominator == 0) {
            throw new InvalidDivisionException("Invalid division operation: Can't divide by 0");
        }

        return numerator / denominator;
    }    
}
