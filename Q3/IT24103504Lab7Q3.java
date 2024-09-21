import java.util.Scanner;
public class IT24103504Lab7Q3 {
    public static void main(String[] args) {

 int count;
 double disc;
double amount;
double payamount;
char method;
Scanner input = new Scanner(System.in);

for(count=1;count<=5;count++)
{
  System.out.println("Coustomer "+ count);

  System.out.println("Enter total biil amount: ");
  amount=input.nextDouble();


  System.out.println("Enter mode of payement(C for cash, O for other):  ");
  method=input.next().charAt(0);
    
   if(method=='C'){

     disc=amount*5/100;
        
       System.out.println("Discount is: "+disc);
       payamount=amount-disc;
       System.out.println("Amount to be paid: "+payamount);

    }

   else if(method=='O'){

     System.out.println("NO dsicount Applicable");
      System.out.println("Amount to be paid: "+amount);
   }

   else
    System.out.println("Payement mode is not valid");
 


 }
}
}