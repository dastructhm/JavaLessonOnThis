class Age {
    int YearOfBirth = 1990;

    public int CalculateAge(int YearOfBirth){
        return (2020 - YearOfBirth);
    }

    public int CalculateAgeUsingThis(int YearOfBirth){
        // this就是myAge
        // myAge对象是Age类的实例
        // myAge.dateOfBirth
        return (2020 - this.YearOfBirth);
    }
}


