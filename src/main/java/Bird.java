public class Bird {
    void moves(){
        System.out.println("All birds can move");
    };
}

class Crow extends Bird{
    @Override
    void moves(){
        System.out.println("Crows can fly");
    }
}

class Penguins extends Bird{
//    @Override
//    void fly(){
//        throw new RuntimeException();
//    }
    @Override
    void moves(){
        System.out.println("penguins can swim");
    }
}