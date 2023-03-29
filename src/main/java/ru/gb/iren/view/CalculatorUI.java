package ru.gb.iren.view;

import ru.gb.iren.logic.CalculatorLogic;
import ru.gb.iren.logic.button.*;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Set;

public class CalculatorUI extends JFrame {
    private final CalculatorLogic logic;

    public CalculatorUI() {
        logic = new CalculatorLogic();
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {
        // Создаем поле для ввода значений
        JTextField valueField = new JTextField("0");
        valueField.setEditable(false);
        valueField.setHorizontalAlignment(JTextField.RIGHT);
        valueField.setFont(new Font("Segoe UI", Font.PLAIN, 36));
        valueField.setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10), new LineBorder(Color.GRAY, 1)));


        // Создаем панель для размещения компонентов
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        buttonPanel.setBackground(Color.WHITE);
        String[] buttonLabels = new String[]{"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+","C"};
        final var strings = Set.of("/", "*", "-", ".", "=", "+","C");
        for (String buttonLabel : buttonLabels) {
            if (strings.contains(buttonLabel)) {
                buttonPanel.add(new NonNumberButton(buttonLabel, logic, valueField));
            } else
                buttonPanel.add(new NumberButton(buttonLabel, valueField));
        }

        // Добавление компонентов на окно калькулятора
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(valueField, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        setResizable(false);
    }


}
