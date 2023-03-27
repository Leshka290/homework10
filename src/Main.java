public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.join(" ", firstName, lastName, middleName);
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        String firstName = "ivan";
        String middleName = "ivanovich";
        String lastName = "ivanov";
        String fullName = String.join(" ", firstName, lastName, middleName);
        fullName = fullName.toUpperCase();
//        String [] strArr = fullName.split(" ");
//        for (int i = 0; i < strArr.length; i++) {
//          strArr[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
//        }
//        fullName = String.join(" ", strArr);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
