public class MainCats {
    public static void main(String[] args) {

        DiffrentsCats.Cat onePerson = new DiffrentsCats.Cat("Ухо", "Откушенное", 5, 3, "black");

        DiffrentsCats.Cat twoPerson = new DiffrentsCats.Cat("Гречка", "Зеленая", 3, 2, "tricolor");

        DiffrentsCats.Cat threePerson = new DiffrentsCats.Cat("Глаз", "Косой", 7, 7, "gray");

        System.out.println("Команда кошачьего дрындолета состоит из первого пилота " + threePerson.getSecondName() + " " + threePerson.getFirstName() +
                " ,второго пилота " + twoPerson.getSecondName() + " " + twoPerson.getFirstName() + " и штурмана " + threePerson.getSecondName() + " " + threePerson.getFirstName() + ".");

        onePerson.sayHello();
        twoPerson.sayName();
        threePerson.sayHello();
        twoPerson.sayGoodWish();
    }
}
