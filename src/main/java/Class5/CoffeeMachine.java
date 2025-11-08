package Class5;

import java.util.List;

public class CoffeeMachine implements ElectronicApplications {

    private String name;
    private String functions;
    private double cost;
    private boolean isOn;

    public CoffeeMachine(String name, String functions, double cost) {
        this.name = name;
        this.functions = functions;
        this.cost = cost;
        this.isOn = true;
    }

    public CoffeeMachine(String name, double cost, String functions) {
        this(name, functions, cost);
    }

    @Override
    public void start() {
        isOn = true;
        System.out.println("Кофемашина включена: " + isOn);
    }

    @Override
    public void work() {
        if (isOn == true) {
            System.out.println("Кофемашина варит кофе");
        } else {
            System.out.println("Кофемашина выключена. Включите устройство перед работой");
        }
    }

}
