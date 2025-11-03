package class5_1;

public class Desk <T extends Integer, P extends Person> {
    T inventoryNumber;
    P person;

    public Desk(T inventoryNumber, P person) {
        this.inventoryNumber = inventoryNumber;
        this.person = person;
    }

    public void printPersonName() {
        System.out.println("За столом №" + inventoryNumber + " сидит: " + person.getFullName());
    }
}
