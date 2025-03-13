
import javax.swing.*;

class LabelExample {
    public static void main(String args[]) {
        JFrame f = new JFrame("Label Example");

        JLabel l1 = new JLabel("First name");
        l1.setBounds(50, 50, 100, 30);

        JLabel l2 = new JLabel("Second name");
        l2.setBounds(50, 100, 100, 30);

        f.add(l1);
        f.add(l2);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}