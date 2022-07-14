import javax.print.StreamPrintService;

public class Main {
    public static void main(String[] args) {

        int ticketPrice = 7685;  // стоимость билета
        int oneMile = 20;       // 1 миля = руб

        int bonus = ticketPrice / oneMile;   // Рассчет количества бонусных миль

        System.out.println("Начислено: " + bonus + " мили(ль)");
    }
}