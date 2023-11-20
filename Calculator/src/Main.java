//Задание: Калькулятор с использованием архитектуры MVC
//
//        Цель задания: Создать простой калькулятор, используя архитектуру Модель-Вид-Контроллер (MVC) для разделения функциональности.
//
//        Описание задания:
//
//        Модель (Model): Создайте класс CalculatorModel, который будет отвечать за математические операции. Этот класс должен содержать методы для сложения, вычитания, умножения и деления чисел. Также предусмотрите обработку случая деления на ноль.
//
//        Представление (View): Создайте класс CalculatorView, который будет отвечать за ввод и вывод данных. Этот класс должен предоставить методы для ввода операндов и оператора от пользователя, а также для отображения результата вычислений.
//
//        Контроллер (Controller): Создайте класс CalculatorController, который будет координировать работу между моделью и представлением. Этот класс должен иметь методы для запуска калькулятора, получения ввода пользователя, вызова соответствующей операции в модели и вывода результата в представлении.
//
//        Подробности задания:
//
//        Калькулятор должен поддерживать четыре основные математические операции: сложение, вычитание, умножение и деление.
//
//        Калькулятор должен запрашивать у пользователя ввод двух операндов и оператора (+, -, *, /).
//
//        Если оператор введен некорректно или если введено деление на ноль, калькулятор должен выводить соответствующее сообщение об ошибке.
//
//        Калькулятор должен выводить результат операции.
//
//        Калькулятор должен предоставить пользователю возможность продолжить вычисления или завершить программу.
//
//        Примечания:
//
//        Это задание ориентировано на разделение функциональности между компонентами Модель-Вид-Контроллер (MVC). Убедитесь, что каждый класс выполняет свою специфическую роль.
//
//        В качестве языка программирования используйте Java, как указано в вашем профиле.
//
//        При разработке уделяйте внимание обработке ошибок и валидации ввода от пользователя.
//
//        Создайте основной класс (например, Main), который создает объекты модели, представления и контроллера, а затем запускает калькулятор.
//
//        Важно соблюдать принципы архитектуры МВС, чтобы обеспечить четкое разделение компонентов и их независимость.
//
//        Формат сдачи: ссылка на гитхаб проект
public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view= new CalculatorView();
        CalculatorController controller= new CalculatorController(model,view);

        controller.runCalculator();
    }
}