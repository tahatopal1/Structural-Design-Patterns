package Bridge.Device;

import Bridge.MusicPlayer.Music;
import Bridge.MusicPlayer.MusicPlayer;
import Bridge.VoiceDevice.VoiceDevice;

public abstract class MusicPlayingComputer {

    protected VoiceDevice voiceDevice;
    protected MusicPlayer musicPlayer;

    public MusicPlayingComputer() { }

    public MusicPlayingComputer(VoiceDevice voiceDevice, MusicPlayer musicPlayer) {
        this.voiceDevice = voiceDevice;
        this.musicPlayer = musicPlayer;
    }

    public void playMusic(Music music){
        String voice = musicPlayer.playMusic(music);
        voiceDevice.reflectVoice(voice);
    }
}
