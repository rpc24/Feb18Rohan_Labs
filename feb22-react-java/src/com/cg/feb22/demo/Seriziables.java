package com.cg.feb22.demo;
import java.io.*;
public class Seriziables implements Serializable{
	    int roll;
	    String sname;
	    public Seriziables(int r, String s){
	          roll = r;
	          sname = s;     }
	     public String toString(){
		        return "Roll no is : "+roll+"   Name is : "+sname;
	    } }



