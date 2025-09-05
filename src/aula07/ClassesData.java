package aula07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClassesData {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(); // possui métodos próprios
        LocalDate localDate2 = LocalDate.of(2025, 2, 4); // possui métodos próprios


        System.out.println(localDate);

        String stringData = "2023-01-17";

        LocalDate dataCorrect = LocalDate.parse(stringData);

        System.out.println(dataCorrect);

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(formatter.format(dataCorrect));

        System.out.println(localDate.minusYears(2));
        System.out.println(localDate.plusYears(2));

        System.out.println(localDate2.isAfter(localDate));
        System.out.println(localDate2.isBefore(localDate));


    }
}
