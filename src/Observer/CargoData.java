package Observer;

import java.util.Observable;

public class CargoData extends Observable {
    private String cargoNumber;
    private String description;
    private String address;
    private String location;
    private boolean isArrived;

    public CargoData(String cargoNumber, String description, String address, String location) {
        this.cargoNumber = cargoNumber;
        this.description = description;
        this.address = address;
        this.location = location;
        isArrived = false;
    }

    private void locationChanged() {
        setChanged();
        notifyObservers();
    }

    private void isArrivedChanged() {
        setChanged();
        notifyObservers();
    }

    //Setters
    public void setLocation(String location) {
        this.location = location;
        locationChanged();
    }

    public void setIsArrived(Boolean isArrived) {
        this.isArrived = isArrived;
        isArrivedChanged();
    }

    //Getters
    public String getCargoNumber() {
        return cargoNumber;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }

    public boolean getIsArrived() {
        return isArrived;
    }
}
