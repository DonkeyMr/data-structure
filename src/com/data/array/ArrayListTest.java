package com.data.array;

/**
 * @author liupeng
 * @date 2019/8/26
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>(10);
        Student student = new Student(1, "bb");
        list.addLast(student);
        System.out.println(list.contains(student));
    }
}
