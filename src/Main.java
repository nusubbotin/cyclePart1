public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        for (int i = 1; i < 11; i++){
            System.out.println("i = " + i);
        }

        System.out.println("Задание 2: ");
        for (int i = 10; i > 0; i--){
            System.out.println("i = " + i);
        }

        System.out.println("Задание 3: ");
        for (int i = 0; i < 17; i = i + 2){
            System.out.println("i = " + i);
        }

        System.out.println("Задание 4: ");
        for (int i = 10; i > -11; i--){
            System.out.println("i = " + i);
        }

        //Домашнее задание -2. Задача 1
        System.out.println("Задание 5: ");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }

        //Домашнее задание -2. Задача 2
        System.out.println("Задание 6: ");
        for (int i = 1; i*7 <= 98 ; i++){
            System.out.println(i*7);
        }

        //Домашнее задание -2. Задача 3
        System.out.println("Задание 7: ");
        for (int i = 1; i <= 512 ; i = i * 2){
            System.out.println(i);
        }
    }
}