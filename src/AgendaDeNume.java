import javax.swing.*;
import java.util.Scanner;

/**
 * Created by icondor on 26/03/16.
 */
public class AgendaDeNume {

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

    static String[] sirDeNume = new String[10];
    static int index=0;

    /* here starts the main class - exercitiu in clasa */
    public static void main(String[] arguments) {
        int optiune = 0;
        do {
            printConsole("1-listare ");
            printConsole("2-adaugare");
            printConsole("3-cautare");
            printConsole("7-exit");
            optiune = readIntConsole("alegeti un numar");
            if (optiune == 1)
                listare();
            else if (optiune == 2) {
                String v = readStringConsole("numele");
                creareFaraDuplicate(v);
            }

        } while (optiune != 7);
    }

        //do
            //listare
            //adaugare
            //acasa modificare
            //acasa stergere
            //cautare
            //acasa exit
        //while exit

//        listare();
//        creareFaraDuplicate("andrei");
//        creareFaraDuplicate("ion");
//        creareFaraDuplicate("maria");
//        creareFaraDuplicate("maria");
//        creareFaraDuplicate("ana");
//        listare();
//        int pozitie = cautare("maria");
//        System.out.println(pozitie);

    //end of main method

    public static void listare() {
        for (int i = 0; i<sirDeNume.length; i++){
            if (sirDeNume[i] != null) {
                printConsole(sirDeNume[i]);
            }
        }
    }

    public static void creare(String valoare) {
        sirDeNume[index] = valoare;
        index++;
    }

    public static void creareFaraDuplicate(String valoare) {
        int i = cautare(valoare);
        if (i!=-1 || index==0) { //negasita.. deci scri-o
            sirDeNume[index] = valoare;
            index++;
        } else {
            System.out.println("deja exista");
        }
    }

    public static int cautare(String valoare) {
        int r =-1; //negasit

        for (int i = 0; i<sirDeNume.length; i++){
            if (valoare.equals(sirDeNume[i])){
                r=i; //negasit pe pozitia x
                break;
            }
         }
    return r;
    }

}
// end of class
