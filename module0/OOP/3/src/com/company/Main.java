package com.company;

public class Main {

    public static void main(String[] args) {
        Student[] students= new Student[10];
        students[0]=new Student("Иванов", "И.Е.", 3, new int[]{2, 3, 4, 5, 6});
        students[1]=new Student("Петров", "П.Г.", 5, new int[]{2,3,4,6,7});
        students[2]=new Student("Сидоров", "Б.Т.", 2, new int[]{3,6,9,6,10});
        students[3]=new Student("Пономарёв", "Л.Г.", 4, new int[]{3,5,6,8,9});
        students[4]=new Student("Ильин", "К.Н.", 5, new  int[]{10,9,10,9,9});
        students[5]=new Student("Кондратьев", "А.Р.", 4, new int[]{9,9,9,9,9});
        students[6]=new Student("Сакович", "Я.С.", 5, new int[]{7, 8,9,10, 6});
        students[7]=new Student("Орлович", "Е.Р.", 7, new int[]{8,4, 9, 7,9});
        students[8]=new Student("Булатов", "Р.А.", 3, new int[]{10,10,10,10,10});
        students[9]=new Student("Кастрица", "В.П", 3, new int[]{8,9,9,10,8});
    }
}
