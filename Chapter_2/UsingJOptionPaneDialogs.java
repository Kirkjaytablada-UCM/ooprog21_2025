import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {

        String name;
        int choice;

        do {

            name = JOptionPane.showInputDialog("Enter your name:");


            if (name == null) {
                break;
            }


            choice = JOptionPane.showConfirmDialog(null, "Do you want to display your name?");


            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
            }


        } while (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION);
    }
}