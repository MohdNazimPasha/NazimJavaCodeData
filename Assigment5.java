//Q5 . One File data store another File;
import java.io.*;

/**
 *
 * @author Nazim
 */
public class Assigment5 {
    public static void main(String[] args) throws IOException{
    FileReader fr = new FileReader ("C:\\Nazim\\a.txt");
    BufferedReader br = new BufferedReader(fr);
    FileWriter fw=new FileWriter("C:\\Nazim\\c1.txt");
    BufferedWriter bw=new BufferedWriter(fw);
    String sCurrentLine1;
         

			while (((sCurrentLine1=br.readLine() ) != null) ) {
				System.out.println(sCurrentLine1);
                                bw.write(sCurrentLine1);
                                bw.newLine();
                                bw.flush();
			}
     
    }
}
