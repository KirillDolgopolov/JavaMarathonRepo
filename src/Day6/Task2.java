package Day6;
/*Создать класс Самолет с полями
“изготовитель”, “год выпуска”, “длина”, “вес”, “объем топлива в баке”.
Создать конструктор в классе Самолет,
принимающий в качестве аргументов значения четырех полей класса
(значение поля “объем топлива в баке” установить равным 0).
В конструкторе для передачи полям значений
использовать ключевое слово this.
Помимо этого, в классе необходимо реализовать метод info(),
который выводит сообщение в следующем формате:
“Изготовитель: … , год выпуска: … , длина: ..., вес: ..., объем топлива в баке: …”
Также, необходимо реализовать метод fillUp(),
который в качестве аргумента принимает число
и заправляет топливный бак самолета на это значение.
Создать новый объект класса Самолет с произвольными данными.
Изменить год выпуска и длину с помощью сеттеров,
вызвать метод fillUp() два раза, передав разные значения. Вызвать метод info().
*/

public class Task2 {
    public static void main (String[] args){

        Airplane centurion = new Airplane("Cessna", 2002, 6,1045);

        centurion.setLenght(10);
        centurion.setYear(1968);
        centurion.fillUp(150);
        centurion.fillUp(100);
        centurion.info();



    }
}


class Airplane{
String name;
int year;
int lenght;
int weight;
int volume;

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