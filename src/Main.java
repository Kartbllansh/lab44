import java.util.Objects;

public class Main {
    public static void main(String[] args) {
       Person th = new They("они") ;
       Person pux = new VinniPux("Винни-Пух", 100);
       Person pg = new Pigs("Пятачок", 100);
     DullPlace dullPlace = new DullPlace("Снег идет", -25);
       DullPlace.Forest forest = dullPlace.new Forest("Не идет снег", -15);
       DullPlace.Forest.Garden garden = forest.new Garden();
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
        Pigs.Ears ear = ((Pigs)pg).new Ears();

        ear.statussnow();
        ((Pigs)pg).bother();
        th.turn();
        pux.turn();
        pg.turn();
        dullPlace.sss();
        pux.sayAbout();
        pg.sayAbout();
        pg.check(pg.HPHot);
        pux.check(pux.HPHot);
        th.sitDown();
        pux.sitDown();
        pg.sitDown();
        Snow snow = new Snow();
        snow.notGoSnow();

        forest.cold();
        garden.tsWind();
        th.freeze();
        th.singSong();
        ((VinniPux)pux).compose();
        th.beatStick();
        pux.beatStick();
        pg.beatStick();
        pux.status();
        pg.status();
        th.status();
        th.contTalk();
        System.out.println("");
        System.out.println(pux.toString());
        //System.out.println(dullPlace.equals(forest));

    }
}