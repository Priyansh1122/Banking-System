import java.util.*;

class Investment{
    int initial;
    double interest;
    int time;
    
    Investment(int initial,double interest,int time){
        this.initial=initial;
        this.interest=interest;
        this.time=time;
    }
    
}

class Future extends Investment{
    double future_value;
    int r;
    Future(int initial,double interest,int time){
        super(initial,interest,time);
        
    }
    void value(){
        
        future_value=initial * Math.pow(1+ (interest/100) ,time);
        System.out.println("The future value of the investment is:"+future_value);
    }
}


class tracker{
    int expense;
    int income;
    tracker(int expense,int income){
        this.expense=expense;
        this.income=income;
        
    }
    void calculate(){
        int i;
        if(expense==income){
            System.out.println("you have not saved money");
        }
        else if(expense>income){
            i=expense-income;
            System.out.println("you are overspending rs:"+i);
        }
        else if(expense<income){
            i=income-expense;
            System.out.println("you are saving rs:"+i);
        }
        else{
            System.out.println("wrong character entered");
        }
        
    }
    
}


class User{
    String name;
    int income;
    int credit;
    
    User(String name,int income,int credit){
        this.name=name;
        this.income=income;
        this.credit=credit;
    }
    
}

class Loan extends User{
    int loan_amount;
    Loan(String name,int income,int credit,int loan_amount){
        super(name,income,credit);
        this.loan_amount=loan_amount;
        
    }
    void approve(){
        if(loan_amount>=10000 && loan_amount<=1000000){
            if(credit>300 && credit<=550){
                System.out.println("Your credit score is poor .Your Loan is not approved");
                
            }
            else if(credit>550){
                System.out.println("Your credit score is Good.Your loan is approved");
            }
            else{
                System.out.println("Your credit score is very poor.Your loan is not approved");
            }
        }
        else if(loan_amount>1000000){
            if(credit>300 && credit<=550){
                System.out.println("Your credit score is poor.Your loan is not approved");
                
            }
            else if(credit>550 && credit<=650){
                System.out.println("Your credit score is not enough .Your loan is not approved");
            }
            else if(credit>650){
                System.out.println("Your credit score is good.Your loan is approved");
            }
            else{
                System.out.println("Your credit score is very poor.Your loan is not approved");
            }
            
        }
        else{
            System.out.println("Your amount is very low.You cannot get a loan");
        }
    }
    
}


class credit{
    
    int balance;
    
    String name;
    credit(String name,int balance){
        this.name=name;
        this.balance=balance;
        
    }
}

class interest extends credit{
    int date;
    interest(String name,int balance,int date){
        
        super(name,balance);          
        this.date=date;
        
        
    }
    void calculate(){
        if(date== 1|| date==2 || date==3 || date==4 || date==5 ){
            System.out.println("You paid the bill on time .You dont have to pay any interest");
        }
        else if(date>5 && date<=10){
            System.out.println("you have been fined Rs 500");
        }
        else if(date>10 && date<=15){
            System.out.println("you have been fined Rs 1000");


        }
        else if(date>15 && date<=20){
            System.out.println("you have been fined Rs 1500");
        }
        else if(date>20 && date<=25){
            System.out.println("you have been fined Rs 2000");

        }
        else if(date>25 && date<=31){
            System.out.println("you have been fined Rs 2500");
        }
        else{
            System.out.println("Enter date between 1 to 31");
        }
    }
}
class Credit_card{
    public static void main(String[] args){
        
        char q;
        do{
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter which service you want to use:");
         System.out.println("1-Credit Card Bill");
         System.out.println("2-Loan Approval ");
         System.out.println("3-Check Your Budget that you are saving or overspending");
         System.out.println("4-Investment Calculation");
         int b=sc.nextInt();
         
            switch(b){
                case 1:
                Scanner r=new Scanner(System.in);
                System.out.println("Enter your name:");
                String name=r.nextLine();
        
                System.out.println("How much you spended with credit card:");
                int balance=r.nextInt();
        
                System.out.println("You should pay the bill within 5 working days of next month. On which date you paid the bill:");
                int date=r.nextInt();
        
            
        
               interest i=new interest(name,balance,date);
               i.calculate();
               break;
            
               case 2:
               Scanner m=new Scanner(System.in);
               System.out.println("Enter your name:");
               name=m.nextLine();
               System.out.println("Enter your income:");
               int income=m.nextInt();
               System.out.println("Enter your credit score");
               int credit=m.nextInt();
               System.out.println("Enter your loan amount");
               int loan_amount=m.nextInt();
        
               Loan l=new Loan(name,income,credit,loan_amount);
               l.approve();
               break;
               case 3:
               Scanner s=new Scanner(System.in);
               System.out.println("Enter your monthly expenses:");
               int e=s.nextInt();
               System.out.println("Enter your monthly income:");
               int g=s.nextInt();
    
               tracker t=new tracker(e,g);
               t.calculate();
               break;

               case 4:
               Scanner p=new Scanner(System.in);
               System.out.println("enter your initial investment:");
               int z=p.nextInt();
               System.out.println("enter interest rate:");
               double w=p.nextInt();
               System.out.println("enter the time period of investment:");
               int u=p.nextInt();
    
               Future f=new Future(z,w,u);
               f.value();
               break;
            }

          Scanner y=new Scanner(System.in);
          System.out.println("Do you want to use the service again Press y for yes and n for no");
          q=y.next().charAt(0);
        }while(q=='y'||q=='Y');

       
        
      
        
        
       

        
        
        
            
       
        
        
        
    }
    
}
