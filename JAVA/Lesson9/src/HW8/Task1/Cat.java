package HW8.Task1;

class Cat extends Animal implements Swim,Run {

    Cat(String name) {
        super(name);
    }
    @Override
    public String getName() {
        return name;
    }

    public void actSwim(String name) {
        System.out.printf("%s умеет плавать!\n",name);
    }
    public void actRun(String name)
    {
        System.out.printf("%s умеет бегать!\n",name);
    }
}
