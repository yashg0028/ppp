package programmes;

import java.util.Scanner;

import org.yaml.snakeyaml.Yaml;

public class LeapYear {
	
		   public static void main(String[] args){
	      int year;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter an Year :: ");
	      year = sc.nextInt();
	      sc.close();
	      if (((year % 4== 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year : " +year);
	      else
	         System.out.println("Specified year is not a leap year : " +year);
	   }
	}
