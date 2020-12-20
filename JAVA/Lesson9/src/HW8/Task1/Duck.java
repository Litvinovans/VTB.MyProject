package HW8.Task1;

class Duck extends Animal implements Swim,Fly {

    Duck (String name) {
        super(name);
    }
    public String getName() {return name;}

    public void actSwim(String name) {
        System.out.printf("%s умеет плавать!\n",name);
    }

    public void actFly (String name)
    {
        System.out.printf("%s умеет бегать!\n",name);
    }
}