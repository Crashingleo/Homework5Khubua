public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

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
            switch (clientOS)
            {
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
    public static void task4(){
        System.out.println("Task 4");

    }




    }









