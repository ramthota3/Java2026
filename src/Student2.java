// CONSTRUCTORS


// PARAMETERIZED CONSTRUCTOR

public class Student2 {
    int id;
    String name;

    Student2(String name, int id)
    {
        this.name = name;
        this.id = id;

    }
    void display(){
        System.out.println("StudentName : "+ name + " " + "&" + " " + "Student id : " + id);

    }
    public static void main(String[ ] args){
        Student2 s2 = new Student2("RAM", 99);
        s2.display();
    }
      }


