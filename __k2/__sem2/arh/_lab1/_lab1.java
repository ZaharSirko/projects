package __k2.__sem2.arh._lab1;

public class _lab1 {
    public static void main(String[] args) {
        _compositionFactory myMusicFactory = new _music_compos_factory();
        _compositionFactory myArtFactory  = new _art_compos_factory();

        _composition myMusicCompos = myMusicFactory.createCar();
        _composition myArtCompos = myArtFactory.createCar();

        System.out.println(myMusicCompos);
        System.out.println(myArtCompos);
        
    }
}
