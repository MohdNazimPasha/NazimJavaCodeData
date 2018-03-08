/*
 Q2. Create a file abc.txt and read multiple path from it.
 */


package Assigment;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Nazim
 */
public class Assigment2 {
  public static void main(String[] args) throws IOException {
  File f=new File ("C:\\Nazim\\abc.txt");
  //boolean b=f.createNewFile();
  
  int c;
  
       FileReader fr=new FileReader(f);
  while (( c=fr.read())!= -1){
      
  
      System.out.print((char)c);
  }
  } 
}
