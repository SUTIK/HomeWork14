package eu.senla.sutko.task14;

//Создаем объект процессор. У него есть название модели, тактовая частота.
//Создать коллекцию в которую поместить 10 разных процессоров.
//Выполнить над коллекцией все методы которые написаны в презентации. Для вывода использовать любые терминальные методы.
//Результат работы каждого метода вывести на экран. так как мы делали.
//Задание просто практика.
//Конечно для сортировки использовать компаратор (отсортировать по частоте)
//


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

       List<Processor> Processors = Arrays.asList(
               new Processor ("Intel", 1, 1.8),
               new Processor("Celeron", 1, 2.2),
               new Processor("Athlon", 2, 1.3),
               new Processor("Intel", 1, 1.9),
               new Processor("Athlon", 4, 2.8),
               new Processor("Celeron", 4, 2.6),
               new Processor("Athlon", 2, 3.2),
               new Processor("Celeron", 1, 1.2),
               new Processor("Intel", 8, 3.1),
               new Processor("Celeron", 4, 2.6)
       );


        System.out.println("_____________________ФИЛЬТР_______________________");
        //Фильтрует по частоте
        //Processors.stream().filter(processor -> processor.getCoreСlockSpeed()>2.0).collect(Collectors.toList());
        List<Processor> sortedProcessors = Processors.stream()
                .filter(processor -> processor.getCoreСlockSpeed()>2.0)
                .collect(Collectors.toList());

      for (Processor i : sortedProcessors)
      {
          System.out.println(i.toString());
      }

        System.out.println("___________________ПРОПУСТИЛИ____________________");
      List<Processor> skipProcessors = Processors.stream().skip(5).collect(Collectors.toList());
        for (Processor i : skipProcessors)
        {
            System.out.println(i.toString());
        }
        System.out.println("_________________БЕЗ_ДУБЛИКОТОВ__________________");
        List<Processor>noDuplicateProcessors = Processors.stream().distinct().collect(Collectors.toList());
        for (Processor i : noDuplicateProcessors)
        {
            System.out.println(i.toString());
        }









    }
}
