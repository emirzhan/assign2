package kz.aitu.oop.practice.practice2;
import java.util.ArrayList;
import java.util.List;

public class Locomotive {
    private float speed;
    private List<Wagon> wagons = new ArrayList<Wagon>();
    private int numberOfWagons;

    public Locomotive(float speed) {
        this.speed = speed;
        this.numberOfWagons = 0;
    }
    public void addWagon(Wagon wagon){
        this.wagons.add(wagon);
        this.numberOfWagons++;
    }
    public void removeWagon(int wagonID){
        this.wagons.remove(wagonID);
        this.numberOfWagons--;
    }
    public void getInfoAboutWagons(){
        for(int i=0;i<this.numberOfWagons;i++){
            System.out.print("\t"+(i+1) + ":");
            this.wagons.get(i).getInfoAboutWagon();
        }
    }
    public float getSpeed(){
        return this.speed;
    }
    public Wagon trainWagon(int id){
        return this.wagons.get(id);
    }
}
