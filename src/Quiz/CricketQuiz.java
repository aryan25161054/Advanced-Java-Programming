package Quiz;

import java.util.Scanner;

public class CricketQuiz {

    public static void main(String[] args) {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------WELCOME TO THE CRICKET QUIZ--------------------");

        int ans1;
        while (true) {
             try{
            System.out.println("Q:1 When did India won the first ODI World Cup?");
            System.out.println(" 1) 1988\n 2) 1990\n 3) 1983\n 4) 1987\n Enter Option (1-4)");
            ans1 = sc.nextInt();
            if ((ans1 >= 1) && (ans1 <= 4)) {
                break;
            } else {
                System.out.println("Invalid option");
            } }
             catch (Exception e) {
                 System.out.println("Invalid option");
                 sc.next();
             }
        }


        switch (ans1) {
            case 1:
            case 2:
                System.out.println("Wrong answer !");
                break;
            case 3:
                System.out.println("Correct ! ");
                score++;
                break;
            case 4:
                System.out.println("Wrong answer !");
                break;

        }
        int ans2;

        while (true) {
            try{
            System.out.println("Q:2 Who was India’s captain during the 2011 ICC Cricket World Cup victory?");
            System.out.println(" 1) Sourav Ganguly\n 2) V.V.S Laxman\n 3) M.S. Dhoni\n 4) Rahul Dravid\n Enter Option(1-4)");

            ans2 = sc.nextInt();
            if ((ans2 >= 1) && (ans2 <= 4)) {
                break;
            } else {
                System.out.println("Invalid option");
            }}
              catch(Exception e) {
                  System.out.println("Invalid option");
                  sc.next();
              }
        }
        switch (ans2) {
            case 1:
            case 2:
                System.out.println("Wrong answer !");
                break;
            case 3:
                System.out.println("Correct ! ");
                score++;
                break;
            case 4:
                System.out.println("Wrong answer !");
                break;

        }
        int ans3;

        while (true) {
            try {
            System.out.println("Q:3 Who was the first Indian cricketer to score a triple century in Test cricket?");
            System.out.println(" 1) Virender Sehwag\n 2) Sachin Tendulkar\n 3) Brian Lara\n 4) Ricky Ponting\n Enter Option(1-4)");

            ans3 = sc.nextInt();
            if((ans3>=1)&&(ans3<=4)) {
                break;
            } else {
                System.out.println("Invalid option");
            } } catch (Exception e) {
                System.out.println("Invalid option");
                sc.next();
            }

        }
        switch (ans3) {
            case 1:
                System.out.println("Correct !");
                score++;
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Wrong answer !");
                break;
        } int ans4;
        while(true) {
            try {
            System.out.println("Q:4 Who was the first Indian batsman to hit six sixes in an over in a professional match?");
            System.out.println(" 1) Yuvraj Singh\n 2) M.S. Dhoni\n 3) Andrew Flintoff\n 4) Ravi Shastri\n Enter Option(1-4)");
            ans4 = sc.nextInt();
            if((ans4>=1)&&(ans4<=4)){
                break;
            } else {
                System.out.println("Invalid option");
            } } catch(Exception e) {
                System.out.println("Invalid option");
                sc.next();
            }
        }
        switch (ans4) {
            case 1:
            case 2:
            case 3:
                System.out.println("Wrong answer !");
                break;
            case 4:
                System.out.println("Correct !");
                score++;
                break;

        } int ans5;
        while (true) {
            try {
            System.out.println("Q:5 Against which country did India play its first-ever Test match in 1932?");
            System.out.println(" 1) Australia\n 2) England\n 3) West Indies\n 4) Pakistan\n Enter Option(1-4)");
            ans5 = sc.nextInt();
            if((ans5>=1)&&(ans5<=4)) {
                break;
            } else {
                System.out.println("Invalid option");
            } } catch ( Exception e) {
                System.out.println("Invalid option");
                sc.next();
            }
        }
        switch (ans5) {
            case 1:
                System.out.println("Wrong answer !");
                break;
            case 2:
                System.out.println("Correct !");
                score++;
                break;
            case 3:
            case 4:
                System.out.println("Wrong answer !");
                break;
        }
        if (score == 5) {
            System.out.println("Awesome! You have an excellent cricket knowledge");
        } else if (score == 4) {
            System.out.println("Well done! You have good cricket knowledge");
        } else if (score == 3) {
            System.out.println("Good score!");
        } else if (score == 2) {
            System.out.println("You can do better if you try");
        } else {
            System.out.println("You need to watch more cricket");
        }
        System.out.println("Your total score is " + score + "/5");
        System.out.println("Thanks for attempting this quiz");
    }
}
