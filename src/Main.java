import javax.print.StreamPrintService;

public class Main {
    public static void main(String[] args) {

        int ticketPrice = 7685;  // стоимость билета
        int oneBonus = 20;       // 1 миля = руб

        int х = ticketPrice / oneBonus;   // Рассчет количества бонусных миль

        System.out.println(х + " мили(ль)");
    }
}