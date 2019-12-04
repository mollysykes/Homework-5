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

    public void addTemp(Double d){
        temperature.add(d);
    }

    public void addRain(Double d){
        rainfall.add(d);
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
