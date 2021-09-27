package Bridge.VoiceDevice;

public class HeadSet implements VoiceDevice{
    @Override
    public void reflectVoice(String voice) {
        System.out.println("Headset is reflecting the voice: " + voice);
    }
}
