package epam.cargo_project.domain.common;

public class CommonObjects {
    private final static long INCREMENT = 10;

    public void printAll(Object object) {
        System.out.println(object);
        if (object instanceof Cargo){
//            ....
        }
    }
}