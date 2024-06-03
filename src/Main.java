public class Main {
    public static void main(String[] args) {
        //TASK 1
            int ageOfAdulthood = 18;

            if(ageOfAdulthood >= 18)
            {
                System.out.println("Если возраст человека равен " + ageOfAdulthood +", то он совершеннолетний.");
            }
            else
            {
                System.out.println("Если возраст человека равен " + ageOfAdulthood +", то он не достиг совершеннолетия, нужно немного подождать.");
            }


        //TASK 2
            int temperature = 10;
            if(temperature < 5) //TEMPERATURE IS 10 DEGREES
            {
                System.out.println("На улице холодно, нужно надеть шапку.");
            }
            else
            {
                System.out.println("Сегодня тепло, можно идти без шапки.");
            }


        //TASK 3
            int speed = 64;
            if(speed > 60)
            {
                System.out.println("Если скорость равна " + speed + ", то придется заплатить штраф.");
            }
            else
            {
                System.out.println("Если скорость равна " + speed + ", можно ехать спокойно.");
            }

        //TASK 4
            int ageDistribution = 19;
            if(ageDistribution >= 2 && ageDistribution <= 6)
            {
                System.out.println("Если возраст человека равен " + ageDistribution + ", то ему нужно ходить в детский сад.");
            }
            else if(ageDistribution >= 7 && ageDistribution <= 17)
            {
                System.out.println("Если возраст человека равен " + ageDistribution + ", то ему нужно ходить в школу.");
            }
            else if(ageDistribution >= 18 && ageDistribution <= 24)
            {
                System.out.println("Если возраст человека равен " + ageDistribution + ", то ему нужно ходить в университет.");
            }
            else if(ageDistribution > 24)
            {
                System.out.println("Если возраст человека равен " + ageDistribution + ", то ему нужно ходить на работу.");
            }

        //TASK 5
            int attractionAge = 10;
            if(attractionAge < 5)
            {
                System.out.println("Если возраст ребенка равен " + attractionAge + ", то он не может кататься на аттракционе.");
            }
            else if(attractionAge >= 5 && attractionAge <= 14)
            {
                System.out.println("Если возраст ребенка равен " + attractionAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            }
            else if(attractionAge > 14)
            {
                System.out.println("Если возраст ребенка равен " + attractionAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
            }

        //TASK 6
            int wagonCapacity = 102;
            int wagonSeats = 60;
            int occupiedSeats = 75;
            if (occupiedSeats < wagonSeats) {
                System.out.println("Есть сидячие места.");
            } else if (occupiedSeats < wagonCapacity) {
                System.out.println("Есть только стоячие места.");
            } else {
                System.out.println("Вагон уже полностью забит.");
            }

        //TASK 7
            int one = 5;
            int two = 11;
            int three = 7;
            int max = 0;
            if (one >= two && one >= three) {
                max = one;
            } else if (two >= one && two >= three) {
                max = two;
            } else {
                max = three;
            }
            System.out.println("Наибольшее число это " + max +".");
    }
}