import java.util.Scanner;

public class Exercice18 {

    public static void main(String[] args) {
        double h, hourm, money, net, gross, tax;

        Scanner inputValue;
        inputValue= new Scanner(System.in);

        System.out.println("Enter hours: ");
        h= inputValue.nextDouble();
        System.out.println("Enter $/hour: ");
        hourm= inputValue.nextInt();

        if (h < 35) {
            money = h * hourm;
            if ( money < 500 ) {
                net=money;
                gross=h*hourm;
                tax=0;
                System.out.println("Net salary: " + net);
                System.out.println("Gross salary: " + gross);
                System.out.println("Taxes: " + tax);
            } else if ( money < 900) {
                tax= 0.25 * (money - 500);
                gross=h*hourm;
                net=money-tax;
                System.out.println("Net salary: " + net);
                System.out.println("Gross salary: " + gross);
                System.out.println("Taxes: " + tax);
            } else {
                tax= 0.45 * (money - 900)+0.25*400;
                gross=h*hourm;
                net=money-tax;
                System.out.println("Net salary: " + net);
                System.out.println("Gross salary: " + gross);
                System.out.println("Taxes: " + tax);
            }
        } else {
            money = 35 * hourm + (h-35)*1.5*hourm;
            if ( money < 500 ) {
                net=money;
                gross=35*hourm + 1.5*hourm*(h-35);
                tax=0;
                System.out.println("Net salary: " + net);
                System.out.println("Gross salary: " + gross);
                System.out.println("Taxes: " + tax);
            } else if ( money < 900) {
                tax= 0.25 * (money - 500);
                gross=35*hourm + 1.5*hourm*(h-35);
                net=money-tax;
                System.out.println("Net salary: " + net);
                System.out.println("Gross salary: " + gross);
                System.out.println("Taxes: " + tax);
            } else {
                tax= 0.45 * (money - 900)+ 0.25*400;
                gross=35*hourm + 1.5*hourm*(h-35);
                net=money-tax;
                System.out.println("Net salary: " + net);
                System.out.println("Gross salary: " + gross);
                System.out.println("Taxes: " + tax);
        }
    }
}
}
