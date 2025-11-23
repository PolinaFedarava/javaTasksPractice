package Class8;

import java.io.Serializable;
import java.security.spec.ECField;

public class Ferma implements Serializable {
    //5. Создать объект Ферма с полями. Выполнить сериализацию и десериализацию в файл. (интерфейс Externelizibel)
    private String name;
    private int pigCount;


    public Ferma() {
    }

    public Ferma(String name, int pigCount) {
        this.name = name;
        this.pigCount = pigCount;
    }

    @Override
    public String toString() {
        return "Ferma{" +
                "name='" + name + '\'' +
                ", pigCount=" + pigCount +
                '}';
    }
}
