import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCommit {

//    private Bear bear;
//    private Salmon salmon;
//    private River river;
//
//    @Before
//    public void before(){
//        bear = new Bear("Baloo");
//        salmon = new Salmon();
//        river = new River();
//        river.addFish(salmon);
//    }
//
//    @Test
//    public void bellyStartsEmpty(){
//        assertEquals(0, bear.foodCount());
//    }

    private Commit commit;

    @Before
    public void before() {
        commit = new Commit("MVP Working", "ER342UUJ");
    }

    @Test
    public void canGetDescription(){
        assertEquals("MVP Working", commit.getDescription());
    }

}
