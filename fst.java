class Students{
    String name ;
    int age;
    int roll;
    char group;
    
    public void pirntStudentInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll);
        System.out.println(group);
    }
}
// constructors
class Constactor {
    String name;
    int age;
    
    // Normal constructor
    Constactor(){
        System.out.println("this is an normal constructor");
    }
    // parameter constructor
    Constactor(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printInfoOfConstruct(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // polimorfijom  or funtion overloading
    public void print(String name){
        System.out.println(name);
    }
    public void print(int age){
        System.out.println(age);
    }
    public void print(String name,int age){
        System.out.println(name + " " + age);
    }
}
// inhariants
class Paine {
    String color;
    
}
class Type extends Paine {
    String type;
    public void printInfoI(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
// protected opjects
class pop {

    public String subName;
    // Defarance betwine this two Variable's
    protected String name;
    
}
// private class
class privateClass {

    // this is an private opject
    private String name;

}
class GeterAndSeter{
    String name;

    // Geter
    public String getName(){
        return this.name;
    }
    // Seter
    public void setName(String name){
        this.name = name;
    }
}
// Encapsulation
class Encapsulation{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
// Abstract
abstract class Animal{
    abstract void walk();
}
class Horse extends Animal {
    public void walk(){
        System.out.println("Walks in 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks in 2 legs");
    } 
}
// Interfacesn
interface Cow{
    void wite();
}
class Hors implements Cow{
    public void wite(){
        System.out.println("Wites");
    }
}


public class fst {
    // public static void main(String[] args){
        
    //     Students student1 = new Students();
    //     student1.name = "Onim";
    //     student1.age = 18;
    //     student1.roll = 21;
    //     student1.group = 'A';

    //     // constructor execouteding in here
    //     Constactor peapoleInfo = new Constactor("Anonto",19);
    //     // peapoleInfo.printInfoOfConstruct();

    //     // Inharetans
    //     Paine write = new Paine();
    //     write.color = "blue";
        
    //     Type pan = new Type();
    //     pan.color = "red";
    //     pan.type = "Ball Pain";
    //     // pan.printInfoI();

    //     GeterAndSeter name = new GeterAndSeter();
    //     name.setName("Mariya Rohoman Supti");
    //     System.out.println(name.getName());

    //     // Abstract
        
    // }

    public static void main(String[] args) {
        Hors horse = new Hors();
        horse.wite();
    }
}