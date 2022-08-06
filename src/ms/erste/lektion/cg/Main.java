package ms.erste.lektion.cg;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERENT = 100;
        int principal = 0;
        float monthyInteresst;
        float numberOFPayments = 0;


        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if(principal >=1000 && principal <= 1_000_00)
                break;
            System.out.println("Enter a value 1000 and 1000000");

        }


      while (true) {
          System.out.print("Annual Interest Rate: ");
          float annulaInterest = scanner.nextFloat();
          if(annulaInterest >=1 && annulaInterest <=30){
              monthyInteresst = annulaInterest / PERENT / MONTHS_IN_YEAR;
              break;
          }
          System.out.println("Enter a value between 1 and 30");
      }

      while (true){
          System.out.print("Period (Years) :");
          byte years = scanner.nextByte();
          if(years >= 1&& years<= 30){
              numberOFPayments = years * MONTHS_IN_YEAR;
              break;
          }
          System.out.println("Enter a value between 1 and 30");
      }


        float monthlyInterest = anuulaInterest / PERENT /MONTHS_IN_YEAR;

        System.out.print("Period (Year : ");
        byte years = scanner.nextByte();
        int numberofPayments = years * MONTHS_IN_YEAR;


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(montgage);
        System.out.println("Mortgage: " + mortgageFormatted);



    }
    public static double calculateMortgage(int principal, float annualInterest,byte years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERENT = 100;
        float monthlyInterest = annualInterest / PERENT /MONTHS_IN_YEAR;
        float numberofPayments = years * MONTHS_IN_YEAR;
        double montgage = principal * (monthlyInterest * Math.pow(1 +monthlyInterest, numberofPayments))/
                (Math.pow(1+monthlyInterest, numberofPayments) -1);
        return montgage;


    }
}


