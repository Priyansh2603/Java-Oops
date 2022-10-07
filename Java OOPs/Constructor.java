import java.util.Scanner;

class Player{
    String name;
    String team;
    int age;
    int matches;
    String profile;
    Player(String name, String team, int age, int matches, String profile){
        this.name = name;
        this.team = team;
        this.age = age;
        this.matches = matches;
        this.profile = profile; 
    }
    public void playerInfo(){
        System.out.println();
        System.out.println("The player is "+this.name);
        System.out.println(this.name +" plays for "+ this.team);
        System.out.println(this.name +" is "+ this.age+" yrs. old");
        System.out.println(this.name +" has played "+ this.matches+" matches");
        System.out.println(this.name +" is a "+ this.profile);
    }
}
public class Constructor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the deatails of the player.....");
        System.out.print(" Name : ");
        String nam = sc.next();
        System.out.println();
        System.out.print(" Team : ");
        String tem = sc.next();
        System.out.println();
        System.out.print(" Age : ");        
        int ag = sc.nextInt();
        System.out.println();
        System.out.print(" No. of Matches : ");
        int match = sc.nextInt();
        System.out.println();
        System.out.print(" Profile : ");
        String prof = sc.next();
        System.out.println();
        Player Dhoni = new Player(nam, tem, ag, match, prof);
        Dhoni.playerInfo();
    }
    //Polymorphism is when we craete many functions of same name in a class doing different tasks.
}
