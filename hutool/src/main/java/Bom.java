/**
 * @Author: liangpeng
 * @Date: 2022/3/11 8:05
 */

public class Bom {

    private int id;
    private String msNum;
    private String suNum;
    private String lineNum;
    private String seqNum;
    private String mwo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsNum() {
        return msNum;
    }

    public void setMsNum(String msNum) {
        this.msNum = msNum;
    }

    public String getSuNum() {
        return suNum;
    }

    public void setSuNum(String suNum) {
        this.suNum = suNum;
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public String getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(String seqNum) {
        this.seqNum = seqNum;
    }

    public String getMwo() {
        return mwo;
    }

    public void setMwo(String mwo) {
        this.mwo = mwo;
    }

    public Bom(int id, String msNum, String suNum, String lineNum, String seqNum, String mwo) {
        this.id = id;
        this.msNum = msNum;
        this.suNum = suNum;
        this.lineNum = lineNum;
        this.seqNum = seqNum;
        this.mwo = mwo;
    }


    @Override
    public String toString() {
        return "Bom{" +
                "id=" + id +
                ", msNum='" + msNum + '\'' +
                ", suNum='" + suNum + '\'' +
                ", lineNum='" + lineNum + '\'' +
                ", seqNum='" + seqNum + '\'' +
                ", mwo='" + mwo + '\'' +
                '}';
    }
}
