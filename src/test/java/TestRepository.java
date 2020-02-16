import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRepository {

    private Repository repository;

    @Before
    public void before() {
        repository = new Repository("JavaProject",
                "Card Game",
                RepositoryType.PUBLIC);
    }

    @Test
    public void testRepositoryHasName() {
        assertEquals("JavaProject", repository.getName());
    }

    @Test
    public void testRepositoryHasDescription(){
        assertEquals("Card Game", repository.getDescription());
    }

    @Test
    public void testRepositoryHasType(){
        assertEquals(RepositoryType.PUBLIC, repository.getRepositoryType());
    }


}
