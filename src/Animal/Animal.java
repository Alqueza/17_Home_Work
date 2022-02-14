package Animal;

public class Animal {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void hunting(){
        System.out.println(name+" hunting of something");
    }

    @Override
    public String toString() {
        return "Название животного: "+name;
    }
}
