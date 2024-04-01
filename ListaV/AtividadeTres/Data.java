import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
     LocalDate dataAtual = LocalDate.now();
      DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String dataFormatada = dataAtual.format(formato);
      System.out.println("Registro: " + dataFormatada);
      System.out.println();
}
