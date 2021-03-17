package eu.senla.sutko.task14;

//Создаем объект процессор. У него есть название модели, тактовая частота.
//Создать коллекцию в которую поместить 10 разных процессоров.
//Выполнить над коллекцией все методы которые написаны в презентации. Для вывода использовать любые терминальные методы.
//Результат работы каждого метода вывести на экран. так как мы делали.
//Задание просто практика.
//Конечно для сортировки использовать компаратор (отсортировать по частоте)
//


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       List<Processor> Processors = Arrays.asList(
               new Processor("Intel", 1, 1.8),
               new Processor("Celeron", 1, 2.2),
               new Processor("Athlon", 2, 1.3),
               new Processor("Intel", 1, 1.9),
               new Processor("Athlon", 4, 2.8),
               new Processor("Celeron", 1, 2.6),
               new Processor("Athlon", 2, 3.2),
               new Processor("Celeron", 1, 1.2),
               new Processor("Intel", 8, 3.1),
               new Processor("Celeron", 4, 2.6)
       );


       //for (Processor i : Processors
       //     ) {
       //    System.out.println(i.toString());

       //}






    }
}
