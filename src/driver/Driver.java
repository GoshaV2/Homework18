package driver;

import transport.Car;
import transport.Competitor;

public abstract class Driver<T extends Car> {
    private String fullName;
    private boolean hasDriverLicense;
    private int drivingExperienceYears;

    protected T car;

    public Driver(String fullName, boolean hasDriverLicense, int drivingExperienceYears) {
        this.fullName = fullName;
        this.hasDriverLicense = hasDriverLicense;
        this.drivingExperienceYears = drivingExperienceYears;
    }

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
    }

    protected abstract void startMove();

    protected abstract void endMove();

    protected abstract void refill();

    public void printInfo() {
        System.out.println("водитель " + fullName + " управляет автомобилем " + car.getBrand() + car.getModel() + " и будет участвовать в заезде");
    }
}
