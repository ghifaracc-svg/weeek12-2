public class Student {
    String nim, name, major;

    Student(String nim, String name, String major) {
        this.nim = nim;
        this.name = name;
        this.major = major;
    }

    void print() {
        System.out.println("NIM    : " + nim);
        System.out.println("Name   : " + name);
        System.out.println("Major  : " + major);
    }
}