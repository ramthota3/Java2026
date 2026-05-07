public class Uppercase {

    static String convertToUpper(String text) {
        return text.toUpperCase();
    }

    public static void main(String[] args) {

        String name = "hello";

        String result = convertToUpper(name);

        System.out.println("Uppercase String: " + result);
    }
}
