package ru.gb.iren.logic;

import ru.gb.iren.operation.Addition;
import ru.gb.iren.operation.Operation;

public class CalculatorLogic {
    private double currentValue;
    private Operation currentOperation;

    public CalculatorLogic() {
        currentValue = 0;
        currentOperation = new Addition();
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double value) {
        currentValue = value;
    }

    public void setOperation(Operation operation) {
        currentOperation = operation;
    }

    public void performOperation(double value) {
        currentValue = currentOperation.operate(currentValue, value);
    }
}
