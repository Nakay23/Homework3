public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int egg = 50000;
        System.out.println("значение переменной egg с типом int равно " + egg);
        byte carrots = 50;
        System.out.println("значение переменной carrots с типом byte равно " + carrots);
        short tomatoes = 20000;
        System.out.println("значение переменной tomatoes с типом short равно " + tomatoes);
        long dosh = 99999L;
        System.out.println("значение переменной dosh с типом long равно " + dosh);
        float a = 34.55F;
        System.out.println("значение переменной a с типом float равно " + a);
        double b = 3.12345678;
        System.out.println("значение переменной b с типом double равно " + b);

        float q = 27.12f;
        System.out.println(q);
        long w = 987678965549L;
        System.out.println(w);
        float e = 2.786f;
        System.out.println(e);
        short r = 569;
        System.out.println(r);
        int t = -159;
        System.out.println(t);
        short y = 27987;
        System.out.println(y);
        byte u = 67;
        System.out.println(u);

        byte s = 23;
        byte d = 27;
        byte f = 30;
        int all = (s + d + f);
        short lists = 480;
        int c = lists /all;
        System.out.println("На каждого ученика рассчитано " + c + " листов бумаги");

        byte er = 16;
        byte tm = 2;
        int oneMinute = er/tm;
        System.out.println("За одну минуту производительность составила " + oneMinute + " бутылок");
        byte t1 = 20;
        int e1 = oneMinute * 20;
        System.out.println("За " +t1 + " минут машина произвела " + e1 + " штук бутылок");
        short t2 = 1440;
        int e2 = oneMinute * t2;
        System.out.println("За " + t2 + " минут машина произвела " + e2 + " штук бутылок");
        short t3 = 4320;
        int e3 = oneMinute * t3;
        System.out.println("За " + t3 + " минут машина произвела " + e3 + " штук бутылок");
        int t4 = 43200;
        int e4 = oneMinute * t4;
        System.out.println("За " + t4 + " минут машина произвела " + e4 + " штук бутылок");

        short dye = 120;
        byte white = 2;
        byte brown = 4;
        int oneClass = white + brown;
        int classes = dye / oneClass;
        int allWhite = white * classes;
        int allBrown = brown * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

        byte bananaWeight = 80;
        byte allBanana = 5;
        int allBananaWeight = allBanana * bananaWeight;
        byte milkWeight = 105;
        byte allMilk = 2;
        int allMilkWeight = milkWeight * allMilk;
        byte iceCreamWeight = 100;
        byte allIceCream = 2;
        int allIceCreamWeight = allIceCream * iceCreamWeight;
        byte eggsWeight = 70;
        byte allEggs = 4;
        int allEggsWeight = allEggs * eggsWeight;
        int sportGram = allEggsWeight + allBananaWeight + allIceCreamWeight + allMilkWeight;
        float sportKg = sportGram /1000f;
        System.out.println("Вес спортзавтрака составляет " + sportGram + " грамм и " + sportKg + " килограмм");

        int allWeightG = 7 * 1000;
        short weight1 = 250;
        short weight2 = 500;
        int days1 = allWeightG /weight1;
        System.out.println(days1 + " дней уйдёт на похудение при потере " + weight1 + " грамм в день ");
        int days2 = allWeightG /weight2;
        System.out.println(days2 + " дней уйдёт на похудение при потере " + weight2 + " грамм в день ");
        int days3 = (days1 + days2) / 2;
        System.out.println(days3 + " дней уйдёт на похудение в среднем ");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int upMasha = masha /100 * 10;
        int todayMasha = masha + upMasha;
        System.out.println("Маша теперь получает " + todayMasha + " рублей, годовой доход вырос на " + upMasha + " рублей" );
        int upDenis = denis /100 * 10;
        int todayDenis = denis + upDenis;
        System.out.println("Денис теперь получает " + todayDenis + " рублей, годовой доход вырос на " + upDenis + " рублей" );
        int upKristina = kristina /100 * 10;
        int todayKristina = kristina + upKristina;
        System.out.println("Кристина теперь получает " + todayKristina + " рублей, годовой доход вырос на " + upKristina + " рублей" );

    }
}