package ro.siit.generics.services;

import ro.siit.generics.model.CollegeEnum;
import ro.siit.generics.model.Person;
import ro.siit.generics.model.Student;
import ro.siit.generics.utils.genericsUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

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


        Student andreiPopescu = new Student("Popescu", "Andrei", "1861114137926", 35, "53126", CollegeEnum.POLITENICA.toString());
        Student ioanaGheorghe = new Student("Gheorghe", "Ioana", "2940122121224", 27, "12126", CollegeEnum.MEDICINA.toString());
        Student berindeSergiu = new Student("Berinde", "Sergiu", "1990209160134", 22, "22173", CollegeEnum.DREPT.toString());
        Student mirceaToma = new Student("Toma", "Mircea", "5020809209718", 19, "72175", CollegeEnum.STIINTE_POLITICE.toString());
        Student simonaVeres = new Student("Veres", "Simona", "2970510063140", 24, "92175", CollegeEnum.STIINTE_ECONOMICE.toString());

        List<Person> studentList = new ArrayList<>();
        studentList.add(andreiPopescu);
        studentList.add(ioanaGheorghe);
        studentList.add(berindeSergiu);
        studentList.add(mirceaToma);
        studentList.add(simonaVeres);

        genericsUtils.printListOnConsole(studentList, "\nLista studenti: ");

        System.out.println("\nCel mai in varsta student este: " + genericsUtils.getMaxValueFromList(studentList));

    }

}
