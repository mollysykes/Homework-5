import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {

    private GregorianCalendar date;
    private LinkedList<Double> temperature;
    private LinkedList<Double> rainfall;

    public DailyWeatherReport (GregorianCalendar date){
        this.date = date;
        temperature = new LinkedList<Double>();
        rainfall = new LinkedList<Double>();
    }

    /**
     * Adds a temperature to the LinkedList of temperature data in a DailyWeatherReport
     * @param d a double that represents a temperature
     */
    public void addTemp(Double d){
        temperature.add(d);
    }

    /**
     * Adds a rainfall to the LinkedList of rainfall data in a DailyWeatherReport
     * @param d a double that represents a rainfall
     */
    public void addRain(Double d){
        rainfall.add(d);
    }

    /**
     * Calculates the average temperature of a LinkedList of temperature values
     * @return the average temperature
     */
    public double getAverageTemp(){
        double sum = 0;

        for (Double t : temperature){
            sum += t;
        }

        return sum/temperature.size();
    }

    /**
     * Calculates the total rainfall of a LinkedList of rainfall data
     * @return the total rainfall
     */
    public double getTotalRainfall(){
        double sum = 0;

        for (Double r : rainfall){
            sum += r;
        }
        return sum;
    }

    /**
     * Retrieves the month from a DailyWeatherReport
     * @return the month
     */
    public int getMonth(){
        int month = date.get(GregorianCalendar.MONTH);
        return month;
    }

    /**
     * Retrieves the year from a DailyWeatherReport
     * @return the year
     */
    public int getYear(){
        int year = date.get(GregorianCalendar.YEAR);
        return year;
    }


}
