
/*
 Q1. Create a file abc.txt and read a file path from it.
 */
package Assigment;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Nazim
 */
public class assigment1 {
  public static void main(String[] args) throws IOException {
  File f=new File ("C:\\Nazim\\abc.txt");
  //boolean b=f.createNewFile();
  System.out.println(f.getAbsolutePath());
   
  }
  } 
