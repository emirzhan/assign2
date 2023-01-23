package kz.aitu.oop.practice.practice2;
public class Coupe extends Wagon{
    public Coupe(int id){
        super(id);
        super.capacity = 25;
        super.price = 4000;
        super.passengersInWagon = super.passengers.size();
    }
    @Override
    public void getInfoAboutWagon(){
        System.out.println("\t" + super.id + " Coupe wagon, capacity: " + super.capacity + ", price for ticket: " + super.price + " tenge, passengers in wagon:");
        for(int i = 0;i<super.passengersInWagon;i++){
            int number = i+1;
            System.out.println("\t\t\t"+ number+ ": " + super.passengers.get(i).getInfo());
        }
    }
}
