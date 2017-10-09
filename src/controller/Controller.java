package controller;

import model.Vehicle;
import repository.RepositoryDAO;

public class Controller {
    private RepositoryDAO repo;

    public Controller(RepositoryDAO repo) {
        this.repo = repo;
    }

    public void save(Vehicle vehicle) {
        try {
            repo.save(vehicle);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void printFilter(int minPrice) {
        Vehicle[] filterList = repo.filter(minPrice);
        int pos = 0;
        while (filterList[pos] != null) {
            System.out.println(filterList[pos]);
            pos++;
        }
    }
}
