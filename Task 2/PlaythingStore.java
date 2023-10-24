import java.io.FileWrite;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlaythingStore {
    private List<Plaything> playthings;
    private List<Plaything> playthingsforprizing;

    public PlaythingStore() {
        playthings = new ArrayList<>();
        playthingsforprizing = new ArrayList<>();
    }

    public void PlaythingtoAdd(int ID, String name, int amount, double weight) {
        Plaything plaything = new Plaything(ID, name, amount, weight);
        playthings.add(plaything);
    }

    public void PlaythingWeightAdding(int ID, double weight) {
        for (Plaything plaything : playthings) {
            if (plaything.getterId() == ID) {
                plaything.setterWeight(weight);
                break;
            }
        }
    }

    public void startGame() {
        double FullWeight = 0;
        for (Plaything plaything : playthings) {
            FullWeight += plaything.getterWeight();
        }
=
        Random random = new Random();
        double NumbertoRandomize = random.nextDouble() * FullWeight;


        Plaything playthingsforprizing = null;
        for (Plaything plaything : playthings) {
            if (NumbertoRandomize < plaything.getterWeight()) {
                playthingsforprizing = plaything;
                break;
            }
            NumbertoRandomize -= plaything.getterWeight();
        }

    
        if (playthingsforprizing != null && playthingsforprizing.getterAmount() > 0) {
            playthingsforprizing.add(playthingsforprizing);
            playthingsforprizing.setterAmount(playthingsforprizing.getterAmount() - 1);
        }
    }

    public void PrizePlaythingToCatch()
   {
        if (playthingsforprizing.size() > 0) {
            Plaything playthingsforprizing = playthingsforprizing.remove();
            FileWriter writer = new FileWriter("prizing_playthings.txt", true);
            writer.write(plaything.getterId() + "," + playthingsforprizing.getterName() + "\n");
            writer.close();
        }
    }
}