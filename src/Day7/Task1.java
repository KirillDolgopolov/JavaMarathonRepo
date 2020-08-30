package Day7;
/*
В классе Самолет создать статический метод,
который в качестве аргументов
принимает два объекта класса Airplane (два самолета)
и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */

public class Task1 {
    public static void main (String[] args){

       Airplane centurion = new Airplane("Cessna", 2002, 6,1045);
       Airplane skyhawk = new Airplane ("Cessna", 1956, 8,1001);

       Airplane.compare(centurion,skyhawk);

        centurion.setLenght(10);
        centurion.setYear(1968);
        centurion.fillUp(150);
        centurion.fillUp(100);
       // centurion.info();

        Airplane.compare(centurion,skyhawk);



    }
}


class Airplane{
    String name;
    int year;
    int lenght;
    int weight;
    int volume;


     static void compare(Airplane one, Airplane two){
         if (one.getLenght()>two.getLenght()){
             System.out.println("Первый самолёт длиннее второго");
         } else if (one.getLenght()<two.getLenght()){
             System.out.println("Второй самолёт длиннее первого");
         } else {
             System.out.println("Самолёты одинаковой длины");}

    }

    int getLenght(){
        return this.lenght;
    }

    public Airplane (String name, int year, int lenght, int weight){
        this.name=name;
        this.year=year;
        this.lenght=lenght;
        this.weight=weight;
        volume=0;
    }
    void info(){
        System.out.println("Изготовитель: "+name);
        System.out.println("Год выпуска: "+year);
        System.out.println("Длина:"+lenght);
        System.out.println("Масса: "+weight);
        System.out.println("Объём топтива в баке: "+volume);
    }

    void fillUp(int v){
        volume=volume+v;
    }
    void setYear(int year){ this.year=year;}
    void setLenght(int lenght){this.lenght=lenght;}
}

