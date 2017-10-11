package mobile.mcgrainsoft.com.fiftheditioncompanion.spells.contract;


import java.io.Serializable;
import java.util.List;

public class SpellDTO implements Serializable {

    private Short id;

    private Integer level;

    private Boolean isConcentration;
    private Boolean isRitual;

    private Duration duration;
    private CastingTime castingTime;

    private String name;
    private String school;
    private String page;
    private String range;
    private String materials;
    private String description;
    private String higherLevels;

    private List<String> classes;
    private List<String> subClasses;
    private String components;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getConcentration() {
        return isConcentration;
    }

    public void setConcentration(Boolean concentration) {
        isConcentration = concentration;
    }

    public Boolean getRitual() {
        return isRitual;
    }

    public void setRitual(Boolean ritual) {
        isRitual = ritual;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public CastingTime getCastingTime() {
        return castingTime;
    }

    public void setCastingTime(CastingTime castingTime) {
        this.castingTime = castingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHigherLevels() {
        return higherLevels;
    }

    public void setHigherLevels(String higherLevels) {
        this.higherLevels = higherLevels;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public List<String> getSubClasses() {
        return subClasses;
    }

    public void setSubClasses(List<String> subClasses) {
        this.subClasses = subClasses;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }
}
