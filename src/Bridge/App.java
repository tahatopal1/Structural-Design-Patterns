package Bridge;

import Bridge.Device.FizyHeadsetComputer;
import Bridge.Device.GeneralComputer;
import Bridge.Device.MusicPlayingComputer;
import Bridge.MusicPlayer.Music;
import Bridge.MusicPlayer.Spotify;
import Bridge.VoiceDevice.LoudSpeaker;

public class App {
    public static void main(String[] args) {

        Music music = new Music("Bon Jovi - It's my life", "♫ It's my life, It's now or never ♫");

        MusicPlayingComputer computer = new FizyHeadsetComputer();
        computer.playMusic(music);

        System.out.println();

        music = new Music("Metallica - Enter Sandman", "♫ Exit light, enter night ♫");
        computer = new GeneralComputer(new LoudSpeaker(), new Spotify());
        computer.playMusic(music);

    }
}
