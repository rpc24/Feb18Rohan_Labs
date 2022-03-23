package com.cg.feb22.demo;
import java.io.*;
public class Demo {

	    public static void main(String args[])throws IOException, ClassNotFoundException{
	    Seriziables s1 = new Seriziables (100,"Varsha");
	          System.out.println("s1 object : "+s1.toString());
	          String s = "student.ser";
	          FileOutputStream fos = new FileOutputStream(s);
	          ObjectOutputStream oos = new ObjectOutputStream(fos);
	          oos.writeObject(s1);
	          oos.flush();
	          oos.close();
	            
	          Seriziables s2;
	          String st = "C:\\Users\\rohan\\eclipse-workspace\\feb22-react-java\\student.ser";
	          FileInputStream fis = new FileInputStream(st);
	          ObjectInputStream ois = new ObjectInputStream(fis);
	          s2 = (Seriziables)ois.readObject();
	          ois.close();
	          System.out.println("s2 object : "+s2.toString());   
	    }   

}
