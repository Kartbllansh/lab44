public class Pigs extends Person implements HeBother {
    public Pigs(String name, int HPHot) {
        super(name, HPHot);
    }

    @Override
    public void goToPlace() {
        if (speed == 0) {
            HPHot = HPHot - 10;
        } else if (speed == 1) {
            HPHot = HPHot - 20;
        } else {
            HPHot = HPHot - 30;
        }
    }
    DullPlace dull = new DullPlace("Снежно", -20); //Уточнить
    int powerWind = dull.getPowerWind();

    @Override
    public void sitDown() {
        if (touch <0.4 & powerWind >6) {
            try {
                throw new FallException();
            } catch (FallException f) {
                System.out.println("Поросенок упал и разбился");
                System.exit(1);
            }
        }
    }
   public class Ears{
        public void statussnow(){
            System.out.println(", и так как у "+ getName() +" за ушками все еще было снежно");
        }

   }
    @Override
    public void bother() {
        System.out.print(" и ему это начинало надоедать");
    }
/*HeBother pigs = new HeBother() {
       @Override
       public void bother() {
           System.out.print(" и ему это начинало надоедать");
       }
   }; */
    //Pigs pigs = new Pigs("jjj", 100);
    @Override
    public int check(int HPHot) {
        if (HPHot > 0) {
            return HPHot;
        }
        else{
            try {
                throw new NegativeException();
            } catch (NegativeException e){
                System.out.println("Поросенок умер от холода");
                System.exit(1);
            }
            return 0;

        }

    }
    @Override
    public void turn(){
        if(touch<0.4){
            HPHot=HPHot-40;
            System.out.println(getName()+" наступил в сугроб. Упс!");
        }
    }
    int koef = dull.getKoef();
    @Override
    public void sayAbout(){
        if(koef>=29){
            System.out.println(getName()+": Бррр... Как холодно. ");
            HPHot=HPHot-50;
        }
        else{
            System.out.println(getName()+": Ну, и не так то холодно. ");
        }
    }
    @Override
    public void status(){
        if(HPHot>30){
            System.out.println(getName()+": Да уж... Тепло");
        }
        else{
            try {
                throw new NotPowerException();
            } catch (NotPowerException n){
                System.out.println("К сожалению, поросенку не хватило сил выйти из леса");
                System.exit(1);
            }
        }
    }

}


