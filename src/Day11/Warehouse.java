package Day11;

public class Warehouse {
    private int countOrder;
    private int balance;
    boolean bonusPicker=false;
    boolean bonusCourier=false;//В условиях не сказано про многократные бонусы

    public String toString(){
        return "Count of orders "+ this.countOrder + " / Balance "+this.balance +
                " / Bonus of Picker = " + bonusPicker+ " / Bonus of Courer = "+bonusCourier;
    }

    public void upCountOrder(){
        this.countOrder++;

    }
    public int numOfOrders(){
        return this.countOrder;
    }
    public void upBalance(){
        this.balance+=1000;
    }
    public int sumOfBalance(){
        return this.balance;
    }

}
