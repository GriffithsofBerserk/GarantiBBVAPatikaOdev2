package GarantiBBVAPatikaOdev2;

public class Xbox extends Computer{
    final private String xbox = "Xbox";
    @Override
    public void isConnect(String getConnect){
        if (getConnect.equals(xbox)){
            System.out.println(xbox+" Computer'a bağlandı!");
        }
    }
    @Override
    public void open(){
        if(openPlus){
            throw new RuntimeException("Bilgisayar zaten açık!!");
        }
        else{
            throw new RuntimeException(xbox+" açıldı!");

        }
    }
    @Override
    public void shutDown(){
        if (!openPlus){
            throw new RuntimeException("Bilgisayar zaten kapalı!!");
        }
        else {
            throw new RuntimeException(xbox+" kapandı!");
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
            System.out.println(xbox+" kapalıdır. Önce "+xbox+"ı açınız!");
            throw new RuntimeException("Cihaz kapalıdır!");
        }else {
            System.out.println(xbox + " oyunu başlatıldı!!");
        }
    }


}
