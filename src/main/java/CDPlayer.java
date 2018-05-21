public class CDPlayer extends Radio implements IVolume {

    public void volume(int volume) {
        startVolumeLevel += volume;
    }
}
