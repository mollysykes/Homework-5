public class Reading {

    private Time time;
    private double temp;
    private double rainfall;

    private Reading (Time time, double temp, double rainfall){
        this.time = time;
        this.temp = temp;
        this.rainfall = rainfall;
    }

    /**
     * Determines the temperature value from the reading
     * @return the temperature data
     */
    public double getTemp(){
        return this.temp;
    }

    /**
     * Determines the rainfall value from the reading
     * @return the rainfall data
     */
    public double getRainfall(){
        return this.rainfall;
    }

}
