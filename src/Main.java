public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        int year = 2021;
        checkYearIsLeapAndPrint(year);

        System.out.println("\nTask 2");
        int clientOS = 0;
        int clientDeviceYear = 2016;
        int conclusion = checkingConditionAndReturningString(clientOS, clientDeviceYear);
        if (conclusion == 1) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        } else if (conclusion == 2) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else if (conclusion == 3) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
        } else if (conclusion == 4) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        } else if (conclusion == 5) {
            System.out.println("«Такая система не поддерживается».");
        }

        System.out.println("\nTask 3");
        int calculated = calculateDeliveryDistance(25);
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

    private static int checkingConditionAndReturningString(int deviceType, int year) {
        int currentYear = 2015;
        if (deviceType == 0 && year < currentYear) {
            return 1;
        } else if (deviceType == 0) {
            return 2;
        } else if (deviceType == 1 && year < currentYear) {
            return 3;
        } else if (deviceType == 1) {
            return 4;
        } else {
            return 5;
        }
    }

    private static int calculateDeliveryDistance(int distance) {
        if (distance > 100) {
            return -1;
        }
        return (int) Math.ceil((double) (distance - 20) / 40) + 1;
    }
}
