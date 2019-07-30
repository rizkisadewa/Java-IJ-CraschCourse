public class PC {
    private String merekPC;
    private MotherBoard motherBoard;

    public PC(String merekPC, MotherBoard motherBoard){
        this.merekPC = merekPC;
        this.motherBoard = motherBoard;
    }

    public String getMerekPC() {
        return merekPC;
    }

    public void setMerekPC(String merekPC) {
        this.merekPC = merekPC;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
}
