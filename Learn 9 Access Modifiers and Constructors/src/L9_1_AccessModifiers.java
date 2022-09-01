class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class L9_1_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee naruto  = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        naruto.setName("Naruto Uxumaki");
        System.out.println(naruto.getName());
        naruto.setId(77);
        System.out.println(naruto.getId());
    }
}
