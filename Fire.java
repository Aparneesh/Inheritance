public class Fire extends Pokemon{
    private boolean learnFlameThrower = true;


    public void weakToWater(){
        System.out.println("This pokemone is weak to water");
    }

    public void ember(){
        System.out.println("This pokemon uses ember");
    }

    //accesor
    public boolean getLearnFlameThrower(){
        return learnFlameThrower;
    }

    //mutators
    public void setLearnFlameThrower(boolean f){
        this.learnFlameThrower = f;
    }
}
