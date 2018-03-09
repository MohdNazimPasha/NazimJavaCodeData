/*Q3 . a.txt File   b.text File                  Output Screen and store File c1.txt
       AAA          111                           AAA
       BBB          222                           111
       CCC          333                           BBB
                                                  222
                                                  CCC
                                                  333
*/
import java.io.*;

/**
 *
 * @author Nazim
 */
public class Assigment3 {
  public static void main(String[] args) {
      
      try (FileReader fr1 = new FileReader ("C:\\Nazim\\a.txt");
           FileReader fr2 = new FileReader ("C:\\Nazim\\b.txt");
           FileWriter fw=new FileWriter("C:\\Nazim\\c1.txt")) {
          BufferedReader br1 = new BufferedReader(fr1);
          BufferedReader br2 = new BufferedReader(fr2);
          BufferedWriter bw=new BufferedWriter(fw);
          String sCurrentLine1;
          String sCurrentLine2;
         
                       
			while (((sCurrentLine1=br1.readLine() ) != null)&&((sCurrentLine2=br2.readLine() ) != null) ) {
				System.out.println(sCurrentLine1);
                                bw.write(sCurrentLine1);
                                bw.newLine();
                                bw.flush();
                                System.out.println(sCurrentLine2);
                                bw.write(sCurrentLine2);
                                bw.newLine();
                                bw.flush();
			}
                        
		} catch (IOException e) {
		System.out.println(e);
		}
             
      }
     
      }
  