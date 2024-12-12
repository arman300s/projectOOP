package projectA;


import java.util.ArrayList;
import java.util.List;

/**
 * @generated
 */
public class ResearchProject {
    private String topic;
    private List<ResearchPaper> publishedPapers;
    private List<Reseacrher> participants;
    private Researcher researcher;
    private ResearchPaper researchPaper;

    public ResearchProject(String topic) {
        this.topic = topic;
        this.publishedPapers = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public void addParticipant(Researcher researcher) {
        participants.add(researcher);
    }

    public void removeParticipant(Researcher researcher) {
        participants.remove(researcher);
    }

    public void addPublishedPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
    }
}

