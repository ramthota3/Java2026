// CONSTRUCTOR OVERLOADING

public class Student3 {
    int id;
    String name;

    Student3 (){
        this.id = 99;
        this.name = "Ram";
    }
     Student3(int i, String n){
        this.id = i;
        this.name = n;
     }
     public static void main(String[] args) {
        Student3 obj1 = new Student3();

        Student3 obj2 = new Student3(99,"Ram");

         System.out.println(obj1.id + " " + obj1.name);
         System.out.println(obj2.id + " " + obj2.name);
     }
}
