public class Tester {

    public static void main(String[] args) {
        PC pc = new PC("ASUS", new MotherBoard("ATX"));

        System.out.println(pc.getMerekPC());
        System.out.println(pc.getMotherBoard().getTipeMotherBoard());
    }
}
