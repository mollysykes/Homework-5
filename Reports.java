import java.util.LinkedList;

public class Reports implements IData{

    private LinkedList<DailyWeatherReport> reports;

    public Reports(){
        reports = new LinkedList<DailyWeatherReport>();
    }

    public void addReport(DailyWeatherReport dwReport){
        reports.add(dwReport);
    }

    public LinkedList<DailyWeatherReport> cleanData(int month, int year){
        LinkedList<DailyWeatherReport> cleanedData = new LinkedList<DailyWeatherReport>();

        for (DailyWeatherReport dw : reports){
            if (dw.getMonth() == month && dw.getYear() == year){
                cleanedData.add(dw);
            }
        }
        return cleanedData;
    }

}
