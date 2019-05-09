public class Kitchen {

    public static void main(String[] args) {
        Pot rondel = new Pot("Pilipiak", 2.5, "Steel", true);

//        rondel.setMake("Pilipiak");
//        rondel.setMaterial("Steel");
//        rondel.setWeight(2.5);
//        rondel.setStainless(true);

        Pot brytfanka = new Pot("Zepter", 10.58, "Ceramics", false);
//        brytfanka.setMake("Zepter");
//        brytfanka.setMaterial("Ceramics");
//        brytfanka.setWeight(10.58);
//        brytfanka.setStainless(false);

        System.out.println(rondel);
        System.out.println(brytfanka);
    }
}
