import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by icondor on 26/03/16.
 */
public class P1 {

    /* utility methods for INPUT/OUTPUT using a GUI or Console, please leave them as they are */

    // GUI
    public static int readIntGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        int returnValue = Integer.parseInt(input);
        return returnValue;
    }

    public static double readDoubleGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        double returnValue = Double.parseDouble(input);
        return returnValue;
    }

    public static String readStringGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        return input;
    }

    public static void printGUI(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(int text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(double text) {
        JOptionPane.showMessageDialog(null, text);
    }

    // CONSOLE
    public static String readStringConsole(String label) {
        System.out.print(label);
        String input = new Scanner(System.in).nextLine();
        return input;
    }

    public static int readIntConsole(String label) {
        System.out.print(label);
        int input = new Scanner(System.in).nextInt();
        return input;
    }

    public static double readDoubleConsole(String label) {
        System.out.print(label);
        double input = new Scanner(System.in).nextDouble();
        return input;
    }

    public static void printConsole(String text) {
        System.out.println(text);
    }

    public static void printConsole(int text) {
        System.out.println(text);
    }

    public static void printConsole(double text) {
        System.out.println(text);
    }
    /* end of utility methods*/

    /* here starts the main class - exercitiu in clasa */
    public static void main(String[] arguments) {

        String user = "ana";
        String parola = "cucu76";

        //lansare Notepad () doar daca combinatia este corecta

        boolean run = true;
        int count = 0;

        do {
            String u = readStringGUI("User");
            String p = readStringGUI("Parola");

            if (user.equals(u) && parola.equals(p)) {
                LansareNotePad();
                run = false;
            }
            count++;
            if (count == 3) {
                break;
            }

        }
        while (run = true);
    }

    //end of main method
    public static void LansareNotePad() {
        // code de pe net
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("lansare");
    }
}


// end of class
