import java.util.*;

public class TestStudent {
    public static void main(String[] args) {

        int a = 20;
        int b = 20;

        if (a == b) {
            System.out.println("a and b are equal");
        } else {
            System.out.println("a and b are not equal");
        }

        Students raj = new Students(101, "Raj");
        Students arjun = new Students(101, "Arjun");

        if (raj.equals(arjun)) {
            System.out.println("raj and arjun are same");
        } else {
            System.out.println("raj and arjun are not same");
        }

        Set<Students> studentSet = new HashSet<>();

        studentSet.add(raj);
        studentSet.add(arjun);

        System.out.println("studentSet.size: " + studentSet.size());

        Map<Integer, Students> tsMap = new HashMap<>();

        tsMap.put(1, raj);
        tsMap.put(1, arjun);

        System.out.println("tsMapSize: " + tsMap.size());

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(77);
        numberList.add(33);
        numberList.add(98);


        Collections.sort(numberList);

        System.out.println("Sorted number list: " + numberList);


    }
}