package homework.homework11;

/**
 * Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 * Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, двое детей. Вывести объекты на экран.
 * Примечание:
 * Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
 * Пример вывода:
 * Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
 * Имя: Катя, пол: женский, возраст: 55
 * Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 * …
 */

public class Human {

    private String name;
    private boolean gender;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, boolean gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        if(this.father != null && this.mother != null) {
            return "Имя: " +  this.name +  " пол: " +  (this.gender? "мужской" : "женский") +  " возраст: "  + this.age +
                    " отец: " +  this.father.name  + " мать: " + this.mother.name;
        } else{
            return "Имя: " +   this.name +  " пол: " +  (this.gender ? "мужской" : "женский") +  " возраст: "  + this.age;
        }
    }
}




