package solid.antiL;

public class Sub extends Parent {

    @Override
    public String getName() {
        throw new RuntimeException("bad method");
    }
}
