import java.util.Objects;

public class Main {
    public static void main(String[] args) {
       They th = new They("они") ;
       VinniPux pux = new VinniPux("Винни-Пух", 100);
       Pigs pg = new Pigs("Пятачок", 100);
     DullPlace dullPlace = new DullPlace("Снег идет", -25);
        th.goToPlace();
        ShotSound shotSound = new ShotSound() {
           @Override
           public void shotSound() {
              System.out.print("Раздался шум выстрела...");
           }
        };
        pux.check(pux.HPHot); //dobavit
        pux.goToPlace();
        pg.goToPlace();
        pg.toString();
        Pigs.Ears ear = pg.new Ears();
        ear.statussnow();
        pg.bother();
        th.turn();
        pux.turn();
        pg.turn();
        pux.sayAbout();
        pg.sayAbout();
        pg.check(pg.HPHot);
        pux.check(pux.HPHot);
        th.sitDown();
        pux.sitDown();
        pg.sitDown();
        Snow snow = new Snow();
        snow.notGoSnow();
        DullPlace.Forest forest = dullPlace.new Forest("Не идет снег", -15);
        DullPlace.Forest.Garden garden = forest.new Garden();
        forest.cold();
        garden.tsWind();
        th.freeze();
        th.singSong();
        pux.compose();
        th.beatStick();
        pux.beatStick();
        pg.beatStick();
        pux.status();
        pg.status();
        th.status();
        th.contTalk();
    }
}