package abstraction;


interface Multiply{
   // 2 abstract methods in interface class	
   public abstract int multiplyTwo(int n1, int n2);
   
   /* We need not to mention public and abstract in interface
    * as all the methods in interface are 
    * public and abstract by default so the compiler will
    * treat this as 
    * public abstract multiplyThree(int n1, int n2, int n3);
    */
   int multiplyThree(int n1, int n2, int n3);

   /* Regular (or concrete) methods are not allowed in an interface
    * so if I uncomment this method, you will get compilation error
    * public void disp(){
    *    System.out.println("I will give error if u uncomment me");
    * }
    */
}

class Demo implements Multiply
{
   public int multiplyTwo(int num1, int num2)
   {						//in One child class we are declaring two methods
      return num1*num2;
   }
   
   public int multiplyThree(int num1, int num2, int num3)
   {
      return num1*num2*num3;
   }
}
   public class TestInh3 {
public static void main(String args[]){
      Multiply obj = new Demo();
      System.out.println(obj.multiplyTwo(3, 7));
      System.out.println(obj.multiplyThree(1, 9, 0));
   }
}

