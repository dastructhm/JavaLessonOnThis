/*
学习目标：this关键字
概念定义：- The keyword "this" is a Java language keyword that represents the current instance of the class in which it appears.
        - It is used to access class variables and methods.
实际应用：
另请参阅：- https://en.wikipedia.org/wiki/This_(computer_programming)
        - https://en.wikipedia.org/wiki/List_of_Java_keywords
        - https://www.youtube.com/watch?v=hUZ4jQmgwi4
源代码：- https://github.com/bjdhjy888/JavaLessonOnThis
*/

public class main {

    public static void main(String[] args) {

        Age myAge = new Age();

        System.out.println("Bob, you are " + myAge.CalculateAge(1982) + " years old.");

        System.out.println("Jim, you are " + myAge.CalculateAgeUsingThis(1982) + " years old.");
    }
}

