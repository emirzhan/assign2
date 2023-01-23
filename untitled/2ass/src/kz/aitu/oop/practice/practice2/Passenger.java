package kz.aitu.oop.practice.practice2;
public class Passenger {
    private int id;
    private int age;
    private String name;
    private boolean disability;
    private boolean isInTrain = false;

    public Passenger(int id, int age, String name, boolean disability) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.disability = disability;
    }

    public int getId() {
        return id;
    }

    public boolean getIsInTrain() {
        return this.isInTrain;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return "\t\t\t" + getId() + " , " + getName() + " ," + getAge() + " years old, disability: " + getDisabilityInfo();
    }

    public String getDisabilityInfo() {
        if (this.disability) {
            return "disabled person";
        }
        return "not disabled person";
    }

    public boolean getDisability() {
        return this.disability;
    }

    public void setInTrain() {
        this.isInTrain = true;
    }
}

