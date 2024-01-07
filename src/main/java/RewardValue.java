public class RewardValue {
    private final double cashValue;
    public final double milesToCashConversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private int convertToMiles(double cashValue) {
        return (int) (cashValue / milesToCashConversionRate);
    }

    private double convertToCash(int milesValue) {
        return milesValue * milesToCashConversionRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
