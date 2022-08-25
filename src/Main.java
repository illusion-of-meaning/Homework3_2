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
        System.out.println("------------------------------------------");
//        ### Задание 4
//        Инициализируйте (=присвойте значение) переменную friend значением 19.
//        Увеличьте значение переменной на 2, после чего поделите значение на 7.
//        После каждой операции выводите значение переменной в консоль. В итоге, у вас должно быть выведено 3 значения одной переменной.
        var friend = 19;
        System.out.println(friend);
        System.out.println(friend += 2);
        System.out.println(friend / 7);
        System.out.println("------------------------------------------");
//        ### Задание 5
//        Инициализируйте переменную frog значением 3,5.
//        Умножьте переменную в 10 раз и поделите на 3,5. Добавьте к последнему значению переменной 4.
//        После каждой операции выводите значение переменной в консоль. В итоге, у вас должно быть выведено 4 значения одной переменной.
        var frog = 3.5;
        System.out.println(frog *= 10);
        System.out.println(frog /= 3.5);
        System.out.println(frog += 4);
        System.out.println("------------------------------------------");
//        ### Задание 6
//        В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории, и бой будет честным.
//        Вес одного боксера – 78,2 кг
//        Вес второго боксера – 82,7 кг
//        Подсчитайте и выведите в консоль общий вес двух бойцов.
//        Подсчитайте и выведите в консоль разницу между весами бойцов.  Для решения этой задачи используйте тип переменной var.
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        var differenceWeight = Math.abs(firstBoxerWeight - secondBoxerWeight);
        System.out.println("Общий вес бойцов = " + totalWeight);
        System.out.println("Разница в весе бойцов = " + differenceWeight);
        System.out.println("------------------------------------------");
//        ### Задание 7
//        Вычислите разницу весов спортсменов, используя 2 способа:
//        1. Вычитание из большего веса меньшего
//        2. Используя функцию остаток от деления
        var differenceWeightFirstVariant = firstBoxerWeight > secondBoxerWeight ? (firstBoxerWeight - secondBoxerWeight) : (secondBoxerWeight - firstBoxerWeight);
//        var differenceWeightSecondVariant = ;
        System.out.println(differenceWeightFirstVariant);
        System.out.println("------------------------------------------");
//        ### Задание 8
//        Решите задачу с помощью функций сложения, вычитания, умножения и деления.
//        1. 640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов, то сколько всего работников в компании?
//        Выведите результат задачи в консоль в формате “Всего работников в компании – … человек”.
//        2. Посчитайте сколько часов работы должно быть поделено между сотрудниками, если в компании работает на 94 человека больше.
//        Выведите результат задачи в консоль в формате “Если в компании работает … человек, то всего … часов работы может быть поделено между сотрудниками”.
        var totalHour = 640;
        var hourInWork = 8;
        var totalWorker = totalHour / hourInWork;
        System.out.println(String.format("Всего работников в компании – %s человек", totalWorker));
        totalWorker += 94;
        hourInWork *= totalWorker;
        System.out.println(String.format("Если в компании работает %s человек, то всего %s часов работы может быть поделено между сотрудниками", totalWorker, hourInWork));
    }
}