/*
 * this is an 64 bit decimal to binary converter
 * that means this can convert any number up to 9,223,372,036,854,775,807
 */
package decimaltobinaryconverter;
import javax.swing.*;
/**
 *
 * @author Jordan Hamilton
 */
public class DecimalToBinaryConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long decimal = 0;
        long remainders[] = new long[64];
        long currentPos = 0;
        long pastVal = 0;
        
        String binaryNumber = "";
        
        JFrame f = new JFrame();
        String UI = JOptionPane.showInputDialog(f, "What Number Do You Want Converted?");
        
        long startVal = Long.parseLong(UI);
        
        currentPos = startVal;
        pastVal = currentPos;
        
        for(int i = 63; i >= 0; i--){
            remainders[i] = currentPos % 2;
            currentPos = pastVal / 2;
            pastVal = currentPos;
        }
        for(int j = 0; j <= remainders.length - 1; j++){
            binaryNumber += remainders[j]; 
        }
        System.out.println(binaryNumber);
        System.exit(0);
    }
}
