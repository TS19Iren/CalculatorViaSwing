package ru.gb.iren.logic.button;

import ru.gb.iren.logic.CalculatorLogic;
import ru.gb.iren.logic.button.listener.*;

import javax.swing.*;
import java.awt.event.ActionListener;

public class NonNumberButton extends JButton {
    private final CalculatorLogic logic;
    private final JTextField textField;

    public NonNumberButton(String text, CalculatorLogic logic1, JTextField textField) {
        super(text);
        this.textField = textField;
        this.logic = logic1;
        this.addActionListener(setActionListener(text));
    }

    private ActionListener setActionListener(String text) {
        return switch (text) {
            case "/" -> new DivideActionListener(logic, textField);
            case "*" -> new MultiplyActionListener(logic, textField);
            case "-" -> new SubstractionActionListener(logic, textField);
            case "=" -> new EqualActionListener(logic, textField);
            case "C" -> new ClearButtonListener(logic, textField);
            default -> new AdditionalActionListener(logic, textField);
        };
    }
}
