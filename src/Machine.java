public class Machine {
    private IMachineBehavior iMachineBehavior;
    public void setiMachineBehavior(IMachineBehavior iMachineBehavior) {

        this.iMachineBehavior = iMachineBehavior;
    }

    public void performProduct(){
        iMachineBehavior.doProduct();
    }


}
