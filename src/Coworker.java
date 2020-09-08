class Coworker {
    int YearOfBirth = 2008;

    public Coworker(){
        this(2000);
    }

    public Coworker(int YearOfBirth){
        System.out.print("the constructor says you are " + (2020 - YearOfBirth) + " years old.");

        System.out.println(" But using this keyword, you are " + (2020 - this.YearOfBirth) + " years old.");
    }

    public void CalculateNominalAge(int YearOfBirth){
        System.out.print("your nominal age is " + (2020 - YearOfBirth + 1) + " years old.");

        System.out.println(" But using this keyword, you are " + (2020 - this.YearOfBirth) + " years old.");
    }
}


