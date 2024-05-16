import java.util.Scanner;

public class ATM_INTERFACE {
    public static void main(String[] args) {
        int bal = 0, withdraw, deposit;
        Scanner input = new Scanner(System.in);
        System.out.println("Balance : " + bal);
        System.out.println("");
        while(true){
            System.out.println("ATM Machine");
            System.out.println("");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println("");
            System.out.print("Please select a operation :");
            int i=input.nextInt();
            switch(i){
                case 1:
                System.out.println("Enter the amount you want to withdraw");
                withdraw=input.nextInt();
                if(bal>=withdraw){
                    bal=bal-withdraw;
                    System.out.println("Please collect your money");
                }else System.out.println("Insufficient Balance");
                System.out.println("");
                break;
                case 2:
                System.out.println("Enter money to be deposited");
                deposit = input.nextInt();
                bal=bal+deposit;
                System.out.println("Your Money has been successfully deposited");
                System.out.println("");
                break;
                case 3:
                System.out.println("Balance : " + bal);
                System.out.println("");
                break;
                case 4:
                System.exit(0);
            }
        }
    }
}
