import java.util.ArrayList;
import java.util.HashMap;

public class GitHubAccount {


    private String username;
    private String name;
    private HashMap<String, Repository> repositories;
    private AccountType accountType;

    public GitHubAccount(String username, String name, AccountType accountType) {
        this.username = username;
        this.name = name;
        this.accountType = accountType;
        this.repositories = new HashMap<String, Repository>();

    }


    public String getUserName() {
        return username;
    }

    public String getName() {
        return name;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }
}
