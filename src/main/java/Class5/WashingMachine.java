package Class5;

public class WashingMachine implements KitchenAppliances {
    private String name;
    private String functions;
    private double cost;
    private boolean isOn;

    public WashingMachine(String name, String functions, double cost) {
        this.name = name;
        this.functions = functions;
        this.cost = cost;
        this.isOn = true;
    }

    public WashingMachine(String name, double cost, String functions) {
        this(name, functions, cost);
    }

    @Override
    public void work() {
        if (isOn == true) {
            System.out.println("Стиральная машина стирает");
        } else {
            System.out.println("Стиральная машина выключена");
        }
    }
}
