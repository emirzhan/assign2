import kz.aitu.oop.practice.practice2.*;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void getInfoAboutFreePassengers(List<Passenger> pas) {
        for (int i = 0; i < pas.size(); i++) {
            if (!pas.get(i).getIsInTrain()) {
                System.out.println(pas.get(i).getInfo());
            }
        }
    }

    public static void showInfoAboutTrains(Train tr1, Train tr2, Train tr3) {
        tr1.getInfoAboutTrain();
        tr2.getInfoAboutTrain();
        tr3.getInfoAboutTrain();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        List<Passenger> passengers = PassengerLoader.loadFromTxt("C:\\Users\\Admin\\Desktop\\passengers.txt");
        Locomotive TA33A = new Locomotive(120);
        Locomotive TAM11A = new Locomotive(100);
        Locomotive TAM15 = new Locomotive(90);
        Train astana_almaty = new Train("1.Astana-Almaty", TA33A, "2:05-19:53");
        Train kostanay_karagandy = new Train("2.Kostanay-Karagandy", TAM11A, "12:53-4:03");
        Train kokshetau_shimkent = new Train("3.Kokshetau-Shimkent", TAM15, "6:05-23:44");
        System.out.println("Hello, this is menu, where you can manage with tickets and train:");
        while (true) {
            System.out.println("Choose the option");
            System.out.println("1. Add wagon to the train");
            System.out.println("2. Remove wagon from the train");
            System.out.println("3. Add passengers to the wagon");
            System.out.println("4. Remove passenger from the wagon");
            System.out.println("5. Check list of the tickets");
            System.out.println("6. Check trains condition");
            System.out.println("7. Quit from menu");
            byte choose = scan.nextByte();
            if (choose == 1) {
                System.out.println("Choose the train(number):\n");
                showInfoAboutTrains(astana_almaty, kostanay_karagandy, kokshetau_shimkent);
                System.out.println("And choose the wagon: 1.Luxe, 2.Coupe, 3.HandicappedWagon\n");
                byte chooseTrain = scan.nextByte();
                byte chooseWagon = scan.nextByte();
                if (chooseTrain > 3 || chooseTrain < 0 || chooseWagon > 3 || chooseWagon < 0) {
                    System.out.println("Not right input\n");
                } else {
                    if (chooseTrain == 1) {
                        switch (chooseWagon) {
                            case 1:
                                Luxe wagon = new Luxe(Math.abs(random.nextInt()));
                                astana_almaty.trainLocomotive().addWagon(wagon);
                                break;
                            case 2:
                                Coupe wagon1 = new Coupe(Math.abs(random.nextInt()));
                                astana_almaty.trainLocomotive().addWagon(wagon1);
                                break;
                            case 3:
                                HandicappedWagon wagon2 = new HandicappedWagon(Math.abs(random.nextInt()));
                                astana_almaty.trainLocomotive().addWagon(wagon2);
                                break;
                        }
                    } else if (chooseTrain == 2) {
                        switch (chooseWagon) {
                            case 1:
                                Luxe wagon = new Luxe(Math.abs(random.nextInt()));
                                kostanay_karagandy.trainLocomotive().addWagon(wagon);
                                break;
                            case 2:
                                Coupe wagon1 = new Coupe(Math.abs(random.nextInt()));
                                kostanay_karagandy.trainLocomotive().addWagon(wagon1);
                                break;
                            case 3:
                                HandicappedWagon wagon2 = new HandicappedWagon(Math.abs(random.nextInt()));
                                kostanay_karagandy.trainLocomotive().addWagon(wagon2);
                                break;
                        }
                    } else if (chooseTrain == 3) {
                        switch (chooseWagon) {
                            case 1: {
                                Luxe wagon = new Luxe(Math.abs(random.nextInt()));
                                kokshetau_shimkent.trainLocomotive().addWagon(wagon);
                                break;
                            }
                            case 2: {
                                Coupe wagon1 = new Coupe(Math.abs(random.nextInt()));
                                kokshetau_shimkent.trainLocomotive().addWagon(wagon1);
                                break;
                            }
                            case 3: {
                                HandicappedWagon wagon2 = new HandicappedWagon(Math.abs(random.nextInt()));
                                kokshetau_shimkent.trainLocomotive().addWagon(wagon2);
                                break;
                            }
                        }
                    }
                    System.out.println("Wagon was added\n");
                }
            } else if (choose == 2) {
                showInfoAboutTrains(astana_almaty, kostanay_karagandy, kokshetau_shimkent);
                System.out.println("Choose train:\n");
                int chooseTrain = scan.nextByte();
                System.out.println("Choose wagon \n");
                int chooseWagon = scan.nextInt();
                if (chooseTrain == 1) {
                    astana_almaty.trainLocomotive().removeWagon(chooseWagon - 1);
                } else if (chooseTrain == 2) {
                    kostanay_karagandy.trainLocomotive().removeWagon(chooseWagon - 1);
                } else if (chooseTrain == 3) {
                    kokshetau_shimkent.trainLocomotive().removeWagon(chooseWagon - 1);
                }
                System.out.println("Wagon was removed\n");
            } else if (choose == 3) {
                showInfoAboutTrains(astana_almaty, kostanay_karagandy, kokshetau_shimkent);
                System.out.println("Choose train and wagon \n");
                byte chooseTrain = scan.nextByte();
                int chooseWagon = scan.nextInt();
                getInfoAboutFreePassengers(passengers);
                System.out.println("Choose the passenger\n");
                byte choosePassenger = scan.nextByte();
                if (chooseTrain == 1) {
                    astana_almaty.trainLocomotive().trainWagon(chooseWagon - 1).addPassenger(passengers.get(choosePassenger));
                } else if (chooseTrain == 2) {
                    kostanay_karagandy.trainLocomotive().trainWagon(chooseWagon - 1).addPassenger(passengers.get(choosePassenger));
                } else if (chooseTrain == 3) {
                    kokshetau_shimkent.trainLocomotive().trainWagon(chooseWagon - 1).addPassenger(passengers.get(choosePassenger));
                }
                System.out.println("Passenger has been added\n");
            } else if (choose == 4) {
                showInfoAboutTrains(astana_almaty, kostanay_karagandy, kokshetau_shimkent);
                System.out.println("Choose train and wagon");
                byte chooseTrain = scan.nextByte();
                byte chooseWagon = scan.nextByte();
                System.out.println("Choose passenger");
                byte choosePassenger = scan.nextByte();
                if (chooseTrain == 1) {
                    astana_almaty.trainLocomotive().trainWagon(chooseWagon - 1).removePassenger(choosePassenger - 1);
                } else if (chooseTrain == 2) {
                    kostanay_karagandy.trainLocomotive().trainWagon(chooseWagon - 1).removePassenger(choosePassenger - 1);
                } else if (chooseTrain == 3) {
                    kokshetau_shimkent.trainLocomotive().trainWagon(chooseWagon - 1).removePassenger(choosePassenger - 1);
                }
                System.out.println("Passenger was removed from the train");
            } else if (choose == 5) {
                getInfoAboutFreePassengers(passengers);
            } else if (choose == 6) {
                showInfoAboutTrains(astana_almaty, kostanay_karagandy, kokshetau_shimkent);
            } else if (choose == 7) {
                System.out.println("Thanks for using our app!\n");
                break;
            }
        }
    }
}