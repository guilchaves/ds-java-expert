package entities;

public class Task extends Lesson {
    private String description;
    private Integer questionCount;

    public Task(String title, String description, Integer questionCount) {
        super.setTitle(title);
        this.description = description;
        this.questionCount = questionCount;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuestionCount() {
        return questionCount;
    }

    @Override
    public int duration() {
        return questionCount * 300;
    }
}
