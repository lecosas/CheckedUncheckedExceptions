public class Account {

    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws NegativeBalanceException {

        if (this.balance - amount < 0) {
            // Dispara a exceção NegativeBalanceException caso o saldo seja negativo.
            throw new NegativeBalanceException("Não há saldo suficiente para o saque.");
        } else {
            this.balance -= amount;
        }
    }
}
