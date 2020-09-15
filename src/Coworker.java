class Coworker {
    // Field YearOfBirth
    int YearOfBirth = 2010;

    // This is another constructor
    // Field YearOfBirth is shadowed by a constructor parameter
    public Coworker(int YearOfBirth){
         System.out.print("you are " + (2020 - YearOfBirth) + " years old.");

        // 2010 is used
        // To represent the current instance of the class in which it appears
        // To access class variables and methods
        // 不使用参数或局部变量
        System.out.println(" Using this keyword, you are " + (2020 - this.YearOfBirth) + " years old.");
    }

    // Field YearOfBirth is shadowed by a method parameter
    public void CalculateNominalAge(int YearOfBirth){
        System.out.print("your nominal age is " + (2020 - YearOfBirth + 1) + " years old.");

        // 2010 is used again
        // To represent the current instance of the class in which it appears
        // To access class variables and methods
        // 不使用参数或局部变量
        System.out.println(" Using this keyword, you are " + (2020 - this.YearOfBirth) + " years old.");
    }
}


