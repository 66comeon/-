package utils;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class MidiEventUtil {
    private MidiEventUtil(){}

    public static MidiEvent getMidiEvent(int commond, int data1, int data2, int tick) throws Exception{
        ShortMessage shortMessage = new ShortMessage();
        shortMessage.setMessage(commond,6,data1, data2);
        MidiEvent midiEvent = new MidiEvent(shortMessage, tick);
        return midiEvent;
    }
}
