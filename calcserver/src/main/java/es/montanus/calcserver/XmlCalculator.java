package es.montanus.calcserver;

public class XmlCalculator {
    private final Calculator calculator;

    public XmlCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculate(String xmlInput) {
        return calculator.calculate(1, 2, "/add");
    }
}
