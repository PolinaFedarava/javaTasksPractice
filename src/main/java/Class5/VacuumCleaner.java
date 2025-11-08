package Class5;

public class VacuumCleaner implements ElectronicApplications {

    private String name;
    private String functions;
    private double cost;
    private boolean isOn;

    public VacuumCleaner(String name, boolean isOn, double cost, String functions) {
        this.name = name;
        this.isOn = isOn;
        this.cost = cost;
        this.functions = functions;
    }

    @Override
    public void work() {
        if (isOn == true) {
            System.out.println("Пылесос убирает");
        } else {
            System.out.println("Пылесос выключен");
        }
    }

    @Override
    public void start() {
        ElectronicApplications.super.start();
    }
}
