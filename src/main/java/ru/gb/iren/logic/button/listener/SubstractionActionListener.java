package ru.gb.iren.logic.button.listener;

import ru.gb.iren.logic.CalculatorLogic;
import ru.gb.iren.operation.Addition;
import ru.gb.iren.operation.Subtraction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubstractionActionListener implements ActionListener {
    private final CalculatorLogic logic;
    private final JTextField valueField;

    public SubstractionActionListener(CalculatorLogic logic, JTextField valueField) {
        this.logic = logic;
        this.valueField = valueField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        logic.setCurrentValue(Double.parseDouble(valueField.getText()));
        logic.setOperation(new Subtraction());
        valueField.setText("0");

    }
}
