package Observer;

import java.util.Observable;

public class CargoData extends Observable
{
    private String cargoNumber;
    private String description;
    private String address;
    private String location;
    private boolean isArrived;

    public CargoData(String cargoNumber, String description, String address, String location)
    {
        this.cargoNumber = cargoNumber;
        this.description = description;
        this.address = address;
        this.location = location;
        isArrived = false;
    }

    private void LocationChanged()
    {
        setChanged();
        notifyObservers();
    }

    private void IsArrivedChanged()
    {
        setChanged();
        notifyObservers();
    }

    //Setters
    public void SetLocation(String location)
    {
        this.location = location;
        LocationChanged();
    }

    public void SetIsArrived(Boolean isArrived)
    {
        this.isArrived = isArrived;
        IsArrivedChanged();
    }

    //Getters
    public String GetCargoNumber()
    {
        return cargoNumber;
    }

    public String GetDescription()
    {
        return description;
    }

    public String GetAddress()
    {
        return address;
    }

    public String GetLocation()
    {
        return location;
    }

    public boolean GetIsArrived()
    {
        return isArrived;
    }
}
