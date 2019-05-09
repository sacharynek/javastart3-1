public class Kitchen {

    public static void main(String[] args) {
        Pot rondel = new Pot();

        rondel.setMake("Pilipiak");
        rondel.setMaterial("Steel");
        rondel.setWeight(2.5);
        rondel.setStainless(true);

        Pot brytfanka = new Pot();
        brytfanka.setMake("Zepter");
        brytfanka.setMaterial("Ceramics");
        brytfanka.setWeight(10.58);
        brytfanka.setStainless(false);

        System.out.println(rondel);
        System.out.println(brytfanka);
    }
}
