package Player;

public class Player {
    private String name;
    private int age;
    private boolean male; //true for boy, false for girl
    private Inventory inventory;
    
    public Player(){
        inventory = new Inventory();
    } 
    
    public void setName(String n){
        name = n;
    }
    
    public void setAge(int a){
        age = a;
    }
    
    public void setGender(boolean m){
        male = m;
    }
    
    
}
