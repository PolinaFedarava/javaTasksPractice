package Class5;

public interface ElectronicApplications {
    void work();

    default void start() {
        System.out.println("Электроприбор стартует");
    }
}
