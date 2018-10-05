package model;

public class Kid {

    private String name;
    private Hobby hobby;

    public Kid(String name, Hobby hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return String.format("Hi, I'm %s. ", name);
    }
}
