package SpringCourse;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{

    private PopMusic() {
    }
    public static PopMusic PopMusic(){
        return new PopMusic();
    }
    @Override
    public String getSong() {
        return "Pop music";
    }
}
