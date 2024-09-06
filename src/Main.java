public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        var dogx = dog * 4;
        var catx = cat * 4;
        var paperx = paper * 4;

        var dogy = dog - 3.5;
        var caty = cat - 1.6;
        var papery = paper - 7639;

        var friend = 19;
        var friendx = friend * 2;
        var friendy = friendx / 7;

        var frog = 3.5;
        var frogX = frog * 10;
        var frogy = frogX / 3.5;
        var frogz = frogy + 4;

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersSum = boxer1 + boxer2;
        var boxersDif = boxer2 - boxer1;
        var boxersDivision = boxer2 % boxer1;

        var hoursOfWorkers = 640;
        var hoursForWorker = 8;
        var workers1 = hoursOfWorkers / hoursForWorker;
        var workers2 = workers1 + 94;
        var hoursPerWorker2 = hoursOfWorkers / workers2;

        System.out.println(("dog = " + dog + "\n") + ("cat = " + cat + "\n") + ("paper = " + paper + "\n") + ("\n") +
                ("dog * 4 = " + dogx + "\n") + ("cat * 4 " + catx + "\n") + ("paper * 4" + paperx + "\n") + ("\n") +
                ("dog / 3.5 = " + dogy + "\n") + ("cat / 1.6 = " + caty + "\n") + ("paper / 7639 = " + papery + "\n") + ("\n") +
                ("friend = " + friend + "\n") + ("friend * 2 = " + friendx + "\n") + ("friend * 2 / 7 = " + friendy + "\n") + ("\n") +
                ("frog = " + frog + "\n") + ("frog * 10 = " + frogX + "\n") + ("frog * 10 / 3.5 = " + frogy + "\n") + ("\n") +
                ("frog * 10 / 3.5 + 4" + frogz + "\n") + ("\n") +
                ("Вес первого боксёра = " + boxer1 + "\n") + ("Вес второго боксёра = " + boxer2 + "\n") + ("\n") +
                ("Вес обоих боксёров = " + boxersSum + "\n") + ("Разница весов боксёров = " + boxersDif + "\n") + ("\n") +
                ("Остаток от деления весов боксёров = " + boxersDivision + "\n") + ("\n") +
                ("Рабочих часов в неделю на всех сотрудников = " + hoursOfWorkers + "\n") +
                ("Часов в день на работника = " + hoursForWorker + "\n") +
                ("Количство работников на 640 часов работы = " + workers1 + "\n") +
                ("Количество работников на 640 часов работы на 174 работника = " + workers2 + "\n") +
                ("Количество часов на 174 работника = " + hoursPerWorker2 + "\n")

        );


    }
}
