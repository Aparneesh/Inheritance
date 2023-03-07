public class Mudkip extends Water{
    private boolean dualType = true;
    
    public void genThree(){
        System.out.println("This pokemon is a gen three pokemone");
    }

    public void resistElectric(){
        System.out.println("This pokemon resists electric moves");
    }

    //accesor
    public boolean getDualType(){
        return dualType;
    }

    //mutators
    public void setDualType(boolean d){
        this.dualType = d;
    }
}
