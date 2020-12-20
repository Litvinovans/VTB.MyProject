package HW8.Task1;

abstract class Animal {
    protected String name;

    Animal (String name) {
        this.name = name;
    }

    public abstract String getName();
}
