import java.util.Objects;
import java.util.Random;

public class DullPlace {
    public static String statussnow;
    public int tmp;
    Random rd = new Random();
    public int powerWind = rd.nextInt(10);

    public int getPowerWind() {
        return powerWind;
    }
public int humidity = rd.nextInt(8) +1;

    int koef = humidity + powerWind - tmp;

    public int getKoef(){
        return koef;
    }


    public DullPlace(String statussnow, int tmp) {
        this.statussnow = statussnow;
        this.tmp = tmp;

    }
    public DullPlace(){}

    public class Forest {
        public String statussnow;
          public static int tmp; //почему без статик не работает equals
        public Forest(String statussnow, int tmp) {
            this.statussnow = statussnow;
            Forest.tmp =tmp;
        }
        public Forest(){}
        public void cold(){
            if(powerWind>8){
            System.out.print(", но все еще было ОЧЕНЬ холодно.");
        } else{
                System.out.print(", но все еще было холодно.");
            }
 }

            public class Garden {
            void tsWind(){
                if(powerWind == 1 | powerWind == 2 | powerWind == 3){
                    System.out.print("Кусты издавали звук: тс...");
                }
                else  if(powerWind == 4 | powerWind == 5 | powerWind == 6 | powerWind == 7 | powerWind == 8){
                    System.out.print("Кусты издавали звук: ААа... ветер");
                }
                else {
                    System.out.print("Кусты издавали звук: Помогите");
                }
            }
            }

            public class Gate {
public int hight = 2;
           }
        }


    public boolean equals(Object obj){
        DullPlace.Forest ft = (DullPlace.Forest) obj; //downcasting
        return this.tmp > DullPlace.Forest.tmp;
    }
public void sss(){
        DullPlace dullPlace = new DullPlace();
    DullPlace.Forest forest = dullPlace.new Forest();
        if(dullPlace.equals(forest)){
            System.out.println("Герои зашли в лес, в котором было более тепло");
        }
}
        }

