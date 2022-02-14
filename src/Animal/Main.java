package Animal;


import jdk.dynalink.linker.support.TypeUtilities;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Shark("Shark"),
                new Turtle("Turtle"),
                new Eagle("Eagle")};

        for (Animal a : animals) {
            if (a.getClass().getName().equals("Animal.Shark")){
                System.out.println(a);
            }
            if (a instanceof Shark) {
                ((Shark) a).attack();
                System.out.println();
            }

            /*if (a instanceof Shark) {
                System.out.println(a);
                ((Shark) a).attack();
            }*/

            if (a.getClass().getName().equals("Animal.Turtle")) {
                System.out.println(a);
            }
            if (a instanceof Turtle) {
                ((Turtle) a).swim();
                System.out.println();
            }

            /*if (a instanceof Turtle) {
                System.out.println(a);
                ((Turtle) a).swim();
            }*/

            if (a.getClass().getName().equals("Animal.Eagle")) {
                System.out.println(a);
            }
            if (a instanceof Eagle) {
                ((Eagle) a).fly();
            }

            /*if (a instanceof Eagle) {
                System.out.println(a);
                ((Eagle) a).fly();
            }*/

//        Shark shark = new Shark("Shark");
//        shark.attack();
//        System.out.println();
//
//        Turtle turtle = new Turtle("Turtle");
//        turtle.swim();
//        System.out.println();
//
//        Eagle eagle = new Eagle("Eagle");
//        eagle.fly();
            }
        }
    }
