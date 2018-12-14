package homework.lesson9.task1_2;

public class AcessToVariables {
    private String veriablesPriv;
    public String veriablesPubl;
    protected String veriablesProtect;
    String veriablesDef;

    public AcessToVariables() {
        this.veriablesPriv = veriablesPriv;
        this.veriablesPubl = veriablesPubl;
        this.veriablesProtect = veriablesProtect;
        this.veriablesDef = veriablesDef;
    }

    public String getVeriablesPriv() {
        return veriablesPriv;
    }

    public void setVeriablesPriv(String veriablesPriv) {
        this.veriablesPriv = veriablesPriv;
    }

    public void setVeriablesDef(String veriablesDef) {
        this.veriablesDef = veriablesDef;
    }

    public String getVeriablesPubl() {
        return veriablesPubl;
    }

    public void setVeriablesPubl(String veriablesPubl) {
        this.veriablesPubl = veriablesPubl;
    }

    public String getVeriablesProtect() {
        return veriablesProtect;
    }

    public void setVeriablesProtect(String veriablesProtect) {
        this.veriablesProtect = veriablesProtect;
    }

    public String getVeriablesDef() {
        return veriablesDef;
    }

}
