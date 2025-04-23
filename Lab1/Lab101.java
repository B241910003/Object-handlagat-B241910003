import java.util.List;


import java.util.ArrayList;
import java.util.List;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Lion extends Animal {
    Lion() {
        super("Arslan");
    }
}

class Crane extends Animal {
    Crane() {
        super("Togoruu");
    }
}

public class Lab101 {
    public static void main(String[] args) {
        List<Lion> lions = new ArrayList<>();
        lions.add(new Lion());

        List<Crane> cranes = new ArrayList<>();
        cranes.add(new Crane());

        List<Animal> animals = new ArrayList<>();

        Zoo<Animal> zoo = new Zoo<>();
        zoo.transferAnimals(lions, animals);
        zoo.transferAnimals(cranes, animals);

        animals.forEach(System.out::println);
    }
}