public class OOPs {
    public static void main(String args[]){
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);

        Student s1 = new Student("Rohit");
        System.out.println(s1.name);



        bankAcc myAcc = new bankAcc();
        myAcc.username = "Rohit";
        //myAcc.password = "adcfjdu";   //Password is not visible
        myAcc.setPassword("hellowb");
    }
}
class Pen{
    String color;
    int tip;

    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class bankAcc{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Student{
    String name;
    int roll;

    Student (String name){
        this.name = name;
    }
}
//Abstraction
abstract class Animals{
    void animal(){
        System.out.println("Animal Class called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walks();
}

class Horse extends Animals{
    void walks(){
        System.out.println("Walks on 4 legs");
    }
}

//Interfaces 
interface Chess{
    void move();
}
class Queen implements Chess{
    public void move(){
        System.out.println("Moves");
    }
}

//Nested classes
class Stu{
    String name;
    int roll;

    static String Schoolname; //Declare ones and whenever called will get the same school name

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
