package CliffDemo;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DrinkDispenser {
    List<Syrup> syrups = new ArrayList<>();
    public CupHolder small;
    public CupHolder medium;
    public CupHolder large;

    public DrinkDispenser(int smallVol, int mediumVol, int largeVol) {
//        syrups = new ArrayList<>();
        small = new CupHolder(smallVol);
        medium = new CupHolder(mediumVol);
        large = new CupHolder(largeVol);
    }

    public void serveDrink(String size, int sirupI) {
        int volume;
        switch (size.toUpperCase(Locale.ROOT)) {
            case "S":
                volume = small.dispense();
                break;
            case "M":
                volume = medium.dispense();
                break;
            case "L":
                volume = large.dispense();
                break;
            default:
                System.out.println("Error: invalid size");
                return;
        }
        String drink = syrups.get(sirupI).dispense(volume);
        System.out.printf("%s %s\n", size, drink);
    }

    public void addSyrup(Syrup newSyrup) {
        syrups.add(newSyrup);
    }

    public void addSyrup(String name, int vol) {
        syrups.add(new Syrup(name, vol));
    }

    public List<String> lowSyrup(int lowValue) {
        List<String> output = new ArrayList<>();

        for (int i = 0; i < syrups.size(); i++) {
            if (syrups.get(i).getVol() <= lowValue) {
                output.add(i + ": " + syrups.get(i).name);
            }
        }
        return output;
    }


}
