public class Camel extends Livestock implements WorkRole {

    public Camel(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Builna!";
    }

    String makeSound(int volume) {
        return "Builna! (duu changa: " + volume + ")";
    }

    @Override
    public String performTask() {
        return ("Temee jin teedegchdiin ajild hereglegdene.");
    }
}