public class Ram extends Citizen{
    @Override
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18){
            throw new InvalidAgeException(" Ram is not eligible for voting");
        }
    }
}
