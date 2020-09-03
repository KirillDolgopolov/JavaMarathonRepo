package Day11;

public class Courier implements Worker{
    int salary;

    public void doWork(Warehouse s) {
        salary+=100;
        s.upBalance();
        int x=s.sumOfBalance();
        if (x==1000_000){
            salary*=2;
        }

    }

    public void bonus(Warehouse s) {
        int x=s.sumOfBalance();
        if (x==1000_000&& s.bonusCourier==false){
            salary*=2;
            s.bonusCourier=!s.bonusCourier;
        }

    }

    public int getSalary(){
        return salary;
    }
}
