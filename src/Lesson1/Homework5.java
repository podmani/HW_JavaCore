package Lesson1;

public class Homework5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Черчесов Станислав Саламович", "главный тренер","cherchesov@rfu.ru","+71111111", 200000, 55);
        persArray[1] = new Person("Дзюба Артем","нападающий","dzuba@rfu.ru", "+777474", 400000, 32);
        persArray[2] = new Person("Головин Александр","полузащитник","golovin@rfu.ru","+72222",250000, 25);
        persArray[3] = new Person("Джикия Георгий","защитник","dzhikia@rfu.ru", "+788999", 280000, 28);
        persArray[4] = new Person("Шунин Антон","вратарь", "shunin@rfu.ru", "+7987654", 1600000, 34 );
        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge() > 40){
                persArray[i].printInfo();
            }
        }
    }
}
