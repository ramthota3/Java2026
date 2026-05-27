import java.util.*;


public class Demotest {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;

        if(x == y){
            System.out.println("x and y are equal");
        }
        else {
            System.out.println("x and y are not equal");
        }

        User ravi = new User(1,"ravi");
        User ram = new User(1,"ravi");
    if (ravi.equals(ram)){
        System.out.println("ravi and ram are same");
    }
    else {
        System.out.println("ravi and ram are not same");
    }
        Set<User> userSet = new HashSet<>();

        userSet.add(ravi);
        userSet.add(ram);

        System.out.println("userSet.size: " + userSet.size());

        Map <Integer,User> userMap = new HashMap<>();
        userMap.put(1,ravi);
        userMap.put(1,ram);

        System.out.println("userMapSize: " + userMap.size());

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(45);
        numberList.add(20);

        Collections.sort(numberList);
        System.out.println("Sorted number list: " + numberList);



    }

}
