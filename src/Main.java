public class Main {
    public static void main(String[] args) {
        boolean isIOS = false; // true - iOS, false - Android

        if (isIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        boolean isUserIOS = true; // true - iOS, false - Android
        int deviceReleaseYear = 2015;

        if (deviceReleaseYear < 2015 && isUserIOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (deviceReleaseYear < 2015 && !isUserIOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (deviceReleaseYear >= 2015 && isUserIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        int yearToCheck = 2016;

        if (yearToCheck % 4 == 0 && yearToCheck % 100 != 0 || yearToCheck % 400 == 0 && yearToCheck >= 1584) {
            System.out.format("%s год является високосным\n", yearToCheck);
        } else {
            System.out.format("%s год не является високосным\n", yearToCheck);
        }
        System.out.println();

        int distanceToDeliver = 925;
        String deliveryTime = "Потребуется дней: ";

        if (distanceToDeliver <= 20) {
            deliveryTime += "1";
        } else if (distanceToDeliver > 20 && distanceToDeliver < 60) {
            deliveryTime += "2";
        } else if (distanceToDeliver >= 60 && distanceToDeliver <= 100) {
            deliveryTime += "3";
        } else {
            deliveryTime = "Доставки нет";
        }

        System.out.println(deliveryTime);
        System.out.println();

        int month = 8;
        String currentSeason = "";

        switch (month) {
            case 1:
            case 2:
            case 3:
                currentSeason = "Зима";
                break;
            case 4:
            case 5:
            case 6:
                currentSeason = "Весна";
                break;
            case 7:
            case 8:
            case 9:
                currentSeason = "Лето";
                break;
            case 10:
            case 11:
            case 12:
                currentSeason = "Осень";
                break;
            default:
                currentSeason = "Такого сезона не существует";
        }

        System.out.println(currentSeason);
    }
}
