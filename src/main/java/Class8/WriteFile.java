package Class8;

import java.io.*;
import java.util.List;

public class WriteFile {
    //    Дан русский текст: Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов "живых" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.
//    Использовать Reader, Writer
//1. Записать его в файл прописал относительный путь.
//2. Записать его в файл прописав абсолютный путь.
//3. Вычитать текст из первого файла.
//4. Вычитать текст из второго файла
//5. Создать объект Ферма с полями. Выполнить сериализацию и десериализацию в файл. (интерфейс Externelizibel)
    public static void main(String[] args) {
        String text = "Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.";
        //File file = new File("file.txt");
        String absolutePath = "/Users/palinakukhmar/Documents/repositories/Java25/JavaPractiseClass/fileNew.txt";
        File file = new File(absolutePath);

        try (FileWriter fileWriter = new FileWriter(file);) {
            fileWriter.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        second();
         third();
        forth();
    }

    public static void second() {
        FileReader fileReader = null;
        try {
            //fileReader = new FileReader("file.txt");
            fileReader = new FileReader("/Users/palinakukhmar/Documents/repositories/Java25/JavaPractiseClass/fileNew.txt");
            BufferedReader br = new BufferedReader(fileReader);
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void third() {
        Ferma ferma1 = new Ferma("F1", 2);
        Ferma ferma2 = new Ferma("F2",10);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("FileSerializable"));){
//            FileOutputStream fos = new FileOutputStream("FileSerializable");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(ferma1);
            objectOutputStream.writeObject(ferma2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void forth() {
        try ( ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("FileSerializable")){
            //FileInputStream fileInputStream = new FileInputStream("FileSerializable") ;
            //ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                //System.out.println(objectInputStream.readObject());
            List<Ferma> returnListFerma = (List<Ferma>) objectInputStream.readObject();

        System.out.println(returnListFerma.get(0));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    }

