package com.lthergo.studentsystem.StudentADB;

/**
 * 学生信息的实体类
 */
public class StudentInfo {
    private Long id;
    private String name;
    private String age;
    private String cj;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCj() {
        return cj;
    }

    public void setCj(String cj) {
        this.cj = cj;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + cj + '\'' +
                '}';
    }
}
