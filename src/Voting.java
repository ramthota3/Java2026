public class Voting {
    public static void main (String[] args){
        Citizen c;
        c = new Ram();
        try {
            c.checkAge(17);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception : " + e.getMessage());
        }

    }
}
