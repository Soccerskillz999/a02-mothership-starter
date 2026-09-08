package edu.unc.comp210.a02mothership;

public class ExperimentModule extends AModule{
    private String experimentName;
    private double[] parameters;
    double result;
    boolean hasRun;

    public ExperimentModule(String experimentName, double[] parameters){
        super("ExperimentModule");
        this.experimentName = experimentName;
        this.parameters = parameters;
        this.result = 0;
        this.hasRun = false;
    }



    public void runExperiment(){
        for (int i = 0; i <= parameters.length; i++) {
            result=i*Math.random();
            hasRun=true;

        }
    }
    public String getSummary(){
        if(hasRun==true){

            return "Experiment '" +experimentName+ "' result: " +result;

        }
        else{
            return "Experiment not run yet.";
        }
    }
    @Override
    public void statusReport(String moduleStatus,boolean isSuccessful){
        if(hasRun==true){
            System.out.println(getName() + ": " + experimentName +" completed.");
        }
        else{
            System.out.println(getName() + ": " + experimentName + " pending.");
        }

        super.statusReport(moduleStatus, isSuccessful);

    }


}
