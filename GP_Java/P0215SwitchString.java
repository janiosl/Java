import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class P0215SwitchString {
    public static void main(String[] args) {
        if (args.length > 0) {
            //continue;
            switch (args[0].toLowerCase()){
                case "data":
                    //Recupera a data com .getDateInstance()
                    System.out.println(DateFormat.getDateInstance().format(new Date()));
                    break;
                case "hora":
                    //Recupera a hora com .getTimeInstance()
                    System.out.println(DateFormat.getTimeInstance().format(new Date()));
                    break;
                case "nova-data":
                    //Exibe data no formato desejado
                    System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")));
                    break;
                case "nova-hora":
                    //Exibe hora no formato desejado
                    System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
                    break;
                default:
                    System.out.println("Comando não reconhecido");
                    //break;
            }            
        } else {
            System.out.println("Não foi fornecido argumento");
        }
    }
}
