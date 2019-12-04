import java.util.LinkedList;

public class Reports implements IData{

    private LinkedList<DailyWeatherReport> reports;

    public Reports(){
        reports = new LinkedList<DailyWeatherReport>();
    }

    /**
     * Adds a DailyWeatherReport to the linked list of DailyWeatherReports
     * @param dwReport a DailyWeatherReport
     */
    public void addReport(DailyWeatherReport dwReport){
        reports.add(dwReport);
    }

    /**
     * Creates a new LinkedList from all weather reports of data from the specified month and year
     * @param month an integer that specifies the month of the desired data
     * @param year an integer that specifies the year of the desired data
     * @return The data from the specified month and year in a LinkedList
     */
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
