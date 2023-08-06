package GarantiBBVAPatikaOdev2;

public abstract class PlaystationController implements IGameController{
    public void x(String pas){
        System.out.println("PS kolundan pas tuşuna basıldı!");
    }
    public void square(String shot){
        System.out.println("PS kolundan şut tuşuna basıldı!");
    }
    public void circle(String orta){
        System.out.println("PS kolundan orta tuşuna basıldı!");
    }
    public void triangle(String araPasi){
        System.out.println("PS kolundan ara pası tuşuna basıldı!");
    }

}
