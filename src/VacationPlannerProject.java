import java.util.Scanner;

public class VacationPlannerProject {
    public static void main(String[] args) {
        greeting();
        budget();
        time();
        distance();
        System.out.println("I hope you one day get to enjoy your dream vacation!");











    }

    public static void greeting() {
        Scanner input = new Scanner(System.in);


        // Greet the user
        System.out.println("Welcome to your Dream Vacation!");
        System.out.print("Firstly, please state your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", and where would you like to travel to? ");
        String place = input.nextLine();
        System.out.println("Great! " + place + " sounds like an exciting trip!");
        System.out.println("********************");
        System.out.println("\n");




    }







    public static void budget() {
        Scanner input = new Scanner(System.in);
        // Travel time and Budget
        int minutes = 60;
        System.out.print("How many days would you like to spend traveling? ");
        int days = input.nextInt();
        System.out.print("About how much money, in USD, are you planning to spend on your trip? ");
        int money1 = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double money2 = input.nextDouble();
        System.out.println("********************");

        System.out.println("\n");



        // Tell user information about the trip
        double totalMoney = (money1*money2/days);
        double value1 = totalMoney*100;
        int value2 = (int) value1;
        double value3 = value2 / 100.0;
        System.out.println("If you are traveling for " + days + " days that is the same as " + days*24 + " hours or " + days*24*minutes + " minutes!" );
        System.out.println("If you are planning on spending $" + money1 + " " + "USD" + " that means per day you can spend up to $" + money1/days + " " + "USD!");
        System.out.println("Your total budget in " + symbol + " is " + money1*money2 + " " + symbol + ", which per day is " + value3 + " " + symbol + "!");
        System.out.println("********************");

        System.out.println("\n");






    }

    public static void time(){
        Scanner input = new Scanner(System.in);
        // What is the time difference for the trip?
        System.out.print("What is the time difference, in hours, between your home and your destination?\n(Please note, if the time zone is behind your home time zone, please use the ' - ' or minus symbol. ");
        int dif = input.nextInt();
        double time1 = (0.00+dif);
        double time2 = (12.00+dif);
        System.out.println("That means when it is midnight at home it will be " + time1 + "0 (military time) in your travel destination and when it is noon at home it will be " + time2 + "0 (military time) at your destination.");




    }

    public static void distance(){

    }


}



