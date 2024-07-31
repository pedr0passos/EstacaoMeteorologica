package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos Rocha
 */

public class DataConverterService {
    
    public LocalDate convertStringToLocalDate(String dateString) {
        
        if (dateString == null || dateString.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Data Inválida: Campo Vázio.", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE
            );
            throw new RuntimeException("Data inválida: campo vazio.");
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            return LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Data inválida: formato incorreto. Esperado dd/MM/yyyy.", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE
            );            
            e.printStackTrace();
            throw new RuntimeException("Data inválida: formato incorreto. Esperado dd/MM/yyyy.", e);
        }
    }
    
}