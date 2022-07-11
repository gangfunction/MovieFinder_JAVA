package CSVparser;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CSVparser {
    private static final DateTimeFormatter DatePattern
            = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private MovieTransaction parseFromCsv(final String line){
        final String[] columns = line.split(",");

        final double Amount = Double.parseDouble(columns[1]);
        final String Description = columns[2];

        return new MovieTransaction(Amount, Description);
    }
    public List<MovieTransaction> parseLinefromCSV(final List<String> lines){
        final List<MovieTransaction> movieTransactions = new ArrayList<>();
        for(final String line : lines){
            movieTransactions.add(parseFromCsv(line));
        }
        return movieTransactions;
    }
}
