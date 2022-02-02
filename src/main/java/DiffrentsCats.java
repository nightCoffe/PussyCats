public class DiffrentsCats {

    public static class Cat {
        private String firstName;
        private String secondName;
        private int age;
        private int weight;
        private String color;

        public Cat(String firstName, String secondName, int age, int weight, String color) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.weight = weight;
            this.color = color;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            }
        }

        public int getAge() {
            return age;
        }

        public void setWeight(int weight) {
            if (weight > 0) {
                this.weight = weight;
            }
        }

        public int getWeight() {
            return weight;
        }

        public void setColor(String color) {
            if (color != null) {
                this.color = color;
            }
        }

        public String getColor() {
            return color;
        }

        public void sayHello() {
            System.out.println("Hello, my name is " + secondName + " " + firstName + ", I'm " + age + " years old, my weight is "
                    + weight + " and my color is " + color + ".");
        }

        public void sayName() {
            System.out.println("My name is" + secondName + " " + firstName);
        }

        public void sayGoodWish() {
            System.out.println("Да вы не бойтесь, если, что случится, наш дрындолет прекрасно плавает.");
        }
    }
}
