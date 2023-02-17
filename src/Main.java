public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("First Task");
        Boolean clientOS = true;
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");

        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");

        }
    }

    public static void task2() {
        System.out.println("Second Task");
        int clientOS = 1;
        int clientDeviceYear = 2017;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("eror");
                break;
        }

    }

    public static void task3() {
        System.out.println("Task 3");
        int year = 1;
        boolean God = true;
        if ((year % 100) == 0) {
            God = false;
        }

        if ((year % 400) == 0) {
            God = true;
        }
        if ((year % 4) == 0 && God == true) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60 && deliveryDistance > 20) {
            System.out.println("Потребуется дней: 2");

        } else if (deliveryDistance <= 100 && deliveryDistance >= 60) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }


    }
    public static void task5(){
        System.out.println("Task5");
        int month = 1;
        switch (month){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Авгусо");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Неправильный номер месяца");

        }
    }
}










