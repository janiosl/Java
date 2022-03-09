/*
Outros métodos e aplicações disponíveis em:
https://www.devmedia.com.br/trabalhando-com-as-classes-date-calendar-e-simpledateformat-em-java/27401
*/
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Datas {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        //Recuperando tempo completo
        System.out.println("Data e hora atual: " + c.getTime());
        //Recuperando partes do tempo
        System.out.println("Ano: "+c.get(Calendar.YEAR));
		System.out.println("Mes: "+c.get(Calendar.MONTH));
		System.out.println("Dia do Mes: "+c.get(Calendar.DAY_OF_MONTH));

        //Data formatada
        System.out.println("-".repeat(40));
        Date data = c.getTime();
        System.out.println("Data atual sem formatacao: " + data);
		DateFormat formataData = DateFormat.getDateInstance();
		System.out.println("Data atual com formatacao: "+ formataData.format(data));

        //Formata Hora
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println("Hora formatada: "+hora.format(data));

        //Formata Data e Hora
		DateFormat dtHora = DateFormat.getDateTimeInstance();
		System.out.println(dtHora.format(data));

        //Outros exemplos
        System.out.println("-".repeat(40));
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); //Data COmpleta
		System.out.println("Data brasileira: "+f.format(data));

        f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Data sem o dia descrito: "+f.format(data));

		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Data resumida 1: "+f.format(data));

		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data resumida 2: "+f.format(data));

        //Convertendo para string e vice-versa

        //Conversões
        Date data2 = f.parse("12/01/1995");
		System.out.println(data2);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: "+sdf.format(data));

        //Converte Objetos
		System.out.println("Data convertida: "+sdf.parse("02/08/1970"));

        //Outros formatos
        SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");
		System.out.println("Data formatada sem separadores: "+sdf2.format(data));

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMdd");
		System.out.println("Data formatada americana sem separadores: "+sdf3.format(data));

        SimpleDateFormat sdf4 = new SimpleDateFormat("hhmmss");
		System.out.println("Hora formatada sem separadores: "+sdf4.format(data));

        SimpleDateFormat sdf5 = new SimpleDateFormat("yyyyMMdd_hhmmss");
		System.out.println("Data e Hora formatada sem separadores: "+sdf5.format(data));
        
        //Nome do arquivo com data
        System.out.println("-".repeat(40));
        String arquivo = sdf3.format(data) + "_" +  hora.format(data) + ".ser";
        System.out.println("Nome do arquivo: " + arquivo);

        String file = "harbinger_param_" + sdf5.format(data) + ".ser";
        System.out.println("Nome do arquivo 2: " + file);
    }
}
