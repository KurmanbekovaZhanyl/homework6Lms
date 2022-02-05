package lms6;

public class Mayor {
    private String name ;
    private String surname ;

    public Mayor() {
    }

    public Mayor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return " Mayor " +
                " name: " + name +
                " surname: " + surname +" \n ";
    }
}
