import com.sun.xml.internal.bind.v2.model.core.ID;
import sun.awt.image.ImageWatched;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {

    private IData reports;


    public double averageTempForMonth(int month, int year){

        LinkedList<DailyWeatherReport> cleanedData = new LinkedList<DailyWeatherReport>();
        double total = 0;

        cleanedData = reports.cleanData(month, year);

        for (DailyWeatherReport dw : cleanedData){
            total += dw.getTotalRainfall();
        }
        return total;
    }

    public double totalRainfallForMonth(int month, int year){

        LinkedList<DailyWeatherReport> cleanedData = new LinkedList<DailyWeatherReport>();
        double sum = 0;

        cleanedData = reports.cleanData(month, year);

        for(DailyWeatherReport dw : cleanedData){
            sum += dw.getAverageTemp();
        }

        return sum/cleanedData.size();
    }

    public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings){

        DailyWeatherReport dw = new DailyWeatherReport(date);

        for(Reading r : readings){
            dw.addTemp(r.getTemp());
            dw.addRain(r.getRainfall());
        }

        reports.addReport(dw);
    }
}
