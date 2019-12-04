import com.sun.xml.internal.bind.v2.model.core.ID;
import sun.awt.image.ImageWatched;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {

    private IData reports;

    /**
     * Calculates the total rainfall for the specified month and year.
     * @param month takes in an integer that specifies the month for the total rainfall calculation
     * @param year takes in an integer that specifies the year for the total rainfall calculation
     * @return the total rainfall for the specified month and year
     */
    public double totalRainfallForMonth(int month, int year){

        LinkedList<DailyWeatherReport> cleanedData = new LinkedList<DailyWeatherReport>();
        double total = 0;

        cleanedData = reports.cleanData(month, year);

        for (DailyWeatherReport dw : cleanedData){
            total += dw.getTotalRainfall();
        }
        return total;
    }

    /**
     * Calculates the average temperature for the specified month and year.
     * @param month takes in an integer that specifies the month for the average temp calculation
     * @param year takes in an integer that specifies teh year for the average temp calculation
     * @return the average temperature for the specified month and year
     */
    public double averageTempForMonth(int month, int year){

        LinkedList<DailyWeatherReport> cleanedData = new LinkedList<DailyWeatherReport>();
        double sum = 0;

        cleanedData = reports.cleanData(month, year);

        for(DailyWeatherReport dw : cleanedData){
            sum += dw.getAverageTemp();
        }

        return sum/cleanedData.size();
    }

    /**
     * Adds a daily report using the date and readings data
     * @param date date of the readings
     * @param readings linked list of readings that have rainfall and temperature data
     */
    public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings){

        DailyWeatherReport dw = new DailyWeatherReport(date);

        for(Reading r : readings){
            dw.addTemp(r.getTemp());
            dw.addRain(r.getRainfall());
        }

        reports.addReport(dw);
    }
}
