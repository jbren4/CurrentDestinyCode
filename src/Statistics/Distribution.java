package statistics;

public class Distribution {

    protected double _mean;
    protected double _stdDev;

    //Each edge has a distibution object
    public Distribution(double mean, double stdDev) {
        _mean = mean;
        _stdDev = stdDev;
    }

    //Since I have all the times calculated, Should I just hardcode this or randomly generate time or just use the mean?
    public double generateTime() {
        return -1;
    }

    public double computerSTD(double[] ary, double mean, int numberOfDataPoints) {
        double sumation = 0;
        for (int i = 0; i < ary.length; i++) {
            sumation += Math.pow((ary[i] - mean), 2);
        }
        return sumation / numberOfDataPoints;
    }

    public double computeMean(double[] ary) {
        double mean = 0;
        for (int i = 0; i < ary.length; i++) {
            mean += ary[i];
        }
        return mean/ary.length;
    }
    
    public double getMean(){
        return _mean;
    }
    
    public double getSTD(){
        return _stdDev;
    }

}

