import java.util.ArrayList;
import java.util.List;

public class Course {

    String title;
    int units;
    List<String> topics = new ArrayList<>();
    Teachers teacher;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }

    public void addTopic(String topic){
        topics.add(topic);
    }

    public void removeTopic(String topic){
        topics.remove(topic);
    }

    public List<String> seeAllTopics(){
        for(int i = 0; i < topics.size(); i++){
            System.out.println(topics.get(1));
        }
        return topics;
    }

}
