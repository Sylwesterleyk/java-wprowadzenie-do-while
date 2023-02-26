public class ExcerciseOne {
    public static void main(String[] args) {
        int number = 21;
        do {
            int modulo = number % 2;
            System.out.print(modulo);
            number = number / 2;
        } while (number > 0);
    }
}
