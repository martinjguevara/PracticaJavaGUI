import formulario.Formulario;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        JFrame frame = new JFrame("Mi Formulario");
                        Formulario formulario = new Formulario();
                        frame.setContentPane(formulario.panel1);
                        JMenuBar menuBar = new JMenuBar();
                        JMenu menu = new JMenu("Archivo");
                        JMenuItem item1 = new JMenuItem("Opcion1");
                        JMenuItem item2 = new JMenuItem("Opcion2");
                        JMenuItem item3 = new JMenuItem("Opcion3");
                        menu.add(item1);
                        menu.add(item2);
                        menu.add(item3);
                        menuBar.add(menu);
                        frame.setJMenuBar(menuBar);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.pack();
                        frame.setSize(400, 400);
                        frame.setVisible(true);
                    }
                }
        );
    }
}