public class Symptom {
    private boolean fever;
    private boolean cough;
    private boolean difficultyBreathing;
    private boolean tiredness;
    private boolean aches;
    private boolean chills;
    private boolean soreThroat;
    private boolean noSmell;
    private boolean noTaste;
    private boolean headache;
    private boolean diarrhea;
    private boolean vomiting;

    Symptom(){};

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isDifficultyBreathing() {
        return difficultyBreathing;
    }

    public void setDifficultyBreathing(boolean difficultyBreathing) {
        this.difficultyBreathing = difficultyBreathing;
    }

    public boolean isTiredness() {
        return tiredness;
    }

    public void setTiredness(boolean tiredness) {
        this.tiredness = tiredness;
    }

    public boolean isAches() {
        return aches;
    }

    public void setAches(boolean aches) {
        this.aches = aches;
    }

    public boolean isChills() {
        return chills;
    }

    public void setChills(boolean chills) {
        this.chills = chills;
    }

    public boolean isSoreThroat() {
        return soreThroat;
    }

    public void setSoreThroat(boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    public boolean isNoSmell() {
        return noSmell;
    }

    public void setNoSmell(boolean noSmell) {
        this.noSmell = noSmell;
    }

    public boolean isNoTaste() {
        return noTaste;
    }

    public void setNoTaste(boolean noTaste) {
        this.noTaste = noTaste;
    }

    public boolean isHeadache() {
        return headache;
    }

    public void setHeadache(boolean headache) {
        this.headache = headache;
    }

    public boolean isDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public boolean isVomiting() {
        return vomiting;
    }

    public void setVomiting(boolean vomiting) {
        this.vomiting = vomiting;
    }
}
