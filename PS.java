package GarantiBBVAPatikaOdev2;

public class PS extends Computer{
    final private String ps = "Playstation";
    @Override
    public void isConnect(String getConnect){
        if (getConnect.equals(ps)){
            System.out.println(ps+" Computer'a bağlandı!");
        }
    }
    @Override
    public void open(){
        if(openPlus){
            throw new RuntimeException("Bilgisayar zaten açık!!");
        }
        else {
            throw new RuntimeException(ps+" açıldı!!");
        }
    }
    @Override
    public void shutDown(){
        if (!openPlus){
            throw new RuntimeException("Bilgisayar zaten kapalı!!");
        }
        else {
            throw new RuntimeException(ps+" kapandı!!");
        }
    }
    @Override
    public void addController(String controller) {
        this.controller = controller;
        System.out.println(controller+"controller eklendi!");
    }
    @Override
    public void playGame() {
        if (!openPlus) {
            System.out.println(ps+" kapalıdır. Önce "+ps+"yi açınız!");
            throw new RuntimeException("Cihaz kapalıdır!");
        }else {
            System.out.println(ps + " oyunu başlatıldı!!");
        }
    }



}
