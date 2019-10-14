package sk.itsovy.ganoczi.other;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class FreeClass {


    //1.Výpis všetkých štvorciferných čísel deliteľných číslom 615
    public void hW1() {
        for (int i = 1000; i <= 9999; i++) {
            if (i % 615 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //2.Výpis pekných trojciferných čísel. Číslo je pekné ak cifry klesajú, napr: 543, 951, 421, 862, 943, ... atd
    public void hW2() {
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if (c > b && b > a) {
                System.out.print(i + " ");
            }
        }
    }

    //3. Scitat vsetky dvojciferné čísla deliteľné číslom 3, teda vypísať ich súčet
    public void hW3() {
        int count = 0;
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            if (0 == i % 3) {
                count++;
                sum += i;
                System.out.print(i + " ");

            }

        }
        System.out.println(" ");
        System.out.println("pocet cisel " + count + " sucet cisel  " + sum);
    }

    //4. Zistiť a vypísať počet deliteľov čísla 1000000 (milion)
    public void hW4() {
        int count = 0;
        for (int i = 1; i <= 1317; i++) {
            if (1317 % i == 0) {
                count++;
                System.out.println(i);

            }
        }
        System.out.print(count + " ");
    }

    //5. Vypocitat povrch a objem kvadra. Strany su 45, 87, 37
    public void hW5() {
        int a = 45;
        int b = 87;
        int c = 37;
        double area = (double) 2 * (a * b + b * c + a * c);
        double capacity = (double) a * b * c;
        System.out.println("Area of rectangle " + area + " Capacity of rectangle " + capacity);

    }

    //6. Vypísat cisla od 10 do 2 s krokom 0,5 , teda: 10 9.5 9 8.5 8  .......3 2.5 2
    public void hW6() {
        for (double i = 10; i >= 2; i = i - 0.5) {
            System.out.print(i + " ");
        }
    }

    //7. Vypocitat faktorial cisla 7!, teda 7*6*5*4*3*2*1  cez cyklus for
    public void hW7() {
        int result = 1;
        for (int i = 1; i <= 7; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    //8. vypisat vsetky trojciferne neparne cisla, ktore su delitelne cislom 27 a nie su delitelne cislom 13.
    public void hW8() {
        for (int i = 100; i <= 999; i++) {
            if (i % 2 != 0) {
                if (i % 27 == 0 && i % 13 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    //9. vypisat vsetky nasobky cisla 91 az do 10000, teda: 91,  182,, 273, .......
    public void hW9() {
        for (int i = 91; i <= 10000; i = i + 91) {
            System.out.print(i + " ");
        }
    }

    //10. vypisat vsetky 5 ciferne cisla, ktore su palindromy, cize odpredu aj odzadu rovnako citatelne, napr:  45854, 30903, 11111, 22722, ...
    public void hW10() {
        for (int i = 10000; i <= 99999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int d = (i / 1000) % 10;
            int e = (i / 10000) % 10;
            if (a == e && b == d) {
                System.out.print(i + " ");
            }

        }
    }

    public void hW11() {
        int i = 10000;


        while (i <= 99999) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            int d = (i / 1000) % 10;
            int e = (i / 10000) % 10;
            if (a + b + c + d + e == 43) {
                System.out.println(i);
            }
            i++;
        }

    }
    //najvacsie 5cif cislo, ktore je delitelne cislom 613

    public void hW12() {
        int i = 99999;
        while (i % 613 != 0) {   //i=99999 - (99999 % 613 )
            i--;
        }
        System.out.print(i);
    }

    public void hW13() {
        int a = 6;
        int b = 8;
        int x = 1;
        while ((a * x) % b != 0) {
            x++;
        }
        System.out.println(a * x);

    }

    public void hW14() {
        int a = 54;
        int b = 87;
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println(a + " " + b);

        }

    }

    public void hW15() {
        int a = 48;
        int b = 88;
        int c = 0;

        if (a < b) {
            c = a;
            a = b;
            b = c;
        }
        while (a % b != 0) {
            c = b;
            b = a - b;
            a = c;

            if (a < b) {
                c = a;
                a = b;
                b = c;
            }
        }
        System.out.println(b);

    }

    public void hW16() {
        for (int j = 5; j > 0; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void hW17() {
        int i;
        int j;
        int n = 7;
        for (j = 0; j <= n; j++) {

            for (i = 1 * (n - j); i >= 0; i--) {
                System.out.print(" ");

            }
            for (i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void hW18() {
        int r;
        int m;
        int h;
        int x = 1;
        for (r = 1; r <= 7; r++) {
            for (m = 6; m >= r; m--) {
                System.out.print(" ");
            }
            for (h = 1; h <= x; h++) {
                System.out.print("*");
            }
            System.out.println(" ");
            x += 2;
        }
    }

    public void hW19() {
        int r;
        int c = 1;
        int s;
        for (r = 1; r <= 8; r++) {
            for (s = 1; s <= 8; s++) {
                if (r == 1 || r == 8 || s == 1 || s == 8) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayNHello(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println("Hello"); //cyklus for
            i++;
        }
        System.out.println(); //odriadkovanie na konci vypisu

    }

    public void sayHi() {
        System.out.println("Hi");
    }

    public void sayNHi(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println("Hi");
            i++;
        }
        System.out.println();
    }

    public int roundNumber(int a) {
        if (a % 2 == 0) {
            return a;
        } else {
            return a + 1;

        }
    }

    public void calcLoan(int months, double interestRate, double amountOfMoney) {
        double monthRate = interestRate / 12;
        double monthlyInterest = (((amountOfMoney / months) / 100) * monthRate);
        double monthlyPayment = amountOfMoney / months + monthlyInterest; // mesacna splatka + urok
        double paymentTotal = monthlyPayment * months;
        System.out.println("Your monthly payment will be " + monthlyPayment + "$, and total you wil pay " + paymentTotal);

    }

    public void zodiac() {
        int day = 0;
        int month = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter day and month");
        day = scanner.nextInt();
        month = scanner.nextInt();

        if ((day >= 22 && month == 12) || (day <= 20 && month == 1)) {
            System.out.println("Vase znamenie je Kozorozec");
        } else if ((day >= 21 && month == 1) || (day <= 19 && month == 2)) {
            System.out.println("Vase znamenie je Vodnar");
        } else if ((day >= 20 && month == 2) || (day <= 20 && month == 3)) {
            System.out.println("Vase znamenie su Ryby");
        } else if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
            System.out.println("Vase znamenie je Baran");
        } else if ((day >= 21 && month == 4) || (day <= 21 && month == 5)) {
            System.out.println("Vase znamenie je Byk");
        } else if ((day >= 22 && month == 5) || (day <= 21 && month == 6)) {
            System.out.println("Vase znamenie su Blizenci");
        } else if ((day >= 22 && month == 6) || (day <= 22 && month == 7)) {
            System.out.println("Vase znamenie je Rak");
        } else if ((day >= 23 && month == 7) || (day <= 23 && month == 8)) {
            System.out.println("Vase znamenie je Lev");
        } else if ((day >= 24 && month == 8) || (day <= 23 && month == 9)) {
            System.out.println("Vase znamenie je Panna");
        } else if ((day >= 24 && month == 9) || (day <= 23 && month == 10)) {
            System.out.println("Vase znamenie je Vaha");
        } else if ((day >= 24 && month == 10) || (day <= 22 && month == 11)) {
            System.out.println("Vase znamenie je Skorpion");
        } else if ((day >= 23 && month == 11) || (day <= 21 && month == 12)) {
            System.out.println("Vase znamenie je Strelec");
        } else if (day == 0 || day > 31 || month == 0 || month > 12 || (month == 2 && day > 28)) {
            System.out.println("Zadali ste zly datum");
        }

    }

    public void userVerify() {
        Random rnd = new Random();
        Scanner myscan = new Scanner(System.in);

        int symbol = rnd.nextInt(4);
        int r = 0;
        int count = 1;
        int sum=0;
        int incorrect=0;
        while (count <= 10) {

            int a = rnd.nextInt(90) + 10;
            int b = rnd.nextInt(90) + 10;
            System.out.println("Cislo prikladu " + count);


            switch (symbol) {
                case 0:
                    System.out.print(a + " + " + b + " = ");
                    break;
                case 1:
                    System.out.print(a + " + " + b + " = ");
                    r = a + b;
                    break;
                case 2:
                    System.out.print(a + " - " + b + " = ");
                    r = a - b;
                    break;
                case 3:
                    System.out.print(a + " * " + b + " = ");
                    r = a * b;
                    break;
            }
            int input = myscan.nextInt();

            if (r == input) {
                System.out.println("Correct");  sum++;
            } else {
                System.out.println("Incorrect"); incorrect++;
            }
            count++;
        }
        System.out.println("Correct answers " + sum + " incorrect answers "+incorrect);
    }

    public String generatePassword(int n, boolean rules) {
        if (rules == true && (n < 6 || n > 30))  // kontrola dlzky hesla
            n = 10;

        String passwd = "";
        int count = 0;
        int digits = 0;
        int upper = 0;
        int lower = 0;
        if (rules == false) {
            digits = upper = lower = 1;
        }
        int num = 0;
        Random rnd = new Random();
        do {
            int type = rnd.nextInt(3);
            switch (type) {
                case 0:
                    num = rnd.nextInt(10) + '0';
                    digits++;
                    break;
                case 1:
                    num = rnd.nextInt(26) + 'A';
                    upper++;
                    break;
                case 2:
                    num = rnd.nextInt(26) + 'a';
                    lower++;
                    break;
            }
            char c = (char) num;
            passwd += c;
            count++;
            if (count == n && (digits == 0 || upper == 0 || lower == 0)) {
                count = digits = upper = lower = 0;
                passwd = "";
            }

        } while (count < n);

        return passwd;
    }

    public void test33() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object


        System.out.println("Add number of month ");
        int month = myObj.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");


            default:
                System.out.println("you add bad number");


        }


    }

}
