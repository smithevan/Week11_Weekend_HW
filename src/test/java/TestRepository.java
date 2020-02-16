import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRepository {

    private Repository repository;
    private Repository repository2;
    private Commit commit1;

    @Before
    public void before() {
        repository = new Repository("JavaProject",
                "Card Game",
                RepositoryType.PUBLIC);
        repository2 = new Repository("PrivateProject",
                "Inventory System",
                RepositoryType.PRIVATE);
        commit1 = new Commit ("First Part of MVP working", "553JJHB");
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
    public void testRepositoryHasTypeForPublic(){
        assertEquals(RepositoryType.PUBLIC, repository.getRepositoryType());
    }

    @Test
    public void testRepositoryHasTypeforPrivate(){
        assertEquals(RepositoryType.PRIVATE, repository2.getRepositoryType());
    }

    @Test
    public void testRepositoryStartsEmpty(){
        assertEquals(0, repository.commitCount());
    }

    @Test
    public void testCanAddCommitToRepository(){
        repository.addCommit(commit1);
        assertEquals(1, repository.commitCount());
    }

    @Test

    public void testCanReturnCommit(){
        repository.addCommit(commit1);
        assertEquals(commit1, repository.getCommit());
    }

    @Test
    public void testCanGetCommitByUniqueIdIfIdCorrect(){
        repository.addCommit(commit1);
        assertEquals(commit1, repository.findCommitById(commit1.getUniqueId()));

    }

    @Test
    public void testWillNotReturnAnyCommitIfUniqueIdIncorrect(){
        repository.addCommit(commit1);
        assertEquals(null, repository.findCommitById("34377J"));
    }


}
