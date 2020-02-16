import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class TestGitHubAccount {


    private GitHubAccount gitHubAccount;
    private Repository repository1;
    private Repository repository2;
    private Commit commit1;
    private Commit commit2;
    private Commit commit3;
    private Commit commit4;

    @Before
    public void setup() {
        gitHubAccount = new GitHubAccount("FakeUser", "John Doe", AccountType.FREE);
        repository1 = new Repository("JavaProject", "Card Game", RepositoryType.PUBLIC);
        repository2 = new Repository("Small Project", "Testing Theory", RepositoryType.PUBLIC);
        commit1 = new Commit("Initial State", "JE334VC");
        commit2 = new Commit("Getters Working with TDD", "CWE2289");
        commit3 = new Commit("Adding ENUMS", "CE323UI");
        commit4 = new Commit("Testing How HashMapsWork", "REW343U");
        repository1.addCommit(commit1);
        repository1.addCommit(commit2);
        repository1.addCommit(commit3);
        repository2.addCommit(commit4);

    }

    @Test
    public void testIfGitHubAccountHasUsername() {
        assertEquals("FakeUser", gitHubAccount.getUserName());
    }

    @Test
    public void testIfGitHubAccountHasName() {
        assertEquals("John Doe", gitHubAccount.getName());
    }

    @Test
    public void testIfGitHubAccountHasType() {
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

    @Test
    public void testIfRepositoriesStartsAtZero() {
        assertEquals(0, gitHubAccount.repositoriesCount());
    }

    @Test
    public void testCanAddRepositories() {
        gitHubAccount.addRepository(repository1);
        assertEquals(1, gitHubAccount.repositoriesCount());
    }

    @Test
    public void testCanSearchForRepositoriesByName() {
        gitHubAccount.addRepository(repository1);
        assertEquals(repository1, gitHubAccount.findRepository(repository1.getName()));
    }

    @Test
    public void testAccountTypeStartsFree(){
        gitHubAccount.upgradeAccount();
        assertEquals(AccountType.PRO, gitHubAccount.getAccountType());
    }

    @Test
    public void testCanGetRepositoryWithLargestNumberOfCommits(){
        gitHubAccount.addRepository(repository1);
        gitHubAccount.addRepository(repository2);
        assertEquals(repository1, gitHubAccount.findLargestCommits());
    }




}
