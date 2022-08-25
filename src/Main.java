public class Main {
    public static void main(String[] args) {
//### **Задача 1.**
//        Ваше первое задание: присвоить переменным разные значения. Для решения этой задачи используйте тип переменной var.
//        1. dog значение 8;
//        2. cat значение 3.6;
//        3. paper значение 763789;
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("------------------------------------------");
//        ### **Задача 2.**
//        Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.  Для решения этой задачи используйте тип переменной var.
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("------------------------------------------");
//        А теперь нужно уменьшить значение каждой переменной:
//        1. dog уменьшить на 3,5;
//        2. cat  уменьшить на 1,6;
//        3. paper уменьшить на  7639;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}