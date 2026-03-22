public class Goat extends Livestock implements WorkRole {

    public Goat(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Mailna!";
    }

    String makeSound(int volume) {
        return "Mailna! (duu changa: " + volume + ")";
    }

    @Override
    public String performTask() {
        return "Yamaa suu, noos ogdog.";
    }
}