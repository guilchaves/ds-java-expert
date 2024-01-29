package entities;

public abstract class Lesson {
    private String title;

    public abstract int duration();

    public void setTitle(String title) {
        this.title = title;
    }
}
