package ru.gb.iren.logic.button.listener;

import ru.gb.iren.logic.CalculatorLogic;
import ru.gb.iren.operation.Addition;
import ru.gb.iren.operation.Division;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionalActionListener implements ActionListener {
    private final CalculatorLogic logic;
    private final JTextField valueField;

    public AdditionalActionListener(CalculatorLogic logic, JTextField valueField) {
        this.logic = logic;
        this.valueField = valueField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        logic.setCurrentValue(Double.parseDouble(valueField.getText()));
        logic.setOperation(new Addition());
        valueField.setText("0");

    }
}
