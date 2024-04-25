package utils;

import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.Sequence;
import javax.sound.midi.Track;

public class TrackUtil {
    private TrackUtil(){}

    public static Track getTrack(Sequence sequence) throws Exception{
        Track track = sequence.createTrack();
        MetaMessage timeSigMessage = new MetaMessage();
        byte[] timeSigData = {4, 2, 24, 8}; // 4/4拍的拍子事件数据
        timeSigMessage.setMessage(0x58, timeSigData, 4);
        MidiEvent timeSigEvent = new MidiEvent(timeSigMessage, 0);
        track.add(timeSigEvent);
        return track;
    }
}
