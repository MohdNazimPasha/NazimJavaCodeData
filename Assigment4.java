
import java.io.*;

/**
 *
 * @author Nazim
 */
public class Assigment4 {
  public static void main(String[] args) throws IOException{
      
      try (FileReader fr1 = new FileReader ("C:\\Nazim\\a.txt");
           FileReader fr2 = new FileReader ("C:\\Nazim\\b.txt")                                                    ) {
          BufferedReader br1 = new BufferedReader(fr1);
           BufferedReader br2 = new BufferedReader(fr2);
        FileWriter fw=new FileWriter("C:\\Nazim\\c2.txt");
    BufferedWriter bw=new BufferedWriter(fw);
          String sCurrentLine1;
           String sCurrentLine2;
         

			while (((sCurrentLine1=br1.readLine() ) != null) ) {
				System.out.println(sCurrentLine1);
                                 bw.write(sCurrentLine1);
                                 bw.newLine();
                                 bw.flush();
			}
                        while (((sCurrentLine2=br2.readLine() ) != null) ) {
				System.out.println(sCurrentLine2);
                                 bw.write(sCurrentLine2);
                                bw.newLine();
                                bw.flush();
			}
		} catch (IOException e) {
		System.out.println(e);
		}
     // br.close();
      }
  }  
