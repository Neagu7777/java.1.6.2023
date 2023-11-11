public class Person implements Comparable<Person> {

    private String name;
    private int age;

    // Конструктор класса
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для сравнения объектов Person по возрасту
    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    // Геттеры и сеттеры для полей name и age

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Пример использования Comparable для сравнения объектов Person
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        int result = person1.compareTo(person2);

        if (result < 0) {
            System.out.println(person1.getName() + " younger than " + person2.getName());
        } else if (result > 0) {
            System.out.println(person1.getName() + " older than " + person2.getName());
        } else {
            System.out.println(person1.getName() + " and " + person2.getName() + " are of the same age");
        }
    }
}
