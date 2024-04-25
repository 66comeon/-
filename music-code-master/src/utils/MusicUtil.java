package utils;

import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class MusicUtil {
    private MusicUtil(){}

    public static void start(Sequencer sequencer, Sequence sequence,int bpm) throws Exception{
        sequencer.setTempoInBPM(bpm);
        sequencer.open();
        sequencer.setSequence(sequence);

        Thread.sleep(2000);
        sequencer.start();
        while (sequencer.isRunning()) {
            Thread.sleep(100);
        }
        sequencer.close();
    }
}
