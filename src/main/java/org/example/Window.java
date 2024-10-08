package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JTextField textField;
    private int randomNumber;
    private int continues;

    public Window() {
        this.randomNumber = (int) (Math.random() * 10) + 1;
        this.continues = 3;
        setTitle("Угадай число");
        setBounds(600, 300, 600, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Угадай число от 1 до 10, у Вас 3 попытки");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 16);
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);

            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex);
                }
            });
        }

        JPanel restartButtonPanel = new JPanel(new GridLayout(1, 1));
        add(restartButtonPanel, BorderLayout.SOUTH);

        JButton buttonRestart = new JButton();
        buttonRestart.setFont(font);
        buttonRestart.setText("Рестарт");
        restartButtonPanel.add(buttonRestart);
        buttonRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Программа загадала новое число");
                randomNumber = (int) (Math.random() * 10) + 1;
            }
        });

        setVisible(true);
    }

    private void tryToAnswer(int answer) {
        if (answer == randomNumber) {
            textField.setText("Победа, это число " + randomNumber);
            return;
        }
        if (answer > randomNumber) {
            continues--;
            textField.setText("Загаданное число меньше, чем " + answer + " у вас осталось " + continues + " попытки");
        }
        if (answer < randomNumber) {
            continues--;
            textField.setText("Загаданное число больше, чем " + answer + " у вас осталось " + continues + " попытки");
        } else if (continues == 0) {
            textField.setText("Ты проиграл, нажми рестарт");
        }
    }
}