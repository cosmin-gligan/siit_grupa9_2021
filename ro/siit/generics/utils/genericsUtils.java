package ro.siit.generics.utils;

import java.util.List;

public class genericsUtils {

    public static final <T> void swapElementsInArray(T[] array, int firstElementIndex, int secondElementIndex) throws IllegalArgumentException {
        int arrayLength = array.length;
        if (firstElementIndex < 0) {
            throw new IllegalArgumentException("Pozitia primului element nu poate fi mai mica decat zero;");
        }
        if (secondElementIndex < 0) {
            throw new IllegalArgumentException("Pozitia celui de al doilea element nu poate fi mai mica decat zero;");
        }
        if (firstElementIndex > arrayLength - 1) {
            throw new IllegalArgumentException("Pozitia primului element nu poate fi mai mare decat lungimea array-ului" + " " + "(max: " + (arrayLength - 1) + ")");
        }
        if (secondElementIndex > arrayLength - 1) {
            throw new IllegalArgumentException("Pozitia celui de al doilea element nu poate fi mai mare decat lungimea array-ului" + " " + "(max: " + (arrayLength - 1) + ")");
        }

        if (firstElementIndex == secondElementIndex) {
            throw new IllegalArgumentException("Pozitiile celor doua elemente trebuie sa fie diferite");
        }

        T initialValueOfFirstElement = array[firstElementIndex];
        array[firstElementIndex] = array[secondElementIndex];
        array[secondElementIndex] = initialValueOfFirstElement;
    }

    public static final <T> void printArrayOnConsole(T[] array, String prefix) {
        StringBuffer sb = new StringBuffer(prefix);
        String separator = "";
        for (T element : array) {
            sb.append(separator + element.toString());
            separator = ", ";
        }
        System.out.println(sb);
    }

    public static <T extends Object & Comparable<? super T>> T getMaxValueFromList(List<? extends T> list) {
        T maxValue = list.get(0);
        for (T element : list){
            if ( element.compareTo(maxValue) > 0){
                maxValue = element;
            }
        }
        return maxValue;
    }
}
