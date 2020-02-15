package conditions;

public class TestNest {
public static void main(String args[]) {
	
	int age=25;    
    int weight=48; 
    int color=98;
    int height=100;
    						//applying condition    
	  if(age>=18){    
           System.out.println("You are eligible to donate blood");    
	  if(weight>50){    
	       System.out.println("You are not eligible to donate blood");    
	        }  
	  if(color>50){    
	       System.out.println("good looking");   
	        }  
	  if(height>150){    
	       System.out.println("good height");   
	        }  
	  
	   else{  
	      System.out.println("Age must be greater than 18");  
	    }  

}
}}