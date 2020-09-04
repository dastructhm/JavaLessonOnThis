class Age {
    int dateOfBirth = 1982;

    public int CalculateAge(int dateOfBirth){
        return dateOfBirth;
    }

    // using this, 1982 called
    public int CalculateAge2(int dateOfBirth){
        return this.dateOfBirth;
    }
}
