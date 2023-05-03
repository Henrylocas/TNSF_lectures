class TestClass{  
    //private variable and method
    private int num=100;  
    private void printMessage(){System.out.println("Hello java");}  
     
}  
   
public class Main{  
 public static void main(String args[]){  
   TestClass obj=new TestClass();  
   System.out.println(obj.num);//try to access private data member - Compile Time Error  
   obj.printMessage();//Accessing private method - Compile Time Error  
   }  
} 
