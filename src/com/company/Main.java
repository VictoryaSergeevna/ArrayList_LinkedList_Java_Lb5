package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        1.Напишите метод, который добавляет 100000элементовв ArrayList и LinkedListи затемвыбирает из заполненного списка элемент
//        наугад 100000 раз. Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
//        Объяснение допишите в виде коммента. Для замера времени используйте System.currentTimeMillis().
	   //compareOfLists();
//        2.Напишите  свой  итератор  по  одномерному  массиву.  Итератором будет  класс,  который  реализовывает  интерфейс Iterator<T>.
//          В данном  классе  вам  нужно  создать  конструктор  и  реализовать методы booleanhasNext()и Tnext()
        String[] catsNames = {
                "Васька",
                "Кузя",
                "Барсик",
                "Мурзик",
                "Леопольд",
                "Бегемот",
                "Рыжик",
                "Матроскин"
        };

        ArrayIterator<String> arrayIter =new ArrayIterator<String>(catsNames);


        while(arrayIter.hasNext()){

            System.out.println(arrayIter.next());
        }
    }
    public static void compareOfLists() {
        final int n=1000000;
       ArrayList<Double> arr1 = new ArrayList<>();
        LinkedList<Double> arr2 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            arr1.add(Math.random());
            arr2.add(Math.random());
        }

        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arr1.get((int)(Math.random()*(n-1)));
        }
        System.out.println("Потраченое время ArrayList: " +(System.currentTimeMillis() - startTime)+"миллисекунд");

        startTime=System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arr2.get((int)(Math.random()*(n-1)));
        }
        System.out.println("Потраченое время LinkedList: " +(System.currentTimeMillis() - startTime)+"миллисекунд");
    }

}
