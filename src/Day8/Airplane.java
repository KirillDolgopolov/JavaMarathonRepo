package Day8;


class Airplane {
String name;
int year;
int lenght;
int weight;
int volume;

public Airplane(String name, int year, int lenght, int weight){
    this.name=name;
    this.year=year;
    this.lenght=lenght;
    this.weight=weight;
    volume=0;
}

public String toString(){
    return "Изготовитель: "+name+"\n"+"Год выпуска: "+year+"\n"+
            "Длина:"+lenght+"\n"+"Масса: "+weight+"\n"+"Объём топтива в баке: "+volume;
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