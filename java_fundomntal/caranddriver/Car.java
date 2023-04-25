class Car{
    private int gas;

    public Car(){
        this.gas=10;
    }
    public int getGas(){
        return this.gas;
    }
    public void status () {
        System.out.println("Gas remaining : "+this.gas);
    }
    public void useGas() {
        gas -= 1;
        if (gas <= 0) {
            System.out.println("Game over!");
        }
    }

    public void useBooster() {
        if (gas >= 3) {
            gas -= 3;
            System.out.println("You use the booster.");
            status();
        } else {
            System.out.println("Not enough gas to use the booster.");
        }
    }

    public void refuel() {
        gas += 2;
        if (gas > 10) {
            gas = 10;
        }
        System.out.println("You refuel the car.");
        status();
    }
}
