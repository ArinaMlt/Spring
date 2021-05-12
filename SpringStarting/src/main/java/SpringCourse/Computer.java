package SpringCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    private MusicPlayer musicPlayer;

    @Override
    public String toString() {
        return "Computer: "+musicPlayer.playMusic();
    }
}
