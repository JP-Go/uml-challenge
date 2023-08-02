package main.interfaces;

public interface MusicPlayer {

    public boolean getPlaying();

    public String getSong();

    public void changeSong(String song);

    public void play();

    public void pause();

}
