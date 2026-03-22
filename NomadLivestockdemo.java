import java.io.PrintStream;

public class NomadLivestockdemo {

    public static void main(String[] args) throws Exception {
        
        Horse mori   = new Horse("Mori", 4);
        Sheep honi = new Sheep("Honi", 2);
        Camel temee   = new Camel("Temee", 6);
        Goat yamaa    = new Goat("Ymaa", 3);
        Cow uher  = new Cow("Uher", 5);

        Herd herd = new Herd();
        herd.addLivestock(mori);
        herd.addLivestock(honi);
        herd.addLivestock(temee);
        herd.addLivestock(yamaa);
        herd.addLivestock(uher);

        herd.dailyRoutine();

        herd.grazeAll();

        PrintStream out = System.out;
        out.println("=== Ideeshilj baina ===");
        mori.graze("nogoo");
        honi.graze("ovs");
        temee.graze("zag");
        yamaa.graze("navch");
        uher.graze("ovsoo");

        out.println("=== Duun duugarah baidal ===");
        out.println(mori.makeSound());
        out.println(honi.makeSound());
        out.println(temee.makeSound());
        out.println(yamaa.makeSound());
        out.println(uher.makeSound());

        out.println("=== mal surag ===");
        Livestock[] animals = { mori, honi, temee, yamaa, uher };
        for (Livestock a : animals) {
            a.graze();
        }
    }
}