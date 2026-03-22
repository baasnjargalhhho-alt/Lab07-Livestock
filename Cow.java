public class Cow extends Livestock implements WorkRole {

    public Cow(String name, int age) {
        super(name, age);
    }

    String makeSound() {
        return "Moorno!";
    }

    String makeSound(int volume) {
        return "moorno! (duu changa: " + volume + ")";
    }

    @Override
    public String performTask() {
        return "Uher suu ogdog.";
    }
}