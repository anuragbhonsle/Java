class employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is is "+ name);
    }
}
public class L8_1_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee student1 = new employee();
        employee student2 = new employee();
        student1.id = 1;
        student1.name = "Ayanokoji Kiyotaka";
        student2.id = 2;
        student2.name = "Horikita Suzune";
        student1.printdetails();
        student2.printdetails();
    }
}