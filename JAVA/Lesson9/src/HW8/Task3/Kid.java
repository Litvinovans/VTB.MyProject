package HW8.Task3;

public class Kid extends Person{
    protected int age;

    Kid (String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void actRun(String name) {
        System.out.printf("%s любит бегать на перемене в школе. \n",name);
    }

    @Override
    public boolean wearBoots() {
        return true;
    }

    @Override
    public boolean wearSwimsuit() {
        return false;
    }

    @Override
    public void actSwim(String name) {
        System.out.printf("%s не умеет плавать. \n",name);
    }
}
