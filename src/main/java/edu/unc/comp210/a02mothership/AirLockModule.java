package edu.unc.comp210.a02mothership;

public class AirLockModule extends AModule{
    private int people;

    public AirLockModule(int people){
        super("Airlockmodule");
        this.people = people;

    }
    public void statusReport(String moduleStatus, boolean isSuccessful) {
        System.out.println("People in Airlock: " + people);
        super.statusReport(moduleStatus, isSuccessful);
    }
}
