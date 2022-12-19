

public class VinniPux extends Person{

    public VinniPux(String name, int HPHot) {
        super(name, HPHot);
    }
    @Override
    public void goToPlace(){
        if(speed == 0){
            super.HPHot = HPHot - 5; }
            else if(speed ==1){
                HPHot = HPHot + 10;}
            else {
            HPHot = HPHot + 15;
        }
            }
    @Override
    public void sitDown(){
        if(touch == 0){
            HPHot = HPHot -50;
        }
    }
    }






