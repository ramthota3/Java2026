import java.util.*;

class Members implements Comparable<Members> {

    String name;
    int salary;

    Members(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Members m) {
        return this.salary - m.salary;
    }

    @Override
    public String toString() {
        return name + " : " + salary;
    }
}

 class ComparableExample {

    public static void main(String[] args) {

        List<Members> members = Arrays.asList(
                new Members("Ram", 30000),
                new Members("Ravi", 25000),
                new Members("Raj", 40000)
        );

        Collections.sort(members);

        System.out.println(members);
    }
}