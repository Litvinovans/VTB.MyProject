package HW8.Task3;

public class Man extends Person{
    protected int age;
    protected int sportSkills;

    Man (String name, int age, int sportSkills) {
        super(name);
        this.age = age;
        this.sportSkills = sportSkills;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void actRun(String name) {
        if (sportSkills>10)
            System.out.printf("%s имеет доступ на стадион. \n",name);
        else
            System.out.printf("Error! Доступ закрыт\n");
    }

    @Override
    public boolean wearBoots() {
        return true;
    }

    @Override
    public boolean wearSwimsuit() {
        return true;
    }

    @Override
    public void actSwim(String name) {
        if (sportSkills>10)
            System.out.printf("%s имеет доступ в бассейн. \n",name);
        else
            System.out.printf("Error! Доступ закрыт\n");
    }
}
