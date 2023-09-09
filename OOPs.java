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
