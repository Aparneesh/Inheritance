public class Charmander extends Fire{
    private boolean isLizard = true;

    public void genOne(){
        System.out.println("This pokemon is a gen one pokemon");
    }

    public void growl(){
        System.out.println("GROWL");
    }

    public void cute(){
        System.out.println("This pokemon isn't cute anymore. It's angry. >:( ");
    }

    //accesor
    public boolean getIsLizard(){
        return isLizard;
    }

    //mutators
    public void setIsLizard(boolean l){
        this.isLizard = l;
    }
}
