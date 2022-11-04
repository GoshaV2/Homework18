import driver.DriverCategoryA;
import driver.DriverCategoryB;
import driver.DriverCategoryD;
import transport.Bus;
import transport.Competitor;
import transport.PassengerCar;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        task1234();
    }

    private static void task1234() {
        PassengerCar passengerCar1 = new PassengerCar("BMW", "#1");
        passengerCar1.setVolumeEngine(10);
        passengerCar1.setTypeBody(PassengerCar.TypeBody.Sedan);
        PassengerCar.TypeBody.printTypeBody(passengerCar1);
        PassengerCar passengerCar2 = new PassengerCar("AUDI", "A3");
        passengerCar2.setVolumeEngine(7);
        PassengerCar passengerCar3 = new PassengerCar("MERCEDES", "BENZ");
        passengerCar3.setVolumeEngine(15);
        PassengerCar passengerCar4 = new PassengerCar("Девятка", "Легендарная");
        passengerCar4.setVolumeEngine(20);

        Truck truck1 = new Truck("Грузовик", "e");
        truck1.setVolumeEngine(3);
        Truck truck2 = new Truck("Монстр", "Гонщик");
        truck2.setVolumeEngine(5);
        Truck truck3 = new Truck("Камаз", "Огромный");
        truck3.setVolumeEngine(25);
        Truck truck4 = new Truck("Грузовик2", "Ф3");
        truck4.setVolumeEngine(10);

        Bus bus1 = new Bus("Желтый", "В2");
        truck1.setVolumeEngine(23);
        Bus bus2 = new Bus("Школьный", "Ж3");
        truck2.setVolumeEngine(15);
        Bus bus3 = new Bus("Синий Московский", "О2");
        truck3.setVolumeEngine(23);
        Bus bus4 = new Bus("СССРовский", "У5");
        truck4.setVolumeEngine(100);

        passengerCar1.startMove();
        truck1.startMove();
        bus1.startMove();
        passengerCar1.endMove();
        truck1.endMove();
        bus1.endMove();


        passengerCar1.setMaxSpeed(150);
        bus1.setMaxSpeed(140);
        truck1.setMaxSpeed(130);
        passengerCar1.setBestLapTime(3.2f);
        bus1.setBestLapTime(2.9f);
        truck1.setBestLapTime(3.1f);
        Competitor[] competitors = new Competitor[]{passengerCar1, bus1, truck1};
        for (Competitor el : competitors) {
            System.out.println("Лучшее время круга " + el.getBestLapTime());
            System.out.println("Максимальная скорость " + el.getMaxSpeed());
            el.pitStop();
        }

        DriverCategoryA driverCategoryA=new DriverCategoryA("A",true,12);
        DriverCategoryB driverCategoryB=new DriverCategoryB("B",false,5);
        DriverCategoryD driverCategoryD=new DriverCategoryD("D",true,8);
        driverCategoryA.setCar(passengerCar1);
        driverCategoryB.setCar(truck1);
        driverCategoryD.setCar(bus1);
        driverCategoryA.startMove();
        driverCategoryB.startMove();
        driverCategoryD.startMove();
    }
}