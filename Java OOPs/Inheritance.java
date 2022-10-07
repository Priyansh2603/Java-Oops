//Inheritance and Polymorphism
class Person{
    String name;
    int age;
    String religion;
}
class Student extends Person{
    String school;
    int standard;
    float cgpa;
    public void personInfo(String name){
        System.out.println("Name : "+name);
        System.out.println("Age : "+this.age);
        System.out.println("Religion : "+this.religion);
    }
    public void personInfo(){
        System.out.println("School : "+this.school);
        System.out.println("Standard : "+this.standard);
        System.out.println("Cgpa : "+this.cgpa);
    }
}
public class Inheritance {
    public static void main(String args[]){
        String name= "Rohan";
        Student Rohan = new Student();
        Rohan.age= 22;
        Rohan.religion = "Hindu";
        Rohan.school = "ddps";
        Rohan.standard = 9;
        Rohan.cgpa = 9.85F;
        System.out.println("Personal Info :");
        Rohan.personInfo(name);
        System.out.println("Student Info :");
        Rohan.personInfo();
    }
}
