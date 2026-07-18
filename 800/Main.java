//import java.awt.*;
//import java.util.Arrays;
//import java.lang.Math;
//import java.text.NumberFormat;
//import java.util.Scanner;
    //Point point1 = new Point(1, 1);
   // Point point2 = point1;
    //point1.x = 2;
    //System.out.println(point2);
    // c:\Windows\...
    //String message = "c:\tWindows\\..";
    //message.endsWith("!!");
    //System.out.println(message.trim());
    //System.out.println(message);
    //int[] numbers = new int[5];
    //numbers[0] = 1;
    //numbers[1] = 2;
    //int[] numbers = {2,3,5,1,4};
    //Arrays.sort(numbers);
    //System.out.println(Arrays.toString(numbers));
    //int[][][] numbers = new int[2][3][5];
    //numbers[0][0][0] = 1;
    //numbers[0][1][0] = 2;
    //numbers[0][2][4] = 5;
    //System.out.println(Arrays.deepToString(numbers));
    //int[][] numbers = {{1,2,3}, {4,5,6}};
    //System.out.println(Arrays.deepToString(numbers));
   //final float PI = 3.14F;
   // int x = 1;
    //x = x+2;
  //  x -= 2;
   // System.out.println(x);
    //int x =(10+3)*2;
    //System.out.println(x);
    //Implicit casting
    // byte > short > int > long > float > double
   //String x = "1.1";
   //Double y = Double.parseDouble(x)+2;
   // System.out.println(y);
    //int result =(int) Math.round(Math.random() * 100);
    //System.out.println(result);
    //int result =(int)(Math.random() * 100);
    //System.out.println(result);
   //NumberFormat percent = NumberFormat.getPercentInstance();
   //String result = percent.format(0.1);
    //String result = NumberFormat.getCurrencyInstance().format(12345.343);
   // System.out.println(result);
    //Scanner scanner = new Scanner(System.in);
   //System.out.print("Name: ");
  // String name =  scanner.nextLine().trim();
   // System.out.println("You're " + name);
    //System.out.println(Math.pow(2,3));

 //Mortgage
    //Scanner scanner = new Scanner(System.in);
   // System.out.print("Principal: ");
   // int principal = scanner.nextInt();
    //System.out.print("Annual Interest Rate: ");
    //float annualInterestRate = scanner.nextFloat();
    //byte numbersOfMonthInYears = 12;
    //byte turnPercentages = 100;
    //System.out.print("Period Years: ");
   // int periodYears = scanner.nextInt();
    //float r = (annualInterestRate/turnPercentages)/numbersOfMonthInYears;
    //float n = periodYears*numbersOfMonthInYears;
    //double m = (double)principal * ((r * Math.pow((1+r),n))/((Math.pow((1+r),n))-1));
    //String result = NumberFormat.getCurrencyInstance().format(m);
    //System.out.println("Mortgage: " + result);
 //.Mortgage



    //int x = 1;
    //int y = 2;
    // System.out.println(x <= y);
    // int temperature = 12;
    // boolean isWarm = temperature > 20 && temperature < 30;
    // System.out.println(isWarm);
    //boolean hasHighIncome = true;
    //boolean hasGoodCredit = true;
    //boolean hasCriminalRecord = true;
    //boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    //System.out.println(isEligible);
    //int temp =12;
    //if (temp > 30) {
    //    System.out.println("It is a hot day");
    //    System.out.println("Drink water");
    //}
    //else if (temp > 20 )
    //    System.out.println("Beautiful day!");
    //else
    //    System.out.println("Cold day");
    //int income = 120_000;
    //boolean hasHighIncome = (income > 100_000);
    //System.out.println(hasHighIncome);
    // int income = 120_000;
    // String className;
    // if (income > 100_000)
    //     className = "First";
    // else
    //     className = 'economy'

    //Advanced (if)
    //Scanner scanner = new Scanner(System.in);
    //int income = scanner.nextInt();
    //String className = (income > 100_000) ? "First" : "Economy";
    // System.out.println(className);
    //.Advanced (if)

    //Switch statement
    // String role = "admin";
    //switch (role){
    //    case "admin":
    //        System.out.println("You're an admin");
    //        break;
    //    case "moderator":
    //       System.out.println("You're a moderator");
    //        break;
    //   default:
    //        System.out.println("You're a guest");
    // }
    //.Switch statement

    //if (role =="admin")
    //    System.out.println("You're an admin");
    //else if (role == "moderator")
    //   System.out.println("You're a moderator");
    //else
    //   System.out.println("You're a guest");

    //Exercise(if)
    //Scanner scanner = new Scanner(System.in);
    //System.out.print("Number: ");
    //int input = scanner.nextInt();
    //if ((input%3 == 0) && (input%5 == 0))
    //    System.out.println("FizzBuzz");
    //else if (input%5 == 0)
    //    System.out.println("Fizz");
    // else if (input%3 == 0)
    //     System.out.println("Buzz");
    // else
    //     System.out.println(input);

    // Scanner scanner = new Scanner(System.in);
    //System.out.print("Number: ");
    // int input = scanner.nextInt();

    // if (input%3 == 0){
    //     if (input%5 == 0)
    //     System.out.println("FizzBuzz");
    //     else
    //         System.out.println("Buzz");
    //}
    // else if (input%5 == 0)
    //     System.out.println("Fizz");
    //  else
    //      System.out.println(input);
//.Ecercise(if)

    //Loops(for)
    // for (int i = 5; i > 0; i--) {
    //      System.out.println("hi shit " + i);
    // }
//
    //  for (int i = 0; i < 5; i++) {
    //       System.out.println("hi shit " + i);
    //  }

    //Loops(while)

    // String input = "";
    // Scanner scanner = new Scanner(System.in);
    //while(!input.equals("quit")) {
    //    System.out.println("Input: ");
    //    input = scanner.next().toLowerCase();
    //    System.out.println(input);
    // }

    //Loops(do.. while)

//    String input = "";
    //   Scanner scanner = new Scanner(System.in);
//    while(!input.equals("quit")) {
//        System.out.println("Input: ");
//        input = scanner.next().toLowerCase();
    //    if (input.equals("Pass")
    //      continue;
    //  if (input.equalts("quit"))
    //      break;
//        System.out.println(input);
//    }
//    do {
//        System.out.println("Input: ");
//        input = scanner.next().toLowerCase();
//        System.out.println(input);
//    } while (!input.equals("quit"));

    // Loops ( while true)
//    Scanner scanner = new Scanner(System.in);
//    String input = "";
//    while(true) {
//        System.out.print("Input: ");
//        input = scanner.next().toLowerCase();
//        if (input.equals("pass"))
//            continue;
//        if (input.equals("quit"))
//            break;
//        System.out.println(input);
//    }

//}
//.Loops

//
//void main(){
//    String[] fruits = {"Apple", "Banana", "Pineaple"};
//
//    for (int i = 0; i < fruits.length; i++){
//        System.out.println(fruits[i]);
//    }
//    for (String fruit : fruits){
//        System.out.println(fruit);
//    }
//}
//import java.awt.*;
//import java.util.Arrays;
//import java.lang.Math;
//import java.text.NumberFormat;
//import java.util.Scanner;
//
//void main() {
//    Scanner scanner = new Scanner(System.in);
//
//    int principal = 0;
//    float annualInterestRate = 0;
//    int periodYears = 0;
//
//    while (true) {
//        System.out.print("Principal ($1K - $1M): ");
//        principal = scanner.nextInt();
//        if (principal >= 1000 && principal <= 1000000) {
//            break; // Input is valid, break out of this loop
//        }
//        System.out.println("Enter a number between 1,000 and 1,000,000.");
//    }
//
//    while (true) {
//        System.out.print("Annual Interest Rate (0 - 30): ");
//        annualInterestRate = scanner.nextFloat();
//        if (annualInterestRate > 0 && annualInterestRate <= 30) {
//            break; // Input is valid, break out of this loop
//        }
//        System.out.println("Enter a value greater than 0 and less than or equal to 30.");
//    }
//
//    while (true) {
//        System.out.print("Period (Years) (1 - 30): ");
//        periodYears = scanner.nextInt();
//        if (periodYears >= 1 && periodYears <= 30) {
//            break; // Input is valid, break out of this loop
//        }
//        System.out.println("Enter a value between 1 and 30.");
//    }
//
//    float r = (annualInterestRate / 100) / 12;
//    float n = periodYears * 12;
//
//    double m = (double)principal * ((r * Math.pow((1 + r), n)) / ((Math.pow((1 + r), n)) - 1));
//    String result = NumberFormat.getCurrencyInstance().format(m);
//
//    System.out.println("Mortgage: " + result);
//
//void main(){
//    System.out.println("I don't know what should i do right now - should i just suicide or move on to hope one thing might happen, knowing that such thing truly doesn't exist");
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Do you thing that thing is true, not believing that thing does really exist? :  ");
//    String theInput = scanner.nextLine();
//    String case_1 = "yes";
//    String case_2 = "maybe";
//    String case_3 = "no";
//
//    if (theInput.equals(case_1))
//        System.out.println("you're damn depressed or that you just found out you're not perfect");
//    else if (theInput.equals(case_2))
//        System.out.println("Come on! You need to thing about what you've already sacrificed");
//    else if (theInput.equals(case_3))
//        System.out.println("I am happy for you!");
//    else
//        System.out.println("...");
//}
import java.util.Scanner;
import java.util.Arrays;
void main() {
    Scanner scanner = new Scanner(System.in);
    int[] number = {2,3,5,1,6};
    //sort in my way
    for (int i = 0; i < number.length; i++){
        if (number[i] < number[i+1]) {
            number[i]++;
        }
        else continue;
  }
    System.out.println(number);
}



