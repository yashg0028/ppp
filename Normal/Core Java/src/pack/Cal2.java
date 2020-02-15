package pack;
import pack.Cal1;  //importing Cal1 class into Cal2.. Both classes are in same package 
public class Cal2 
{
public static void main(String args[]) {
	Cal1 c1=new Cal1();				//instance has to be created to imported class.
	
	System.out.println(c1.add(700,20));

}}
