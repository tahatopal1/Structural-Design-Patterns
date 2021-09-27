package Bridge;

import Bridge.MusicPlayer.Music;
import Bridge.MusicPlayer.MusicPlayer;

public class Fizy implements MusicPlayer {
    @Override
    public String playMusic(Music music) {
        System.out.println("Fizy is playing: " + music);
        return music.getVoice();
    }
}
