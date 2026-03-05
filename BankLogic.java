public class BankLogic {

    double totalMoney;
    int width = 140;

    public BankLogic (double totalMoney) {
        this.totalMoney = totalMoney;
    }

    private String center(String text) {
        if (text.length() >= width) return text;
        int leftPadding = (width - text.length()) / 2;
        return " ".repeat(leftPadding) + text; 
    }

    public void showTotalMoney() {
        System.out.println(center("CURRENT BALANCE = $" + totalMoney));
    }

    public void getWithdraw(double amount) {
         if (amount > totalMoney) {
            System.out.println(center("NOT ENOUGH MONEY IN ACCOUNT"));
                      
         } else if (amount <=0) {
            System.out.println(center("INVALID"));
            System.out.println(center("ENTER POSITIVE AMOUNT ONLY"));
         } else {
            totalMoney -= amount;
            System.out.println(center("SUCCESSFUL"));
            System.out.println(center("YOUR NEW BALANCE IS :: $" + totalMoney));
        }   
    } 

    public void getDeposit (double amount) {
        if (amount <= 0) {
            System.out.println(center("INVALID"));
            System.out.println(center("ENTER POSITIVE AMOUNT ONLY"));

        } else {
            totalMoney += amount;
            System.out.println(center("SUCCESSFUL"));
            System.out.println(center("YOUR NEW BALANCE IS :: $" + totalMoney));       
        }
    }
   
 }

