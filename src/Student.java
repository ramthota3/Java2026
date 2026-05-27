
import java.util.HashSet;

class Student {

    int id;
    String name;

    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        Student s = (Student) obj;

        if(this.id == s.id && this.name.equals(s.name)) {

            return true;
        }
        else {

            return false;
        }
    }
}

 class HashSetEqualsExample {

    public static void main(String[] args) {

        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student(101, "Ram");
        Student s2 = new Student(101, "Ram");

        hs.add(s1);
        hs.add(s2);

        System.out.println("HashSet Size : " + hs.size());

        for(Student s : hs) {

            System.out.println(s.id + " " + s.name);
        }

        if(s1.equals(s2)) {

            System.out.println("Both objects are equal");
        }
        else {

            System.out.println("Objects are not equal");
        }
    }
}
