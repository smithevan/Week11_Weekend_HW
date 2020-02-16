import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCommit {

    private Commit commit;

    @Before
    public void before() {
        commit = new Commit("MVP Working", "ER342UUJ");
    }

    @Test
    public void canGetDescription(){
        assertEquals("MVP Working", commit.getDescription());
    }

    @Test
    public void canGetUniqueId(){
        assertEquals("ER342UUJ", commit.getUniqueId());
    }

}
