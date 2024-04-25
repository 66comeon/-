package midimusic;

import music.Music;
import note.C;
import utils.MusicUtil;

import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;

public class TheWindRisesRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Music music = new Music(16);
            Sequencer sequencer = music.getSequencer();
            Sequence sequence = music.getSequence();

            int rtick = 0;
            int ltick = 0;

            //1
            rtick = music.addNote(ShortMessage.NOTE_ON, C.SEVEN,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_OFF, C.H1_THREE,32,rtick,true,true);

            //2
            rtick = music.addNote(ShortMessage.NOTE_ON, C.SEVEN,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_THREE,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.SEVEN,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.FIVE,8,rtick,true,true);
            //3
            rtick = music.addNote(ShortMessage.NOTE_ON, C.SEVEN,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_THREE,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_THREE,36,rtick,true,true);
            //4
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,4,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_TWO,4,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, 73,4,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, 73,4,rtick,true,true);

            //5
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_TWO,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_TWO,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,8,rtick,true,true);

            //6
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_TWO,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_TWO,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.FIVE,4,rtick,true,true);

            //7
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_TWO,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_TWO,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,8,rtick,true,true);

            //8
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_TWO,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,4,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_TWO,4,rtick,true,true);

            //9
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_TWO,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_TWO,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,8,rtick,true,true);

            //10
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_TWO,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.SIX,4,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,true);

            //11
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,4,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_ONE,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,true);

            //12
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,4,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_ONE,4,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,8,rtick,true,true);

            //13
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_OFF, C.H1_SIX,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SEVEN,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SEVEN,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_SEVEN,4,rtick,true,true);

            //14
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SEVEN,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SEVEN,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_SEVEN,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, 84,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, 86,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, 84,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_SEVEN,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,8,rtick,true,true);

            //15
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_TWO,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H1_FIVE,12,rtick,true,true);

            //16
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,4,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_THREE,4,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,8,rtick,true,true);

            //17
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_OFF, C.H1_SIX,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SEVEN,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SEVEN,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_SEVEN,4,rtick,true,true);

            //18
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SEVEN,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SEVEN,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_SEVEN,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_TWO,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SEVEN,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,8,rtick,true,true);

            //19
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H2_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H2_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_FIVE,8,rtick,true,true);

            //20
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,4,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_OFF, C.H1_SIX,32,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_ONE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_TWO,8,rtick,true,true);

            //21
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H2_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_TWO,8,rtick,true,true);

            //22
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H2_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H2_FIVE,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H2_THREE,12,rtick,true,true);

            //23
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_TWO,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, 0,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,8,rtick,true,true);

            //24
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H2_THREE,24,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FOUR,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H2_THREE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_TWO,4,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_TWO,8,rtick,true,true);

            //25
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H2_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_TWO,8,rtick,true,true);

            //26
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_THREE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H2_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_FIVE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H2_FIVE,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_THREE,8,rtick,true,true);

            //27
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H2_THREE,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H2_ONE,12,rtick,true,true);

            //28
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,4,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_OFF, C.H2_ONE,32,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H2_THREE,12,rtick,true,true);


            //29
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H2_THREE,12,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_TWO,8,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H2_ONE,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote(ShortMessage.NOTE_OFF, C.H1_SIX,16,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_ON, C.H2_ONE,12,rtick,true,true);

            //30
            rtick = music.addNote(ShortMessage.NOTE_ON, C.H2_ONE,4,rtick,true,false);
            rtick = music.addNote2(ShortMessage.NOTE_OFF, C.H2_ONE,48,rtick,true,true);





            //1
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //2
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SEVEN,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.ONE,8,ltick,false,false);

            //3
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //4
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,58,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.ONE,8,ltick,false,false);
            ltick = music.addNote2(ShortMessage.NOTE_ON,C.THREE,32,ltick,false,false);

            //5
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,4,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_OFF,C.L1_FIVE,4,ltick,false,false);

            //6
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SEVEN,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.TWO,4,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_OFF,C.TWO,4,ltick,false,false);

            //7
            ltick = music.addNote(ShortMessage.NOTE_ON,34,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,40,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SEVEN,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,4,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_OFF,C.L1_FOUR,4,ltick,false,false);

            //8
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.ONE,4,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_OFF,C.ONE,4,ltick,false,false);

            //9
            //可以复用在15节
            //2 6 2 4 5 2 5 7
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //10
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.THREE,4,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_OFF,C.THREE,4,ltick,false,false);

            //11
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //12
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,4,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_OFF,C.L1_FIVE,4,ltick,false,false);

            //13
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //14
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SEVEN,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.ONE,8,ltick,false,false);

            //15
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //16
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,4,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_OFF,C.L1_FIVE,4,ltick,false,false);

            //17
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //18
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SEVEN,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.ONE,8,ltick,false,false);
            //19
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //20
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.THREE,4,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_OFF,C.THREE,4,ltick,false,false);

            //21
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //22
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SEVEN,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.ONE,8,ltick,false,false);

            //23
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //24
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SEVEN,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,53,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);

            //25
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //26
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SEVEN,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.ONE,8,ltick,false,false);

            //27
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //28
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.THREE,4,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_OFF,C.THREE,4,ltick,false,false);

            //29
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FOUR,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SIX,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_TWO,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_SEVEN,8,ltick,false,false);

            //30
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L2_FIVE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_ONE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_THREE,8,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_ON,C.L1_FIVE,4,ltick,false,false);
            ltick = music.addNote(ShortMessage.NOTE_OFF,C.L1_FIVE,4,ltick,false,false);


            MusicUtil.start(sequencer,sequence,80);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
