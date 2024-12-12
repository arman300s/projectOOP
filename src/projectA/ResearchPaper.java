package projectA;


import java.time.LocalDate;
public class ResearchPaper {
    private String title;
    private String authors;
    private Integer citations;
    private Integer pages;
    private String doi;
    private String journal;
    private LocalDate publicationDate;
    private Researcher researcher;
    private ResearchProject researchProject;

    public ResearchPaper(String title, String authors, int citations, int pages, String journal, String doi, LocalDate publicationDate) {
        this.title = title;
        this.authors = authors;
        this.citations = citations;
        this.pages = pages;
        this.journal = journal;
        this.doi = doi;
        this.publicationDate = publicationDate;
    }

    public String getCitation(String format) {
        if ("Plain Text".equalsIgnoreCase(format)) {
            return authors + ". " + title + ". " + journal + ", " + publicationDate.getYear() + ".";
        } else if ("BibTeX".equalsIgnoreCase(format)) {
            return "@article{" + doi + ",\n  title={" + title + "},\n  author={" + authors + "},\n  journal={" + journal + "},\n  year={" + publicationDate.getYear() + "}\n}";
        }
        return "Invalid format";
    }
}
