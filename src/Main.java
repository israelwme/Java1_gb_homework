import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
        System.out.println("1. Создан проект в IntelliJ IDEA и прописан метод main()");
//        2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        int num = 23;
        double num_2 = 234.65435453d;
        float num_3 = 23.24f;
        boolean isFalse = false;
        byte bb = 123;
        char sym = 'C';
        System.out.println("2. Переменные всех пройденных типов данных: int num = " + num + ", double num_2 = " + num_2 + ", float num_3 = " + num_3 + ", boolean isFalse = " + isFalse + ", byte bb = " + bb + ", char sym = " + sym);

//        3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        System.out.println("a * (b + (c / d)) = " + method_3());
//        4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        System.out.println("4. Метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно)");
        System.out.println(method_4());
//        5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        System.out.println("5. Метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное");
        System.out.println(method_5());
//        6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        System.out.println("6. Метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;");
        System.out.println(method_6());
//        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        System.out.println("7. Метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»");
        System.out.println("Привет, " + method_7() + "!");
//        8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println("8. Метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.");
        System.out.println(method_8());
    }

    public static int method_3(){
        System.out.println("3. Метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите c");
        int c = scanner.nextInt();
        System.out.println("Введите d");
        int d = scanner.nextInt();
        int result;
        result = a * (b + (c / d));
        return result;
    }

    public static String method_4() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите первое число");
        int e = scanner.nextInt();
        System.out.println("Введите второе число");
        int f = scanner.nextInt();
        int g = e + f;
        if (g >= 10 && g <=20){
            return "true";
        } else {
            return "false";
        }

    }

    public static String method_5() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите целое число");
        int h = scanner.nextInt();
        if (h>=0) {
            return "число положительное";
        } else {
            return "число отрицательное";
        }
    }

    public static String method_6() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите целое число");
        int j = scanner.nextInt();
        if (j<0) {
            return "true";
        } else {
            return "";
        }
    }

    public static String method_7() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        return name;

    }

    public static String method_8() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        if((year % 400 == 0)||((year % 4 == 0)&&(year % 100 !=0))) {
            return "год високосный";
        } else {
            return "год не високосный";
        }

    }
}
