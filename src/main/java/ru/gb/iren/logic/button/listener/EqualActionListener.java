package ru.gb.iren.logic.button.listener;

import ru.gb.iren.logic.CalculatorLogic;
import ru.gb.iren.operation.Addition;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class EqualActionListener implements ActionListener {
    private final CalculatorLogic logic;
    private final JTextField valueField;

    public EqualActionListener(CalculatorLogic logic, JTextField valueField) {
        this.logic = logic;
        this.valueField = valueField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double value = Double.parseDouble(valueField.getText());
        logic.performOperation(value);
        final var bigDecimal = BigDecimal.valueOf(logic.getCurrentValue()).setScale(10, RoundingMode.HALF_UP);
        valueField.setText(bigDecimal.toPlainString());
    }
}
