class Coworker {
    int YearOfBirth = 2010;

    public Coworker(){
        this(2000);
    }

    // Constructor
    public Coworker(int YearOfBirth){
        System.out.print("the constructor says you are " + (2020 - YearOfBirth) + " years old.");

        // 2010 is used
        System.out.println(" But using This keyword, you are " + (2020 - this.YearOfBirth) + " years old.");
    }

    public void CalculateNominalAge(int YearOfBirth){
        System.out.print("your nominal age is " + (2020 - YearOfBirth + 1) + " years old.");

        // 2010 is used again
        System.out.println(" But using This keyword, you are " + (2020 - this.YearOfBirth) + " years old.");
    }
}


