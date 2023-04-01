public class AccountManagement {

    private Account account = new Account(20.0);

    public void accountOperations() {
        account.deposit(10); //Balance = 30
        account.deposit(20); //Balance = 50

        try {
            account.withdraw(70);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage()); //Irá exibir "Não há saldo suficiente para o saque."
        }
    }

}
