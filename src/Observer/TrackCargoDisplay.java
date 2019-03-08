package Observer;

import java.util.Observable;
import java.util.Observer;

public class TrackCargoDisplay implements Observer, DisplayElement {
    private String cargoNumber;
    private String location;
    private boolean isArrived;

    public TrackCargoDisplay(Observable obs) {
        obs.addObserver(this);
    }

    public void update(Observable obs, Object obj) {
        if(obs instanceof CargoData){
            CargoData cd = (CargoData)obs;
            cargoNumber = cd.getCargoNumber();
            location = cd.getLocation();
            isArrived = cd.getIsArrived();
        }
        display();
    }

    public void display() {
        System.out.println("TRACK INFORMATION OF THE CARGO");
        System.out.println("-Cargo Number: " + cargoNumber);
        System.out.println("-Current Location: " + location);

        if(isArrived == true) {
            System.out.println("-Cargo is delivered.");
        }
        else {
            System.out.println("-Cargo is not delivered yet." + "\n");
        }
    }
}
