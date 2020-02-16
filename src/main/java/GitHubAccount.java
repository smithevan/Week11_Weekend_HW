import java.util.ArrayList;
import java.util.HashMap;

public class GitHubAccount {

//    private String name;
////    private String description;
////    private RepositoryType repositoryType;
////    private ArrayList<Commit> commits;
////
////    public Repository(String name, String description, RepositoryType repositoryType) {
////        this.name = name;
////        this.description = description;
////        this.repositoryType = repositoryType;
////        this.commits = new ArrayList<Commit>();
////
////    }

    private String username;
    private String name;
    private HashMap<String, Repository> repositories;
    private AccountType accountType;

    public GitHubAccount(String username, String name) {
        this.username = username;
        this.name = name;
//        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
    }


}
