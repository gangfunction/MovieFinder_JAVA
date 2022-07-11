package CSVparser;

import java.lang.constant.Constable;
import java.util.Objects;

public class MovieTransaction {
    private final double Amount;
    private final String Description;

    public MovieTransaction(final double Amount, final String Description) {
        this.Amount = Amount;
        this.Description = Description;
    }
    public double getAmount(){
        return Amount;
    }
    public String getDescription(){
        return Description;
    }
    @Override
    public String toString() {
        return "MovieTransaction{" +
                "Amount=" + Amount +
                ", Description='" + Description + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieTransaction that = (MovieTransaction) o;
        return Double.compare(that.Amount, Amount) == 0 &&
                Description.equals(that.Description);
    }
    @Override
    public int hashCode(){
        return Objects.hash(Amount, Description);

    }
}
