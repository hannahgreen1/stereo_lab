public class CDPlayer extends Radio implements IVolume {

    public void volume(int volume) {
        startVolumeLevel += volume;
    }

    public String play(String title){
        return "CD - playing " + title;
    }
}
