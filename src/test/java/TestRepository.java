import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRepository {

    private Repository repository;
    private Repository repository2;
    private Commit commit1;
    private Commit commit2;
    private Commit commit3;
    private Commit commit4;


    @Before
    public void before() {
        repository = new Repository("JavaProject",
                "Card Game",
                RepositoryType.PUBLIC);
        repository2 = new Repository("PrivateProject",
                "Inventory System",
                RepositoryType.PRIVATE);
        commit1 = new Commit ("First Part of MVP working", "553JJHB");
        commit2 = new Commit("Getters Working with TDD", "CWE2289");
        commit3 = new Commit("Adding ENUMS", "CE323UI");
        commit4 = new Commit("Testing How HashMapsWork", "REW343U");

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

//    @Test
//    public void testCanRollBackRepository(){
//        repository.addCommit(commit1);
//        repository.addCommit(commit2);
//        repository.addCommit(commit3);
//        repository.addCommit(commit4);
//        repository.revert(commit2.getUniqueId());
//        assertEquals(repository );
//    }


//
//    Arrange: [commit1, commit2, commit3]
//    Act: repo.revert(commit2uniqueId)
//    Assert: Expected = [commit1, commit2]



}
