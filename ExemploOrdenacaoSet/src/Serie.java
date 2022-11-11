import java.util.Objects;

public class Serie {
    private String name;
    private String genre;
    private Integer epiTime;

    // Constructor

    public Serie(String name, String genre, Integer epiTime) {
        this.name = name;
        this.genre = genre;
        this.epiTime = epiTime;
    }

    // SPecial Methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getEpiTime() {
        return epiTime;
    }

    public void setEpiTime(Integer epiTime) {
        this.epiTime = epiTime;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", epiTime=" + epiTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(name, serie.name) && Objects.equals(genre, serie.genre) && Objects.equals(epiTime, serie.epiTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, epiTime);
    }
}


