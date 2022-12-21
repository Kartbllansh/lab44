import java.sql.SQLOutput;

public class They extends Person {
    public They(String name) {
        super(name);
    }

    @Override
    public void goToPlace() {
        System.out.print("К этому времени " + getName() + " подходили к Унылому Месту, где жил ИА");
    }

    @Override
    public void turn() {
        System.out.print(getName() + " свернули в небольшую сосновую рощицу.");
    }

    @Override
    public void sitDown() {
        System.out.print(" и присели на калитку в изгороди. ");
    }

    @Override
    public void freeze() {
        System.out.print(", и, чтобы не замерзнуть, ");
    }

    @Override
    public void singSong() {
        System.out.println("Они спели Шумелку Пуха шесть раз от начала до конца: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(Song.STRING1.getName());
            System.out.println(Song.STRING2.getName());
            System.out.println(Song.STRING3.getName());
            System.out.println(Song.STRING4.getName());
            System.out.println(Song.STRING5.getName());
            System.out.println(Song.STRING2.getName());
            System.out.println(Song.STRING2.getName());
            System.out.println(Song.STRING5.getName());
            System.out.println(Song.STRING2.getName());
            System.out.println(Song.STRING2.getName());
            System.out.println(Song.STRING5.getName());
        }
    }

    @Override
    public String toString() {
        return "оба";
    }
    @Override
    public void beatStick(){
        System.out.println("Причем оба в нужных местах колотили по изгороди палочками. ");
    }
    @Override
    public void status(){
        System.out.print(" Вскоре им стало гораздо теплее, ");
    }
    @Override
    public void contTalk(){
        System.out.print("и "+getName()+" смогли продолжить разговор.");
    }
}
