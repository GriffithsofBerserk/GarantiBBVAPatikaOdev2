package GarantiBBVAPatikaOdev2;
public class Computer {
    public boolean openPlus = true;
    public String getConnect;
    public String controller;

    public void isConnect(String getConnect){
        this.getConnect = getConnect;
    }

    public void open(){
            System.out.println("Bilgisayar açıldı!");
    }
    public void shutDown(){
        System.out.println("Bilgisayar kapandı!");
    }
    public void addController(String controller) {
        this.controller = controller;
    }
    public void playGame(){
        System.out.println("Oyun başladı!");
    }
}
