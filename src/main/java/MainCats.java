public class MainCats {
    public static void main(String[] args) {

        DiffrentsCats.Cat onePerson = new DiffrentsCats.Cat("Ухо", "Откушенное", 5, 3, "black");

        DiffrentsCats.Cat twoPerson = new DiffrentsCats.Cat("Гречка", "Зеленая", 3, 2, "tricolor");

        DiffrentsCats.Cat threePerson = new DiffrentsCats.Cat("Глаз", "Косой", 7, 7, "gray");

        DiffrentsCats.Cat fourPerson = new DiffrentsCats.Cat("Цап", "Мохнатый", 6, 2, "tricolor");

        System.out.println("Команда кошачьего дрындолета состоит из первого пилота " + onePerson.getSecondName() + " " + onePerson.getFirstName() +
                " ,второго пилота " + twoPerson.getSecondName() + " " + twoPerson.getFirstName() + ", штурмана " + threePerson.getSecondName() + " " + threePerson.getFirstName()
                + " и стрелка-радиста " + fourPerson.getSecondName() + " " + fourPerson.getFirstName() + ".");

        onePerson.sayHello();
        twoPerson.sayName();
        threePerson.sayHello();
        fourPerson.sayHello();
        twoPerson.sayGoodWish();
    }
}
