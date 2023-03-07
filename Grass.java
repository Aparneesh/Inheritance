public class Grass extends Pokemon{
    private boolean resistWater = true;

    public void weaktoFire(){
        System.out.println("This pokemone is weak to fire");      
    }
    
    public void absorb(){
        System.out.println("This pokemone can use absorb");
    }

    //accesor
    public boolean getResistToWater(){
        return resistWater;
    }

    //mutators
    public void setResistToWater(boolean b){
        this.resistWater = b;
    }

}
