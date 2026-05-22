public class Sonu extends Citizen{
    @Override
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 21){
            throw new InvalidAgeException("Sonu is eligible for voting");
        }
    }
}
