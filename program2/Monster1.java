package jdharri2.example.com.program2;

import android.view.View;
import android.widget.AdapterView;

/**
 * Created by Joe on 10/13/2017.
 */

public class Monster1 {
    private String name;
    private String description;

    public static final Monster1[] monsters = {
            new Monster1("Monster Energy",
                    "Tear into a can of the meanest energy drink on the planet, Monster Energy.\n" +
                            "It`s the ideal combo of the right ingredients in the right proportion to deliver the big bad buzz that only Monster can.\n" +
                            "Monster packs a powerful punch but has a smooth easy drinking flavor.\n" +
                            "Athletes, musicians, anarchists, co-ed’s, road warriors, metal heads, geeks, hipsters, and bikers dig it- you will too. "),
            new Monster1("Monster Energy - Low Carb",
                    "Tear into a can of the meanest energy drink on the planet, Lo-carb Monster Energy.\n" +
                            "Low calories, no compromise. That’s what Lo-carb Monster Energy is all about.\n" +
                            "Get the big bad Monster buzz you know and love, but with a fraction of the calories and carbohydrates.\n" +
                            "Athletes, musicians, anarchists, co-ed’s, road warriors, metal heads, geeks, hipsters, and bikers dig it- you will too. "),
            new Monster1("Monster Energy - Absolute Zero",
                    "WPeople have been blowin’ up our inbox for years asking for a zero calorie Monster. We got it, but this ain’t soda pop, dude!\n" +
                            "Making a zero calorie, zero sugar drink, that’s good enough to earn the Monster M ain’t that easy.\n" +
                            "Finally with a re-tooled energy blend, new sweetener system and after hundreds of failed flavors, we absolutely got it right!\n" +
                            "Monster Absolutely Zero: helps fight fatigue, improve mental performance and focus, and motivates you to work ( I mean play ) harder, so generally you feel pretty damn good.\n" +
                            "Zero calories, zero sugar, Monster buzz…"),
            new Monster1("Monster Energy - Import",
                    "From Georgia to Vegas, nothing beats the heat and charges you up like Peach Iced Tea, Monster Rehab style.\n" +
                            "Rehab Peach Tea packs a triple threat that quenches thirst, fires you up, and is the perfect choice after a hard day’s night.\n" +
                            "Monster Rehab Peach Tea + Energy: RE-FRESH, RE-HYDRATE, RE-VIVE, or in other words, Re-habilitate with a killer mix of peach tea, electrolytes and our bad-ass Monster Rehab energy blend."),
            new Monster1("Monster Energy - Ubermonster",
                    "Uber: [oo-ber} From the German, meaning superior, above the norm, or the ultimate.\n" +
                            "UberMonster [ oo-ber-mon-stir] The ultimate energy brew from Monster. Produced using proprietary German brewing technology which converts malt sugar into organic acids.  The resulting “Bio-Activated” energy brew has a clean, crisp taste without any alcohol.\n" +
                            "Cheers, this energy brew’s for you!"),
            new Monster1("Monster Energy - Assault",
                    "At Monster we don’t get too hung up on politics. We’re not for “the War”, against “the War” or any war for that matter.\n" +
                            "We put the “camo” pattern on our new Monster Assault can because we think it looks cool. Plus it helps fire us up to fight the big multi-national companies who dominate the beverage business.\n" +
                            "We’ll leave politics to the politicians and just keep doing what we do best – make the meanest energy drinks on the planet!\n" +
                            "Declare war on the ordinary! Grab a Monster Assault and Viva La Revolution!"),
            new Monster1("Monster Energy - Gronk",
                    "Rob Gronkowski he`s a Beast on the football field and a Party Animal in the offseason. In other words, he`s a Monster kind of guy.\n" +
                            " \n" +
                            "Who better to partner with on our latest all pro creation.. GRONK.\n" +
                            " \n" +
                            "We re-engineered the flavor and added our tried and true energy blend to deliver the big bad buzz only Monster can.")
    };

    private Monster1(String name, String description) {
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