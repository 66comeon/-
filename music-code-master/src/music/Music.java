package music;

import utils.MidiEventUtil;
import utils.TrackUtil;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;

public class Music {
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;
    private int tickPerNote;
    private String time = "";
    public Music(){}

    public Music(int tickPerNote) throws Exception{
        this.sequencer = MidiSystem.getSequencer();
        this.sequence = new Sequence(Sequence.PPQ, tickPerNote);
        this.track = TrackUtil.getTrack(sequence);
        this.tickPerNote = tickPerNote;
    }

    public Sequencer getSequencer() {
        return sequencer;
    }

    public Sequence getSequence() {
        return sequence;
    }

    public String getTime() {
        return time;
    }


    public int addNote(int commond,int note,int noteType,int tick,boolean main,boolean end) throws Exception{
        track.add(MidiEventUtil.getMidiEvent(commond,note,127,tick));
        int offset = computeTick(noteType);
        tick = tick + offset;
        if(main){

           int time = computeTiem(noteType);
           if(end){
               this.time = this.time + "|" + time;
           }else{
               this.time = this.time + " " + time;
           }
        }
        return tick;
    }
    public int addNote2(int commond,int note,int len,int tick,boolean main,boolean end) throws Exception{
        track.add(MidiEventUtil.getMidiEvent(commond,note,127,tick));
        tick = tick + len;
        if(main){
            int time = 47*len;
            if(end){
                this.time = this.time + "|" + time;
            }else{
                this.time = this.time + " " + time;
            }
        }
        return tick;
    }
    public int computeTick(int noteType){
        int offset = 0;
        if(noteType == 4){
            offset = this.tickPerNote;
        }else if(noteType == 8){
            offset = this.tickPerNote/2;
        }else if(noteType == 16){
            offset = this.tickPerNote/4;
        }
        return offset;
    }
    public int computeTiem(int noteType){
        int time = 0;
        if(noteType == 4){
            time = 47*16;
        }else if(noteType == 8){
            time = 47*8;
        }else if(noteType == 16){
            time = 47*4;
        }
        return time;
    }
}
