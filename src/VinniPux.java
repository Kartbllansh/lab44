

public class VinniPux extends Person implements HeCompose {

    public VinniPux(String name, int HPHot) {
        super(name, HPHot);
    }

    @Override
    public void goToPlace() {
        if (speed == 0) {
            super.HPHot = this.HPHot - 10;
        } else if (speed == 1) {
            HPHot = HPHot - 20;
        } else {
            HPHot = HPHot - 30;
        }
    }
DullPlace dull = new DullPlace("Снежно", -20);
    int powerWind=dull.getPowerWind();
    @Override
    public void sitDown() {
        if (touch <0.3 & powerWind>6) {
            try {
                throw new FallException();
            } catch (FallException f) {
                System.out.println("Медвежонок упал и разбился");
                System.exit(1);
            }
        }
    }

    @Override
    public void compose() {
        System.out.println(getName() + ": Кстати эту песню я сочинил");
    }

    /*@Override
    public int check(int HPHot){
        if(HPHot>0){
            return HPHot;
            }
        else{ try {
            Math.sqrt(HPHot);
            return HPHot;
        } catch (MatchException e) {
            System.out.println("Медвежонок умер от холода");
        }
        }
        return HPHot;
        */
    @Override
    public int check(int HPHot) {
        if (HPHot > 0) {
            return HPHot;
        }
        else{
            try {
                throw new NegativeException();
            } catch (NegativeException e){
                System.out.println("Медвежонок умер от холода");
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
    public void beatStick(){
        HPHot=HPHot+stick;
    }
    @Override
    public void status(){
        if(HPHot>30){
            System.out.println(getName()+": Стало теплее. Не правда ли?");
        }
        else{
            try {
                throw new NotPowerException();
            } catch (NotPowerException n){
                System.out.println("К сожалению, медвежонку не хватило сил выйти из леса");
                System.exit(1);
            }
        }
    }
    public String toString(){
        return getClass().getName()+ " желает удачи";
    }

}







