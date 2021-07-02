package CliffDemo;

public class Syrup {
    public String name;
    public int volume;

    public Syrup(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String dispense(int amt) {
        volume -= amt;
        return name;
    }

    public int getVol() {
        return volume;
    }


}
