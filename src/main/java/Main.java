import java.util.ArrayList;

public class Main {

    static void main(String[] args) {


        ArrayList<String> bus = new ArrayList<String>();

        // Original order:
        bus.add("Ryan");
        bus.add("Brandon");
        bus.add("Rebecca");
        bus.add("Richard");
        bus.add("Jessica");
        bus.add("Brian");
        bus.add("Antoinne");
        bus.add("Grace");
        bus.add("Zee");
        bus.add("Ibrahim");

        // Move Ibrahim to the back:
        bus.remove("Ibrahim");
        bus.add(0, "Ibrahim");

        // Move Rebecca to the front:
        bus.remove("Rebecca");
        bus.add("Rebecca");

        // Move Richard behind Antoinne:
        bus.remove("Richard");
        bus.add(6, "Richard");

        // Move Ryan to the front behind Rebecca:
        bus.remove("Ryan");
        bus.add(8, "Ryan");
        System.out.println(bus);
    }
}
