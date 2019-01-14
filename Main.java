import Competitor.*;
import Obstacle.*;



//Добавить класс Team, который будет содержать название команды, массив из 4-х участников
// (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации о членах команды,
// прошедших дистанцию, метод вывода информации обо всех членах команды.
//        Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий, метод,
//        который будет просить команду пройти всю полосу.
//        То есть в итоге должно быть что-то вроде:
//public static void main(String[] args) {
//        Course c = new Course(...); // Создаем полосу препятствий
//        Team team = new Team(...);  // Создаем команду
//        c.doIt(team);               // Просим команду пройти полосу
//        team.showResults();         // Показываем результаты
//        }
//

public class Main {
    public static void main(String[] args) {

        Team team = new Team("Rocket", new Human("Bob"), new Cat("Vaska"), new Dog("Bobik"));
        Course course = new Course(new Cross(80), new Wall(2), new Wall(1), new Cross(120));
        course.doIt(team);
        team.showWinners();
    }
}

