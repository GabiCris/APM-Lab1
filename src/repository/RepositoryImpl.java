package repository;

import model.Vehicle;

public class RepositoryImpl implements RepositoryDAO {
    Vehicle[] vehicleList;
    private int maxSize;

    public RepositoryImpl(int maxSize) {
        this.maxSize = maxSize;
        vehicleList = new Vehicle[maxSize];
    }

    private int currentPos = -1;

    @Override
    public void save(Vehicle vehicle) throws Exception {
        vehicleList[++currentPos] = vehicle;
        if (currentPos > 199) {
            throw new Exception("Repository List is full!");
        }
    }

    @Override
    public Vehicle[] filter(int price) {
        Vehicle[] filteredList = new Vehicle[200];
        int filteredIndex = -1;
        for (int i = 0; i < currentPos; i++) {
            if (vehicleList[i].getPrice() > price) {
                filteredList[++filteredIndex] = vehicleList[i];
            }
        }
        return filteredList;
    }
}
