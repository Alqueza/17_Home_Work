package Animal;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Shark("Shark"),
        new Turtle("Turtle"),
        new Eagle("Eagle")};

        for (Animal a: animals) {
            System.out.println();
            System.out.println(a);
            a.hunting();
            System.out.println();
        }


        Shark shark = new Shark("Shark");
        shark.attack();
        System.out.println();

        Turtle turtle = new Turtle("Turtle");
        turtle.swim();
        System.out.println();

        Eagle eagle = new Eagle("Eagle");
        eagle.fly();

    }
}
