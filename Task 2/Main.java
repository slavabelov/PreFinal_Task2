public class Main {
    public static void main(String[] args) {
        PlaythingStore shop = new PlaythingStore();

        shop.PlaythingtoAdd(1, "Bear", 50, 75);
        shop.PlaythingtoAdd(2, "Dog", 20, 40);
        shop.PlaythingtoAdd(3, "Cat", 30, 65);

        shop.PlaythingWeightAdding(10, 40);

        
        shop.startGame();

    
        shop.PrizePlaythingToCatch();
       