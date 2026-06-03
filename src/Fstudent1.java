import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Fstudent1 {

    String name;
    int id;

    Fstudent1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {

        Fstudent1 s1 = new Fstudent1("RAM", 99);
        Fstudent1 s2 = new Fstudent1("RAJ", 101);
        Fstudent1 s3 = new Fstudent1("ARJUN", 102);
        Fstudent1 s4 = new Fstudent1("KIRAN", 103);

        System.out.println("Student Details");

        System.out.println("Name : " + s1.name + "  Id : " + s1.id);
        System.out.println("Name : " + s2.name + "  Id : " + s2.id);

        System.out.println();


        Function<Fstudent1, String> studentInfo = student ->
                "Student Name : " + student.name +
                        " , Student Id : " + student.id;

        System.out.println(studentInfo.apply(s1));

        System.out.println();

        List<Fstudent1> studentList = Arrays.asList(s1, s2, s3, s4);

        System.out.println();

        studentList.stream()
                .map(studentInfo)
                .forEach(System.out::println);
    }
}
