package uet.oop.bomberman;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound {
    private Clip clip;
    public Sound(String name){
        try {
            File file = new File(name);
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audio);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void play(int loop){
        clip.setFramePosition(0);
        clip.loop(loop);
    }
}
