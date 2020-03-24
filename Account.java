//Autumn Capasso
//UMUC Project 2 ATM
//This class will hold all the functional logic of Withdraw, Transfer and Deposit



public class Account {

    //variable
    public double balance;
    public int count;
    public double amount;
    public double deposit;

    //constructor and Surcharge function
    public void Account(double balance, double amount, int count) throws InsufficientFunds {



        if (count >= 3) {
            double surcharge = 1.50;
            amount += surcharge;
        }

        if (this.balance <= amount) {
            this.balance -= amount;
            count++;
        }

    }

    //method for  balance
    public void setBalance(double balance){
        this.balance = balance;

    }


    //returns the blance so it can be used in other places in the porgram
    public double getBalance () {
        return this.balance;
    }




    //Creating the Checking & Savings Accounts Subclasses


    //Checking subclass
    public class Checking extends Account{

        //constructor for checking account
        public Checking(){

        }
    }




    //Savings subclass
    public class Savings extends Account{

        //constructor for Savings Account
        public Savings(){

        }
    }


    //The Deposite Method
    public void deposit (double deposit){
        this.balance += balance;
    }


    //Withdraw Method
    public void Withdraw (double withdraw) throws InsufficientFunds{

        if(this.balance - withdraw <0){
            throw new InsufficientFunds();
        }

        this.balance = this.balance - withdraw;
    }



    //Transfer  Method
    public void transfer (double transfer){
        this.balance = this.balance + deposit;
    }


}


