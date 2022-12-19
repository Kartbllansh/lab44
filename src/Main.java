public class Main {
    public static void main(String[] args) {
       They th = new They("они") ;
       VinniPux pux = new VinniPux("Винни-Пух", 100);
       Pigs pg = new Pigs("Пятачок", 100);
        th.goToPlace();
        pux.goToPlace();
        pg.goToPlace();
        pg.toString();
        Pigs.Ears ear = pg.new Ears();
        ear.statussnow();
        pg.bother();
        th.turn();
        Snow snow = new Snow();
        snow.notGoSnow();
        DullPlace dullPlace = new DullPlace("Снег идет", -25);
        DullPlace.Forest forest = dullPlace.new Forest("Не идет снег", -15);
        forest.cold();
        th.freeze();
    }
}