package formulario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario {

    public JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JLabel label1;
    private JTable table;

    public Formulario() {
        panel1 = new JPanel();
        textField1 = new JTextField(15);
        textField2 = new JTextField(15);
        button1 = new JButton("Click");
        label1 = new JLabel("Mostrar");

        String[][] data = {
                {"1", "Fuego", "Rojo"},
                {"2", "Tierra", "Verde"}
        };
        String[] columnas = {"ID", "Elemento", "Color"};
        table = new JTable(data, columnas);

        JScrollPane scroll = new JScrollPane(table);

        panel1.add(textField1);
        panel1.add(textField2);
        panel1.add(label1);
        panel1.add(button1);
        panel1.add(scroll);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                label1.setText("Texto: " + text1 + " " + text2);
            }
        });
    }
}
