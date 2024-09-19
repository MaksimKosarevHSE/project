import java.util.Objects;

public class People {
    private int id;
    private String name;
    private int age;

    public People(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public People() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id == people.id && age == people.age && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    public String getName() {
        return name;
    }
}
