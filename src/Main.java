public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 4");
        //Task 1
        System.out.println("Task 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        //Task 2
        System.out.println("Task 2");
        int humanAge = 19;
        if (humanAge >=7 && humanAge < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (humanAge >= 18 && humanAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (humanAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //Task 3
        System.out.println("Task 3");
        int ticketNumber = 55;
        if (ticketNumber <= 60) {
            System.out.println("Место в вагоне сидячее");
        }
        if (ticketNumber > 60 && ticketNumber <= 102) {
            System.out.println("Место в вагоне стоячее");
        }
        if (ticketNumber > 102) {
            System.out.println("Свободных мест нет");
        }



        }
}
