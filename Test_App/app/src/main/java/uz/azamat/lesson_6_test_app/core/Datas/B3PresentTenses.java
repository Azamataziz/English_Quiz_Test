package uz.azamat.lesson_6_test_app.core.Datas;

import java.util.ArrayList;

import uz.azamat.lesson_6_test_app.core.QuestionData;

public class B3PresentTenses {

    public static ArrayList<QuestionData> makeTest1() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test_1_1 = new QuestionData("I’m taking my sister out as she ___ any sun for a long time.", "hasn’t had");
        test_1_1.addVariants("hasn’t had");
        test_1_1.addVariants("haven’t had");
        test_1_1.addVariants("hadn’t been");
        test_1_1.addVariants("hadn’t been");
        test_1_1.addVariants("shall have");
        test1.add(test_1_1);

        QuestionData test_1_2 = new QuestionData("He ___ ill for three months already.", "has been");
        test_1_2.addVariants("was");
        test_1_2.addVariants("has been");
        test_1_2.addVariants("is");
        test_1_2.addVariants("have been");
        test_1_2.addVariants("were");
        test1.add(test_1_2);

        QuestionData test_1_3 = new QuestionData("Who goes sightseeing?", "Nina does.");
        test_1_3.addVariants("Nina does.");
        test_1_3.addVariants("We shall.");
        test_1_3.addVariants("We did.");
        test_1_3.addVariants("I did.");
        test_1_3.addVariants("She has.");
        test1.add(test_1_3);

        QuestionData test4 = new QuestionData("I usually ___ a blouse and jeans at home, but today I ___ on a new dress.", "wear/have put");
        test4.addVariants("wear/have put");
        test4.addVariants("have worn/have put");
        test4.addVariants("wore/has put");
        test4.addVariants("wears/has put");
        test4.addVariants("will wear/put");
        test1.add(test4);

        QuestionData test5 = new QuestionData("What ___ the president ___?\n" +
                "-He ___ a contract.", "is/doing/is signing");
        test5.addVariants("does/do/has signed");
        test5.addVariants("is/doing/is signing");
        test5.addVariants("will/do/was signing");
        test5.addVariants("is/ going to do/would sign");
        test5.addVariants("shall/do/has been signing");
        test1.add(test5);

        QuestionData test6 = new QuestionData("Look! The cat ___ your cutlet.", "is eating");
        test6.addVariants("is eating");
        test6.addVariants("was eating");
        test6.addVariants("eats");
        test6.addVariants("has been eating");
        test6.addVariants("had eaten");
        test1.add(test6);

        QuestionData test7 = new QuestionData("You look pale. You ___ too hard these days.", "have been working");
        test7.addVariants("have been working");
        test7.addVariants("worked");
        test7.addVariants("are working");
        test7.addVariants("work");
        test7.addVariants("were working");
        test1.add(test7);

        QuestionData test8 = new QuestionData("What ___ you ___ since I saw you last?", "have/been doing");
        test8.addVariants("do/do");
        test8.addVariants("are/doing");
        test8.addVariants("have/been doing");
        test8.addVariants("did/do");
        test8.addVariants("will/do");
        test1.add(test8);

        QuestionData test9 = new QuestionData("It is 8.30. Ben and Ann ___ breakfast.", "are having");
        test9.addVariants("have");
        test9.addVariants("are having");
        test9.addVariants("is having");
        test9.addVariants("was having");
        test9.addVariants("were having");
        test1.add(test9);

        QuestionData test10 = new QuestionData("She ___ a journalist nowadays.", "is");
        test10.addVariants("are");
        test10.addVariants("was");
        test10.addVariants("is");
        test10.addVariants("were");
        test10.addVariants("am");
        test1.add(test10);

        QuestionData test11 = new QuestionData("You ___ always ___ your things. Put them into their bag.", "are/losing");
        test11.addVariants("are/losing");
        test11.addVariants("-/lost");
        test11.addVariants("have/lost");
        test11.addVariants("shall/have been losing");
        test11.addVariants("had/lust");
        test1.add(test11);

        QuestionData test12 = new QuestionData("What place ___ the youth of our country occupy in all branches now?", "does");
        test12.addVariants("did");
        test12.addVariants("shall");
        test12.addVariants("is");
        test12.addVariants("does");
        test12.addVariants("will");
        test1.add(test12);

        QuestionData test13 = new QuestionData("I ___ home for lunch on Mondays. I have lunch in the canteen.", "don’t go");
        test13.addVariants("didn’t go");
        test13.addVariants("was going");
        test13.addVariants("don’t go");
        test13.addVariants("doesn’t go");
        test13.addVariants("will not go");
        test1.add(test13);

        QuestionData test14 = new QuestionData("Westminster Abbey is the ancient old church in which the " +
                "coronation ceremonies of almost all English kings and queens " +
                "___ place.", "have taken");
        test14.addVariants("will take");
        test14.addVariants("was taken");
        test14.addVariants("was taking");
        test14.addVariants("is taking");
        test14.addVariants("have taken");
        test1.add(test14);

        QuestionData test15 = new QuestionData("This is the most interesting film I ___ ever ___.", "have/seen");
        test15.addVariants("didn’t/see");
        test15.addVariants("was/seen");
        test15.addVariants("have /saw");
        test15.addVariants("have/seen");
        test15.addVariants("had/seen");
        test1.add(test15);

        QuestionData test16 = new QuestionData("“Nobody ___ in that country,” said Pinocchio to his friend.", "learns");
        test16.addVariants("don’t learn");
        test16.addVariants("are learning");
        test16.addVariants("learns");
        test16.addVariants("doesn’t learn");
        test16.addVariants("learn");
        test1.add(test16);

        QuestionData test17 = new QuestionData("Paul ___ a student of Cambridge University.", "is");
        test17.addVariants("were");
        test17.addVariants("are");
        test17.addVariants("am");
        test17.addVariants("be");
        test17.addVariants("is");
        test1.add(test17);

        QuestionData test18 = new QuestionData("“Little boy”, said a man, “why do you carry that umbrella over your " +
                "head? It ___ and the sun ___”", "isn’t raining/isn’t shining");
        test18.addVariants("rains/isn’t shining");
        test18.addVariants("doesn’t rain/shines");
        test18.addVariants("isn’t raining/isn’t shining");
        test18.addVariants("is raining/is shining");
        test18.addVariants("isn’t raining/don’t shine");
        test1.add(test18);

        QuestionData test19 = new QuestionData("Who often has dinner at the canteen?", "we do");
        test19.addVariants("I did");
        test19.addVariants("we do");
        test19.addVariants("he had");
        test19.addVariants("they have");
        test19.addVariants("she will");
        test1.add(test19);

        QuestionData test20 = new QuestionData("I ___ never ___ him before.", "have/met");
        test20.addVariants("- /met");
        test20.addVariants("- /meet");
        test20.addVariants("have/met");
        test20.addVariants("has/met");
        test20.addVariants("-/meets");
        test1.add(test20);

        QuestionData test21 = new QuestionData("The weather is awful, it ___ all day.", "has been raining");
        test21.addVariants("rains");
        test21.addVariants("is raining");
        test21.addVariants("rained");
        test21.addVariants("has rained");
        test21.addVariants("has been raining");
        test1.add(test21);

        QuestionData test22 = new QuestionData("It is 2 o’clock. I ___ afraid I ___ late.", "am/am");
        test22.addVariants("was/am");
        test22.addVariants("shall be/am");
        test22.addVariants("am/am");
        test22.addVariants("was/was");
        test22.addVariants("am/wasn’t");
        test1.add(test22);

        QuestionData test23 = new QuestionData("Who usually answers these letters in your office?", "I do, of course.");
        test23.addVariants("My friend can.");
        test23.addVariants("That man will.");
        test23.addVariants("I do, of course.");
        test23.addVariants("Mary is.");
        test23.addVariants("Those engineers did.");
        test1.add(test23);

        QuestionData test24 = new QuestionData("The milk is hot I ___ on it to make it cold.", "am blowing");
        test24.addVariants("am blowing");
        test24.addVariants("blow");
        test24.addVariants("is blowing");
        test24.addVariants("blew");
        test24.addVariants("had blown");
        test1.add(test24);

        QuestionData test25 = new QuestionData("- You don’t like horror films, do you?\n" +
                "- ___ . They are so terrifying.", "No, I don’t.");
        test25.addVariants("Yes, I can.");
        test25.addVariants("No, I can’t.");
        test25.addVariants("No, I don’t.");
        test25.addVariants("Yes, I do.");
        test25.addVariants("No, we didn’t.");
        test1.add(test25);

        QuestionData test26 = new QuestionData("___ this engineer work at the Ministry of Foreign Affairs.", "does");
        test26.addVariants("do");
        test26.addVariants("does");
        test26.addVariants("has");
        test26.addVariants("had");
        test26.addVariants("shall");
        test1.add(test26);

        QuestionData test27 = new QuestionData("He ___ never ___ him sing.", "has___heard");
        test27.addVariants("had___ heard");
        test27.addVariants("has___heard");
        test27.addVariants("have___ heard");
        test27.addVariants("was___ hearing");
        test27.addVariants("is___ hearing");
        test1.add(test27);

        QuestionData test28 = new QuestionData("I think ___ .", "he is about fifty");
        test28.addVariants("if he is about fifty");
        test28.addVariants("he is about fifty");
        test28.addVariants("her about fifty");
        test28.addVariants("him about fifty");
        test28.addVariants("be about fifty");
        test1.add(test28);

        QuestionData test29 = new QuestionData("I miss her very much, almost every minute of the day I think of " +
                "her, or I think I ___ her.", "hear");
        test29.addVariants("am hearing");
        test29.addVariants("hear");
        test29.addVariants("heard");
        test29.addVariants("have heard");
        test29.addVariants("will hear");
        test1.add(test29);

        QuestionData test30 = new QuestionData("Look! There ___ a man sitting at the first table near the door. He " +
                "___ at us.", "is/is looking");
        test30.addVariants("was/looks");
        test30.addVariants("had been/looked");
        test30.addVariants("were/had looked");
        test30.addVariants("is/is looking");
        test30.addVariants("is/was looking");
        test1.add(test30);

        QuestionData test31 = new QuestionData("These engineers always ___ in the office and ___", "stay/learn");
        test31.addVariants("stayed/learn");
        test31.addVariants("stay/learn");
        test31.addVariants("stays/learns");
        test31.addVariants("have stayed/learned");
        test31.addVariants("stay/learned");
        test1.add(test31);

        QuestionData test32 = new QuestionData("It’s the happiest evening I ever ___ .", "have had");
        test32.addVariants("had");
        test32.addVariants("have had");
        test32.addVariants("has");
        test32.addVariants("has had");
        test32.addVariants("had had");
        test1.add(test32);

        QuestionData test33 = new QuestionData("Let me show the picture that I ___ this week.", "have drawn");
        test33.addVariants("am drawing");
        test33.addVariants("shall be drawing");
        test33.addVariants("have drawn");
        test33.addVariants("drew");
        test33.addVariants("will be drawing");
        test1.add(test33);

        QuestionData test34 = new QuestionData("This is the 7th year Ann and Mary ___ this school.", "have been attending");
        test34.addVariants("has attended");
        test34.addVariants("have been attending");
        test34.addVariants("had been attending");
        test34.addVariants("are attending");
        test34.addVariants("were attending");
        test1.add(test34);

        QuestionData test35 = new QuestionData("He ___ his English in the morning, he ___ it in the evening.", "doesn’t have/has");
        test35.addVariants("doesn’t have/is having");
        test35.addVariants("don’t have/had");
        test35.addVariants("doesn’t have/has");
        test35.addVariants("didn’t have/have");
        test35.addVariants("hadn’t/will have");
        test1.add(test35);

        QuestionData test36 = new QuestionData("The sun ___ in the East and ___ in the West.", "rises/sets");
        test36.addVariants("sets/rises");
        test36.addVariants("sets/goes");
        test36.addVariants("rises/sets");
        test36.addVariants("goes/rises");
        test36.addVariants("set/rise");
        test1.add(test36);

        QuestionData test37 = new QuestionData("While ___ to school we always ___ a bus.", "going/take");
        test37.addVariants("going/take");
        test37.addVariants("went/take");
        test37.addVariants("shall go/will take");
        test37.addVariants("had gone/took");
        test37.addVariants("goes/takes");
        test1.add(test37);

        QuestionData test38 = new QuestionData("We don’t like him because he always ___ lies.", "tells");
        test38.addVariants("tell");
        test38.addVariants("was telling");
        test38.addVariants("tells");
        test38.addVariants("are telling");
        test38.addVariants("has told");
        test1.add(test38);

        QuestionData test39 = new QuestionData("I ___ all my work. I am free now.", "have done");
        test39.addVariants("do");
        test39.addVariants("am doing");
        test39.addVariants("shall do");
        test39.addVariants("have done");
        test39.addVariants("had done");
        test1.add(test39);

        QuestionData test40 = new QuestionData("She ___ at school since 1984.", "has been teaching");
        test40.addVariants("teach");
        test40.addVariants("has been teaching");
        test40.addVariants("taught");
        test40.addVariants("was teaching");
        test40.addVariants("have taught");
        test1.add(test40);

        QuestionData test41 = new QuestionData("- ___ your father ___ at the Medical College?\n" +
                "- Yes, he does.", "does/work");
        test41.addVariants("do/work");
        test41.addVariants("did/work");
        test41.addVariants("has/worked");
        test41.addVariants("does/work");
        test41.addVariants("shall/work");
        test1.add(test41);

        QuestionData test42 = new QuestionData("He ___ to school at 7:30 and ___ at 2 o’clock.", "goes/comes back");
        test42.addVariants("goes/comes back");
        test42.addVariants("went/is coming back");
        test42.addVariants("go/come back");
        test42.addVariants("was going/has come back");
        test42.addVariants("is going/came back");
        test1.add(test42);

        QuestionData test43 = new QuestionData("-You ___ not ___ your soup.\n" +
                "-I’m sorry. I’m not hungry.", "are/eating");
        test43.addVariants("are/eat");
        test43.addVariants("has/eaten");
        test43.addVariants("are/eating");
        test43.addVariants("did/ate");
        test43.addVariants("will/eat");
        test1.add(test43);

        QuestionData test44 = new QuestionData("-Who ___ French in your family?\n" +
                "-I ___ .", "speaks/do");
        test44.addVariants("speaks/do");
        test44.addVariants("speak/does");
        test44.addVariants("spoke/do");
        test44.addVariants("speaking/did");
        test44.addVariants("are speaking/did");
        test1.add(test44);

        QuestionData test45 = new QuestionData("Although Mary has been cooking for many years, she still ___ " +
                "how to prepare Chinese food.", "doesn’t know");
        test45.addVariants("did not know");
        test45.addVariants("know");
        test45.addVariants("don’t know");
        test45.addVariants("doesn’t know");
        test45.addVariants("hadn’t known");
        test1.add(test45);

        QuestionData test46 = new QuestionData("The aims of the course ___ me willing to begin.", "make");
        test46.addVariants("makes");
        test46.addVariants("is making");
        test46.addVariants("were made");
        test46.addVariants("make");
        test46.addVariants("making");
        test1.add(test46);

        QuestionData test47 = new QuestionData("Listen! Somebody ___ in the next room.", "d");
        test47.addVariants("sing");
        test47.addVariants("sings");
        test47.addVariants("are singing");
        test47.addVariants("is singing");
        test47.addVariants("is sung");
        test1.add(test47);

        QuestionData test48 = new QuestionData("-___ life ___ on Mars?\n" +
                "-No, it ___ .", "Does/exist/doesn’t");
        test48.addVariants("Does/exist/doesn’t");
        test48.addVariants("Did/existed/didn’t");
        test48.addVariants("Has/existed/had");
        test48.addVariants("Had/existed/had");
        test48.addVariants("Will/exist/will");
        test1.add(test48);

        QuestionData test49 = new QuestionData("I ___ this man at all.", "don’t know");
        test49.addVariants("don’t know");
        test49.addVariants("know");
        test49.addVariants("knew");
        test49.addVariants("have known");
        test49.addVariants("doesn’t know");
        test1.add(test49);

        QuestionData test50 = new QuestionData("The boys ___ four English books this year.", "have read");
        test50.addVariants("read");
        test50.addVariants("had read");
        test50.addVariants("reads");
        test50.addVariants("have read");
        test50.addVariants("do read");
        test1.add(test50);

        QuestionData test51 = new QuestionData("I know he reads every book I ___ ever ___ of.", "have/heard");
        test51.addVariants("-/hear");
        test51.addVariants("-/heard");
        test51.addVariants("have/heard");
        test51.addVariants("has/heard");
        test51.addVariants("had/heard");
        test1.add(test51);

        QuestionData test52 = new QuestionData("Nothing will make him ___ back to her.", "come");
        test52.addVariants("to come");
        test52.addVariants("come");
        test52.addVariants("came");
        test52.addVariants("coming");
        test52.addVariants("would come");
        test1.add(test52);

        QuestionData test53 = new QuestionData("Listen! Someone ___ at the door.", "is knocking");
        test53.addVariants("knocks");
        test53.addVariants("to knock");
        test53.addVariants("has knocked");
        test53.addVariants("is knocking");
        test53.addVariants("has been knocking");
        test1.add(test53);

        QuestionData test54 = new QuestionData("“This thief ___ usually promise to steal again,” said Sherlock Holmes.", "d");
        test54.addVariants("won’t");
        test54.addVariants("didn’t");
        test54.addVariants("isn’t");
        test54.addVariants("doesn’t");
        test54.addVariants("don’t");
        test1.add(test54);

        QuestionData test55 = new QuestionData("Samuel says he’s 25 years old, but nobody ___ him.", "believes");
        test55.addVariants("is believing");
        test55.addVariants("believes");
        test55.addVariants("had believed");
        test55.addVariants("don’t believe");
        test55.addVariants("doesn’t believe");
        test1.add(test55);

        QuestionData test56 = new QuestionData("The sea ___ to those who ___ to listen to it.", "speaks/like");
        test56.addVariants("speaks/likes");
        test56.addVariants("speak/like");
        test56.addVariants("speaks/like");
        test56.addVariants("speak/likes");
        test56.addVariants("speak/will like");
        test1.add(test56);

        QuestionData test57 = new QuestionData("Take your umbrella. It ___ .", "is raining");
        test57.addVariants("was raining");
        test57.addVariants("rained");
        test57.addVariants("rains");
        test57.addVariants("is raining");
        test57.addVariants("would be raining");
        test1.add(test57);

        QuestionData test58 = new QuestionData("We can’t disturb him now. He ___ .", "is operating");
        test58.addVariants("operate");
        test58.addVariants("will operate");
        test58.addVariants("has operated");
        test58.addVariants("is operating");
        test58.addVariants("operates");
        test1.add(test58);

        QuestionData test59 = new QuestionData("The children of the man who works with me ___ the window this morning.", "have broken");
        test59.addVariants("were broken");
        test59.addVariants("break");
        test59.addVariants("broke");
        test59.addVariants("have broken");
        test59.addVariants("had broken");
        test1.add(test59);

        QuestionData test60 = new QuestionData("“Who ___ this picture?” the teacher asks.", "has drawn");
        test60.addVariants("is drawn");
        test60.addVariants("drawn");
        test60.addVariants("have drawn");
        test60.addVariants("draws");
        test60.addVariants("has drawn");
        test1.add(test60);

        QuestionData test61 = new QuestionData("-Where is Comrade A?\n" +
                "-He ___ tennis.", "is playing");
        test61.addVariants("plays");
        test61.addVariants("is playing");
        test61.addVariants("played");
        test61.addVariants("has been playing");
        test61.addVariants("will play");
        test1.add(test61);

        QuestionData test62 = new QuestionData("I ___ never ___ such beautiful flowers before.", "have / seen");
        test62.addVariants("shall / see");
        test62.addVariants("had / seen");
        test62.addVariants("have / seen");
        test62.addVariants("has / seen");
        test62.addVariants("will / see");
        test1.add(test62);

        QuestionData test63 = new QuestionData("I’ve got to get him to the station. His train ___ at the moment.", "is leaving");
        test63.addVariants("leave");
        test63.addVariants("has left");
        test63.addVariants("had left");
        test63.addVariants("is leaving");
        test63.addVariants("are leaving");
        test1.add(test63);

        QuestionData test64 = new QuestionData("-What ___ you ___?\n" +
                "-I ___ now.", "are/doing/am washing up");
        test64.addVariants("are/doing/am washing up");
        test64.addVariants("have/done/am washing up");
        test64.addVariants("have/done/am washing up");
        test64.addVariants("were/done/have washed up");
        test64.addVariants("is/doing/did not wash up");
        test1.add(test64);

        QuestionData test65 = new QuestionData("We can go out now. It ___ .", "isn’t raining");
        test65.addVariants("don’t rain");
        test65.addVariants("rains");
        test65.addVariants("didn’t rain");
        test65.addVariants("has rained");
        test65.addVariants("isn’t raining");
        test1.add(test65);

        QuestionData test66 = new QuestionData("You’ll see what I ___ about you recently.", "have written");
        test66.addVariants("shall write");
        test66.addVariants("have written");
        test66.addVariants("had written");
        test66.addVariants("is written");
        test66.addVariants("was written");
        test1.add(test66);

        QuestionData test67 = new QuestionData("She ___ since last week.", "has been ill");
        test67.addVariants("is ill");
        test67.addVariants("was ill");
        test67.addVariants("had been ill");
        test67.addVariants("has been ill");
        test67.addVariants("will be ill");
        test1.add(test67);

        QuestionData test68 = new QuestionData("Listen! Somebody ___ at the door.", "is knocking");
        test68.addVariants("knocked");
        test68.addVariants("has knocked");
        test68.addVariants("is knocking");
        test68.addVariants("was knocking");
        test68.addVariants("knocks");
        test1.add(test68);

        QuestionData test69 = new QuestionData("This year we ___ a good harvest of cotton.", "has grown");
        test69.addVariants("has grown");
        test69.addVariants("has grown");
        test69.addVariants("grown");
        test69.addVariants("were growing");
        test69.addVariants("are grown");
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
