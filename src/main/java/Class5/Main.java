package Class5;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("DeLonghi", "варит американо", 1550);
        CoffeeMachine coffeeMachine2 = new CoffeeMachine("Philips", "варит капучино", 2550);

        Refrigerator refrigerator1 = new Refrigerator("Samsung", 3000, "морозит");
        Refrigerator refrigerator2 = new Refrigerator("ATLANT", 2000, "морозит");

        VacuumCleaner vacuumCleaner1 = new VacuumCleaner("Dreame", true, 2220, "ротоб-пылесос");
        VacuumCleaner vacuumCleaner2 = new VacuumCleaner("Dyson", false, 2220, "беспроводной");

        WashingMachine washingMachine1 = new WashingMachine("LG", "стирает хлопок", 3000);
        WashingMachine washingMachine2 = new WashingMachine("Haier", "стирает шерсть", 3200);

//        ElectronicApplications[] electronicApplications = new ElectronicApplications[7];
//        electronicApplications[0] = coffeeMachine1;
//        electronicApplications[1] = coffeeMachine2;
//        electronicApplications[2] = refrigerator1;
//        electronicApplications[3] = refrigerator2;
//        electronicApplications[4] = vacuumCleaner1;
//        electronicApplications[5] = vacuumCleaner2;
//        electronicApplications[6] = washingMachine1;
//        electronicApplications[7] = washingMachine2;
//
//        for (ElectronicApplications curApplicaton : electronicApplications) {
//            curApplicaton.work();
//        }

        KitchenAppliances[] kitchenAppliances = new KitchenAppliances[3];
        kitchenAppliances[0] = washingMachine1;
        kitchenAppliances[1] = washingMachine1;
        kitchenAppliances[2] = refrigerator1;
        kitchenAppliances[3] = refrigerator2;

        for (KitchenAppliances curKitchenAppliances : kitchenAppliances) {
            curKitchenAppliances.work();
        }

        ElectronicApplications[] electronicApplications = new ElectronicApplications[1];
        electronicApplications[0] = coffeeMachine1;
        electronicApplications[1] = coffeeMachine2;

        for (ElectronicApplications curCoffeeMashine : electronicApplications) {
            curCoffeeMashine.work();
            curCoffeeMashine.start();
        }
    }

}
