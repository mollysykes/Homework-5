import java.util.LinkedList;

public interface IData {

    public void addReport(DailyWeatherReport dwReport);
    public LinkedList<DailyWeatherReport> cleanData(int month, int year);
}
