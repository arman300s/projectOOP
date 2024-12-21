package projectA;


import java.time.LocalDate;
public class ResearchPaper {
    private String title;
    private Integer citations;
    private Integer pages;
    private String doi;
    private String journal;
    private LocalDate publicationDate;
    private Researcher researcher;
    private ResearchProject researchProject;

    public ResearchPaper(String title, String authors, int citations, int pages, String journal, String doi, LocalDate publicationDate) {
        this.title = title;
        this.citations = citations;
        this.pages = pages;
        this.journal = journal;
        this.doi = doi;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getCitations(Format format) {
        return citations;
    }
    public void setCitations(Integer citations) {
        this.citations = citations;
    }
    public Integer getPages() {
        return pages;
    }
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    public String getDoi() {
        return doi;
    }
    public void setDoi(String doi) {
        this.doi = doi;
    }
    public String getJournal() {
        return journal;
    }
    public void setJournal(String journal) {
        this.journal = journal;
    }
    public LocalDate getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }
    public Researcher getResearcher() {
        return researcher;
    }
    public void setResearcher(Researcher researcher) {
        this.researcher = researcher;
    }
    public ResearchProject getResearchProject() {
        return researchProject;
    }
    public void setResearchProject(ResearchProject researchProject) {
        this.researchProject = researchProject;
    }
}
