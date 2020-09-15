/*
学习目标：this关键字
概念定义：- To represent the current instance of the class in which it appears
        - To access class variables and methods
实际应用：- The most common reason for using the this keyword is because a field is shadowed by a method or constructor parameter.
        - From within a constructor, you can also use the this keyword to call another constructor in the same class. Doing so is called an explicit constructor invocation.
调用API：N/A
另请参阅：- https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
        - https://en.wikipedia.org/wiki/This_(computer_programming)
        - https://en.wikipedia.org/wiki/List_of_Java_keywords
        - https://www.youtube.com/watch?v=hUZ4jQmgwi4
        - https://www.youtube.com/watch?v=cdrTzCY4q4w
        - https://www.youtube.com/watch?v=tPFuVRbUTwA
示例工程：- https://github.com/bjdhjy888/JavaLessonOnThis
*/

public class Main {

    public static void main(String[] args) {
        System.out.print("Tom, ");
        // Calling constructor Coworker
        Coworker coworkerTom = new Coworker(1980);

        // Calling constructor Coworker
        System.out.print("Jim, ");
        Coworker CoworkerJim = new Coworker(1990);

        // Calling constructor Coworker
        System.out.print("Amy, ");
        Coworker CoworkerAmy = new Coworker(2000);

        System.out.print("Tom, ");
        coworkerTom.CalculateNominalAge(1980);

        System.out.print("Jim, ");
        coworkerTom.CalculateNominalAge(1980);

        System.out.print("Amy, ");
        coworkerTom.CalculateNominalAge(1980);
    }
}

