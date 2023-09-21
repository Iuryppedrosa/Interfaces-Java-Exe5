package problema5.interfaces;

public interface InterestService{
    double getInterestRate();

    default double payment(Double amount, Integer months) {
        return amount * Math.pow((1 + getInterestRate() / 100), months);
    }
}
