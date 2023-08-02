package main.interfaces;

public interface TelephonyDevice {

    public boolean getOnCall();

    public Integer getVoiceMailCount();

    public void call(String number);

    public void hangUp();

    public void startVoiceMail();
}
