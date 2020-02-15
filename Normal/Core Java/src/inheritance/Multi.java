package inheritance;

public class Multi {
	void eat(){System.out.println("eating...");}  
	}  
	class Multi1 extends Multi{  
	void bark(){System.out.println("barking...");}  
	}  
	class Multi2 extends Multi1{  
	void weep(){System.out.println("weeping...");}  
	}  
	class TestInheritance2{  
	public static void main(String args[]){  
		Multi2 d=new Multi2();  
	d.weep();  
	d.bark();  
	d.eat();  
	}

}
