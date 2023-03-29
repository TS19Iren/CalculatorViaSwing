package ru.gb.iren.logic.button.listener;

import ru.gb.iren.logic.CalculatorLogic;
import ru.gb.iren.operation.Clear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListener implements ActionListener {
    private final JTextField valueField;
    private final CalculatorLogic logic;

    public ClearButtonListener(CalculatorLogic logic, JTextField valueField) {
        this.valueField = valueField;
        this.logic = logic;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        valueField.setText("0");
        logic.setCurrentValue(0);
        logic.setOperation(new Clear());
    }
}
