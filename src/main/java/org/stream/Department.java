package org.stream;

public class Department {
    private String id;
    private String name;
    private Integer classLength;

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classLength=" + classLength +
                '}';
    }

    public Department(String id, String name, Integer classLength) {
        this.id = id;
        this.name = name;
        this.classLength = classLength;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassLength() {
        return classLength;
    }

    public void setClassLength(Integer classLength) {
        this.classLength = classLength;
    }
}
