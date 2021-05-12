package SpringCourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testSpring {
    private static String LINE= "---------------------";
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        /**
         * factory-method in PopMusic
         */
//       PopMusic popMusic =context.getBean("musicBean",PopMusic.class);
//        System.out.println(popMusic.getSong());

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

//        Computer computer =context.getBean("computer",Computer.class);
//        System.out.println(computer);
        System.out.println(LINE);

       /* MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean b =firstMusicPlayer==secondMusicPlayer;
        System.out.println(b);
        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        System.out.println(LINE);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);*/


       /* musicPlayer.playMusicList();

//        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/

        context.close();
    }
}
