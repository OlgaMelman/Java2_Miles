public class BonusMilesService {
    public int calculate(int cost) {
        int miles;
        int oneMile = 20;

        miles = cost / oneMile;

        return miles;
    }
}