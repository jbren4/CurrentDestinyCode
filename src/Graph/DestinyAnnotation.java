package graph;

import statistics.Distribution;

public class DestinyAnnotation extends Annotation
{
    protected Distribution _distribution;
    double mean;
    double STDev;
	//Each edge has a distribution object, and an annotation which takes a 
	public DestinyAnnotation()
	{
            mean=_distribution.getMean();
            STDev=_distribution.getSTD();
	}

        public double getMean(){
            return _distribution.getMean();
        }
        
        public double getSTD(){
            return _distribution.getSTD();
        }
}
