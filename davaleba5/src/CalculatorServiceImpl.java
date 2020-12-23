public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double prod(double a, double b) {
        return a * b;
    }
}