import javax.swing.*;
import java.awt.*;

public class asd {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    JTextArea textArea = new JTextArea();
    String output = "";

    for(int i = 0; i < numbers.length; i++) {
      output += numbers[i] + "\n";
    }

    textArea.setText(output);

    // Встановлюємо вирівнювання тексту по горизонталі на лівий край


    JFrame frame = new JFrame("Мій JFrame");
    JPanel panel = new JPanel();

    // Встановлюємо менеджер розміщення BorderLayout для панелі
    panel.setLayout(new BorderLayout());

    // Додаємо JTextArea до центру панелі
    panel.add(textArea, BorderLayout.CENTER);

    frame.add(panel);
    frame.pack();
    frame.setVisible(true);

    textArea.setCaretPosition(textArea.getDocument().getLength());
  }
}
