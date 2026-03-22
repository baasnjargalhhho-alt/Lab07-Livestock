import java.io.PrintStream;
import java.util.ArrayList;

public class Herd {

    ArrayList<Livestock> livestock = new ArrayList<>();

    void addLivestock(Livestock animal) {
        livestock.add(animal);
    }

    void dailyRoutine() {
        PrintStream out = System.out;
        out.println("=== Odor tutmyn ajil ekhellee ===");
        for (Livestock animal : livestock) {
            out.println(animal.name + ":" + animal.makeSound());

            if (animal instanceof WorkRole) {
                out.println("→" + ((WorkRole) animal).performTask());
            }
        }
        out.println("=================================");
    }

    void grazeAll() {
        PrintStream out = System.out;
        out.println("=== Sureg belchij baina ===");
        Livestock[] herdArray = livestock.toArray(new Livestock[0]);
        for (Livestock animal : herdArray) {
            animal.graze();
        }
        out.println("==========================");
    }
}