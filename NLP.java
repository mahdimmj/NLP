/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlp;
/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;*/
import java.util.StringTokenizer;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
/*
 *
 * @author ma.mohammadi
 */
public class NLP {
public static String Convertfatext(String asciitext) {
        String convertenfa = "";
      for(int i=0; i < asciitext.length(); i++){
      switch(asciitext.charAt(i)) {

        case 'A' :
             convertenfa = convertenfa + "ا";
             break;
        case '~' :
             convertenfa = convertenfa + "آ";
             break;
        case 'b' :
             convertenfa = convertenfa + "ب";
             break;
        case 'p' :
             convertenfa = convertenfa + "پ";
             break;
        case 't' :
             convertenfa = convertenfa + "ت";
             break;
        case '@' :
             convertenfa = convertenfa + "ة";
             break;
        case 'C' :
             convertenfa = convertenfa + "ث";
             break;
        case 'j' :
             convertenfa = convertenfa + "ج";
             break;
        case 'c' :
             convertenfa = convertenfa + "چ";
             break;
        case 'H' :
             convertenfa = convertenfa + "ح";
             break;
        case 'x' :
             convertenfa = convertenfa + "خ";
             break;
        case 'd' :
             convertenfa = convertenfa + "د";
             break;
        case 'D' :
             convertenfa = convertenfa + "ذ";
             break;
        case 'r' :
             convertenfa = convertenfa + "ر";
             break;
        case 'z' :
             convertenfa = convertenfa + "ز";
             break;
        case 'J' :
             convertenfa = convertenfa + "ژ";
             break;
        case 's' :
             convertenfa = convertenfa + "س";
             break;
        case '$' :
             convertenfa = convertenfa + "ش";
             break;
        case 'S' :
             convertenfa = convertenfa + "ص";
             break;
        case 'X' :
             convertenfa = convertenfa + "ض";
             break;
        case 'T' :
             convertenfa = convertenfa + "ط";
             break;
        case 'Z' :
             convertenfa = convertenfa + "ظ";
             break;
        case 'E' :
             convertenfa = convertenfa + "ع";
             break;
        case 'G' :
             convertenfa = convertenfa + "غ";
             break;
        case 'f' :
             convertenfa = convertenfa + "ف";
             break;
        case 'q' :
             convertenfa = convertenfa + "ق";
             break;
        case 'k' :
             convertenfa = convertenfa + "ک";
             break;
        case 'g' :
             convertenfa = convertenfa + "گ";
             break;
        case 'l' :
             convertenfa = convertenfa + "ل";
             break;
        case 'm' :
             convertenfa = convertenfa + "م";
             break;
        case 'n' :
             convertenfa = convertenfa + "ن";
             break;
        case 'h' :
             convertenfa = convertenfa + "ه";
             break;
        case 'v' :
             convertenfa = convertenfa + "و";
             break;
        case 'y' :
             convertenfa = convertenfa + "ی";
             break;
        case 'a' :
             convertenfa = convertenfa + "َ";
             break;
        case 'e' :
             convertenfa = convertenfa + "ِ";
             break;
        case 'o' :
             convertenfa = convertenfa + "ُ";
             break;
        case '#' :
             convertenfa = convertenfa + "ّ";
             break;
        case 'I' :
             convertenfa = convertenfa +"ئ";
             break;
        case 'O' :
             convertenfa = convertenfa +"أ";
             break;
        case ',' :
             convertenfa = convertenfa +"،";
             break;
        default :
              convertenfa = convertenfa + asciitext.charAt(i);
      }
     }
    return convertenfa;
  }   
    
    public static String Converttext(String Originaltext) {
        String converttxt = "";
          for(int i=0; i < Originaltext.length(); i++){
          switch(Originaltext.charAt(i)) {
            case 'ء' :
                converttxt = converttxt + "'";
                break;
            case 'ا' :
                 converttxt = converttxt +"A";
                 break;
            case 'آ' :
                 converttxt = converttxt +"~";
                break;
            case 'ب' :
                 converttxt = converttxt +"b";
                 break;
            case 'پ' :
                 converttxt = converttxt +"p";
                 break;
            case 'ت' :
                 converttxt = converttxt +"t";
                 break;
            case 'ة' :
                 converttxt = converttxt +"@";
                 break;
            case 'ث' :
                 converttxt = converttxt +"C";
                 break;
            case 'ج' :
                 converttxt = converttxt +"j";
                 break;
            case 'چ' :
                 converttxt = converttxt +"c";
                 break;
            case 'ح' :
                 converttxt = converttxt +"H";
                 break;
            case 'خ' :
                 converttxt = converttxt +"x";
                 break;
            case 'د' :
                 converttxt = converttxt +"d";
                 break;
            case 'ذ' :
                 converttxt = converttxt +"D";
                 break;
            case 'ر' :
                 converttxt = converttxt +"r";
                 break;
            case 'ز' :
                 converttxt = converttxt +"z";
                 break;
            case 'ژ' :
                 converttxt = converttxt +"J";
                 break;
            case 'س' :
                 converttxt = converttxt +"s";
                 break;
            case 'ش' :
                 converttxt = converttxt +"$";
                 break;
            case 'ص' :
                 converttxt = converttxt +"S";
                 break;
            case 'ض' :
                 converttxt = converttxt +"X";
                 break;
            case 'ط' :
                 converttxt = converttxt +"T";
                 break;
            case 'ظ' :
                 converttxt = converttxt +"Z";
                 break;
            case 'ع' :
                 converttxt = converttxt +"E";
                 break;
            case 'غ' :
                 converttxt = converttxt +"G";
                 break;
            case 'ف' :
                 converttxt = converttxt +"f";
                 break;
            case 'ق' :
                 converttxt = converttxt +"q";
                 break;
            case 'ک' :
                 converttxt = converttxt +"k";
                 break;
            case 'گ' :
                 converttxt = converttxt +"g";
                 break;
            case 'ل' :
                 converttxt = converttxt +"l";
                 break;
            case 'م' :
                 converttxt = converttxt +"m";
                 break;
            case 'ن' :
                 converttxt = converttxt +"n";
                 break;
            case 'ه' :
                 converttxt = converttxt +"h";
                 break;
            case 'و' :
                 converttxt = converttxt +"v";
                 break;
            case 'ی' :
                 converttxt = converttxt +"y";
                 break;
            case 'ً' :
                 converttxt = converttxt +"aN";
                 break;
            case 'َ' :
                 converttxt = converttxt +"a";
                 break;
            case 'ِ' :
                 converttxt = converttxt +"e";
                 break;
            case 'ُ' :
                 converttxt = converttxt +"o";
                 break;
            case 'ّ' :
                 converttxt = converttxt +"#";
                 break;
            case 'ئ' :
                 converttxt = converttxt +"I";
                 break;
            case 'أ' :
                 converttxt = converttxt +"O";
                 break;
            case '،' :
                 converttxt = converttxt +",";
                 break;

            default :
                  converttxt = converttxt + Originaltext.charAt(i);
        }
      }
          return converttxt;
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("NLP");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton javaButton = new JButton("Tokenize");
        JTextArea textAreal = new JTextArea("", 30, 50);
        textAreal.setPreferredSize(new Dimension(100, 100));
        JTextArea textArea2 = new JTextArea("", 30, 10);
        textArea2.setPreferredSize(new Dimension(500, 10000));
        JTextArea textArea3 = new JTextArea("", 30, 10);
        textArea3.setPreferredSize(new Dimension(500, 10000));
        JScrollPane scrollPane = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        JScrollPane scrollPane2 = new JScrollPane(textArea3, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        textAreal.setLineWrap(true);
        textArea2.setLineWrap(true);
        textArea3.setLineWrap(true);
        frame.add(textAreal);
        frame.add(javaButton);
        frame.add(scrollPane);
        frame.add(scrollPane2);
        frame.pack();
        frame.setVisible(true);
    javaButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
                String newtoken;
            	String originaltext;
                originaltext = textAreal.getText();
                String asciitext;
                asciitext = Converttext(originaltext);
                /*BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("C:\\text\\1.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
                               fatoen.sCurrentLine2 = sCurrentLine;
                               fatoen.main();
                                
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
                try {
		File file = new File("c:\\text\\convert.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(converttxt);
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException c) {
			c.printStackTrace();
		}*/ 
            String token = ""; 
            textArea2.setText("");
            textArea3.setText("");
            newtoken = "";
            StringTokenizer st = new StringTokenizer(asciitext,"\n\r \f\t.-,؟!:",true);  
                while (st.hasMoreTokens()) {  
                  newtoken = st.nextToken();
                  if (!(newtoken.equals("\n") || newtoken.equals("\t") || newtoken.equals(" ") || newtoken.equals("\r")))
                  token = token + newtoken + "\n";  
                }
            textArea2.setText(token);
            textArea3.setText(Convertfatext(token));
         }
    });   
   }
}
