package ro.siit.generics.services;

import ro.siit.generics.utils.genericsUtils;

import java.util.Arrays;

public class genericsService {

    public void startApp() {

        String[] firstArray = {"a", "b", "c", "d", "e"};

        genericsUtils.printArrayOnConsole(firstArray, "Elementele primului array inainte de swap: ");

        genericsUtils.swapElementsInArray(firstArray, 2, 3);

        genericsUtils.printArrayOnConsole(firstArray, "Elementele primului array dupa de swap: ");

        Integer[] secondArray = {1, 2, 3, 4, 5};

        genericsUtils.printArrayOnConsole(secondArray, "Elementele celui de al doilea array inainte de swap: ");
        genericsUtils.swapElementsInArray(secondArray, 4, 3);
        genericsUtils.printArrayOnConsole(secondArray, "Elementele celui de al doilea array dupa de swap: ");

        System.out.println("Cel mai mare element din primul array este: " + genericsUtils.getMaxValueFromList(Arrays.asList(firstArray)));
        System.out.println("Cel mai mare element din al doilea array este: " + genericsUtils.getMaxValueFromList(Arrays.asList(secondArray)));

    }

}
