package GarantiBBVAPatikaOdev2;

public abstract class XboxController implements IGameController{
    public void x(String pas){
        System.out.println("Xbox kolundan pas tuşuna basıldı!");
    }
    public void square(String shot){
        System.out.println("Xbox kolundan şut tuşuna basıldı!");
    }
    public void circle(String orta){
        System.out.println("Xbox kolundan orta tuşuna basıldı!");
    }
    public void triangle(String araPasi){
        System.out.println("Xbox kolundan ara pası tuşuna basıldı!");
    }
}
