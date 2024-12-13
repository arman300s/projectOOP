package projectA;

import java.util.Comparator;
import java.util.List;

public abstract class Researcher {
    protected List<ResearchProject> researchProjects;
    protected List<ResearchPaper> researchPapers;

    public abstract void printPapers(Comparator<ResearchPaper> comparator);
    public abstract int calculateHIndex();

    public List<ResearchProject> getResearchProjects() {
        return researchProjects;
    }

    public List<ResearchPaper> getResearchPapers() {
        return researchPapers;
    }
}


