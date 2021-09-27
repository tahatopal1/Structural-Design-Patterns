package Bridge.Device;

import Bridge.MusicPlayer.Music;
import Bridge.MusicPlayer.MusicPlayer;
import Bridge.VoiceDevice.VoiceDevice;

public class GeneralComputer extends MusicPlayingComputer{
    public GeneralComputer(VoiceDevice voiceDevice, MusicPlayer musicPlayer) {
        super(voiceDevice, musicPlayer);
    }

    @Override
    public void playMusic(Music music) {
        System.out.println("General computer has started.");
        super.playMusic(music);
    }
}
