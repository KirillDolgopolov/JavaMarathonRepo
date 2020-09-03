package Day11;

public class Picker implements Worker {
    int salary;

    public void doWork(Warehouse s) {
        this.salary+=80;
        s.upCountOrder();

    }

    public void bonus(Warehouse s) {
        int x=s.numOfOrders();
        if (x>=1500&& s.bonusPicker==false){
            salary*=3;
            s.bonusPicker=!s.bonusPicker;
        }

    }

    public int getSalary(){
        return salary;
    }
}
