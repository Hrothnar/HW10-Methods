import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    //task1
    public static void checkYear(int year) {
        if ((year % 400 != 0 || year % 4 != 0) && year % 100 == 0) {
            System.out.println(year + " год не високосный");
            String check = " год не високосный";
        } else {
            System.out.println(year + " год високосный");
        }
    }

    public static void task1() {
        int inputYear = 2024;
        checkYear(inputYear);
    }

    //task2
    public static void task2() {
        int currentYear = LocalDate.now().getYear();
        int os = 0;
        checkOsAndVersion(currentYear, os);
    }

    public static void checkOsAndVersion(int year, int os) {
        if (year >= 2015 && os == 1) {
            System.out.println("Установите версию приложения для iOS");
        } else if (year < 2015 && os == 1) {
            System.out.println("Установите облегчённую версию приложения для iOS");
        } else if (year >= 2015 && os == 0) {
            System.out.println("Установите версию приложения для android");
        } else {
            System.out.println("Установите облегчённую версию приложения для android");
        }
    }

    public static void task3() {
        int inputDistance = 19;
        checkTime(inputDistance);
    }

    public static void checkTime(int distance) {
        if (distance < 20) {
            System.out.println("Доставка карты займёт сутки");
        } else if (distance >= 20 && distance < 60) {
            System.out.println("Доставка карты займёт двое суток");
        } else {
            System.out.println("Доставка карты займёт трое суток");
        }
    }
}