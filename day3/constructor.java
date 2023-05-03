public class constructor{  
int id;  
String name;  
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  
Student3 s1=new Student3(1,"Rahul Yadav");  
Student3 s2=new Student3();  
s1.display();  
s2.display();  
}  
}  
