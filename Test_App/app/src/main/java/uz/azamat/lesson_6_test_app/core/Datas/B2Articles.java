package uz.azamat.lesson_6_test_app.core.Datas;

import java.util.ArrayList;

import uz.azamat.lesson_6_test_app.core.QuestionData;

public class B2Articles {

    // 100
    public static ArrayList<QuestionData> makeArticles() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test_1_1 = new QuestionData("On ___ bright January morning ___ telephone kept ringing in my office.", "a/the");
        test_1_1.addVariants("the/the");
        test_1_1.addVariants("a/the");
        test_1_1.addVariants("-/-");
        test_1_1.addVariants("-/the");
        test_1_1.addVariants("the/-");
        test1.add(test_1_1);

        QuestionData test_1_2 = new QuestionData("On ___ first day they stopped at ___ river and decided to make ___ camp.", "the/a/a");
        test_1_2.addVariants("the/a/a");
        test_1_2.addVariants("the/-/a");
        test_1_2.addVariants("the/an/a");
        test_1_2.addVariants("-/the/-");
        test_1_2.addVariants("the/an/an");
        test1.add(test_1_2);

        QuestionData test_1_3 = new QuestionData("At ___ first they began to look for ___ dry place.", "-/a");
        test_1_3.addVariants("the/a");
        test_1_3.addVariants("-/a");
        test_1_3.addVariants("a/the");
        test_1_3.addVariants("an/a");
        test_1_3.addVariants("the/-");
        test1.add(test_1_3);

        QuestionData test4 = new QuestionData("To climb ___ tree is not to climb ___ mountain.", "a/a");
        test4.addVariants("a/a");
        test4.addVariants("a/the");
        test4.addVariants("the/the");
        test4.addVariants("-/-");
        test4.addVariants("the/-");
        test1.add(test4);

        QuestionData test5 = new QuestionData("Where there’s ___ will, there’s ___ way.", "a/a");
        test5.addVariants("a/a");
        test5.addVariants("-/-");
        test5.addVariants("the/the");
        test5.addVariants("a/the");
        test5.addVariants("the/a");
        test1.add(test5);

        QuestionData test6 = new QuestionData("___ man always went to ___ same bar at ___ same time every " +
                "day and asked for two glasses of ___ soda.", "A/the/the/-");
        test6.addVariants("A/the/the/-");
        test6.addVariants("A/the/the/a");
        test6.addVariants("A/the/-/-");
        test6.addVariants("-/the/the/-");
        test6.addVariants("A/-/the/a");
        test1.add(test6);

        QuestionData test7 = new QuestionData("___ weather was rainy and we made ___ bet whether you would come.", "The/a");
        test7.addVariants("The/a");
        test7.addVariants("-/the");
        test7.addVariants("A/a");
        test7.addVariants("-/a");
        test7.addVariants("An/a");
        test1.add(test7);

        QuestionData test8 = new QuestionData("- Are you afraid of ___ him?\n" +
                "- Not ___ bit.", "-/a");
        test8.addVariants("the/a");
        test8.addVariants("-/a");
        test8.addVariants("-/-");
        test8.addVariants("the/-");
        test8.addVariants("an/a");
        test1.add(test8);

        QuestionData test9 = new QuestionData("___ USA is ___ country. It is in North America.", "the/a");
        test9.addVariants("-/a");
        test9.addVariants("the/a");
        test9.addVariants("the/-");
        test9.addVariants("the/the");
        test9.addVariants("-/-");
        test1.add(test9);

        QuestionData test10 = new QuestionData("If ___ guest has to leave ___ table during ___ meal he always " +
                "asks his hostess, “Will you please excuse me for ___ minute”.", "a/the/a/a");
        test10.addVariants("a/the/a/a");
        test10.addVariants("-/the/a/-");
        test10.addVariants("the/the/-/the");
        test10.addVariants("an/the/a/a");
        test10.addVariants("-/-/-/a");
        test1.add(test10);

        QuestionData test11 = new QuestionData("___ most favorite game is cricket, which is called by ___ English " +
                "“___ greatest game in ___ world”.", "the/the/the/the");
        test11.addVariants("the/the/the/the");
        test11.addVariants("the/a/the/the");
        test11.addVariants("-/the/-/the");
        test11.addVariants("a/the/-/the");
        test11.addVariants("the/an/-/the");
        test1.add(test11);

        QuestionData test12 = new QuestionData("In his childhood he lived with ___ grandfather, ___ poor tailor.", "the/a");
        test12.addVariants("a/the");
        test12.addVariants("-/the");
        test12.addVariants("the/a");
        test12.addVariants("a/a");
        test12.addVariants("the/the");
        test1.add(test12);

        QuestionData test13 = new QuestionData("___ night being sharp and frosty, we trembled from ___ foot to" +
                "___ head.", "the/-/-");
        test13.addVariants("the/the/the");
        test13.addVariants("the/-/-");
        test13.addVariants("a/-/-");
        test13.addVariants("-/a/a");
        test13.addVariants("-/-/-");
        test1.add(test13);

        QuestionData test14 = new QuestionData("My ___ friend likes to listen to ___ good story.", "-/a");
        test14.addVariants("-/the");
        test14.addVariants("a/a");
        test14.addVariants("the/the");
        test14.addVariants("-/a");
        test14.addVariants("a/-");
        test1.add(test14);

        QuestionData test15 = new QuestionData("___ idea of helping ___ man was unpleasant in itself.", "the/the");
        test15.addVariants("-/the");
        test15.addVariants("the/the");
        test15.addVariants("the/a");
        test15.addVariants("-/-");
        test15.addVariants("a/a");
        test1.add(test15);

        QuestionData test16 = new QuestionData("When I lived in Paris some years ago I used to buy ___ copy of Le " +
                "Monde every evening at ___ same local newspaper kiosk.", "a/the");
        test16.addVariants("-/a");
        test16.addVariants("a/the");
        test16.addVariants("a/a");
        test16.addVariants("the/a");
        test16.addVariants("the/the");
        test1.add(test16);

        QuestionData test17 = new QuestionData("___ death of her husband resulted in ___ loss of her home also.", "the/the");
        test17.addVariants("-/-");
        test17.addVariants("-/the");
        test17.addVariants("the/the");
        test17.addVariants("a/-");
        test17.addVariants("a/a");
        test1.add(test17);

        QuestionData test18 = new QuestionData("Peter is on ___ night duty. When I go to ___ bed, he goes to ___ " +
                "work.", "-/-/-");
        test18.addVariants("the/-/a");
        test18.addVariants("-/-/-");
        test18.addVariants("a/a/a");
        test18.addVariants("the/the/-");
        test18.addVariants("-/the/a");
        test1.add(test18);

        QuestionData test19 = new QuestionData("R.Peary was ___ famous American polar traveler. He was _____ " +
                "first to reach ___ North Pole in 1909.", "a/the/the");
        test19.addVariants("a/the/the");
        test19.addVariants("the/the/-");
        test19.addVariants("a/the/a");
        test19.addVariants("-/the/-");
        test19.addVariants("an/the/a");
        test1.add(test19);

        QuestionData test20 = new QuestionData("He likes to have ___ rest in ___ country.", "a/the");
        test20.addVariants("-/-");
        test20.addVariants("-/the");
        test20.addVariants("the/-");
        test20.addVariants("a/-");
        test20.addVariants("a/the");
        test1.add(test20);

        QuestionData test21 = new QuestionData("Don’t stay outside in ___ cold; come in by ___ fire.", "the/the");
        test21.addVariants("the/the");
        test21.addVariants("the/a");
        test21.addVariants("-/a");
        test21.addVariants("the/-");
        test21.addVariants("a/the");
        test1.add(test21);

        QuestionData test22 = new QuestionData("It’s ___ pity that my birthday comes only once ___ year.", "a/a");
        test22.addVariants("a/-");
        test22.addVariants("the/a");
        test22.addVariants("a/a");
        test22.addVariants("an/the");
        test22.addVariants("-/a");
        test1.add(test22);

        QuestionData test23 = new QuestionData("___ boy was shy and always looked down when ___ grown-ups" +
                "spoke to him.", "the/-");
        test23.addVariants("a/the");
        test23.addVariants("the/-");
        test23.addVariants("an/-");
        test23.addVariants("-/a");
        test23.addVariants("the/a");
        test1.add(test23);

        QuestionData test24 = new QuestionData("There was ___ good restaurant near ___ cinema and Joan decided" +
                "to have ___ dinner there.", "a/the/a");
        test24.addVariants("the/a/-");
        test24.addVariants("-/the/-");
        test24.addVariants("an/-/the");
        test24.addVariants("a/a/the");
        test24.addVariants("a/the/a");
        test1.add(test24);

        QuestionData test25 = new QuestionData("Kate ate ___ meat with ___ vegetables for ___ second course.", "-/-/the");
        test25.addVariants("-/-/the");
        test25.addVariants("a/the/-");
        test25.addVariants("the/a/the");
        test25.addVariants("-/an/-");
        test25.addVariants("an/-/a");
        test1.add(test25);

        QuestionData test26 = new QuestionData("I’ll never forget ___ first time I saw ___ real American Christmas tree", "the/a");
        test26.addVariants("a/the");
        test26.addVariants("an/-");
        test26.addVariants("-/a");
        test26.addVariants("the/a");
        test26.addVariants("the/-");
        test1.add(test26);

        QuestionData test27 = new QuestionData("“___ English cannot make ___ good coffee”, she thought leaving " +
                "___ restaurant.", "the/-/the");
        test27.addVariants("the/a/an");
        test27.addVariants("an/-/the");
        test27.addVariants("-/the/the");
        test27.addVariants("a/-/a");
        test27.addVariants("the/-/the");
        test1.add(test27);

        QuestionData test28 = new QuestionData("At ___ first it was difficult for her to drive ___ car in ___ London.", "-/the/-");
        test28.addVariants("-/the/-");
        test28.addVariants("the/the/-");
        test28.addVariants("-/-/the");
        test28.addVariants("a/-/the");
        test28.addVariants("a/a/-");
        test1.add(test28);

        QuestionData test29 = new QuestionData("___ few days later I entered ___ reading room of ___ public library.", "A/the/the");
        test29.addVariants("A/the/the");
        test29.addVariants("The/the/the");
        test29.addVariants("-/the/-");
        test29.addVariants("A/a/-");
        test29.addVariants("-/a/-");
        test1.add(test29);

        QuestionData test30 = new QuestionData("___ book is always ___ acceptable gift.", "A/an");
        test30.addVariants("A/an");
        test30.addVariants("The/-");
        test30.addVariants("The/the");
        test30.addVariants("An/the");
        test30.addVariants("-/a");
        test1.add(test30);

        QuestionData test31 = new QuestionData("Sofia is ___ capital of ___ Bulgaria.", "the/-");
        test31.addVariants("-/-");
        test31.addVariants("the/the");
        test31.addVariants("the/-");
        test31.addVariants("the/a");
        test31.addVariants("-/a");
        test1.add(test31);

        QuestionData test32 = new QuestionData("Many years ago ___ Tower Bridge of London was ___ fortress.", "the/a");
        test32.addVariants("-/a");
        test32.addVariants("the/the");
        test32.addVariants("a/-");
        test32.addVariants("the/-");
        test32.addVariants("the/a");
        test1.add(test32);

        QuestionData test33 = new QuestionData("___ youth of Great Britain wants to have ___ better life for _____ " +
                "British people.", "the/a/the");
        test33.addVariants("-/-/the");
        test33.addVariants("the/a/the");
        test33.addVariants("the/the/the");
        test33.addVariants("the/-/the");
        test33.addVariants("-/the/-");
        test1.add(test33);

        QuestionData test34 = new QuestionData("___ Moon has no ___ light. It is bright because ___ Sun shines on it.", "The/-/the");
        test34.addVariants("The/-/the");
        test34.addVariants("The/a/the");
        test34.addVariants("-/-/the");
        test34.addVariants("The/the/the");
        test34.addVariants("A/an/the");
        test1.add(test34);

        QuestionData test35 = new QuestionData("___ shortest man in ___ world and ___ tallest man in ___ world " +
                "live in ___ Africa.", "The/the/the/the/-");
        test35.addVariants("The/the/the/the/-");
        test35.addVariants("The/the/-/an/an");
        test35.addVariants("-/the/-/an/an");
        test35.addVariants("The/a/-/-/an");
        test35.addVariants("The/-/-/-/-");
        test1.add(test35);

        QuestionData test36 = new QuestionData("Hope is ___ good breakfast, but ___ bad supper.", "a/a");
        test36.addVariants("a/a");
        test36.addVariants("the/the");
        test36.addVariants("a/the");
        test36.addVariants("a/an");
        test36.addVariants("a/-");
        test1.add(test36);

        QuestionData test37 = new QuestionData("I always wear sunglasses when I go ___ beach. ___ sun bothers " +
                "my eyes.", "the/the");
        test37.addVariants("the/the");
        test37.addVariants("a/the");
        test37.addVariants("-/a");
        test37.addVariants("an/a");
        test37.addVariants("the/a");
        test1.add(test37);

        QuestionData test38 = new QuestionData("She ordered ___ fried chicken with ___ green salad and black " +
                "coffee for ___ dessert.", "-/-/-");
        test38.addVariants("-/-/-");
        test38.addVariants("the/-/-");
        test38.addVariants("an/the/-");
        test38.addVariants("-/a/the");
        test38.addVariants("a/an/the");
        test1.add(test38);

        QuestionData test39 = new QuestionData("My aunt lived on ___ ground floor of ___ old house on ___ River Thames.", "the/an/the");
        test39.addVariants("the/an/the");
        test39.addVariants("-/the/a");
        test39.addVariants("the/the/-");
        test39.addVariants("-/an/the");
        test39.addVariants("a/an/a");
        test1.add(test39);

        QuestionData test40 = new QuestionData("On the New Year Eve some of ___ pupils stayed at ___ school " +
                "later than usual.", "the/-");
        test40.addVariants("the/-");
        test40.addVariants("the/the");
        test40.addVariants("-/the");
        test40.addVariants("a/a");
        test40.addVariants("the/a");
        test1.add(test40);

        QuestionData test41 = new QuestionData("___ best runner in the race was ___ young girl.", "the/a");
        test41.addVariants("a/an");
        test41.addVariants("the/an");
        test41.addVariants("-/the");
        test41.addVariants("the/a");
        test41.addVariants("the/the");
        test1.add(test41);

        QuestionData test42 = new QuestionData("The first of ___ January is ___ great holiday in many countries.", "-/a");
        test42.addVariants("the/a");
        test42.addVariants("-/an");
        test42.addVariants("-/a");
        test42.addVariants("the/-");
        test42.addVariants("the/the");
        test1.add(test42);

        QuestionData test43 = new QuestionData("On ___ Sundays my father stays in ___ bed till ten o’clock reading " +
                "___ Sunday papers.", "-/-/the");
        test43.addVariants("the/the/-");
        test43.addVariants("-/-/the");
        test43.addVariants("an/-/-");
        test43.addVariants("the/the/the");
        test43.addVariants("-/-/-");
        test1.add(test43);

        QuestionData test44 = new QuestionData("After ___ fourth lesson English pupils have ___ break of ___ hour " +
                "and ___ half for dinner.", "the/a/an/a");
        test44.addVariants("a/a/a/a");
        test44.addVariants("the/a/-/a");
        test44.addVariants("a/the/an/a");
        test44.addVariants("the/a/an/a");
        test44.addVariants("-/-/an/a");
        test1.add(test44);

        QuestionData test45 = new QuestionData("On ___ day of___ race many people came to the skating.", "the/the");
        test45.addVariants("-/-");
        test45.addVariants("a/the");
        test45.addVariants("the/a");
        test45.addVariants("the/-");
        test45.addVariants("the/the");
        test1.add(test45);

        QuestionData test46 = new QuestionData("___ Sahara is in the northern part of Africa.", "the");
        test46.addVariants("-");
        test46.addVariants("a");
        test46.addVariants("an");
        test46.addVariants("the");
        test46.addVariants("any");
        test1.add(test46);

        QuestionData test47 = new QuestionData("___ fog was so thick that we couldn’t see ___ side of ___ road.", "the/the/the");
        test47.addVariants("a/the/a");
        test47.addVariants("the/-/-");
        test47.addVariants("the/the/the");
        test47.addVariants("-/the/a");
        test47.addVariants("the/a/a");
        test1.add(test47);

        QuestionData test48 = new QuestionData("I remember an episode in ___ my life when I had to spend ___ " +
                "month in the country.", "-/a");
        test48.addVariants("a/-");
        test48.addVariants("the/a");
        test48.addVariants("-/an");
        test48.addVariants("-/a");
        test48.addVariants("an/the");
        test1.add(test48);

        QuestionData test49 = new QuestionData("In ___ afternoon ___ wind increased and they soon found " +
                "themselves in ___ difficulties.", "the/the/-");
        test49.addVariants("the/the/-");
        test49.addVariants("an/a/the");
        test49.addVariants("-/the/-");
        test49.addVariants("the/the/the");
        test49.addVariants("the/a/the");
        test1.add(test49);

        QuestionData test50 = new QuestionData("They took part in ___ demonstration in ___ Independence Square.", "the/-");
        test50.addVariants("-/the");
        test50.addVariants("a/a");
        test50.addVariants("the/-");
        test50.addVariants("-/-");
        test50.addVariants("the/the");
        test1.add(test50);

        QuestionData test51 = new QuestionData("And what ___ beautiful picture there is over there on ___ wall!", "a/the");
        test51.addVariants("-/a");
        test51.addVariants("a/the");
        test51.addVariants("a/-");
        test51.addVariants("the/a");
        test51.addVariants("a/a");
        test1.add(test51);

        QuestionData test52 = new QuestionData("Roger looked at him and, without ___ word, gave him ___ ten dollar note.", "a/a");
        test52.addVariants("a/a");
        test52.addVariants("-/-");
        test52.addVariants("-/the");
        test52.addVariants("the/-");
        test52.addVariants("a/-");
        test1.add(test52);

        QuestionData test53 = new QuestionData("___ longest river in ___ world is ___ Mississippi.", "the/the/the");
        test53.addVariants("a/the/an");
        test53.addVariants("the/a/the");
        test53.addVariants("he/an/the");
        test53.addVariants("an/the/the");
        test53.addVariants("the/the/the");
        test1.add(test53);

        QuestionData test54 = new QuestionData("It took us ___ hour and ___ half to do shopping and we got ___ " +
                "home at 4.", "an/a/-");
        test54.addVariants("an/a/-");
        test54.addVariants("the/an/the");
        test54.addVariants("on/the/the");
        test54.addVariants("an/the/a");
        test54.addVariants("a/the/the");
        test1.add(test54);

        QuestionData test55 = new QuestionData("___ apple ___ day keeps ___ doctor away.", "an/a/the");
        test55.addVariants("an/a/the");
        test55.addVariants("an/-/a");
        test55.addVariants("the/a/a");
        test55.addVariants("a/a/the");
        test55.addVariants("an/the/the");
        test1.add(test55);

        QuestionData test56 = new QuestionData("We had ___ good talk with him about ___ weather, ___ literature " +
                "and other things.", "a/the/-");
        test56.addVariants("-/the/the");
        test56.addVariants("a/the/-");
        test56.addVariants("a/-/the");
        test56.addVariants("the/the/a");
        test56.addVariants("a/a/-");
        test1.add(test56);

        QuestionData test57 = new QuestionData("___ girl from ___ farm came once ___ week to help to clean ___ house.", "the/the/a/the");
        test57.addVariants("a/a/the/the");
        test57.addVariants("the/a/the/the");
        test57.addVariants("the/the/a/the");
        test57.addVariants("the/a/a/a");
        test57.addVariants("the/the/the/a");
        test1.add(test57);

        QuestionData test58 = new QuestionData("___ questions Ann asked always seemed to be ___ questions " +
                "which Paul knew ___ answer.", "the/-/the");
        test58.addVariants("a/the/the");
        test58.addVariants("the/a/a");
        test58.addVariants("the/-/a");
        test58.addVariants("the/-/the");
        test58.addVariants("-/the/the");
        test1.add(test58);

        QuestionData test59 = new QuestionData("Before the New Year we usually have ___ wonderful party at ___ school.", "a / -");
        test59.addVariants("a / the");
        test59.addVariants("the / the");
        test59.addVariants("a / -");
        test59.addVariants("an / -");
        test59.addVariants("- / the");
        test1.add(test59);

        QuestionData test60 = new QuestionData("There is ___ hair in my soup and ___ plate is dirty.", "a/the");
        test60.addVariants("-/-");
        test60.addVariants("the/the");
        test60.addVariants("a/the");
        test60.addVariants("the/a");
        test60.addVariants("-/the");
        test1.add(test60);

        QuestionData test61 = new QuestionData("Soon our team scored ___ goal and won ___ game.", "a/the");
        test61.addVariants("the/the");
        test61.addVariants("a/a");
        test61.addVariants("a/the");
        test61.addVariants("the/a");
        test61.addVariants("an/the");
        test1.add(test61);

        QuestionData test62 = new QuestionData("Let’s have ___ good breakfast and start the day.", "a");
        test62.addVariants("the");
        test62.addVariants("-");
        test62.addVariants("any");
        test62.addVariants("a");
        test62.addVariants("an");
        test1.add(test62);

        QuestionData test63 = new QuestionData("___ youngest boy has just started going to school, ___ eldest " +
                "boy is at ___ college.", "the/the/-");
        test63.addVariants("the/the/-");
        test63.addVariants("the/-/the");
        test63.addVariants("the/-/the");
        test63.addVariants("-/-/-");
        test63.addVariants("a/-/a");
        test1.add(test63);

        QuestionData test64 = new QuestionData("-Did you come by ___ air?\n" +
                "-No, I came by ___ sea. I had a lovely voyage on ___ Queen Elizabeth II.", "-/-/the");
        test64.addVariants("an/the/the");
        test64.addVariants("-/-/the");
        test64.addVariants("an/a/a");
        test64.addVariants("the/the/the");
        test64.addVariants("-/-/a");
        test1.add(test64);

        QuestionData test65 = new QuestionData("We have a very good train service from here to ___ city centre " +
                "and many people go to ___ work by train.", "the/-");
        test65.addVariants("a/a");
        test65.addVariants("the/the");
        test65.addVariants("-/-");
        test65.addVariants("the/-");
        test65.addVariants("an/a");
        test1.add(test65);

        QuestionData test66 = new QuestionData("- I didn’t recognize you. You look different.\n" +
                "- I know I lost ___ lot of ___ weight.", "a/-");
        test66.addVariants("a/-");
        test66.addVariants("an/the");
        test66.addVariants("a/the");
        test66.addVariants("the/a");
        test66.addVariants("the/the");
        test1.add(test66);

        QuestionData test67 = new QuestionData("___ sun came out right after ___ rain and there was ___ beautiful " +
                "rainbow in ___ sky.", "The/the/a/the");
        test67.addVariants("The/the/a/the");
        test67.addVariants("The/a/the/the");
        test67.addVariants("A/a/the/a");
        test67.addVariants("The/the/the/a");
        test67.addVariants("A/the/a/the");
        test1.add(test67);

        QuestionData test68 = new QuestionData("I always have ___ breakfast at 8 a.m. Today I had ___ very nice breakfast.", "-/a");
        test68.addVariants("a/the");
        test68.addVariants("-/a");
        test68.addVariants("-/-");
        test68.addVariants("the/-");
        test68.addVariants("a/-");
        test1.add(test68);

        QuestionData test69 = new QuestionData("He was ___ very tall man with ___ dark hair.", "a/-");
        test69.addVariants("a/the");
        test69.addVariants("a/-");
        test69.addVariants("the/the");
        test69.addVariants("-/-");
        test69.addVariants("a/a");
        test1.add(test69);

        QuestionData test70 = new QuestionData("Would you like to be ___ English teacher at ___ college.", "an/-");
        test70.addVariants("the/-");
        test70.addVariants("the/the");
        test70.addVariants("a/-");
        test70.addVariants("an/-");
        test70.addVariants("the/a");
        test1.add(test70);

        QuestionData test71 = new QuestionData("We had ___ very nice meal. ___ vegetables were especially good.", "a/the");
        test71.addVariants("-/-");
        test71.addVariants("-/the");
        test71.addVariants("a/-");
        test71.addVariants("a/the");
        test71.addVariants("the/the");
        test1.add(test71);

        QuestionData test72 = new QuestionData("All ___ books on ___ top of the shelf belong to me.", "the/the");
        test72.addVariants("-/a");
        test72.addVariants("the/-");
        test72.addVariants("the/the");
        test72.addVariants("-/the");
        test72.addVariants("on/with");
        test1.add(test72);

        QuestionData test73 = new QuestionData("If you live in ___ foreign country you should try and learn ___ language.", "a/the");
        test73.addVariants("a/the");
        test73.addVariants("-/-");
        test73.addVariants("-/a");
        test73.addVariants("the/the");
        test73.addVariants("the/a");
        test1.add(test73);

        QuestionData test74 = new QuestionData("Washington is situated on ___ Potomac River in ___ District of Columbia.", "-/the");
        test74.addVariants("-/-");
        test74.addVariants("the/-");
        test74.addVariants("-/the");
        test74.addVariants("the/the");
        test74.addVariants("a/an");
        test1.add(test74);

        QuestionData test75 = new QuestionData("David picked up ___ nut from ___ hole.", "the/a");
        test75.addVariants("the/the");
        test75.addVariants("a/an");
        test75.addVariants("a/the");
        test75.addVariants("the/a");
        test75.addVariants("an/a");
        test1.add(test75);

        QuestionData test76 = new QuestionData("Once ___ pupils of ___ fifth form read ___ book about Robin Hood.", "the/the/a");
        test76.addVariants("-/the/a");
        test76.addVariants("a/an/the");
        test76.addVariants("the/the/a");
        test76.addVariants("an/a/the");
        test76.addVariants("-/the/an");
        test1.add(test76);

        QuestionData test77 = new QuestionData("___ concert began with ___ song about ___ peace and ___ work.", "the/a/-/-");
        test77.addVariants("the/a/-/-");
        test77.addVariants("a/the/the/the");
        test77.addVariants("a/the/-/-");
        test77.addVariants("the/the/a/a");
        test77.addVariants("a/a/-/-");
        test1.add(test77);

        QuestionData test78 = new QuestionData("___ Penguins live in the South Pole.", "-");
        test78.addVariants("a");
        test78.addVariants("an");
        test78.addVariants("-");
        test78.addVariants("the");
        test78.addVariants("some");
        test1.add(test78);

        QuestionData test79 = new QuestionData("France covers ___ area of 551000 sq kms.", "an");
        test79.addVariants("the");
        test79.addVariants("a");
        test79.addVariants("-");
        test79.addVariants("an");
        test79.addVariants("one");
        test1.add(test79);

        QuestionData test80 = new QuestionData("Open ___ books at ___ page 20 and read ___ text.", "the/-/the");
        test80.addVariants("-/the/the");
        test80.addVariants("the/-/the");
        test80.addVariants("-/-/the");
        test80.addVariants("the/-/a");
        test80.addVariants("-/the/a");
        test1.add(test80);

        QuestionData test81 = new QuestionData("You realize that ___ time to choose one job out of ___ hundreds has come.", "the/-");
        test81.addVariants("the/-");
        test81.addVariants("a/the");
        test81.addVariants("the/a");
        test81.addVariants("an/a");
        test81.addVariants("-/the");
        test1.add(test81);

        QuestionData test82 = new QuestionData("There were ___ three shelters on ___ cliff.", "-/the");
        test82.addVariants("-/the");
        test82.addVariants("-/a");
        test82.addVariants("the/the");
        test82.addVariants("a/a");
        test82.addVariants("a/the");
        test1.add(test82);

        QuestionData test83 = new QuestionData("I saw ___ good deal of him during ___ war.", "a/the");
        test83.addVariants("-/a");
        test83.addVariants("the/the");
        test83.addVariants("a/a");
        test83.addVariants("the/-");
        test83.addVariants("a/the");
        test1.add(test83);

        QuestionData test84 = new QuestionData("He sat down at ___ piano and played ___ piece that he had " +
                "played in the morning.", "the/the");
        test84.addVariants("a/a");
        test84.addVariants("a/the");
        test84.addVariants("the/the");
        test84.addVariants("the/a");
        test84.addVariants("the/-");
        test1.add(test84);

        QuestionData test85 = new QuestionData("___ doctor says ___ child must eat ___ apple ___ day.", "the/the/an/a");
        test85.addVariants("the/the/a/a");
        test85.addVariants("a/a/the/a");
        test85.addVariants("the/the/an/the");
        test85.addVariants("a/a/an/a");
        test85.addVariants("");
        test1.add(test85);

        QuestionData test86 = new QuestionData("___ Browns invited me to ___ dinner.", "the/-");
        test86.addVariants("-/the");
        test86.addVariants("the/a");
        test86.addVariants("-/a");
        test86.addVariants("the/-");
        test86.addVariants("the/an");
        test1.add(test86);

        QuestionData test87 = new QuestionData("They went on ___ expedition to ___ North.", "an/the");
        test87.addVariants("a/the");
        test87.addVariants("an/the");
        test87.addVariants("-/the");
        test87.addVariants("the/the");
        test87.addVariants("the/a");
        test1.add(test87);

        QuestionData test88 = new QuestionData("___ Rome was not built in ___ day.", "-/a");
        test88.addVariants("the/a");
        test88.addVariants("-/the");
        test88.addVariants("-/a");
        test88.addVariants("-/-");
        test88.addVariants("an/a");
        test1.add(test88);

        QuestionData test89 = new QuestionData("The beautiful child gave Pinocchio ___ some medicine and ___ " +
                "piece of sugar.", "-/a");
        test89.addVariants("a/the");
        test89.addVariants("the/a");
        test89.addVariants("-/a");
        test89.addVariants("the/the");
        test89.addVariants("a/an");
        test1.add(test89);

        QuestionData test90 = new QuestionData("Italy is in ___ South of ___ Europe, isn’t it?", "the/-");
        test90.addVariants("an/a");
        test90.addVariants("the/-");
        test90.addVariants("the/the");
        test90.addVariants("the/an");
        test90.addVariants("an/the");
        test1.add(test90);

        QuestionData test91 = new QuestionData("___ West End is ___ richest part of ___ capital.", "the/the/the");
        test91.addVariants("a/an/the");
        test91.addVariants("the/a/a");
        test91.addVariants("the/the/the");
        test91.addVariants("the/-/the");
        test91.addVariants("the/the/-");
        test1.add(test91);

        QuestionData test92 = new QuestionData("-When will ___ next bus be?\n" +
                "-___ next will be tomorrow morning.", "the/the");
        test92.addVariants("-/-");
        test92.addVariants("the/the");
        test92.addVariants("a/a");
        test92.addVariants("a/the");
        test92.addVariants("the/a");
        test1.add(test92);

        QuestionData test93 = new QuestionData("___ Latin America is on ___ South of America.", "-/the");
        test93.addVariants("the/a");
        test93.addVariants("-/the");
        test93.addVariants("the/the");
        test93.addVariants("-/-");
        test93.addVariants("the/-");
        test1.add(test93);

        QuestionData test94 = new QuestionData("Spring is ___ best season of ___ year.", "the/the");
        test94.addVariants("the/a");
        test94.addVariants("I/the");
        test94.addVariants("a/a");
        test94.addVariants("the/the");
        test94.addVariants("a/-");
        test1.add(test94);

        QuestionData test95 = new QuestionData("___ long walk in ___ country is very interesting.", "a/the");
        test95.addVariants("a/the");
        test95.addVariants("the/a");
        test95.addVariants("the/the");
        test95.addVariants("a/a");
        test95.addVariants("-/the");
        test1.add(test95);

        QuestionData test96 = new QuestionData("___ Smiths enjoyed their rest at the coast of ___ Black Sea last summer.", "the/the");
        test96.addVariants("-/the");
        test96.addVariants("the/the");
        test96.addVariants("the/-");
        test96.addVariants("the/a");
        test96.addVariants("a/a");
        test1.add(test96);

        QuestionData test97 = new QuestionData("“___ Queen Mary” is one of ___ biggest ships in the world.", "the/the");
        test97.addVariants("-/a");
        test97.addVariants("-/the");
        test97.addVariants("the/the");
        test97.addVariants("-/-");
        test97.addVariants("the/a");
        test1.add(test97);

        QuestionData test98 = new QuestionData("They stayed only ___ day at the hotel.", "a");
        test98.addVariants("a");
        test98.addVariants("the");
        test98.addVariants("an");
        test98.addVariants("-");
        test98.addVariants("some");
        test1.add(test98);

        QuestionData test99 = new QuestionData("It is ___ holiday of all European people. ___ people have ___ two days’ holiday.", "the/the/a");
        test99.addVariants("-/-/-");
        test99.addVariants("a/-/the");
        test99.addVariants("the/-/the");
        test99.addVariants("the/the/a");
        test99.addVariants("a/the/a");
        test1.add(test99);

        QuestionData test100 = new QuestionData("This is ___ lion that I saw in the circus yesterday.", "the");
        test100.addVariants("a");
        test100.addVariants("-");
        test100.addVariants("the");
        test100.addVariants("an");
        test100.addVariants("any");
        test1.add(test100);

        return test1;
    }
}

