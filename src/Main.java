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
        int yearsOld = 28;
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задание 6
        System.out.println("Задание 6");
        int seatsTotal1 = 102;
        int seats1 = 60;
        int stayingSeats1 = seatsTotal1 - seats1;
        int seatsOccupied1 = 80;
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

        // Задание 8
        System.out.println("Задание 8");
        int age2 = 18;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " , то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если возраст человека равен " + age2 + " , то ему нужно ходить в школу");
        } else if (age2 > 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " , то его место в университете");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " , то ему пора ходить на работу");
        }

        // Задание 9
        System.out.println("Задание 9");
        int age3 = 14;
        if (age3 < 5) {
            System.out.println("Если ребенку " + age3 + " лет, то он не может кататься на аттракционе");
        } else if (age3 >= 5 && age3 < 14) {
            System.out.println("Если ребенку " + age3 + " лет, то то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age3 >= 14) {
            System.out.println("Если ребенку " + age3 + " лет, то он может кататься без сопровождения взрослого.");
        }
        // Задание 10
        System.out.println("Задание 10");
        int one = 5;
        int two = 2;
        int free = 3;
        if (one>two) {
            if (one>free)
            System.out.println(" Наибольшим числом является " +one);
        }
        else if (free>one) {
            System.out.println(" Наибольшим числом является " +free);
        }
        else if (two>one) {
            if (two>free) {
                System.out.println(" Наибольшим числом является " +two);
            }
        else if (free>two) {
                System.out.println(" Наибольшим числом является " +free);
            }
        }

    }
}