package jdharri2.example.com.program2;

import android.view.View;
import android.widget.AdapterView;

/**
 * Created by Joe on 10/13/2017.
 */

public class Monster {
    private int imageResourceId;
    private String name;
    private String description;

    public static final Monster[] monsters = {
            new Monster("Orangeade Rehab",
                    "We know a good thing when we got one. Our original Rehab is killin’ it with drinkers who want something different in an \"energy drink.\"  Something refreshing, great tasting that still gets the job done. \n" +
                            "Rehab Orange combines orange pekoe tea, our proprietary Rehab energy blend and O.J. to deliver a triple threat that quenches thirst, fires you up and is the perfect choice after a hard day’s night.\n" +
                            "Monster Rehab Tea + Orangeade + Energy: RE-FRESH, RE-HYDRATE, RE-VIVE, or in other words, Re-habilitate with a killer mix of tea, O.J., electrolytes, and our bad-ass Monster Rehab energy blend.\n" +
                            "Rehab the Beast!",R.drawable.cappuccino),
            new Monster("Raseberry Rehab",
                    "Here at Monster we’re all about the work hard/play hard mentality and after going all out, we can all use a recharge. Now with Rehab - Raspberry Tea+Energy there’s no reason why bouncing back shouldn’t taste amazing.\n" +
                            "Blending the classic taste of raspberry iced tea with the rejuvenating Rehab energy blend, Rehab Raspberry Energy Iced Tea packs a triple threat that quenches thirst, fires you up, and is the perfect choice after a hard day’s night. \n" +
                            "Rehab Raspberry Tea + Energy: RE-FRESH, RE-HYDRATE, RE-VIVE, or in other words, Re-habilitate with a killer mix of raspberry tea, electrolytes and our bad-ass Monster Rehab energy blend.\n" +
                            "Rehab the Beast!",R.drawable.cappuccino),
            new Monster("Lemonade Rehab",
                    "While chillin' at the Rehab pool party in Vegas, admiring the flesh parade, and pondering the wisdom of doubling down when the dealer shows a face card, it HIT ME!\n" +
                            "We need a new drink, one that can do it all: a triple threat that quenches thirst, fires you up, and is the perfect choice after a hard days night.\n" +
                            "Monster Rehab Tea + Lemonade: RE-FRESH, RE-HYDRATE, RE-VIVE, or in other words, Re-habilitate with a killer mix of tea, lemonade, electrolytes, and our bad-ass Monster Rehab energy blend.",R.drawable.cappuccino),
            new Monster("Peach Rehab",
                    "From Georgia to Vegas, nothing beats the heat and charges you up like Peach Iced Tea, Monster Rehab style.\n" +
                            "Rehab Peach Tea packs a triple threat that quenches thirst, fires you up, and is the perfect choice after a hard day’s night.\n" +
                            "Monster Rehab Peach Tea + Energy: RE-FRESH, RE-HYDRATE, RE-VIVE, or in other words, Re-habilitate with a killer mix of peach tea, electrolytes and our bad-ass Monster Rehab energy blend.",R.drawable.cappuccino),
            new Monster("Pink Lemonade Rehab",
                    "A lot of women think guys who rock a pink shirt are more confident, sensitive and in touch with their feelings. Maybe so, but all we know is pink lemonade mixes super good with tea and our Rehab energy blend.\n" +
                            "Rehab Tea + Pink Lemonade packs a triple threat that quenches thirst, fires you up, and is the perfect choice after a hard day’s night.\n" +
                            "Monster Rehab Tea + Pink Lemonade: RE-FRESH, RE-HYDRATE, RE-VIVE, or in other words, Re-habilitate with a killer mix of tea, pink lemonade, electrolytes, and our bad-ass Monster Rehab energy blend.",R.drawable.cappuccino)
    };

    private Monster(String name, String description,int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}