package edu.unc.comp210.a02mothership;

public abstract class FuelGenerator extends APowerGenerator {
    private int fuel;

    public FuelGenerator(int fuel){
        super("Fuel Generator");
        this.fuel=fuel;
    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful) {
        super.statusReport(moduleStatus, isSuccessful);
        System.out.println(getName()+ ": "  + fuel + " units of fuel remaining.");


    }
    public int generatePower(){
        if(fuel >=10){
            fuel = fuel - 10;
            return 10;
        } else if (fuel<10&&fuel>0){
            int leftoverfuel = fuel;
            fuel = 0;
            return leftoverfuel;
        }
         else{
            int leftoverfuel = fuel;
            return 0;
        }

    }
}
