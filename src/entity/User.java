package entity;

public class User extends Person{
    private double debt;
    private double monthlyIncome;
    private double userScore;

    public User() {
    }

    public User(int id, String name, int age, String phoneNumber, double debt, double monthlyIncome, double userScore) {
        super(id, name, age, phoneNumber);
        this.debt = debt;
        this.monthlyIncome = monthlyIncome;
        this.userScore = userScore;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getUserScore() {
        return userScore;
    }

    public void setUserScore(double userScore) {
        this.userScore = userScore;
    }

    @Override
    public String toString() {
        return "User{" +
                "debt=" + debt +
                ", monthlyIncome=" + monthlyIncome +
                ", userScore=" + userScore +
                "} " + super.toString();
    }
}
