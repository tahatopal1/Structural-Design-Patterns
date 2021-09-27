package Bridge.VoiceDevice;

public class LoudSpeaker implements VoiceDevice{

    public void reflectVoice(String voice){
        System.out.println("Loudspeaker is reflecting the voice: " + voice);
    }

}
