//extends JFrame {} - унаследоваться от окна
//setTitle("..."); - название окна
//setBounds(); - задать границы окна
//setDefaultCloseOperation(EXIT_ON_CLOSE); закрыть программу при закрытии окна
//setVisible(true); - включить окошко, писать в самом конце
//JButton button = new JButton("..."); - создать кнопку
//add(button); - добавить кнопку на экран
//add(button, BorderLayout.CENTER,WEST,EAST,NORTH,SOUTH); - добавить кнопку на экран относительно сторон света
//JTextArea textArea = new JTextArea(); - многострочное поле
//add(textArea, BorderLayout); - разместить многострочное поле
//setLayout(new BorderLayout()); - добавить метод BorderLayout
//FlowLayout - располагает элементы друг за другом
//GridLayout - располагает элементы по заданной сетке
//GridBagLayout - располагает элементы на кастомной сетке
//BoxLayout - располагает элементы по вертикальной или горизантальной оси
//button.addActionListener(new ActionListener)
//JTextField textField = new JTextField(); - однострочное текстовое поле
//add(textField, BorderLayout.NORTH); - добавить текстовое поле на север
//Font font = new Font(name: "Arial", Font.PLAIN, size: 14); - задать шрифт
//textField.setFont(font);
//textField.setEditable(false,true); - запрет на изменение текстового поля
//textField.setHorizontalAlignment(SwingConstants.CENTER); - выравнивание текстового поля по горизонтали
//JPanel buttonsPanel = new JPanel(new GridLayout(задать столбцы и строки)); - создать панель
//add(buttonsPanel, BorderLayout.CENTER); - добавить панель в центр
//buttonsPanel.setBackground(Color.BLUE); - покрасить панель
//setResizable(true,false); - запрет изменения размера окна

//for (int i = 1; i <= 10; i++) {
// JButton button = new JButton(String.valueOf(i));
// buttonsPanel.add(button);
// }              добавить 10 кнопок через цикл

//Домашнее задание:
//1. Разобраться в коде игры "Угадай число"
//2. В игре "Угадай число" сделать кнопку перезапуска игры:
//   Приложение должно загадать новое число, и написать пользователю что игра началась
//3.* Попробуйте добавить 3 попытки на отгадывание


package org.example;


public class App {
    public static void main( String[] args ) {
        new Window();
    }
}
