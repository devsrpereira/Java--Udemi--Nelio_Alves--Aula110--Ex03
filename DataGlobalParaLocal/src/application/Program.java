package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {
        Instant d03 = Instant.parse("2023-05-02T19:52:45Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("r1 = "+r1);
        System.out.println("r2 = "+r2);
        System.out.println("r3 = "+r3);

//Obter dados de uma data local
        LocalDate d01 = LocalDate.parse("2023-05-02");
        LocalDateTime d02 = LocalDateTime.parse("2023-05-02T19:52:45");

        System.out.println("*** Obter dados de uma data local ***");
        System.out.println("d01 DIA = "+d01.getDayOfMonth());
        System.out.println("d01 MES = "+d01.getMonth());
        System.out.println("d01 MES = "+d01.getMonthValue());
        System.out.println("d01 ANO = "+d01.getYear());

        System.out.println("d02 HORA = "+d02.getHour());
        System.out.println("d02 MINUTOS = "+d03.getNano());


    }
}
