package com.monds.ps.jfct.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LowestGrade {
    private static class Student {
        String name;
        int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(scanner.next(), scanner.nextInt());
        }

        Arrays.sort(students, Comparator.comparingInt(o -> o.grade));

        for (Student student : students) {
            System.out.printf("%s ", student.name);
        }
    }
}
