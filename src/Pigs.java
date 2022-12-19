public class Pigs extends Person implements HeBother {
    public Pigs(String name, int HPHot) {
        super(name, HPHot);
    }

    @Override
    public void goToPlace() {
        if (speed == 0) {
            HPHot = HPHot - 10;
        } else if (speed == 1) {
            HPHot = HPHot + 5;
        } else {
            HPHot = HPHot + 15;
        }
    }

    @Override
    public void sitDown() {
        if (touch == 0) {
            HPHot = HPHot - 65;
        }
    }
   public class Ears{
        public void statussnow(){
            System.out.println(", и так как у "+ getName() +" за ушками все еще было снежно");
        }

   }
    @Override
    public void bother() {
        System.out.println(" и ему это начинало надоедать");
    }

    @Override
    public String toString() {
        return getName() +"а";
    }
}


