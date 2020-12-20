package HW8.Task1;

class Dog extends Animal implements Swim,Run {

    Dog (String name) {
        super(name);
    }

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
