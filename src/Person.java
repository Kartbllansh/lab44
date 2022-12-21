import java.util.Random;

public abstract class Person {
    public String name;
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
    Double touch = r.nextDouble();
    public void sitDown(){
    }
    public void freeze(){
    }
    public void singSong(){
    }
    public void beatStick(){
    }
    public void startHot(){

    }
    public void contTalk(){
    }
    public int check(int HPHot){
        return 0;
    }
    public void sayAbout(){

    }
    int stick = r.nextInt(40)+1;
    public void status(){

    }

}
