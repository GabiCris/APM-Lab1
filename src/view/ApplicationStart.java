package view;

import controller.Controller;
import model.Car;
import model.Motorcycle;
import model.Truck;
import repository.RepositoryDAO;
import repository.RepositoryImpl;

public class ApplicationStart {
    public static void main(String args[]) {
        RepositoryDAO repo = new RepositoryImpl(200);
        Controller controller = new Controller(repo);

        Car car1 = new Car("Dacia", 900);
        Car car2 = new Car("BMW", 2000);
        Car car3 = new Car("Audi", 4400);
        Motorcycle moto1 = new Motorcycle("Moto Honda", 840);
        Motorcycle moto2 = new Motorcycle("Moto Yamaha", 2440);
        Truck tr1 = new Truck("Truck Tesla", 9800);
        Truck tr2 = new Truck("Truck BMW", 7800);
        Truck tr3 = new Truck("Truck CAT", 890);
        controller.save(car1);
        controller.save(car2);
        controller.save(car3);
        controller.save(moto1);
        controller.save(moto2);
        controller.save(tr1);
        controller.save(tr2);
        controller.save(tr3);

        controller.printFilter(1000);
    }
}
