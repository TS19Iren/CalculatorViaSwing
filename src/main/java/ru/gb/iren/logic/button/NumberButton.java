package ru.gb.iren.logic.button;

import javax.swing.*;

public class NumberButton extends JButton {
    public NumberButton(String text, JTextField textField) {
        super(text);
        this.addActionListener(e -> {
            if (textField.getText().equals("0"))
                textField.setText("");
            textField.setText(textField.getText() + text);
        });
    }
}
