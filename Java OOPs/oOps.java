import java.util.Scanner;

class Pen{
    String name;
    String color;
    String type;
    int price;
    public void giveInfo(){
        
        System.out.println("The color of "+this.name+" pen is "+this.color);
        System.out.println("The type of "+this.name+" pen is "+this.type);
        System.out.println("The cost of "+this.name+" pen is Rs."+this.price);
    }
}
public class oOps{
    public static void main(String args[]){
    Pen rorito = new Pen();
    rorito.color ="Black";
    rorito.type="Gel";
    rorito.price= 15;
    rorito.giveInfo();
    Pen cello = new Pen();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Name, Color, Type and Price of the pen");
    System.out.print("Name: ");
    String cname= sc.next();
    System.out.print("Color: ");
    String ccolor= sc.next();
    System.out.print("Type: ");
    String ctype= sc.next();
    System.out.print("Price: ");
    int cprice= sc.nextInt();
    cello.name = cname;
    cello.color = ccolor;
    cello.type = ctype;
    cello.price = cprice;
    cello.giveInfo();
    }
}