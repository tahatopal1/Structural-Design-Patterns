package Bridge.MusicPlayer;

public class Spotify implements MusicPlayer{

    public String playMusic(Music music){
        System.out.println("Spotify is playing: " + music);
        return music.getVoice();
    }

}
