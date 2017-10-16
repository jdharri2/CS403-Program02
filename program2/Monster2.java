package jdharri2.example.com.program2;

public class Monster2 {
    private String name;
    private String description;

    public static final Monster2[] monsters = {
            new Monster2("Mean Bean",
                    "No foam, extra hot, half-caf, no-whip, soy latte…Enough of the coffeehouse BS already!\n" +
                            "It’s time to get out of the line and step up to what’s next.\n" +
                            "Java Monster…premium coffee and cream brewed up with killer flavor, supercharged with Monster energy blend. \n" +
                            "Coffee done the Monster way, wide open, with a take no prisoners attitude and the experience and know-how to back it up."),
            new Monster2("Loca Moca",
                    "No foam, extra hot, half-caf, no-whip, soy latte…Enough of the coffeehouse BS already!\n" +
                            "It’s time to get out of the line and step up to what’s next.\n" +
                            "Java Monster…premium coffee and cream brewed up with killer flavor, supercharged with Monster energy blend. \n" +
                            "Coffee done the Monster way, wide open, with a take no prisoners attitude and the experience and know-how to back it up."),
            new Monster2("Kona Blend",
                    "Everyone knows some of the best coffee on the planet comes from the Kona side of the Big Island of Hawaii. No need to trek the slopes of Mauna Loa braddah since we already got some of Pele’s thunder and put it in a can. \n" +
                            "Select Kona beans combined with premium imported coffee, supercharged with our energy blend makes for an unbeatable combination. \n" +
                            "Try Monster’s new Big Island brew it’s just too good to be true."),
            new Monster2("Irish Blend",
                    "No foam, extra hot, half-caf, no-whip, soy latte…Enough of the coffeehouse BS already!\n" +
                            "It’s time to get out of the line and step up to what’s next!\n" +
                            "Java Monster Irish Blend…premium coffee and cream brewed up with authentic Irish flavor, supercharged with Monster energy blend. \n" +
                            "Coffee done the Monster way, wide open, with a take no prisoners attitude and the experience and know-how to back it up."),
            new Monster2("Vanilla Light",
                    "How low can you go?\n" +
                            "Ounce for ounce Java Monster already has way less fat and calories than “Mega Bucks” bottled coffee. So why make Vanilla Light? Because our fearless leader is a health fanatic who counts calories like they’re $100 dollar bills. \n" +
                            "Art vs. Science \n" +
                            "Seriously, making a low calorie coffee + energy drink that tastes good and works, ain’t that easy. Java Monster Vanilla Light sets a new standard for taste and effectiveness."),
            new Monster2("Salted Caramel",
                    "No foam, extra hot, half-caf, no-whip, soy latte…Enough of the coffeehouse BS already!\n" +
                            "It’s time to get out of the line and step up to what’s next.\n" +
                            "Java Monster…premium coffee and cream brewed up with killer flavor, supercharged with Monster energy blend. \n" +
                            "Coffee done the Monster way, wide open, with a take no prisoners attitude and the experience and know-how to back it up.")
    };

    private Monster2(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}