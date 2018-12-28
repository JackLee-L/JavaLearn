package cn.gree.lwh.MapDemo;

public class Person implements Comparable<Person> {
    private int id;

    private String name;

    private int gender;

    @Override
    public int compareTo(Person o) {
        int val = this.getId() - o.getId();
        if (val == 0){
            val = this.gender - o.gender;
            if (val == 0){
                val = this.name.compareTo(o.name);
            }
        }
        return val;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Person(int id, String name, int gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person) ){
            return false;
        }
        Person person = (Person)obj;
        if (this.id == person.id && this.gender == person.gender &&
                this.name != null && person.name != null &&
                this.name.equals(person.name)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
