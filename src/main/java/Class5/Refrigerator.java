package Class5;

public class Refrigerator implements KitchenAppliances {
    private String name;
    private String brand;
    private double cost;
    private boolean isOn;

    public Refrigerator(String name, double cost, String functions) {
        this.name = name;
        this.brand = brand;
        this.cost = cost;
        this.isOn = true;
    }

    @Override
    public void work() {
        if (isOn == true) {
            System.out.println(name + " (" + brand + "): Холодильник морозит");
        } else {
            System.out.println(name + " (" + brand + "): Холодильник выключен");
        }
    }
}
