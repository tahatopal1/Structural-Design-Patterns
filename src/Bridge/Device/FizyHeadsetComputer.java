package Bridge.Device;

import Bridge.Fizy;
import Bridge.MusicPlayer.Music;
import Bridge.VoiceDevice.HeadSet;

public class FizyHeadsetComputer extends MusicPlayingComputer{

    public FizyHeadsetComputer(){
        voiceDevice = new HeadSet();
        musicPlayer = new Fizy();
    }

    @Override
    public void playMusic(Music music) {
        System.out.println("Computer has started.");
        super.playMusic(music);
    }
}
