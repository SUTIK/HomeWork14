package eu.senla.sutko.task14;


//Создаем объект процессор. У него есть название модели, тактовая частота.
//Создать коллекцию в которую поместить 10 разных процессоров.
//Выполнить над коллекцией все методы которые написаны в презентации. Для вывода использовать любые терминальные методы.
//Результат работы каждого метода вывести на экран. так как мы делали.
//Задание просто практика.
//Конечно для сортировки использовать компаратор (отсортировать по частоте)
//


import java.util.Objects;

public class Processor {

    public void setModelProcessorName(String modelProcessorName) {
        this.modelProcessorName = modelProcessorName;
    }

    public void setNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public void setCoreСlockSpeed(Double coreСlockSpeed) {
        this.coreСlockSpeed = coreСlockSpeed;
    }


    public String getModelProcessorName() {
        return modelProcessorName;
    }

    public Integer getNumberOfCores() {
        return numberOfCores;
    }

    public Double getCoreСlockSpeed() {
        return coreСlockSpeed;
    }

    public Processor(String modelProcessorName, Integer numberOfCores, Double coreСlockSpeed) {
        this.modelProcessorName = modelProcessorName;
        this.numberOfCores = numberOfCores;
        this.coreСlockSpeed = coreСlockSpeed;
    }

    public Processor() {
    }

    @Override
    public String toString() {
        return "Processor " +
                "Марка процессора " + modelProcessorName +
                ", Количество ядер =" + numberOfCores +
                ", Тактовая частота ядра =" + coreСlockSpeed ;
    }

    private String modelProcessorName;
    private Integer numberOfCores;
    private Double coreСlockSpeed;

    //метод считает частоту процессора
    double summCoreСlockSpeed(){
        return this.getCoreСlockSpeed()*this.getNumberOfCores();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return modelProcessorName.equals(processor.modelProcessorName) && numberOfCores.equals(processor.numberOfCores) && coreСlockSpeed.equals(processor.coreСlockSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelProcessorName, numberOfCores, coreСlockSpeed);
    }
}


