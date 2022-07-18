package Humanadvanced;

public class zan {
  Integer instanceVariable=10;
  static Integer staticVariable=30;
  private synchronized void nonstaticTest(){
 System.out.print("Non Static Method") ;
    ; 
    
  }
  
  static void staticTest(){
  System.out.println("Static");
    
  }
  public static void main (String [] args)
 
{
  zan fin=new zan();
  fin.instanceVariable=40;
  //fin.instanceVariable2=50;
 // fin.staticVariable 

  System.out.println("Hello");
  fin.nonstaticTest();
  staticTest();
  System.out.print(fin.instanceVariable);
  
  System.out.print(staticVariable);
}
}
