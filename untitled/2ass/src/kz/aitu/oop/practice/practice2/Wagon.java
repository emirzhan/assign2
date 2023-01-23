package kz.aitu.oop.practice.practice2;
import java.util.ArrayList;
import java.util.List;

public abstract class Wagon{
    protected int price;
    protected int capacity;
    protected int passengersInWagon = 0;
    protected int id;
    protected List<Passenger> passengers = new ArrayList<Passenger>();

    public Wagon(int id) {
        this.id = id;
    }

    public void addPassenger(Passenger passenger) {
        if (getPassengersInWagon() < this.capacity) {
            this.passengers.add(passenger);
            passenger.setInTrain();
            setPassengersInWagon();
        }
        else{
            System.out.println("Wagon is overloaded");
        }
    }
    public void removePassenger(int passengerId){
        this.passengers.remove(passengerId);
        System.out.println("Passenger was removed from the train");
        this.passengersInWagon--;
    }

    public void setPassengersInWagon() {
        this.passengersInWagon = this.passengers.size();
    }

    public int getPassengersInWagon() {
        return this.passengersInWagon;
    }
    public void getInfoAboutWagon(){
    }

}
