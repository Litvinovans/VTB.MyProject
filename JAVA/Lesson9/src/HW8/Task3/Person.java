package HW8.Task3;

abstract class Person implements Run,Swim {
    protected String name;
    Person (String name) {
        this.name = name;
    }
    public abstract String getName();

}
