package uz.azamat.lesson_6_test_app.core.Datas;

import java.util.ArrayList;

import uz.azamat.lesson_6_test_app.core.QuestionData;

public class B2Pronouns {

    public static ArrayList<QuestionData> makeTest1() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test_1_1 = new QuestionData("Have you heard that a friend of ___ went to Vietnam", "mine");
        test_1_1.addVariants("my");
        test_1_1.addVariants("mine");
        test_1_1.addVariants("her");
        test_1_1.addVariants("their");
        test_1_1.addVariants("its");
        test1.add(test_1_1);

        QuestionData test_1_2 = new QuestionData("That is the girl ___ brother came to see ___", "whose / us");
        test_1_2.addVariants("that / we");
        test_1_2.addVariants("whose / us");
        test_1_2.addVariants("which / they");
        test_1_2.addVariants("whom / its");
        test_1_2.addVariants("what / us");
        test1.add(test_1_2);

        QuestionData test_1_3 = new QuestionData("If ___ has ___ questions, I’ll be pleased to answer them.", "anyone/any");
        test_1_3.addVariants("someone/any");
        test_1_3.addVariants("anyone/any");
        test_1_3.addVariants("none/any");
        test_1_3.addVariants("anyone/none");
        test_1_3.addVariants("someone/none");
        test1.add(test_1_3);

        QuestionData test4 = new QuestionData("I haven’t read ___ of these books but George has read ___ of them.", "any/some");
        test4.addVariants("none/some");
        test4.addVariants("no/some");
        test4.addVariants("any/some");
        test4.addVariants("any/any");
        test4.addVariants("any/no");
        test1.add(test4);

        QuestionData test5 = new QuestionData("That pen isn’t ___ . ___ is a green one.", "mine/mine");
        test5.addVariants("my/my");
        test5.addVariants("his/he");
        test5.addVariants("mine/mine");
        test5.addVariants("I/me");
        test5.addVariants("her/its");
        test1.add(test5);

        QuestionData test6 = new QuestionData("She always thinks of ___ happiness.", "others’");
        test6.addVariants("another");
        test6.addVariants("others");
        test6.addVariants("other");
        test6.addVariants("another’s");
        test6.addVariants("others’");
        test1.add(test6);

        QuestionData test7 = new QuestionData("___ was not a marriage that could last.", "theirs");
        test7.addVariants("my");
        test7.addVariants("her");
        test7.addVariants("them");
        test7.addVariants("theirs");
        test7.addVariants("our");
        test1.add(test7);

        QuestionData test8 = new QuestionData("If this hat is ___, where have you put ___?", "his/hers");
        test8.addVariants("your/mine");
        test8.addVariants("his/hers");
        test8.addVariants("mine/her");
        test8.addVariants("ours/their");
        test8.addVariants("hers/my");
        test1.add(test8);

        QuestionData test9 = new QuestionData("___ read the book and ___ took it to the library.", "I/he");
        test9.addVariants("He/me");
        test9.addVariants("I/he");
        test9.addVariants("You/her");
        test9.addVariants("She/her");
        test9.addVariants("we/them");
        test1.add(test9);

        QuestionData test10 = new QuestionData("The work done by ___ is very important.", "you");
        test10.addVariants("he");
        test10.addVariants("she");
        test10.addVariants("we");
        test10.addVariants("they");
        test10.addVariants("you");
        test1.add(test10);

        QuestionData test11 = new QuestionData("Why is ___ sitting in the dark?", "she");
        test11.addVariants("we");
        test11.addVariants("she");
        test11.addVariants("you");
        test11.addVariants("I");
        test11.addVariants("her");
        test1.add(test11);

        QuestionData test12 = new QuestionData("- What has Ann?\n" +
                "- ___ has a very nice cat", "she");
        test12.addVariants("we");
        test12.addVariants("it");
        test12.addVariants("she");
        test12.addVariants("he");
        test12.addVariants("them");
        test1.add(test12);

        QuestionData test13 = new QuestionData("Will ___ please give me your pen?", "you");
        test13.addVariants("he");
        test13.addVariants("she");
        test13.addVariants("you");
        test13.addVariants("him");
        test13.addVariants("them");
        test1.add(test13);

        QuestionData test14 = new QuestionData("MR. WATSON said that THE MYSTERY was over.", "he/it");
        test14.addVariants("he/it");
        test14.addVariants("he/she");
        test14.addVariants("she/she");
        test14.addVariants("they/it");
        test14.addVariants("he/them");
        test1.add(test14);

        QuestionData test15 = new QuestionData("Bad NEWS has wings.", "it");
        test15.addVariants("it");
        test15.addVariants("he");
        test15.addVariants("they");
        test15.addVariants("she");
        test15.addVariants("them");
        test1.add(test15);

        QuestionData test16 = new QuestionData("I have a cat. ___ is very nice.", "it");
        test16.addVariants("you");
        test16.addVariants("they");
        test16.addVariants("it");
        test16.addVariants("its");
        test16.addVariants("who");
        test1.add(test16);

        QuestionData test17 = new QuestionData("How many children have THE TAYLORS?", "they");
        test17.addVariants("them");
        test17.addVariants("they");
        test17.addVariants("it");
        test17.addVariants("their");
        test17.addVariants("its");
        test1.add(test17);

        QuestionData test18 = new QuestionData("___ didn’t take our children to the park as ___ were at school.", "we / they");
        test18.addVariants("her / our");
        test18.addVariants("we / they");
        test18.addVariants("us / they");
        test18.addVariants("we / them");
        test18.addVariants("his / her");
        test1.add(test18);

        QuestionData test19 = new QuestionData("What makes THE SATELLITE rush round the earth at such a great speed?", "it");
        test19.addVariants("she");
        test19.addVariants("its");
        test19.addVariants("her");
        test19.addVariants("it");
        test19.addVariants("him");
        test1.add(test19);

        QuestionData test20 = new QuestionData("___ house is almost the same as ___ neighbors’ house. The only " +
                "difference in appearance is that ___is grey and ___ is white.", "our/our/ours/theirs");
        test20.addVariants("our/ours/ours/theirs");
        test20.addVariants("ours/ours/our/their");
        test20.addVariants("my/hers/my/her");
        test20.addVariants("our/our/ours/theirs");
        test20.addVariants("my/ours/ours/theirs");
        test1.add(test20);

        QuestionData test21 = new QuestionData("___ roommate and ___ have to share a bookshelf: ___ keeps ___ " +
                "books on the top two shelves, and I keep ___ on the bottom two " +
                "shelves.", "my/I/she/her/mine");
        test21.addVariants("my/me/she/her/mine");
        test21.addVariants("his/me/her/hers/my");
        test21.addVariants("my/I/she/her/mine");
        test21.addVariants("her/hers/she/her/my");
        test21.addVariants("my/her/she/hers/mine");
        test1.add(test21);

        QuestionData test22 = new QuestionData("Later DICKENS described HIS CHILDHOOD in some " +
                "of his famous novels.", "he/it");
        test22.addVariants("she/them");
        test22.addVariants("they/it");
        test22.addVariants("he/us");
        test22.addVariants("him/them");
        test22.addVariants("he/it");
        test1.add(test22);

        QuestionData test23 = new QuestionData("Of course I ___ used to be very wealthy.", "myself");
        test23.addVariants("my");
        test23.addVariants("mine");
        test23.addVariants("myself");
        test23.addVariants("ourselves");
        test23.addVariants("himself");
        test1.add(test23);

        QuestionData test24 = new QuestionData("I enjoyed the music, but I didn’t like the play ___ .", "itself");
        test24.addVariants("yourself");
        test24.addVariants("herself");
        test24.addVariants("myself");
        test24.addVariants("itself");
        test24.addVariants("himself");
        test1.add(test24);

        QuestionData test25 = new QuestionData("I always enjoy ___ when I go to concerts of classical music.", "myself");
        test25.addVariants("himself");
        test25.addVariants("myself");
        test25.addVariants("themselves");
        test25.addVariants("herself");
        test25.addVariants("ourselves");
        test1.add(test25);

        QuestionData test26 = new QuestionData("You know, Mary bought ___ a new dress yesterday.", "herself");
        test26.addVariants("myself");
        test26.addVariants("itself");
        test26.addVariants("himself");
        test26.addVariants("oneself");
        test26.addVariants("herself");
        test1.add(test26);

        QuestionData test27 = new QuestionData("Let the boys clean the room ___ .", "e");
        test27.addVariants("them");
        test27.addVariants("himself");
        test27.addVariants("their");
        test27.addVariants("theirs");
        test27.addVariants("themselves");
        test1.add(test27);

        QuestionData test28 = new QuestionData("We should help everyone as much as possible because we often need help ___ .", "ourselves");
        test28.addVariants("themselves");
        test28.addVariants("ourselves");
        test28.addVariants("yourselves");
        test28.addVariants("himself");
        test28.addVariants("myself");
        test1.add(test28);

        QuestionData test29 = new QuestionData("Did you all do the grammar exercises ___?", "yourselves");
        test29.addVariants("yourselves");
        test29.addVariants("yourself");
        test29.addVariants("herself");
        test29.addVariants("themselves");
        test29.addVariants("ourselves");
        test1.add(test29);

        QuestionData test30 = new QuestionData("He will sit in the room to keep ___ warm.", "himself");
        test30.addVariants("himself");
        test30.addVariants("herself");
        test30.addVariants("themselves");
        test30.addVariants("yourself");
        test30.addVariants("myself");
        test1.add(test30);

        QuestionData test31 = new QuestionData("I looked at ___ in the mirror.", "myself");
        test31.addVariants("me");
        test31.addVariants("its");
        test31.addVariants("myself");
        test31.addVariants("my");
        test31.addVariants("mine");
        test1.add(test31);

        QuestionData test32 = new QuestionData("Dorothy was happy when she found ___ in a magic country.", "herself");
        test32.addVariants("her");
        test32.addVariants("she");
        test32.addVariants("hers");
        test32.addVariants("herself");
        test32.addVariants("himself");
        test1.add(test32);

        QuestionData test33 = new QuestionData("They always went to places ___ they saw historical monuments.", "where");
        test33.addVariants("which");
        test33.addVariants("what");
        test33.addVariants("that");
        test33.addVariants("where");
        test33.addVariants("who");
        test1.add(test33);

        QuestionData test34 = new QuestionData("“___ else is here?” she asked.", "who");
        test34.addVariants("my");
        test34.addVariants("whom");
        test34.addVariants("which");
        test34.addVariants("why");
        test34.addVariants("who");
        test1.add(test34);

        QuestionData test35 = new QuestionData("I wonder ___ her sister’s boy looks like.", "what");
        test35.addVariants("that");
        test35.addVariants("what");
        test35.addVariants("which");
        test35.addVariants("who");
        test35.addVariants("whose");
        test1.add(test35);

        QuestionData test36 = new QuestionData("I like the book ___ I’ve read recently.", "which");
        test36.addVariants("who");
        test36.addVariants("what");
        test36.addVariants("which");
        test36.addVariants("whatever");
        test36.addVariants("whose");
        test1.add(test36);

        QuestionData test37 = new QuestionData("The man ___ works at this table is my friend.", "who");
        test37.addVariants("how");
        test37.addVariants("what");
        test37.addVariants("who");
        test37.addVariants("which");
        test37.addVariants("as");
        test1.add(test37);

        QuestionData test38 = new QuestionData("___ chapter did you like best?", "which");
        test38.addVariants("what");
        test38.addVariants("whose");
        test38.addVariants("which");
        test38.addVariants("that");
        test38.addVariants("this");
        test1.add(test38);

        QuestionData test39 = new QuestionData("Cook was an English explorer ___ made three voyages round the world.", "who");
        test39.addVariants("what");
        test39.addVariants("who");
        test39.addVariants("which");
        test39.addVariants("where");
        test39.addVariants("when");
        test1.add(test39);

        QuestionData test40 = new QuestionData("You shouldn’t live with a man ___ doesn’t love you.", "who");
        test40.addVariants("that");
        test40.addVariants("which");
        test40.addVariants("who");
        test40.addVariants("what");
        test40.addVariants("whom");
        test1.add(test40);

        QuestionData test41 = new QuestionData("You must find somebody ___ can help you.", "who");
        test41.addVariants("whose");
        test41.addVariants("whom");
        test41.addVariants("who");
        test41.addVariants("what");
        test41.addVariants("which");
        test1.add(test41);

        QuestionData test42 = new QuestionData("Who could tell ___ his son’s circumstances really was.", "what");
        test42.addVariants("which");
        test42.addVariants("that");
        test42.addVariants("why");
        test42.addVariants("what");
        test42.addVariants("whose");
        test1.add(test42);

        QuestionData test43 = new QuestionData("Here are the books, ___ is yours?", "which");
        test43.addVariants("what");
        test43.addVariants("which");
        test43.addVariants("whose");
        test43.addVariants("wherever");
        test43.addVariants("whether");
        test1.add(test43);

        QuestionData test44 = new QuestionData("When they saw a POLICEMAN they stopped in the middle of the STREET.", "him/it");
        test44.addVariants("his/him");
        test44.addVariants("him/it");
        test44.addVariants("her/its");
        test44.addVariants("he/it");
        test44.addVariants("him/ours");
        test1.add(test44);

        QuestionData test45 = new QuestionData("He didn’t take many clothes with ___", "him");
        test45.addVariants("them");
        test45.addVariants("him");
        test45.addVariants("his");
        test45.addVariants("your");
        test45.addVariants("ours");
        test1.add(test45);

        QuestionData test46 = new QuestionData("-On what days do you have English lessons?\n" +
                "-We have ___ on Tuesday, Wednesday and Friday.", "them");
        test46.addVariants("them");
        test46.addVariants("it");
        test46.addVariants("her");
        test46.addVariants("him");
        test46.addVariants("they");
        test1.add(test46);

        QuestionData test47 = new QuestionData("Nick knows English well. Ask ___ to help you.", "him");
        test47.addVariants("her");
        test47.addVariants("her");
        test47.addVariants("me");
        test47.addVariants("him");
        test47.addVariants("us");
        test1.add(test47);

        QuestionData test48 = new QuestionData("He wanted ___ to ring ___ up.", "you/him");
        test48.addVariants("they/them");
        test48.addVariants("her/your");
        test48.addVariants("you/him");
        test48.addVariants("them/their");
        test48.addVariants("us/his");
        test1.add(test48);

        QuestionData test49 = new QuestionData("I can’t find all the books you asked me for. I put ___ I found on your desk.", "those");
        test49.addVariants("the");
        test49.addVariants("this");
        test49.addVariants("that");
        test49.addVariants("those");
        test49.addVariants("its");
        test1.add(test49);

        QuestionData test50 = new QuestionData("Leave THE CHILDREN alone.", "them");
        test50.addVariants("they");
        test50.addVariants("us");
        test50.addVariants("them");
        test50.addVariants("its");
        test50.addVariants("our");
        test1.add(test50);

        QuestionData test51 = new QuestionData("", "");
        test51.addVariants("");
        test51.addVariants("");
        test51.addVariants("");
        test51.addVariants("");
        test51.addVariants("");
        test1.add(test51);

        QuestionData test52 = new QuestionData("", "");
        test52.addVariants("");
        test52.addVariants("");
        test52.addVariants("");
        test52.addVariants("");
        test52.addVariants("");
        test1.add(test52);

        QuestionData test53 = new QuestionData("", "");
        test53.addVariants("");
        test53.addVariants("");
        test53.addVariants("");
        test53.addVariants("");
        test53.addVariants("");
        test1.add(test53);

        QuestionData test54 = new QuestionData("", "");
        test54.addVariants("");
        test54.addVariants("");
        test54.addVariants("");
        test54.addVariants("");
        test54.addVariants("");
        test1.add(test54);

        QuestionData test55 = new QuestionData("", "");
        test55.addVariants("");
        test55.addVariants("");
        test55.addVariants("");
        test55.addVariants("");
        test55.addVariants("");
        test1.add(test55);

        QuestionData test56 = new QuestionData("", "");
        test56.addVariants("");
        test56.addVariants("");
        test56.addVariants("");
        test56.addVariants("");
        test56.addVariants("");
        test1.add(test56);

        QuestionData test57 = new QuestionData("", "");
        test57.addVariants("");
        test57.addVariants("");
        test57.addVariants("");
        test57.addVariants("");
        test57.addVariants("");
        test1.add(test57);

        QuestionData test58 = new QuestionData("", "");
        test58.addVariants("");
        test58.addVariants("");
        test58.addVariants("");
        test58.addVariants("");
        test58.addVariants("");
        test1.add(test58);

        QuestionData test59 = new QuestionData("", "");
        test59.addVariants("");
        test59.addVariants("");
        test59.addVariants("");
        test59.addVariants("");
        test59.addVariants("");
        test1.add(test59);

        QuestionData test60 = new QuestionData("", "");
        test60.addVariants("");
        test60.addVariants("");
        test60.addVariants("");
        test60.addVariants("");
        test60.addVariants("");
        test1.add(test60);

        QuestionData test61 = new QuestionData("", "");
        test61.addVariants("");
        test61.addVariants("");
        test61.addVariants("");
        test61.addVariants("");
        test61.addVariants("");
        test1.add(test61);

        QuestionData test62 = new QuestionData("", "");
        test62.addVariants("");
        test62.addVariants("");
        test62.addVariants("");
        test62.addVariants("");
        test62.addVariants("");
        test1.add(test62);

        QuestionData test63 = new QuestionData("", "");
        test63.addVariants("");
        test63.addVariants("");
        test63.addVariants("");
        test63.addVariants("");
        test63.addVariants("");
        test1.add(test63);

        QuestionData test64 = new QuestionData("", "");
        test64.addVariants("");
        test64.addVariants("");
        test64.addVariants("");
        test64.addVariants("");
        test64.addVariants("");
        test1.add(test64);

        QuestionData test65 = new QuestionData("", "");
        test65.addVariants("");
        test65.addVariants("");
        test65.addVariants("");
        test65.addVariants("");
        test65.addVariants("");
        test1.add(test65);

        QuestionData test66 = new QuestionData("", "");
        test66.addVariants("");
        test66.addVariants("");
        test66.addVariants("");
        test66.addVariants("");
        test66.addVariants("");
        test1.add(test66);

        QuestionData test67 = new QuestionData("", "");
        test67.addVariants("");
        test67.addVariants("");
        test67.addVariants("");
        test67.addVariants("");
        test67.addVariants("");
        test1.add(test67);

        QuestionData test68 = new QuestionData("", "");
        test68.addVariants("");
        test68.addVariants("");
        test68.addVariants("");
        test68.addVariants("");
        test68.addVariants("");
        test1.add(test68);

        QuestionData test69 = new QuestionData("", "");
        test69.addVariants("");
        test69.addVariants("");
        test69.addVariants("");
        test69.addVariants("");
        test69.addVariants("");
        test1.add(test69);

        QuestionData test70 = new QuestionData("", "");
        test70.addVariants("");
        test70.addVariants("");
        test70.addVariants("");
        test70.addVariants("");
        test70.addVariants("");
        test1.add(test70);

        QuestionData test71 = new QuestionData("", "");
        test71.addVariants("");
        test71.addVariants("");
        test71.addVariants("");
        test71.addVariants("");
        test71.addVariants("");
        test1.add(test71);

        QuestionData test72 = new QuestionData("", "");
        test72.addVariants("");
        test72.addVariants("");
        test72.addVariants("");
        test72.addVariants("");
        test72.addVariants("");
        test1.add(test72);

        QuestionData test73 = new QuestionData("", "");
        test73.addVariants("");
        test73.addVariants("");
        test73.addVariants("");
        test73.addVariants("");
        test73.addVariants("");
        test1.add(test73);

        QuestionData test74 = new QuestionData("", "");
        test74.addVariants("");
        test74.addVariants("");
        test74.addVariants("");
        test74.addVariants("");
        test74.addVariants("");
        test1.add(test74);

        QuestionData test75 = new QuestionData("", "");
        test75.addVariants("");
        test75.addVariants("");
        test75.addVariants("");
        test75.addVariants("");
        test75.addVariants("");
        test1.add(test75);

        QuestionData test76 = new QuestionData("", "");
        test76.addVariants("");
        test76.addVariants("");
        test76.addVariants("");
        test76.addVariants("");
        test76.addVariants("");
        test1.add(test76);

        QuestionData test77 = new QuestionData("", "");
        test77.addVariants("");
        test77.addVariants("");
        test77.addVariants("");
        test77.addVariants("");
        test77.addVariants("");
        test1.add(test77);

        QuestionData test78 = new QuestionData("", "");
        test78.addVariants("");
        test78.addVariants("");
        test78.addVariants("");
        test78.addVariants("");
        test78.addVariants("");
        test1.add(test78);

        QuestionData test79 = new QuestionData("", "");
        test79.addVariants("");
        test79.addVariants("");
        test79.addVariants("");
        test79.addVariants("");
        test79.addVariants("");
        test1.add(test79);

        QuestionData test80 = new QuestionData("", "");
        test80.addVariants("");
        test80.addVariants("");
        test80.addVariants("");
        test80.addVariants("");
        test80.addVariants("");
        test1.add(test80);

        QuestionData test81 = new QuestionData("", "");
        test81.addVariants("");
        test81.addVariants("");
        test81.addVariants("");
        test81.addVariants("");
        test81.addVariants("");
        test1.add(test81);

        QuestionData test82 = new QuestionData("", "");
        test82.addVariants("");
        test82.addVariants("");
        test82.addVariants("");
        test82.addVariants("");
        test82.addVariants("");
        test1.add(test82);

        QuestionData test83 = new QuestionData("", "");
        test83.addVariants("");
        test83.addVariants("");
        test83.addVariants("");
        test83.addVariants("");
        test83.addVariants("");
        test1.add(test83);

        QuestionData test84 = new QuestionData("", "");
        test84.addVariants("");
        test84.addVariants("");
        test84.addVariants("");
        test84.addVariants("");
        test84.addVariants("");
        test1.add(test84);

        QuestionData test85 = new QuestionData("", "");
        test85.addVariants("");
        test85.addVariants("");
        test85.addVariants("");
        test85.addVariants("");
        test85.addVariants("");
        test1.add(test85);

        QuestionData test86 = new QuestionData("", "");
        test86.addVariants("");
        test86.addVariants("");
        test86.addVariants("");
        test86.addVariants("");
        test86.addVariants("");
        test1.add(test86);

        QuestionData test87 = new QuestionData("", "");
        test87.addVariants("");
        test87.addVariants("");
        test87.addVariants("");
        test87.addVariants("");
        test87.addVariants("");
        test1.add(test87);

        QuestionData test88 = new QuestionData("", "");
        test88.addVariants("");
        test88.addVariants("");
        test88.addVariants("");
        test88.addVariants("");
        test88.addVariants("");
        test1.add(test88);

        QuestionData test89 = new QuestionData("", "");
        test89.addVariants("");
        test89.addVariants("");
        test89.addVariants("");
        test89.addVariants("");
        test89.addVariants("");
        test1.add(test89);

        QuestionData test90 = new QuestionData("", "");
        test90.addVariants("");
        test90.addVariants("");
        test90.addVariants("");
        test90.addVariants("");
        test90.addVariants("");
        test1.add(test90);

        QuestionData test91 = new QuestionData("", "");
        test91.addVariants("");
        test91.addVariants("");
        test91.addVariants("");
        test91.addVariants("");
        test91.addVariants("");
        test1.add(test91);

        QuestionData test92 = new QuestionData("", "");
        test92.addVariants("");
        test92.addVariants("");
        test92.addVariants("");
        test92.addVariants("");
        test92.addVariants("");
        test1.add(test92);

        QuestionData test93 = new QuestionData("", "");
        test93.addVariants("");
        test93.addVariants("");
        test93.addVariants("");
        test93.addVariants("");
        test93.addVariants("");
        test1.add(test93);

        QuestionData test94 = new QuestionData("", "");
        test94.addVariants("");
        test94.addVariants("");
        test94.addVariants("");
        test94.addVariants("");
        test94.addVariants("");
        test1.add(test94);

        QuestionData test95 = new QuestionData("", "");
        test95.addVariants("");
        test95.addVariants("");
        test95.addVariants("");
        test95.addVariants("");
        test95.addVariants("");
        test1.add(test95);

        QuestionData test96 = new QuestionData("", "");
        test96.addVariants("");
        test96.addVariants("");
        test96.addVariants("");
        test96.addVariants("");
        test96.addVariants("");
        test1.add(test96);

        QuestionData test97 = new QuestionData("", "");
        test97.addVariants("");
        test97.addVariants("");
        test97.addVariants("");
        test97.addVariants("");
        test97.addVariants("");
        test1.add(test97);

        QuestionData test98 = new QuestionData("", "");
        test98.addVariants("");
        test98.addVariants("");
        test98.addVariants("");
        test98.addVariants("");
        test98.addVariants("");
        test1.add(test98);

        QuestionData test99 = new QuestionData("", "");
        test99.addVariants("");
        test99.addVariants("");
        test99.addVariants("");
        test99.addVariants("");
        test99.addVariants("");
        test1.add(test99);

        QuestionData test100 = new QuestionData("", "");
        test100.addVariants("");
        test100.addVariants("");
        test100.addVariants("");
        test100.addVariants("");
        test100.addVariants("");
        test1.add(test100);

        return test1;
    }

}