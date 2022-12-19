import java.sql.SQLOutput;

public class They extends Person {
    public They(String name) {
        super(name);
    }
    @Override
    public void goToPlace(){
        System.out.println("К этому времени " + getName() +" подходили к Унылому Месту, где жил ИА");
    }
    @Override
    public void turn(){
        System.out.println(getName() + " свернули в небольшую сосновую рощицу.");
    }
    @Override
    public void sitDown(){
        System.out.println(" и присели на калитку в изгороди");
    }
    @Override
    public void freeze(){
        System.out.println(", и, чтобы не замерзнуть, ");
    }
    @Override
    public void singSong(){

    }
}
