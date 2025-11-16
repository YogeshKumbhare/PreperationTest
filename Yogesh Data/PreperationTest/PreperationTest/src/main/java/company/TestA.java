package company;


interface I {

    default void a() {

    }

    void b();

}


public class TestA implements I {


    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}


class TestB extends TestA implements I {

    @Override
    public void a() {

    }
}
