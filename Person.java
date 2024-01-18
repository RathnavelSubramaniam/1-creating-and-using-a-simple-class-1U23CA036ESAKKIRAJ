class person1{
    String firstname;
    String lastname;
    int age;
    person1(String fn,String ln,int a){
        firstname=fn;
        lastname=ln;
        age=a;
    }
    String getfullname(){
        return firstname+lastname;
    }
}
public class Person {
    public static void main(String[] args) {
       person1 a1=new person1("Jhon","Doe",30);
       person1 a2=new person1("Alice","Smith",25);
       System.out.println(a1.firstname+a1.lastname);
  System.out.println(a2.firstname+a2.lastname);
  System.out.println((a1.age+a2.age)/2);
    }
}
