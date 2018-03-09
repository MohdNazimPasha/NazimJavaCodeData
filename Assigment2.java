/*Q2 . a.txt File   b.text File                  Output Screen
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
public class Assigment2 {
  public static void main(String[] args) throws IOException{
      
      try (FileReader fr1 = new FileReader ("C:\\Nazim\\a.txt");
           FileReader fr2 = new FileReader ("C:\\Nazim\\b.txt")                                                    ) {
          BufferedReader br1 = new BufferedReader(fr1);
           BufferedReader br2 = new BufferedReader(fr2);
        
          String sCurrentLine1;
           String sCurrentLine2;
         

			while (((sCurrentLine1=br1.readLine() ) != null)&&((sCurrentLine2=br2.readLine() ) != null) ) {
				System.out.println(sCurrentLine1);
                                System.out.println(sCurrentLine2);
			}
                        
		} catch (IOException e) {
		System.out.println(e);
		}
     
      }
  }  
