import java.util.ArrayList;
import java.util.HashMap;

public class GitHubAccount {


    private String username;
    private String name;
    private ArrayList<Repository> repositories;
    private AccountType accountType;

    public GitHubAccount(String username, String name, AccountType accountType) {
        this.username = username;
        this.name = name;
        this.accountType = accountType;
        this.repositories = new ArrayList<Repository>();

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


    public int repositoriesCount() {
        return this.repositories.size();
    }

    public void addRepository(Repository repository) {
        this.repositories.add(repository);
    }

    public Repository findRepository(String repositoryName) {
        for (int i = 0; i < repositories.size(); i++) {
            if (repositories.get(i).getName() == repositoryName)
                return repositories.get(i);
        }
        return null;
    }
}
