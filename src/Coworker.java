class Coworker {
    // Field YearOfBirth
    int YearOfBirth = 2010;

    public Coworker(){
        this(2000);
    }

    // This is a constructor
    // Field YearOfBirth is shadowed by a constructor parameter
    public Coworker(int YearOfBirth){
        System.out.print("the constructor says you are " + (2020 - YearOfBirth) + " years old.");

        // 2010 is used
        // To represent the current instance of the class in which it appears
        // To access class variables and methods
        System.out.println(" But using This keyword, you are " + (2020 - this.YearOfBirth) + " years old.");
    }

    // Field YearOfBirth is shadowed by a method parameter
    public void CalculateNominalAge(int YearOfBirth){
        System.out.print("your nominal age is " + (2020 - YearOfBirth + 1) + " years old.");

        // 2010 is used again
        // To represent the current instance of the class in which it appears
        // To access class variables and methods
        System.out.println(" But using This keyword, you are " + (2020 - this.YearOfBirth) + " years old.");
    }
}


