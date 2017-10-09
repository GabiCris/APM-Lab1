package repository;

import model.Vehicle;

public interface RepositoryDAO {
    void save(Vehicle i) throws Exception;
    Vehicle[] filter(int price);
}
