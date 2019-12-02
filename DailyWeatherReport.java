import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {

    private GregorianCalendar date;
    private LinkedList<Double> temperature;
    private LinkedList<Double> rainfall;

    private DailyWeatherReport (GregorianCalendar date, LinkedList<Double> temperature, LinkedList<Double> rainfall){
        this.date = date;
        this.temperature = temperature;
        this.rainfall = rainfall;
    }

    public double getAverageTemp(){
        double sum = 0;

        for (Double t : temperature){
            sum += t;
        }

        return sum/temperature.size();
    }

    public double getTotalRainfall(){
        double sum = 0;

        for (Double r : rainfall){
            sum += r;
        }
        return sum;
    }

    public int getMonth(){
        int month = date.get(GregorianCalendar.MONTH);
        return month;
    }

    public int getYear(){
        int year = date.get(GregorianCalendar.YEAR);
        return year;
    }


}
