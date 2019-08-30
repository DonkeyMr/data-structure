package com.data.array;

/**
 * @author liupeng
 * @date 2019/8/29
 */
public class Student {

    private Integer id;

    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (!id.equals(student.id)) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }

    public static void main(String[] args) {
        Student student = new Student(1, "aa");
        Student student2 = new Student(1, "aa");
        System.out.println(student.equals(student2));
    }
}
