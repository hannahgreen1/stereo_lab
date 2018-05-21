public class Radio extends Stereo implements IVolume{

Radio radio;
    public String tuneRadio;

    public String tuneRadio(String radioStation){
        return tune(radioStation);
    }


    public String tune(String radioStation){
        return radioStation;
    }

    public void volume(int volume) {
        volumeLevel += volume;
    }


}
