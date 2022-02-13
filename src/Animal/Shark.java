package Animal;
public class Shark extends Animal{
    public Shark(String name){
        super(name);
    }

    public void attack(){
        System.out.println(name+" attacking!");

    }
    @Override
    public void hunting() {
        System.out.println(name+" hunting fish");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
