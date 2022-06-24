package Homework.Homework9.Task1;

/**
 Создать класс Robot с параметрами: name, age, power
 Реализовать метод boolean fight(Robot anotherRobot):
 реализовать механизм драки роботов в зависимости от силы.
 Метод должен определять, выиграл ли робот у которого вызвали метод fight (this) бой или нет,
 т.е. возвращать true, если выиграли и false - если нет.
 Должно выполняться условие:
 если robot1.fight(robot2) = true , то robot2.fight(robot1) = false
 */


public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getPower() {
        return this.power;
    }

    public boolean fight(Robot anotherRobot) {
        boolean robotWin;

        if(this.getPower() > anotherRobot.getPower()) {
            robotWin = true;
        } else {
            robotWin = false;
        }
        return robotWin;
    }
}
