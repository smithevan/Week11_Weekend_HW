import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepositoryType repositoryType;
    private ArrayList<Commit> commits;

    public Repository(String name, String description, RepositoryType repositoryType) {
        this.name = name;
        this.description = description;
        this.repositoryType = repositoryType;
        this.commits = new ArrayList<Commit>();

    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public RepositoryType getRepositoryType() {
        return repositoryType;
    }

    public int commitCount() {
        return this.commits.size();
    }

    public void addCommit(Commit commit) {
        this.commits.add(commit);
    }

    public Commit getCommit() {
        Commit commit = commits.get(0);
        return commit;
    }

    public Commit findCommitById(String uniqueId) {
        for (int i = 0; i < commits.size(); i++) {
            if (commits.get(i).getUniqueId() == uniqueId)
                return commits.get(i);
        }
        return null;

    }
}


