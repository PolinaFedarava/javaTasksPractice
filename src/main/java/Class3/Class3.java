package Class3;

public class Class3 {
    public static void main(String[] args) {
        System.out.println("1******************************");
        for (int i1 = 7; i1 <= 98; i1 += 7) {
            System.out.println(i1 + " ");
        }
        int number = 7;
        while (number <= 98){
            System.out.println("number " + number);
            number+=7;
        }
        System.out.println("2******************************");
        int sum1=0;
        for (int i = 1; i<= 10; i++){
            sum1+=1;
        }
        System.out.println("Сумма первых 10 чисел: " + sum1);
        System.out.println("3******************************");
        int number2 = 1;
        for (int i = 0; i< 10; i++){
            System.out.println(number2 + " ");
            number *=2;
        }
        System.out.println("4******************************");
        int number3 = 100;
        while (number3 >=1) {
            if (number3 > 1){
                System.out.println(number3 + ", " );
            }
            else {
                System.out.println(number3);
            }
            number--;
        }
        System.out.println("5******************************");
        for (int i =1; i<=100; i++){
            System.out.println(i + " ");
        }
        System.out.println("6******************************");
        for (int i =1; i<=100; i++){
            if (i%2!=0){
                System.out.println(i + " ");
            }
        }
        System.out.println("7******************************");
        int [] numbers = {1, 2, 3, 4};
        int min = numbers [0];
        int max = numbers [0];

        for (int i =1; i< numbers.length; i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
