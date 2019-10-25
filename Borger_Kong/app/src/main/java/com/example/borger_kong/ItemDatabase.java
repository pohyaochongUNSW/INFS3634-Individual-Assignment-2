package com.example.borger_kong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ItemDatabase {

    private static final HashMap<Integer, Item> items = new HashMap<>();

    public static Item getItemById(int itemID) {
        return items.get(itemID);
    }

    public static ArrayList<Item> getAllItems() {
        return new ArrayList<Item>((List) Arrays.asList(items.values().toArray()));
    }

    static {
        items.put(1, new Item(
                1,
                "Original Chicken Burger",
                7.99,
                R.drawable.original_chicken,
                "660\n" +
                        "40\n" +
                        "7\n" +
                        "0\n" +
                        "75\n" +
                        "1170\n" +
                        "48\n" +
                        "2\n" +
                        "5\n" +
                        "28",
                "Our Original Chicken Sandwich is made with white meat chicken, lightly breaded and topped with a simple combination of shredded lettuce and creamy mayonnaise on a sesame seed bun.",
                "Lettuce, Crispy Chicken Patty, Toasted Hoagie Bun, Mayonnaise.",
                "Egg, Milk, Soy, Wheat.\nPrepared in fryer used for products containing wheat.",
                "So good, we've been serving it since 1979."
        ));

        items.put(2, new Item(
                2,
                "Big Fish Burger",
                7.99,
                R.drawable.big_fish,
                "510\n" +
                        "28\n" +
                        "4.5\n" +
                        "0\n" +
                        "30\n" +
                        "1180\n" +
                        "51\n" +
                        "2\n" +
                        "7\n" +
                        "16",
                "Our premium Big Fish Sandwich is 100% White Alaskan Pollock, breaded with crispy panko breading and topped with sweet tartar sauce, tangy pickles, all on top of a toasted brioche-style bun.",
                "Pickles, Brioche Style Bun, Lettuce, Tartar Sauce, Premium Alaskan Fish Patty.",
                "Egg, Fish, Milk, Soy, Wheat.\nPrepared in fryer used for products containing wheat.",
                "A delicious golden-crisp catch."
        ));

        items.put(3, new Item(
                3,
                "Cheese Burger",
                7.99,
                R.drawable.cheese_burger,
                "280\n" +
                        "13\n" +
                        "6\n" +
                        "0.5\n" +
                        "45\n" +
                        "560\n" +
                        "27\n" +
                        "less than 1\n" +
                        "7\n" +
                        "15",
                "You can’t go wrong with our cheeseburger, a signature flame-grilled. beef patty topped with a simple layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                "Beef Patty, American Cheese, Pickles, Sesame Seed Bun, Ketchup, Mustard.",
                "Milk, Soy, Wheat.\nPrepared on equipment used for products that cointain soy.",
                "Classic ingredients flavored just right"
        ));

        items.put(4, new Item(
                4,
                "Impossible Whopper Burger",
                10.99,
                R.drawable.impossible_whopper_burger,
                "630\n" +
                        "34\n" +
                        "11\n" +
                        "0\n" +
                        "10\n" +
                        "1080\n" +
                        "58\n" +
                        "4\n" +
                        "12\n" +
                        "25",
                "Our Impossible WHOPPER Burger features a savory flame-grilled patty made from plants topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun. 100% WHOPPER, 0% Beef.",
                "Impossible Whopper Patty, Mayonnaise, Onions, Tomatoes, Lettuce, Ketchup, Pickles, Sesame Seed Bun.",
                "Egg, Soy, Wheat.\nPrepared on equipment used for productss that contain soy.",
                "100% Whopper, 0% beef."
        ));

        items.put(5, new Item(
                5,
                "Quarter Pound King Burger",
                10.99,
                R.drawable.quarter_pound_king_burger,
                "580\n" +
                        "29\n" +
                        "13\n" +
                        "1.5\n" +
                        "105\n" +
                        "1310\n" +
                        "49\n" +
                        "2\n" +
                        "10\n" +
                        "32",
                "Our Quarter Pound KING Burger has over ¼ lb. of flame-grilled 100% beef, topped with all of our classic favorites: American cheese, freshly sliced onions, zesty pickles, ketchup, & mustard all on a toasted sesame seed bun.",
                "WHOPPER Beef Patty with Seasoning, Mustard, American Cheese, Onions, Ketchup, Pickles, Sesame Seed Bun",
                "Milk, Soy, Wheat.\nPrepared on equipment used for products that contain soy.",
                "Flame-grilled to perfection."
        ));

        items.put(6, new Item(
                6,
                "Hamburger",
                7.99,
                R.drawable.hamburger,
                "240\n" +
                        "10\n" +
                        "3.5\n" +
                        "0.5\n" +
                        "35\n" +
                        "380\n" +
                        "26\n" +
                        "less than 1\n" +
                        "6\n" +
                        "13",
                "Try our Hamburger, a signature flame-grilled. beef patty topped with a simple layer of crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                "Beef Patty, Sesame Seed Bun, Pickles, Ketchup, Mustard.",
                "Soy, Wheat.\nPrepared on equipment used for products that contain soy.",
                "Juicy & Superbly tasty."

        ));

        items.put(7, new Item(
                7,
                "Pretzel Bacon Burger",
                9.99,
                R.drawable.pretzel_bacon_burger,
                "920\n" +
                        "60\n" +
                        "18\n" +
                        "2\n" +
                        "135\n" +
                        "1930\n" +
                        "55\n" +
                        "2\n" +
                        "2\n" +
                        "39",
                "Our PRETZEL BACON BURGER features one ¼ lb. of savory flame-grilled 100% beef patties, topped with smoky bacon, melted American cheese, tangy mustard and creamy mayonnaise all on a toasted pretzel bun.",
                "Pretzel Bun, Beef Patty, Salt & Pepper Seasoning, American Cheese, Bacon, Mustard, Mayonnaise.",
                "Egg, Milk, Soy, Wheat.",
                "Big in flame-grilled flavor."
        ));
        items.put(8, new Item(
                8,
                "Triple Stacker Burger",
                12.99,
                R.drawable.triple_stacker_burger,
                "1370\n" +
                        "93\n" +
                        "40\n" +
                        "5\n" +
                        "340\n" +
                        "2300\n" +
                        "51\n" +
                        "1\n" +
                        "11\n" +
                        "85\n",
                        "Our Triple STACKER BURGER features more than ¾ lb. of savory flame-grilled 100% beef, topped with smoky bacon, melted American cheese and our special Stacker sauce all on a toasted sesame bun.",
                "Beef Patty x 3, Bacon, Stacker Sauce, Salt & Pepper Seasoning, " +
                                "American Cheese x3, Sesame Seed Bun.",
                "Egg, Milk, Soy, Wheat.",
                "Stack it up."
        ));

        items.put(9, new Item(
                9,
                "Crispy Chicken Caesar Burger",
                9.99,
                R.drawable.crispy_chicken_caesar_burger,
                "810\n" +
                        "50\n" +
                        "12\n" +
                        "0\n" +
                        "95\n" +
                        "1990\n" +
                        "56\n" +
                        "2\n" +
                        "8\n" +
                        "34\n",
                "Our New CRISPY CHICKEN CAESAR BURGER is made with 100% white meat seasoned chicken filet, battered and breaded, and carefully layered with fresh lettuce, ripe tomato, creamy Caesar sauce, bacon, and shaved parmesan cheese all on a potato bun.",
                "Caesar Sauce, Lettuce, Parmesan Cheese, Crispy Chicken Patty, " +
                        "Potato Bun, Tomatoes, Bacon.",
                "Egg, Fish, Milk, Soy, Wheat.",
                "Caesar, but make it a burger."
        ));

        items.put(10, new Item(
                10,
                "Bacon King Burger",
                9.99,
                R.drawable.bacon_king_burger,
                "570\n" +
                        "38\n" +
                        "15\n" +
                        "1.5\n" +
                        "115\n" +
                        "1050\n" +
                        "27\n" +
                        "less than 1\n" +
                        "6\n" +
                        "29",
                "Introducing the BACON KING BURGER, smaller package, same BIG taste. Two flame–grilled 100% beef patties topped with thick-cut smoked bacon, melted American cheese, ketchup and creamy mayonnaise on a toasted sesame seed bun.",
                "Beef Patty, America Cheese, Sesame Seed Bun, Mayonnaise, Bacon, Ketchup.",
                "Egg, Milk, Soy, Wheat.",
                "Big in flame-grilled flavor."
        ));

        items.put(11, new Item(
                11,
                "Rodeo Crispy Chicken Burger",
                10.99,
                R.drawable.rodeo_crispy_chicken_burger,
                "960\n" +
                        "60\n" +
                        "15\n" +
                        "1\n" +
                        "105\n" +
                        "2230\n" +
                        "72\n" +
                        "3\n" +
                        "14\n" +
                        "33",
                "The RODEO CRISPY CHICKEN BURGER is made with our breaded 100% white meat seasoned chicken filet, topped with 3 half-strips of thick-cut smoked bacon, crispy onion rings, tangy BBQ sauce, creamy mayonnaise and American Cheese all on our potato bun.",
                "Onion Rings, American Cheese, Crispy Chicken Patty, BBQ Sauce, " +
                        "Mayonnaise, Bacon, Potato Bun.",
                "Egg, Milk, Soy, Wheat.",
                "Crispy on the outside, juicy on the inside."
        ));

        items.put(12, new Item(
                12,
                "Crispy Taco",
                10.99,
                R.drawable.crispy_taco,
                "170\n" +
                        "9\n" +
                        "3\n" +
                        "0\n" +
                        "10\n" +
                        "360\n" +
                        "19\n" +
                        "2\n" +
                        "1\n" +
                        "5",
                "Introducing the Crispy Taco featuring a crispy, crunchy tortilla, filled with delicious, seasoned beef, shredded cheddar cheese and lettuce, all topped with just the right amount of our savory taco sauce.",
                "Lettuce, Shredded Cheese, Taco Sauce, Beef Taco",
                "Egg, Milk, Soy, Wheat.",
                "Crunchy tortillas and seasoned beef."
        ));

        items.put(13, new Item(
                13,
                "Chicken Nuggets 20 Pcs",
                9.99,
                R.drawable.chicken_nuggets,
                "860\n" +
                        "54\n" +
                        "9\n" +
                        "0\n" +
                        "115\n" +
                        "1570\n" +
                        "53\n" +
                        "3\n" +
                        "less than 1\n" +
                        "39",
                "Made with white meat, our bite-sized Chicken Nuggets are tender and juicy on the inside and crispy on the outside. Coated in a homestyle seasoned breading, they are perfect for dipping in any of our delicious dipping sauces.",
                "Chicken",
                "Wheat.",
                "Small bites of big flavor."
        ));

        items.put(14, new Item(
                14,
                "Chicken Fries",
                7.99,
                R.drawable.chicken_fries,
                "290\n" +
                        "17\n" +
                        "2.5\n" +
                        "0\n" +
                        "35\n" +
                        "850\n" +
                        "20\n" +
                        "1\n" +
                        "less than 1\n" +
                        "13",
                "Made with white meat chicken, our Chicken Fries are coated in a light crispy breading seasoned with savory spices and herbs. Chicken Fries are shaped like fries and are perfect to dip in any of our delicious dipping sauces. Choose from BBQ, Honey Mustard, Ranch, Zesty, Buffalo and Sweet & Sour.",
                "Chicken Fries",
                "Wheat.\nPrepared in fryer used for products containing wheat.",
                "A fan favorite."
        ));

        items.put(15, new Item(
                15,
                "French Fries",
                3.99,
                R.drawable.french_fries,
                "380\n" +
                        "17\n" +
                        "3\n" +
                        "0\n" +
                        "0\n" +
                        "570\n" +
                        "53\n" +
                        "4\n" +
                        "0\n" +
                        "5\n",
                "More delicious than ever, our signature piping hot, thick cut Salted French Fries are golden on the outside and fluffy on the inside.",
                "Potato",
                "Prepared in fryer used for products containing wheat and milk.",
                "Hot, thick & crispy."
        ));

        items.put(16, new Item(
                16,
                "Crispy Chicken Club Salad",
                10.99,
                R.drawable.chicken_club_salad,
                "710\n" +
                        "51\n" +
                        "13\n" +
                        "0\n" +
                        "110\n" +
                        "1820\n" +
                        "33\n" +
                        "3\n" +
                        "6\n" +
                        "32",
                "Our Crispy Chicken Club Salad is a mix of crispy green romaine, green leaf and radicchio lettuce, thick-cut smoked bacon pieces, shredded cheddar cheese, juicy-ripened tomatoes, and buttery garlic croutons.",
                "Green Romaine, Green Leaf, Radicchio Lettuce, Thick-cut Smoked Bacon, Shredded Cheddar Cheese, Tomatoes, Garlic Croutons, Crispy Chicken.",
                "Prepared in fryer used for productss containing wheat.",
                "Refreshing & tasty!"
        ));

        items.put(17, new Item(
                17,
                "Garden Salad",
                6.99,
                R.drawable.garden_salad,
                "60\n" +
                        "4\n" +
                        "2.5\n" +
                        "0\n" +
                        "10\n" +
                        "95\n" +
                        "3\n" +
                        "1\n" +
                        "2\n" +
                        "4",
                "Our Garden Side Salad is a blend of premium lettuces garnished with juicy tomatoes, home-style croutons, a three-cheese medley, and your choice of KEN’S® salad dressing. Nutrition Information does not reflect home-style croutons or KEN’S salad dressing.",
                "Shredded Cheese, Lettuce, Tometoes.",
                "Milk",
                "Mixed greens garnished fresh."
        ));

        items.put(18, new Item(
                18,
                "Egg-Normous Burrito",
                9.99,
                R.drawable.egg_normous_burrito,
                "930\n" +
                        "57\n" +
                        "17\n" +
                        "0.5\n" +
                        "330\n" +
                        "2110\n" +
                        "69\n" +
                        "6\n" +
                        "7\n" +
                        "35\n",
                "Featuring a generous serving of savory sausage, thick-cut smoked bacon, lots of fluffy eggs, shredded cheddar cheese, golden hash browns, plus a creamy spicy sauce all wrapped up in a warm flour tortilla and served with a side of Picante Sauce.",
                "Eggs, Tortilla, Hash Browns, Creamy Spicy Sauce, Sausage, Bacon, Shredded Cheese.",
                "Egg, Milk, Soy, Wheat.\nPrepared in fryer used for products containing wheat.",
                "Wake Up on the Right Side."
        ));

        items.put(19, new Item(
               19,
               "Pancakes & Sausage Platter",
               12.99,
               R.drawable.pancake_sausage_platter,
               "610\n" +
                       "31\n" +
                       "9\n" +
                       "0\n" +
                       "80\n" +
                       "1010\n" +
                       "72\n" +
                       "1\n" +
                       "30\n" +
                       "12",
                    "Fresh from the kitchen, our Pancakes & Sausage Platter is served with three fluffy pancakes drizzled in sweet syrup and a side of savory sizzling sausage.",
                    "Butter Blend, Sausage, Breakfast Syrup, Pancake.",
                    "Egg, Milk, Soy, Wheat.\nPrepared in fryer used for products containing wheat.",
                    "A classic breakfast staple."
        ));

        items.put(20, new Item(
                20,
                "Vanilla Soft Serve",
                1.49,
                R.drawable.vanilla_soft_serve,
                "140\n" +
                        "4\n" +
                        "3\n" +
                        "0\n" +
                        "15\n" +
                        "100\n" +
                        "24\n" +
                        "0\n" +
                        "17\n" +
                        "3",
                "We didn’t invent soft serve, but with one taste of our cool, creamy, and velvety Vanilla Soft Serve, you’ll think we perfected it. Your choice of classic cone or cup.",
                "Vanilla Soft Serve, Ice Cream Cone",
                "Milk, Soy, Wheat",
                "A simply sweet & classic treat."
        ));

        items.put(21, new Item(
                21,
                "Coca-Cola®",
                2.99,
                R.drawable.coca_cola,
                "380\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "10\n" +
                        "102\n" +
                        "0\n" +
                        "102\n" +
                        "0",
                "Perfect with any meal,enjoy the genuine taste of Coca-Cola®.\n" +
                        "© The Coca-Cola Company. \"Coca-Cola\" is a registered trademark of The Coca-Cola Company.",
                "40 Ounce Coca-Cola®, Ice",
                "-",
                "Uplifting refreshment."
        ));

        items.put(22, new Item(
                22,
                "Diet Coke®",
                2.99,
                R.drawable.diet_coke,
                "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "35\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0",
                "Try a crisp and refreshing no-calorie Diet Coke®.\n" +
                        "\n" +
                        "© The Coca-Cola Company. \"Diet Coke\" is a registered trademark of The Coca-Cola Company.",
                "40 Ounce Diet Coke®",
                "-",
                "Stay Extraordinary."
        ));

        items.put(23, new Item(
                23,
                "Sprite®",
                2.99,
                R.drawable.sprite,
                "380\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "85\n" +
                        "102\n" +
                        "0\n" +
                        "102\n" +
                        "0",
                "Let Sprite® refresh your day with the great taste of lemon-lime.\n" +
                        "\n" +
                        "© The Coca-Cola Company. \"Sprite\" is a registered trademark of The Coca-Cola Company.",
                "40 Ounce Sprite®",
                "-",
                "Clear, crisp & no caffeine"

        ));

        items.put(24, new Item(
                24,
                "Frozen Coke®",
                2.99,
                R.drawable.frozen_coke,
                "130\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "50\n" +
                        "35\n" +
                        "0\n" +
                        "35\n" +
                        "0",
                "Cool down with a Frozen Coke® any time of the year.\n" +
                        "\n" +
                        "© The Coca-Cola Company. \"Coke\" is a registered trademark of The Coca-Cola Company.\n",
                "Frozen Coke®",
                "-",
                "Enjoy Frozen Coke®"
        ));

        items.put(25, new Item(
                25,
                "Coffee",
                1.99,
                R.drawable.coffee,
                "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0",
                "Our Coffee blend is made with 100% Arabica beans and freshly brewed to deliver perfectly balanced flavor in every cup.",
                "Arabica Coffee.",
                "-",
                "Refuel & rebalance."
        ));

        items.put(26, new Item(
                26,
                "Chocolate Chip Cookies",
                1.99,
                R.drawable.chocolate_chip_cookie,
                "160\n" +
                        "8\n" +
                        "4\n" +
                        "0\n" +
                        "10\n" +
                        "125\n" +
                        "24\n" +
                        "less than 1\n" +
                        "15\n" +
                        "2",
                "Our delicious Chocolate Chip Cookie is loaded with ,melty chocolate chips and baked to perfection.",
                "Chocolate Chip Cookie x 2",
                "Egg, Milk, Soy, Wheat",
                "Baked to perfection."
        ));

        items.put(27, new Item(
                27,
                "Dutch Apple Pie",
                5.99,
                R.drawable.apple_pie,
                "340\n," +
                        "14\n" +
                        "6\n" +
                        "0\n" +
                        "0\n" +
                        "310\n" +
                        "51\n" +
                        "1\n" +
                        "25\n" +
                        "3",
                "A gooey apple filling enveloped by a flaky pastry crust, our Dutch Apple Pie is served to you warm right out of the kitchen.",
                "Dutch Apple Pie",
                "Soy, Wheat",
                "Savory, sweet & crumbly"
        ));

        items.put(28, new Item(
                28,
                "Hershey's Sundae Pie",
                6.99,
                R.drawable.hershey_sundae_pie,
                "310\n" +
                        "19\n" +
                        "12\n" +
                        "0\n" +
                        "10\n" +
                        "220\n" +
                        "32\n" +
                        "less than 1\n" +
                        "22\n" +
                        "3",
                "Say hello to our HERSHEY’S Sundae Pie. One part crunchy chocolate crust and one part chocolate crème filling, garnished with a delicious topping and real HERSHEY’S Chocolate Chips.\n" +
                        "\n" +
                        "The HERSHEY’S trademark is used under license.\n",
                "Hershey's Sundae Pie",
                "Milk, Soy, Wheat.",
                "Chock-full of chocolate."
        ));

        items.put(29, new Item(
                29,
                "Pie made with TWIX®",
                6.99,
                R.drawable.pie_made_with_twix,
                "370\n" +
                        "20\n" +
                        "13\n" +
                        "0\n" +
                        "10\n" +
                        "330\n" +
                        "45\n" +
                        "less than 1\n" +
                        "30\n" +
                        "4",
                "Pie made with TWIX® features a creamy caramel whipped filling topped with crumbled pieces of TWIX® Bars, all resting on a vanilla crumb crust.\n" +
                        "\n" +
                        "TWIX and the TWIX logo are trademarks of Mars or Affiliates, used under license.",
                "Pie made with TWIX®",
                "Milk, Peanut, Soy, Wheat",
                "Treat yourself with Pie made with Twix®."
        ));

        items.put(30, new Item(
                30,
                "Cini Minis",
                4.99,
                R.drawable.cini_minis,
                "410\n" +
                        "14\n" +
                        "6\n" +
                        "0\n" +
                        "0\n" +
                        "500\n" +
                        "66\n" +
                        "2\n" +
                        "29\n" +
                        "7",
                "Warm, freshly baked, delicious bite-size cinnamon rolls with its own icing dipping sauce.",
                "Icing, Cini Minis",
                "Egg, Milk, Soy, Wheat.",
                "Ooey gooey Cini Minis are back!"
        ));
    }
}
