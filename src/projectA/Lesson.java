package projectA;

public class Lesson {


    private String lessonType;
    private String topic;
    private Integer durationInMinutes;
    private Course course;
    private Teacher teacher;
    private Student student;


    public Lesson(String lessonType, String topic, int durationInMinutes) {
        this.lessonType = lessonType;
        this.topic = topic;
        this.durationInMinutes = durationInMinutes;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
