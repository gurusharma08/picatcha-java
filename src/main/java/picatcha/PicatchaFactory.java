package picatcha;

public class PicatchaFactory {

    public static Picatcha newPicatcha(String publicKey) {
        PicatchaImpl picatcha = new PicatchaImpl();
        picatcha.setPublicKey(publicKey);
        picatcha.setPicatchaServer(PicatchaImpl.HTTP_SERVER);

        return picatcha;
    }
}
