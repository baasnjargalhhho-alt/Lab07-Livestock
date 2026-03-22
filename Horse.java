public class Horse extends Livestock implements WorkRole {

    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Yantsgaana!";
    }

    String makeSound(int volume) {
        return "Yantsgaana! (duu changa: " + volume + ")";
    }

    @Override
    public String performTask() {
        return ("Mori unalgad hereglegdene.");
    }
}