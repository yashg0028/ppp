package inheritance;

class Single1 {					// first class
	 void teach() {
	  System.out.println("Teaching subjects77");
	 }
	}
	class Single2 extends Single1 {			//Second class derives from first
	 void listen() {
	  System.out.println("Listening to teacher88");
	 }
	
	 public static void main(String args[]) {
		 Single2 s1 = new Single2();		//calling sub class
	  s1.teach();
	  s1.listen();
	 }
	}