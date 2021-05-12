package SpringCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
//        private List<Music> musicList = new ArrayList<>();


    private Music music1;
    private Music music2;

        @Value("${musicPlayer.name}")
        private String name;

        @Value("${musicPlayer.volume}")
        private int volume;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

    @Autowired
    public MusicPlayer(  @Qualifier("popMusic")Music music1,
                         @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayer() {
    }


//            public void setMusicList(List<Music> musicList) {
//            this.musicList = musicList;
//        }
//
//        public void playMusicList() {
//            for (Music music : musicList) {
//                System.out.println("Playing: " + music.getSong());
//            }
//        }



    public String playMusic(){
//        System.out.println("Playing: "+ music.getSong());
        return "Playing: "+ music1.getSong()+", "+music2.getSong();
    }
        }

