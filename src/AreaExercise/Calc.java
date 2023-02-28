package AreaExercise;

public class Calc {
    Floor floor;
    Carpet carpet;

    public Calc(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double f = floor.getArea();
        double c = carpet.getCost();
        return f * c;
    }
}
