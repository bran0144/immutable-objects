public class Demo {
    private void reserve(Money cost) {
        System.out.println("Reserving an item costing " + cost);
    }
    private void buy(Money wallet, Money cost){
        boolean enoughMoney = wallet.compareTo(cost) >= 0;
        this.reserve(cost);

        if (enoughMoney)
            System.out.println("You will pay " + cost + " with your " + wallet);
        else
            System.out.println("You cannot pay " + cost + " with your " + wallet);
    }

    private void run(){

    }
}
