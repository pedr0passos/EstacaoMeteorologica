package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author 
 * Pedro Henrique Passos 
 * Catterina Salvador
 */

public class DateService {
    public static String formatDateBr(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
}
