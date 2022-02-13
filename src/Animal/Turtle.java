package Animal;

public class Turtle extends Animal{
    public Turtle(String name){
        super(name);
    }
    public void swim(){
        System.out.println(name+" swimming");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void hunting() {
        System.out.println(name+" hunting fish eggs");


    }
}
