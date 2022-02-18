/*
 * HARSH SHAKYA
 * FEB 17, 2022
 * COMP SCI ASSIGNMENT 2 
 * MORSE CODE JAVA
 * Mr. Martins 
 */
package MorseCodeHarsh;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
// All the necessary commands for GUI and other stuff needed for this program
// Used some code off online sources and YouTUbe
public class MorseCodeHarsh {

    //letters converted into morse code  
    enum Code {
        A("A", ".-"), B("B", "-..."), C("C", "-.-."), D("D", "-.. "), 
        E("E","."), F("F", "..-."), G("G", "--."), H("H", "...."),
        I("I",".."), J("J", ".---"), K("K", "-.-"), L("L", ".-.."), 
        M("M","--"), N("N", "-."), O("O", "---"), P("P", ".--."), 
        Q("Q","--.-"), R("R", ".-."), S("S", "..."), T("T", "-"), 
        U("U","..-"), V("V", "...-"), W("W", ".--"), X("X", "-..-"), 
        Y("Y","-.--"), Z("Z", "--.."), 
        
        ONE("1", ".----"), TWO("2", "..---"), THREE("3", "...--"), FOUR("4", "....-"), FIVE("5", "....."), 
        SIX("6","-...."), SEVEN("7", "--..."), EIGHT("8", "---.."), NINE("9","----."), TEN("0", "-----");

        private final String input; // Input
 
        private final String output; // Output

        Code(final String input, final String output) { // String input/ Output
            this.input = input;
            this.output = output;
        }

        public String getCode() {
            return output;
        }

        public String getInput() {
            return input;
        }
    }

    
    public static void main(final String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        String word = JOptionPane.showInputDialog("Enter a word: ").replace(" ", ""); // Replace the spaces with null / Also show the GUI of the program
        
        for (final Code code : Code.values()) {  // Using the values from above
            word = word.replaceAll("(?ui)" + code.getInput(),  // Replaces the word then adds a space between each individual letter
                    "\n" + code.getCode());
        }
        System.out.println("The morse code of the input word is:"); // Dislpay the title
        System.out.println("--------------------------------");
        System.out.println(word); // Display the morse code for each individual letter     
        System.out.println("--------------------------------");
        
    }

}
