public class Coder {

    private String name;
    private int id;

    public Coder(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//
//    void code(){
//        System.out.println(name +" is Coding...");
//    }
//    void test(){
//        System.out.println(name +" is testing...");
//    }
}
class Code{

    void code(Coder coder){
        System.out.println(coder.getName() + " is Coding...");
    }
}
class Test{

    void test(Coder coder){
        System.out.println( coder.getName() + " is testing...");
    }
}
