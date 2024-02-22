/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class tste {
    public static void main(String[] args) {
        LocalDate checagem = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascimentoDigitada = "25/02/2010"; // Suponha que essa seja a data digitada pelo usuário
        
        LocalDate dataNascimentoFormatada = LocalDate.parse(dataNascimentoDigitada, formatador);
        
        long anosDeDiferenca = dataNascimentoFormatada.until(checagem, ChronoUnit.YEARS);
        
        if (anosDeDiferenca >= 14) {
            System.out.println("O usuário tem 14 anos ou mais.");
        } else {
            System.out.println("O usuário tem menos de 14 anos.");
        }
    }
}