package GarantiBBVAPatikaOdev2;

public class Main {
    public static void main(String[] args) {
        Computer com = new Computer();
        PS psps = new PS();
        psps.isConnect("Playstation");
        Xbox xbox = new Xbox();
        xbox.isConnect("Xbox");
        //psps.open();
        //xbox.open();
        //psps.shutDown();
        //xbox.shutDown();
        psps.addController("Deneme");
        xbox.playGame();
        psps.playGame();
        com.playGame();
    }
}