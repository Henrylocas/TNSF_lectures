public class StringBuffer{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello ");  
sb.append("Java");//now original string is changed  
System.out.println(sb);
  sb.insert(1,"Java"); 
System.out.println(sb);
  System.out.println(sb.capacity());
}  
}  
