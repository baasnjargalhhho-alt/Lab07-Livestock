import java.io.PrintStream;

public abstract class Livestock {

    String name; 
    int age;   

    public Livestock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String makeSound();

    void graze() {
        PrintStream out = System.out;
        out.println(name + " tald belchine.");
    }

    void graze(String food) {
        System.out.println(name + " " + food + "-idej baina.");
    }
}