package encapsulation;

//A Account class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods.  

class Account {  
							//private data members  
private long acc_no;  
private String name,email;  
private float amount;  

							//public getter and setter methods  
public long getAcc_no() {  
  return acc_no;  
}  
public void setAcc_no(long a) {  
  acc_no = a;  
}  
public String getName() {  
  return name;  
}  
public void setName(String n) {  
  name = n;  
}  
public String getEmail() {  
  return email;  
}  
public void setEmail(String e) {  
  email = e;  
}  
public float getAmount() {  
  return amount;  
}  
public void setAmount(float a) {  
  amount = a;  
}  
}  


//A Java class to test the encapsulated class Account.  
public class TestEncap1 {
	
public static void main(String[] args) {  
			//creating instance of Account class  
  Account acc=new Account();  
  			//setting values through setter methods  
  acc.setAcc_no(7560504000L);  
  acc.setName("Sonoo Jaiswal");  
  acc.setEmail("sonoojaiswal@javatpoint.com");  
  acc.setAmount(500000f);  
  			//getting values through getter methods  
  System.out.println("ACCOUNT NUMBER : "+acc.getAcc_no());  
  System.out.println("NAME :	"+acc.getName());
  System.out.println("EMAIL : "+acc.getEmail());
  System.out.println("ACCOUNT : "+acc.getAmount());
}  
}  
