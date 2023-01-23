package kz.aitu.oop.practice.practice2;
public class HandicappedWagon extends Wagon {
    public HandicappedWagon(int id) {
        super(id);
        super.capacity = 10;
        super.price = 4000;
        super.passengersInWagon = super.passengers.size();
    }

    @Override
    public void addPassenger(Passenger passenger) {
        if ((getPassengersInWagon() < this.capacity)) {
            if (passenger.getDisability()) {
                this.passengers.add(passenger);
                passenger.setInTrain();
                setPassengersInWagon();
            }
            else{
                System.out.println("This wagon only for disabled people");
            }
        } else {
            System.out.println("Wagon is overloaded");
        }
    }
    @Override
    public void getInfoAboutWagon(){
        System.out.println("\t" + super.id + " Handicapped wagon, capacity: " + super.capacity + ", price for ticket: " + super.price + " tenge, passengers in wagon:");
        for(int i = 0;i<super.passengersInWagon;i++){
            int number = i+1;
            System.out.println("\t\t\t"+ number+ ": " + super.passengers.get(i).getInfo());
        }
    }
}
