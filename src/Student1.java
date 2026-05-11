//   COPY CONSTRUCTOR

public class Student1 {
    String name;
    int id;

    Student1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Student1(Student1 s2) {
        this.name = s2.name;
        this.id = s2.id;
    }


    public static void main(String[] args) {
        System.out.println("First Student");
        Student1 S1 = new Student1("RAM", 99);
        System.out.println("ScholarName :" + S1.name + " " + "&" + " " + " ScholarId : " + S1.id);

        System.out.println();

        Student1 S3 = new Student1(S1);
        System.out.println("COPY CONSTRUCTOR");
        System.out.println("ScholarName :" + S3.name + " " + "&" + " " + " ScholarId : " + S3.id);

    }
}
