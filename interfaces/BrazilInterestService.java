package problema5.interfaces;

public class BrazilInterestService implements InterestService{

    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return 0;
    }
}
