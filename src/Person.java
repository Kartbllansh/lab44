import java.util.Random;

public abstract class Person {
    private String name;
    public int HPHot;
    public Person(String name, int HPHot){
        this.name=name;
        this.HPHot=HPHot;
    }
    public Person(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    Random r = new Random();
    int speed = r.nextInt(3);
    public void goToPlace(){
    }
    public void turn(){
    }
    int touch = r.nextInt(2);
    public void sitDown(){
    }
    public void freeze(){
    }
    public void singSong(){
    }
    public void beatStick(){
    }
    public void contTalk(){
    }
}
