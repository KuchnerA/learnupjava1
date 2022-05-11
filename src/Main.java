public class Main {

    public static void main(String[] args) {

        String name = "Maxim";
        int age = 26;
        int amount = 70_000; //RUB
        double rate = 3.4;

        System.out.println((60 - age) * (amount * rate / 100) + " RUB");

    }
}
