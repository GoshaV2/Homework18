package driver;

import transport.Car;
import transport.PassengerCar;

public class DriverCategoryA extends Driver<PassengerCar> {

    public DriverCategoryA(String fullName, boolean hasDriverLicense, int drivingExperienceYears) {
        super(fullName, hasDriverLicense, drivingExperienceYears);
    }

    @Override
    public void startMove() {
        car.startMove();
    }

    @Override
    public void endMove() {
        car.endMove();
    }

    @Override
    public void refill() {
        System.out.println("Заправить " + car.getBrand() + " " + car.getModel());
    }
}
