package kz.aitu.oop.practice.practice2;
public class Train {
    private Locomotive locomotive;
    private String direction;
    private String time;
    public Train(String direction,Locomotive loc,String time){
        this.locomotive=loc;
        this.direction=direction;
        this.time = time;
    }
    public void getInfoAboutTrain(){
        System.out.println(this.direction + ", Time interval: " + this.time + ", speed: " + this.locomotive.getSpeed());
        this.locomotive.getInfoAboutWagons();
    }
    public Locomotive trainLocomotive(){
        return this.locomotive;
    }
}
