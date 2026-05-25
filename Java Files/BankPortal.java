import java.util.Scanner;

public class BankPortal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankLogic bank = new BankLogic(50000);

        int width = 140;
        boolean running = true;
        boolean firstTime = true;
       
        System.out.println("");
        System.out.println(""); 
        System.out.println(center("===================", width));
        System.out.println(center("WELCOME TO THE BANK",   width));
        System.out.println(center("===================", width));

        while (running) {
        if (firstTime) {
        System.out.println(center("WHAT WOULD YOU LIKE TO DO?", width));
        firstTime = false;
        } else {
        System.out.println("");
        System.out.println(center("-------------------------------", width));
        System.out.println(center("WHAT ELSE WOULD YOU LIKE TO DO?", width));
        System.out.println(center("-------------------------------", width));

        }
        
        System.out.println("");
        System.out.println(center("TYPE 1 TO CHECK CURRENT BALANCE", width));
        System.out.println(center("TYPE 2 TO WITHDRAW", width));
        System.out.println(center("TYPE 3 TO DEPOSIT", width));
        System.out.println(center("TYPE 4 TO EXIT BANK", width));

        try {
            
        } catch (Exception e) {
            
        }
        String prompt = "Enter your choice: ";
        System.out.print(" ".repeat((width - prompt.length()) / 2) + prompt);
        int choice = scanner.nextInt();
        
       

        switch (choice) {

            case 1:
            
            System.out.println(center("", width));
            bank.showTotalMoney();
            break;

            case 2:

            System.out.println(center("", width));
            String withdrawPrompt = "Enter amount to withdraw: ";
            System.out.print(" ".repeat((width - withdrawPrompt.length()) / 2) + withdrawPrompt);
            double withdraw = scanner.nextDouble();
            bank.getWithdraw(withdraw);
            break;

            case 3:

            System.out.println(center("", width));
            String depositPrompt = "Enter amount you want deposit: ";
            System.out.print(" ".repeat((width - depositPrompt.length()) / 2) + depositPrompt);
            double deposit = scanner.nextDouble();
            bank.getDeposit(deposit);
            break;

            case 4:

            System.out.println(center("", width));
            System.out.println(center("================", width));
            System.out.println(center("HAVE A GREAT DAY", width));
            running = false;
            break;
        
           
          default:

            System.out.println(center("", width));
            System.out.println(center("INVALID INPUT", width));
          
        }
     }
        scanner.close();

    }

    public static String center(String text, int width) {
        if (text.length() >= width) return text;
        int leftPadding = (width - text.length()) / 2;
        return " ".repeat(leftPadding) + text;
     
    }
}

