public class Main {
    public static void main(String[] args) {
        task1();
        task2();

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
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS > 1)
        {
            System.out.println("Eror");
        }else
        {
            switch (clientOS) {
                case 0:
                    if (clientDeviceYear < 2015) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    } else {
                        System.out.println("Установите версию приложения для iOS по ссылке");
                    }
                    break;
                default:
                    if (clientDeviceYear < 2015) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    } else {
                        System.out.println("Установите версию приложения для Android по ссылке");
                    }
                    break;
            }
        }
    }
}


