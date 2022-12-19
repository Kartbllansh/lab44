import java.util.Random;

public class DullPlace {
    public static String statussnow;
    public int tmp;
    Random rd = new Random();
    public int powerWind = rd.nextInt(10);

    public DullPlace(String statussnow, int tmp) {
        this.statussnow = statussnow;
        this.tmp = tmp;

    }

    public class Forest {
        public String statussnow;
          public int tmp;
        public Forest(String statussnow, int tmp) {
            this.statussnow = statussnow;
            this.tmp =tmp;
        }
        public void cold(){
            if(powerWind>8){
            System.out.println(", но все еще было ОЧЕНЬ холодно,");
        } else{
                System.out.println(", но все еще было холодно,");
            }
 }
            public class Garden {
            void tsWind(){
                if(powerWind == 1 | powerWind == 2 | powerWind == 3){
                    System.out.println("Кусты издавали звук: тс...");
                }
                else  if(powerWind == 4 | powerWind == 5 | powerWind == 6 | powerWind == 7 | powerWind == 8){
                    System.out.println("Кусты издавали звук: ААа... ветер");
                }
                else {
                    System.out.println("Кусты издавали звук: Помогите");
                }
            }
            }

            public class Gate {
public int hight = 2;
           }
        }
    }

