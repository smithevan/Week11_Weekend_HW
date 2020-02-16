import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class TestGitHubAccount {


    private GitHubAccount gitHubAccount;

    @Before
    public void setup() {
        gitHubAccount = new GitHubAccount("FakeUser", "John Doe", AccountType.FREE);
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
    public void testifGitHubAccountHasType() {
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

}
