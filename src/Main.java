import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        int year = 2021;
        checkYearIsLeapAndPrint(year);


        System.out.println("\nTask 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        System.out.println(validateDeviceAndYearAndPrint(clientOS, clientDeviceYear));


        System.out.println("\nTask 3");
        int calculated = calculateDeliveryDistance(49);
        if (calculated == -1) {
            System.out.println("«Извините, в ваш регион мы не осуществляем доставку».");
        } else {
            System.out.printf("«Потребуется дней: %s».%n", calculated);
        }
    }

    private static void checkYearIsLeapAndPrint(int leapYear) {
        boolean leapYearConditions = (leapYear % 400 == 0) || (leapYear % 4 == 0 && leapYear % 100 != 0);
        boolean validYear = leapYear >= 1584;
        if (validYear && leapYearConditions) {
            System.out.printf("«%s  год - високосный год».%n", leapYear);
        } else {
            System.out.printf("«%s  год - не високосный год».%n", leapYear);
        }
    }

    private static String validateDeviceAndYearAndPrint(int deviceType, int year) {
        int currentYear = LocalDate.now().getYear();
        if (deviceType == 0 && year < currentYear) {
            return "«Установите облегченную версию приложения для iOS по ссылке».";
        } else if (deviceType == 0) {
            return "«Установите версию приложения для iOS по ссылке».";
        }else if (deviceType == 1 && year < currentYear) {
            return "«Установите облегченную версию приложения для Android по ссылке».";
        } else if (deviceType == 1) {
            return "«Установите версию приложения для Android по ссылке».";
        } else {
            return "«Такая система не поддерживается».";
        }
    }

    private static int calculateDeliveryDistance(int distance) {
        if (distance > 100) {
            return -1;
        }
        return (int) Math.ceil((double) (distance - 20) / 40) + 1;
    }
}