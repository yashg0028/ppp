package inheritance;

public class Mul2 {
	void disp() {
		System.out.println("pop");
	}
}

class Pio extends Mul2 {
	void oiu() {
		System.out.println("ror");
	}
}
class Rio extends Pio {
	void eww() {
		System.out.println("wer");
	}
	public static void main(String[] args) {
		Rio r=new Rio();
		r.eww();
		r.oiu();
		r.disp();
	}

}



