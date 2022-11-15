public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 23;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age <= 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        // Задание 2
        System.out.println("Задание 2");

        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задание 3
        System.out.println("Задание 3");
        int vanCapacity = 102;
        int seats = 60;
        int staySeats = vanCapacity - seats;
        int occupiedSeats = 54;
        int occupiedStaySeats = 40;
        if (occupiedSeats <= seats) {
            System.out.println("В вагоне есть еще " + (seats - occupiedSeats) + " сидячих мест");
        }
        if (occupiedStaySeats <= staySeats) {
            System.out.println("В вагоне есть еще " + (staySeats - occupiedStaySeats) + " стоячих мест");
        }
        if (seats == occupiedSeats) {
            System.out.println("В вагоне нет сидячих мест");
        }
        if (staySeats == occupiedStaySeats) {
            System.out.println("В вагоне нет стоячих мест");
        }

        // Задание 4
        System.out.println("Задание 4");
        int age1 = 18;
        if (age1 >= 18) {
            System.out.println("Поздавляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        // Задание 5
        System.out.println("Задание 5");
        int yearsOld = 5;
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (yearsOld >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задание 6
        System.out.println("Задание 6");
        int seatsTotal1 = 102;
        int seats1= 60;
        int stayingSeats1 = seatsTotal1 - seats1;
        int seatsOccupied1 = 60;
        int stayingSeatsOccupied1 = 48;
        if (seatsOccupied1 < seats1) {
            System.out.println(" В вагоне осталось " + (seats1 - seatsOccupied1) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (stayingSeats1 > stayingSeatsOccupied1) {
            System.out.println("В вагоне осталось " + (stayingSeats1 - stayingSeatsOccupied1) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }


    }
}