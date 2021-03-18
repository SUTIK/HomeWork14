package eu.senla.sutko.task14;

import java.util.Comparator;

public class ProcessorsComparator implements Comparator<Processor> {

    @Override
    public int compare(Processor o1, Processor o2) {
        Double i = o1.summCoreСlockSpeed();
        Double j = o2.summCoreСlockSpeed();
        return i.compareTo(j);

    }
}
