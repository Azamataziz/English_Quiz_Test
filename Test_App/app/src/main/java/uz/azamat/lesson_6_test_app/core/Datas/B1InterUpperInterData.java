package uz.azamat.lesson_6_test_app.core.Datas;

import java.util.ArrayList;

import uz.azamat.lesson_6_test_app.core.QuestionData;

public class B1InterUpperInterData {

    //  104 - Pronouns - Adverbs - Adjectives - Determiners
    public static ArrayList<QuestionData> makeTest1() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test_1 = new QuestionData("The series of TV programs that has just finished ______ very useful.", "wasn’t");
        test_1.addVariants("are");
        test_1.addVariants("weren’t");
        test_1.addVariants("wasn’t");
        test_1.addVariants("were");
        test1.add(test_1);

        QuestionData test2 = new QuestionData("A new means of detecting gold in travelers’ luggage ______ recently been brought into use.", "has");
        test2.addVariants("has");
        test2.addVariants("have");
        test2.addVariants("is");
        test2.addVariants("was");
        test1.add(test2);

        QuestionData test3 = new QuestionData("Physics ______ a subject that has grown enormously in importance during this century.", "is");
        test3.addVariants("are");
        test3.addVariants("was");
        test3.addVariants("is");
        test3.addVariants("have been");
        test1.add(test3);

        QuestionData test4 = new QuestionData("A pack of cards ______ scattered over the table.", "is");
        test4.addVariants("is");
        test4.addVariants("are");
        test4.addVariants("were");
        test4.addVariants("have been");
        test1.add(test4);


        QuestionData test5 = new QuestionData("The few words he spoke ______ well chosen.", "were");
        test5.addVariants("is");
        test5.addVariants("was");
        test5.addVariants("were");
        test5.addVariants("wasn't");
        test1.add(test5);


        QuestionData test6 = new QuestionData("Some of his advice ______ funny.", "was");
        test6.addVariants("are");
        test6.addVariants("were");
        test6.addVariants("was");
        test6.addVariants("aren’t");
        test1.add(test6);

        QuestionData test7 = new QuestionData("Let’s get ______ lettuce.", "a head of");
        test7.addVariants("head of");
        test7.addVariants("a head of");
        test7.addVariants("head of a");
        test7.addVariants("a head");
        test1.add(test7);

        QuestionData test8 = new QuestionData("There were ______ snow on the car.", "two feet of");
        test8.addVariants("two feet of");
        test8.addVariants("two feet");
        test8.addVariants("a two-feet");
        test8.addVariants("a foot");
        test1.add(test8);

        QuestionData test9 = new QuestionData("The poor ______ unable to look after themselves.", "are");
        test9.addVariants("are");
        test9.addVariants("is");
        test9.addVariants("was");
        test9.addVariants("has been");
        test1.add(test9);


        QuestionData test10 = new QuestionData("Two dozens of cows ______ lying peacefully in the shade.", "were");
        test10.addVariants("were");
        test10.addVariants("was");
        test10.addVariants("has been");
        test10.addVariants("is");
        test1.add(test10);


        QuestionData test11 = new QuestionData("The Town Council ______ against raising the rents of its houses.", "is");
        test11.addVariants("are");
        test11.addVariants("were");
        test11.addVariants("is");
        test11.addVariants("aren’t");
        test1.add(test11);


        QuestionData test12 = new QuestionData("A ______ of vitamin C results in skin infections and slow healing.", "shortage");
        test12.addVariants("short");
        test12.addVariants("shortage");
        test12.addVariants("shorten");
        test12.addVariants("shortly");
        test1.add(test12);


        QuestionData test13 = new QuestionData("What is the difference in ______ between the Amazon and the Nile?", "length");
        test13.addVariants("long");
        test13.addVariants("wide");
        test13.addVariants("length");
        test13.addVariants("deep");
        test1.add(test13);


        QuestionData test14 = new QuestionData("How many of ______ are present in class?", "the girls");
        test14.addVariants("the girls");
        test14.addVariants("girls");
        test14.addVariants("girls’");
        test14.addVariants("the girl’s");
        test1.add(test14);


        QuestionData test15 = new QuestionData("This isn’t ______ bottle.", "a big enough");
        test15.addVariants("a big enough");
        test15.addVariants("big enough");
        test15.addVariants("big enough a");
        test15.addVariants("enough big a");
        test1.add(test15);


        QuestionData test16 = new QuestionData("We don’t have ______ vacation.", "a long enough");
        test16.addVariants("long enough");
        test16.addVariants("a long enough");
        test16.addVariants("long enough a");
        test16.addVariants("enough a long");
        test1.add(test16);


        QuestionData test17 = new QuestionData("That’s too ______ for swimming.", "shallow a lake");
        test17.addVariants("a shallow lake");
        test17.addVariants("a lake shallow");
        test17.addVariants("shallow a lake");
        test17.addVariants("lake shallow");
        test1.add(test17);


        QuestionData test18 = new QuestionData("It isn’t ______ job for me to do alone.", "an easy enough");
        test18.addVariants("easy enough a");
        test18.addVariants("an easy enough");
        test18.addVariants("enough an easy");
        test18.addVariants("an enough easy");
        test1.add(test18);


        QuestionData test19 = new QuestionData("That’s too ______ for me to carry.", "heavy a suitcase");
        test19.addVariants("heavy a suitcase");
        test19.addVariants("heavy suitcase");
        test19.addVariants("a heavy suitcase");
        test19.addVariants("a suitcase heavy");
        test1.add(test19);


        QuestionData test20 = new QuestionData("It wasn’t as clear ______ today.", "a day as");
        test20.addVariants("day as");
        test20.addVariants("day as is");
        test20.addVariants("a day as");
        test20.addVariants("is a day");
        test1.add(test20);


        QuestionData test21 = new QuestionData("I guess I didn’t buy her ______ gift.", "an expensive enough");
        test21.addVariants("expensive enough");
        test21.addVariants("an expensive enough");
        test21.addVariants("expensive enough a");
        test21.addVariants("an enough expensive");
        test1.add(test21);


        QuestionData test22 = new QuestionData("You don’t need as fast ______ she bought.", "a car as");
        test22.addVariants("a car as");
        test22.addVariants("car as one");
        test22.addVariants("car as");
        test22.addVariants("as a car");
        test1.add(test22);


        QuestionData test23 = new QuestionData("That isn’t as busy ______ this one.", "a corner as");
        test23.addVariants("as a corner");
        test23.addVariants("corner as a");
        test23.addVariants("a corner as");
        test23.addVariants("as a corner as");
        test1.add(test23);


        QuestionData test24 = new QuestionData("Rome isn’t ______ as Milan is.", "as near to us");
        test24.addVariants("as near to us");
        test24.addVariants("as near us");
        test24.addVariants("near us to");
        test24.addVariants("to us near");
        test1.add(test24);


        QuestionData test25 = new QuestionData("It cost me ______ than I thought it would.", "more");
        test25.addVariants("fewer");
        test25.addVariants("much");
        test25.addVariants("more");
        test25.addVariants("a lot");
        test1.add(test25);


        QuestionData test26 = new QuestionData("It took us ______ time to get here than usual.", "less");
        test26.addVariants("a lot");
        test26.addVariants("little");
        test26.addVariants("less");
        test26.addVariants("long");
        test1.add(test26);


        QuestionData test27 = new QuestionData("Do you walk ______, now that you live in a village?", "more");
        test27.addVariants("a lot of");
        test27.addVariants("little");
        test27.addVariants("very many");
        test27.addVariants("more");
        test1.add(test27);


        QuestionData test28 = new QuestionData("I have two boys, but ______ of them likes pop music.", "neither");
        test28.addVariants("either");
        test28.addVariants("both");
        test28.addVariants("neither");
        test28.addVariants("none");
        test1.add(test28);


        QuestionData test29 = new QuestionData("I think my answer on the test was ______.", "the best possible choice");
        test29.addVariants("the best possible choice");
        test29.addVariants("best beyond all the choices");
        test29.addVariants("the better of all choices");
        test29.addVariants("the possible best choice");
        test1.add(test29);


        QuestionData test30 = new QuestionData("Not all English people ______ fish and chips.", "like");
        test30.addVariants("likes");
        test30.addVariants("doesn’t like");
        test30.addVariants("don’t like");
        test30.addVariants("like");
        test1.add(test30);

        QuestionData test31 = new QuestionData("It is very difficult to drive in ______.", "slow moving rush hour traffic");
        test31.addVariants("rush houred slow-moving traffic");
        test31.addVariants("slow moving traffic of rush hour");
        test31.addVariants("rush-hour slow moving traffic");
        test31.addVariants("slow moving rush hour traffic");
        test1.add(test31);

        QuestionData test32 = new QuestionData("Nobody ______ objecting to the decision to closedown the factory.", "is");
        test32.addVariants("is");
        test32.addVariants("are");
        test32.addVariants("isn’t");
        test32.addVariants("wasn’t");
        test1.add(test32);

        QuestionData test33 = new QuestionData("The audience ______ listening to a Beethoven symphony.", "is");
        test33.addVariants("are");
        test33.addVariants("is");
        test33.addVariants("were");
        test33.addVariants("have been");
        test1.add(test33);

        QuestionData test34 = new QuestionData("Neither of these roads ______ to the airport.", "goes");
        test34.addVariants("go");
        test34.addVariants("goes");
        test34.addVariants("don’t go");
        test34.addVariants("doesn’t go");
        test1.add(test34);

        QuestionData test35 = new QuestionData("Neither of the footballers ______ well.", "played");
        test35.addVariants("played");
        test35.addVariants("play");
        test35.addVariants("didn’t play");
        test35.addVariants("do play");
        test1.add(test35);

        QuestionData test36 = new QuestionData("Neither of us ______ hungry.", "is");
        test36.addVariants("is");
        test36.addVariants("aren’t");
        test36.addVariants("wasn’t");
        test36.addVariants("weren’t");
        test1.add(test36);

        QuestionData test37 = new QuestionData("Neither of them ______ interested in history.", "was");
        test37.addVariants("was");
        test37.addVariants("were");
        test37.addVariants("are");
        test37.addVariants("have been");
        test1.add(test37);

        QuestionData test38 = new QuestionData("All that glitters ______ not gold.", "is");
        test38.addVariants("are");
        test38.addVariants("is");
        test38.addVariants("were");
        test38.addVariants("aren’t");
        test1.add(test38);

        QuestionData test39 = new QuestionData("Measles ______ an infectious disease.", "is");
        test39.addVariants("are");
        test39.addVariants("were");
        test39.addVariants("is");
        test39.addVariants("aren’t");
        test1.add(test39);

        QuestionData test40 = new QuestionData("Neither Colin nor Digby ______ there.", "was");
        test40.addVariants("are");
        test40.addVariants("isn’t");
        test40.addVariants("wasn’t");
        test40.addVariants("was");
        test1.add(test40);

        QuestionData test41 = new QuestionData("Either your brakes or your eyesight ______ at fault.", "is");
        test41.addVariants("is");
        test41.addVariants("are");
        test41.addVariants("were");
        test41.addVariants("aren’t");
        test1.add(test41);

        QuestionData test42 = new QuestionData("Either David or his parents ______ at home.", "are");
        test42.addVariants("is");
        test42.addVariants("are");
        test42.addVariants("was");
        test42.addVariants("aren’t");
        test1.add(test42);

        QuestionData test43 = new QuestionData("It was a ______.", "thirty-minute show");
        test43.addVariants("thirty-minute show");
        test43.addVariants("TV show thirty minute");
        test43.addVariants("thirty minutes TV show");
        test43.addVariants("TV show of thirty minute");
        test1.add(test43);

        QuestionData test44 = new QuestionData("We saw ______ last week.", "an award winning French film");
        test44.addVariants("award winning of French film");
        test44.addVariants("A French film award winning");
        test44.addVariants("an award winning French film");
        test44.addVariants("a film of French winning award");
        test1.add(test44);

        QuestionData test45 = new QuestionData("A: What is the characteristic of people who live alone?\n" +
                "B: Some of them have tendency to talk to ______.", "themselves");
        test45.addVariants("himself");
        test45.addVariants("oneself");
        test45.addVariants("itself");
        test45.addVariants("themselves");
        test1.add(test45);

        QuestionData test46 = new QuestionData("This used to be the home ______.", "of my old friend Terry");
        test46.addVariants("my old friend Terry");
        test46.addVariants("of my old friend Terry");
        test46.addVariants("my old friend of Terry");
        test46.addVariants("my old friend Terry’s");
        test1.add(test46);

        QuestionData test47 = new QuestionData("Terry is ______.", "an old friend of mine");
        test47.addVariants("an old friend of mine");
        test47.addVariants("an old friend’s");
        test47.addVariants("old friend of me");
        test47.addVariants("my friend’s");
        test1.add(test47);

        QuestionData test48 = new QuestionData("Our family is quite ______ united family.", "a");
        test48.addVariants("*");
        test48.addVariants("a");
        test48.addVariants("the");
        test48.addVariants("an");
        test1.add(test48);

        QuestionData test49 = new QuestionData("The committee decided to award the prize to you and ______.", "me");
        test49.addVariants("I");
        test49.addVariants("we");
        test49.addVariants("his");
        test49.addVariants("me");
        test1.add(test49);

        QuestionData test50 = new QuestionData("They always give the available seats to ______ comes first.", "whoever");
        test50.addVariants("whoever");
        test50.addVariants("whom");
        test50.addVariants("whichever");
        test50.addVariants("whomever");
        test1.add(test50);

        QuestionData test51 = new QuestionData("She heard a sound ______ brought her heart into her mouth.", "which");
        test51.addVariants("what");
        test51.addVariants("who");
        test51.addVariants("whenever");
        test51.addVariants("which");
        test1.add(test51);

        QuestionData test52 = new QuestionData("A: Why are you sitting there?\n" +
                "B: Frankly, there is ______ interesting to do.", "nothing");
        test52.addVariants("anything");
        test52.addVariants("nothing");
        test52.addVariants("something");
        test52.addVariants("nothing else");
        test1.add(test52);

        QuestionData test53 = new QuestionData("A: What do you think of politics?\n" +
                "B: Oh, I find politics really ______.", "depressing");
        test53.addVariants("depress");
        test53.addVariants("depressing");
        test53.addVariants("depressed");
        test53.addVariants("be depressed");
        test1.add(test53);

        QuestionData test54 = new QuestionData("I agree. I get terribly ______ when people talk about politics.", "c");
        test54.addVariants("depression");
        test54.addVariants("depressing");
        test54.addVariants("depressed");
        test54.addVariants("be depressed");
        test1.add(test54);

        QuestionData test55 = new QuestionData("I find people who spit in the street ______.", "offensive");
        test55.addVariants("offensive");
        test55.addVariants("offensively");
        test55.addVariants("offender");
        test55.addVariants("offence");
        test1.add(test55);

        QuestionData test56 = new QuestionData("Since divorce became easier to obtain in Europe, the divorce rate has gone up ______.", "dramatically");
        test56.addVariants("dramatic");
        test56.addVariants("dramatically");
        test56.addVariants("dramatics");
        test56.addVariants("to be dramatic");
        test1.add(test56);

        QuestionData test57 = new QuestionData("They play the guitar ______.", "beautifully");
        test57.addVariants("beautiful");
        test57.addVariants("beautifully");
        test57.addVariants("very beautiful");
        test57.addVariants("a lot beautiful");
        test1.add(test57);

        QuestionData test58 = new QuestionData("I’m going to ______ next term, because the exams are getting closer.", "study hard");
        test58.addVariants("study hard");
        test58.addVariants("hardly study");
        test58.addVariants("study hardly");
        test58.addVariants("studying hard");
        test1.add(test58);

        QuestionData test59 = new QuestionData("The migration of the ducks was due to the ______ of colder weather.", "arrival");
        test59.addVariants("arriving");
        test59.addVariants("arrive");
        test59.addVariants("arrival");
        test59.addVariants("arrived");
        test1.add(test59);

        QuestionData test60 = new QuestionData("Since the old lady’s husband died, she’s been living ______.", "on her own");
        test60.addVariants("herself");
        test60.addVariants("on her own");
        test60.addVariants("by itself");
        test60.addVariants("by her");
        test1.add(test60);

        QuestionData test61 = new QuestionData("The weather changed ______. There was an ______ change in the weather.", "unexpectedly / unexpected");
        test61.addVariants("unexpected / unexpectedly");
        test61.addVariants("unexpectancy / unexpected");
        test61.addVariants("unexpectedly / unexpected");
        test61.addVariants("unexpectedly / unexpectation");
        test1.add(test61);

        QuestionData test62 = new QuestionData("Her condition improved ______. There was a ______ improvement in her condition.", "steadily / steady");
        test62.addVariants("steady / steadiness");
        test62.addVariants("steadiness / steady");
        test62.addVariants("steady / steadily");
        test62.addVariants("steadily / steady");
        test1.add(test62);

        QuestionData test63 = new QuestionData("Fleming discovered penicillin ______.", "accidentally");
        test63.addVariants("accidentally");
        test63.addVariants("accidental");
        test63.addVariants("accident");
        test63.addVariants("on accident");
        test1.add(test63);

        QuestionData test64 = new QuestionData("The ______ discovery of penicillin by Fleming in 1928 made the " +
                "effective treatment of many bacterial diseases possible.", "accidental");
        test64.addVariants("accidental");
        test64.addVariants("by chance");
        test64.addVariants("accident");
        test64.addVariants("accidentally");
        test1.add(test64);

        QuestionData test65 = new QuestionData("The ______ of the forest will result in the ____ of many animal species.", "destruction / disappearance");
        test65.addVariants("destruction / disappear");
        test65.addVariants("destruction / disappearance");
        test65.addVariants("destructing / disappear");
        test65.addVariants("destruct / disappearance");
        test1.add(test65);

        QuestionData test66 = new QuestionData("A: Who told you they were moving?\n" +
                "B: They told me ______.", "themselves");
        test66.addVariants("by themselves");
        test66.addVariants("on their own");
        test66.addVariants("themselves");
        test66.addVariants("himself");
        test1.add(test66);

        QuestionData test67 = new QuestionData("The toes of her shoes are open. She always wears open ______ shoes.", "d");
        test67.addVariants("toe");
        test67.addVariants("toehold");
        test67.addVariants("tiptoe");
        test67.addVariants("toed");
        test1.add(test67);

        QuestionData test68 = new QuestionData("I didn’t buy the sweater because it wasn’t ______.", "washable");
        test68.addVariants("washing");
        test68.addVariants("washable");
        test68.addVariants("washer");
        test68.addVariants("washed");
        test1.add(test68);

        QuestionData test69 = new QuestionData("My chest hurts ______ I breathe.", "whenever");
        test69.addVariants("whenever");
        test69.addVariants("whatever");
        test69.addVariants("wherever");
        test69.addVariants("whichever");
        test1.add(test69);

        QuestionData test70 = new QuestionData("Larry is a friendly person. He meets new people ______ he goes.", "wherever");
        test70.addVariants("whenever");
        test70.addVariants("whatever");
        test70.addVariants("wherever");
        test70.addVariants("whoever");
        test1.add(test70);

        QuestionData test71 = new QuestionData("You must do ______ he says.", "whatever");
        test71.addVariants("whomever");
        test71.addVariants("whatever");
        test71.addVariants("whenever");
        test71.addVariants("wherever");
        test1.add(test71);

        QuestionData test72 = new QuestionData("______ solved that problem must be very smart.", "Whoever");
        test72.addVariants("Whomever");
        test72.addVariants("Whatever");
        test72.addVariants("Who");
        test72.addVariants("Whoever");
        test1.add(test72);

        QuestionData test73 = new QuestionData("We haven’t enjoyed ______ so much for years.", "ourselves");
        test73.addVariants("myself");
        test73.addVariants("oneself");
        test73.addVariants("ourselves");
        test73.addVariants("us");
        test1.add(test73);

        QuestionData test74 = new QuestionData("Have you heard about Sally? She killed______.", "herself");
        test74.addVariants("itself");
        test74.addVariants("herself");
        test74.addVariants("on her own");
        test74.addVariants("by herself");
        test1.add(test74);

        QuestionData test75 = new QuestionData("Her children are too young to look after______.", "themselves");
        test75.addVariants("them");
        test75.addVariants("by themselves");
        test75.addVariants("on their own");
        test75.addVariants("themselves");
        test1.add(test75);

        QuestionData test76 = new QuestionData("That is a beautiful dress you’re wearing. Did you make it______?", "yourself");
        test76.addVariants("you");
        test76.addVariants("yourselves");
        test76.addVariants("yourself");
        test76.addVariants("herself");
        test1.add(test76);

        QuestionData test77 = new QuestionData("Many lakes and rivers are being ______ polluted.", "dangerously");
        test77.addVariants("dangers");
        test77.addVariants("danger");
        test77.addVariants("dangerous");
        test77.addVariants("dangerously");
        test1.add(test77);

        QuestionData test78 = new QuestionData("Vitamins are produced synthetically in large quantities. This has made" +
                "them ______ and ______ available to most of the population.", "cheaply / easily");
        test78.addVariants("cheaply / easily");
        test78.addVariants("cheap / easy");
        test78.addVariants("cheap / easily");
        test78.addVariants("cheaply / easy");
        test1.add(test78);

        QuestionData test79 = new QuestionData("Several new dams are being constructed. This will help to control" +
                "floods and provide water for______.", "irrigation");
        test79.addVariants("irrigate");
        test79.addVariants("irrigated");
        test79.addVariants("irrigating");
        test79.addVariants("irrigation");
        test1.add(test79);

        QuestionData test80 = new QuestionData("A problem of fundamental ______ for the developing countries is" +
                "that of slowing down population growth.", "importance");
        test80.addVariants("importance");
        test80.addVariants("vital");
        test80.addVariants("urgent");
        test80.addVariants("serious");
        test1.add(test80);

        QuestionData test81 = new QuestionData("The Alfa River is 100 km long. The Beta River is 200 km long." +
                "means: The Beta River is ______ the Alfa River.", "c");
        test81.addVariants("shorter than");
        test81.addVariants("half as long as");
        test81.addVariants("twice as long as");
        test81.addVariants("half as short as");
        test1.add(test81);

        QuestionData test82 = new QuestionData("“Lake Beta is 20 m deep. Lake Alfa is 80 m deep.” means: The" +
                "depth of Lake Beta is ______ that of Lake Alfa.", "one-fourth");
        test82.addVariants("one-fourth");
        test82.addVariants("four times");
        test82.addVariants("one-third");
        test82.addVariants("three times");
        test1.add(test82);

        QuestionData test83 = new QuestionData("The height of Mt Vesuvius is about 1200 m and that of Mt Blanc is" +
                "4800 m. Mt Blanc is the ______ of the two mountains. Its height is" +
                "about ______ of Mt Vesuvius", "higher / four times that");
        test83.addVariants("higher / one fourth that");
        test83.addVariants("highest / one fourth");
        test83.addVariants("highest / four times that");
        test83.addVariants("higher / four times that");
        test1.add(test83);

        QuestionData test84 = new QuestionData("A: Will you boil the potatoes?\n" +
                "B: Yes. I like ______ potatoes.", "boiled");
        test84.addVariants("boiling");
        test84.addVariants("boiled");
        test84.addVariants("boil");
        test84.addVariants("boiler");
        test1.add(test84);

        QuestionData test85 = new QuestionData("A: Shall I write the recipe?\n" +
                "B: Yes, please. I need a ______ recipe.", "written");
        test85.addVariants("wrote");
        test85.addVariants("write");
        test85.addVariants("writing");
        test85.addVariants("written");
        test1.add(test85);

        QuestionData test86 = new QuestionData("We didn’t have much money, so we stayed at a/an ______ hotel.", "inexpensive");
        test86.addVariants("luxurious");
        test86.addVariants("inexpensive");
        test86.addVariants("comfort");
        test86.addVariants("quietness");
        test1.add(test86);

        QuestionData test87 = new QuestionData("The nurse is very ______. She spoke ______.", "politely / polite");
        test87.addVariants("politely / politely");
        test87.addVariants("polite / politely");
        test87.addVariants("politely / polite");
        test87.addVariants("polite / polite");
        test1.add(test87);

        QuestionData test88 = new QuestionData("Annie ______ lives in London. She moved to Bristol.", "no longer");
        test88.addVariants("any more");
        test88.addVariants("any longer");
        test88.addVariants("no longer");
        test88.addVariants("any better");
        test1.add(test88);

        QuestionData test89 = new QuestionData("I don’t want to stay here ______.", "any more");
        test89.addVariants("any more");
        test89.addVariants("no longer");
        test89.addVariants("never");
        test89.addVariants("no more");
        test1.add(test89);

        QuestionData test90 = new QuestionData("Are you ______ or do you want me to switch on the heating ?", "warm enough");
        test90.addVariants("warm enough");
        test90.addVariants("too warm");
        test90.addVariants("pretty cold");
        test90.addVariants("quite cold");
        test1.add(test90);

        QuestionData test91 = new QuestionData("I’ve got ______ a lot to do today. I’m really busy.", "such");
        test91.addVariants("such");
        test91.addVariants("so");
        test91.addVariants("very");
        test91.addVariants("too");
        test1.add(test91);

        QuestionData test92 = new QuestionData("I’ve made _____ many mistakes in this letter. I think I’ll type it again.", "too");
        test92.addVariants("such");
        test92.addVariants("so");
        test92.addVariants("very");
        test92.addVariants("too");
        test1.add(test92);

        QuestionData test93 = new QuestionData("The poor girl looked ______ ______.", "miserably / unhappy");
        test93.addVariants("miserable / unhappy");
        test93.addVariants("miserably / unhappy");
        test93.addVariants("miserable / unhappily");
        test93.addVariants("miserably / unhappily");
        test1.add(test93);

        QuestionData test94 = new QuestionData("This is not______.", "a big enough van");
        test94.addVariants("a big enough van");
        test94.addVariants("big a enough van");
        test94.addVariants("an enough big van");
        test94.addVariants("a van enough big");
        test1.add(test94);

        QuestionData test95 = new QuestionData("The boss looked at him ______.", "angrily");
        test95.addVariants("astonishing");
        test95.addVariants("unhappy");
        test95.addVariants("angrily");
        test95.addVariants("hardly");
        test1.add(test95);

        QuestionData test96 = new QuestionData("It was ______ hot in the train.", "terribly");
        test96.addVariants("extreme");
        test96.addVariants("intolerable");
        test96.addVariants("worse");
        test96.addVariants("terribly");
        test1.add(test96);

        QuestionData test97 = new QuestionData("She ran ______ to the telephone.", "hopefully");
        test97.addVariants("very quick");
        test97.addVariants("hopefully");
        test97.addVariants("impatient");
        test97.addVariants("miserable");
        test1.add(test97);

        QuestionData test98 = new QuestionData("“Shall we go?” David looked ______ at Susan.", "happily");
        test98.addVariants("happily");
        test98.addVariants("surprised");
        test98.addVariants("astonishing");
        test98.addVariants("glad");
        test1.add(test98);

        QuestionData test99 = new QuestionData("The child looked ______.", "neglected");
        test99.addVariants("neglected");
        test99.addVariants("a beggar");
        test99.addVariants("hunger");
        test99.addVariants("poverty");
        test1.add(test99);

        QuestionData test100 = new QuestionData("The world has gone ______.", "crazy");
        test100.addVariants("difficult");
        test100.addVariants("coldness");
        test100.addVariants("crazy");
        test100.addVariants("foregoing");
        test1.add(test100);

        QuestionData test101 = new QuestionData("The situation resolved itself ______ than I had expected.", "much more easily");
        test101.addVariants("much more easily");
        test101.addVariants("the most easily");
        test101.addVariants("a lot easier");
        test101.addVariants("much easier");
        test1.add(test101);

        QuestionData test102 = new QuestionData("The young man struck his boss and______ killed him.", "accidentally");
        test102.addVariants("sudden");
        test102.addVariants("accidentally");
        test102.addVariants("bloody");
        test102.addVariants("angry");
        test1.add(test102);

        QuestionData test103 = new QuestionData("Every child reacts ______ ______.", "somewhat / differently");
        test103.addVariants("rather / different");
        test103.addVariants("quite / differ");
        test103.addVariants("a lot / difference");
        test103.addVariants("somewhat / differently");
        test1.add(test103);

        QuestionData test104 = new QuestionData("He stood up slowly and ______.", "with difficulty");
        test104.addVariants("with difficulty");
        test104.addVariants("too difficult");
        test104.addVariants("very difficult");
        test104.addVariants("too much difficulty");
        test1.add(test104);

        return test1;
    }


    //  Tenses - Passives
    public static ArrayList<QuestionData> makeTest2() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test_1_1 = new QuestionData("", "");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test1.add(test_1_1);

        QuestionData test_1_2 = new QuestionData("", "");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test1.add(test_1_2);

        QuestionData test_1_3 = new QuestionData("", "");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test1.add(test_1_3);

        QuestionData test4 = new QuestionData("", "");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test1.add(test4);

        QuestionData test5 = new QuestionData("", "");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test1.add(test5);

        QuestionData test6 = new QuestionData("", "");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test1.add(test6);

        QuestionData test7 = new QuestionData("", "");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test1.add(test7);

        QuestionData test8 = new QuestionData("", "");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test1.add(test8);

        QuestionData test9 = new QuestionData("", "");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test1.add(test9);

        QuestionData test10 = new QuestionData("", "");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test1.add(test10);

        QuestionData test11 = new QuestionData("", "");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test1.add(test11);

        QuestionData test12 = new QuestionData("", "");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test1.add(test12);

        QuestionData test13 = new QuestionData("", "");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test1.add(test13);

        QuestionData test14 = new QuestionData("", "");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test1.add(test14);

        QuestionData test15 = new QuestionData("", "");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test1.add(test15);

        QuestionData test16 = new QuestionData("", "");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test1.add(test16);

        QuestionData test17 = new QuestionData("", "");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test1.add(test17);

        QuestionData test18 = new QuestionData("", "");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test1.add(test18);

        QuestionData test19 = new QuestionData("", "");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test1.add(test19);

        QuestionData test20 = new QuestionData("", "");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test1.add(test20);

        QuestionData test21 = new QuestionData("", "");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test1.add(test21);

        QuestionData test22 = new QuestionData("", "");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test1.add(test22);

        QuestionData test23 = new QuestionData("", "");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test1.add(test23);

        QuestionData test24 = new QuestionData("", "");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test1.add(test24);

        QuestionData test25 = new QuestionData("", "");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test1.add(test25);

        QuestionData test26 = new QuestionData("", "");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test1.add(test26);

        QuestionData test27 = new QuestionData("", "");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test1.add(test27);

        QuestionData test28 = new QuestionData("", "");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test1.add(test28);

        QuestionData test29 = new QuestionData("", "");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test1.add(test29);

        QuestionData test30 = new QuestionData("", "");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test1.add(test30);

        QuestionData test31 = new QuestionData("", "");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test1.add(test31);

        QuestionData test32 = new QuestionData("", "");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test1.add(test32);

        QuestionData test33 = new QuestionData("", "");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test1.add(test33);

        QuestionData test34 = new QuestionData("", "");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test1.add(test34);

        QuestionData test35 = new QuestionData("", "");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test1.add(test35);

        QuestionData test36 = new QuestionData("", "");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test1.add(test36);

        QuestionData test37 = new QuestionData("", "");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test1.add(test37);

        QuestionData test38 = new QuestionData("", "");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test1.add(test38);

        QuestionData test39 = new QuestionData("", "");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test1.add(test39);

        QuestionData test40 = new QuestionData("", "");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test1.add(test40);

        QuestionData test41 = new QuestionData("", "");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test1.add(test41);

        QuestionData test42 = new QuestionData("", "");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test1.add(test42);

        QuestionData test43 = new QuestionData("", "");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test1.add(test43);

        QuestionData test44 = new QuestionData("", "");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test1.add(test44);

        QuestionData test45 = new QuestionData("", "");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test1.add(test45);

        QuestionData test46 = new QuestionData("", "");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test1.add(test46);

        QuestionData test47 = new QuestionData("", "");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test1.add(test47);

        QuestionData test48 = new QuestionData("", "");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test1.add(test48);

        QuestionData test49 = new QuestionData("", "");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test1.add(test49);

        QuestionData test50 = new QuestionData("", "");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test1.add(test50);

        QuestionData test51 = new QuestionData("", "");
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
        test1.add(test52);

        QuestionData test53 = new QuestionData("", "");
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
        test1.add(test54);

        QuestionData test55 = new QuestionData("", "");
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
        test1.add(test56);

        QuestionData test57 = new QuestionData("", "");
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
        test1.add(test58);

        QuestionData test59 = new QuestionData("", "");
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
        test1.add(test60);

        QuestionData test61 = new QuestionData("", "");
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
        test1.add(test62);

        QuestionData test63 = new QuestionData("", "");
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
        test1.add(test64);

        QuestionData test65 = new QuestionData("", "");
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
        test1.add(test66);

        QuestionData test67 = new QuestionData("", "");
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
        test1.add(test68);

        QuestionData test69 = new QuestionData("", "");
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
        test1.add(test70);

        QuestionData test71 = new QuestionData("", "");
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
        test1.add(test72);

        QuestionData test73 = new QuestionData("", "");
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
        test1.add(test74);

        QuestionData test75 = new QuestionData("", "");
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
        test1.add(test76);

        QuestionData test77 = new QuestionData("", "");
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
        test1.add(test78);

        QuestionData test79 = new QuestionData("", "");
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
        test1.add(test80);

        QuestionData test81 = new QuestionData("", "");
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
        test1.add(test82);

        QuestionData test83 = new QuestionData("", "");
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
        test1.add(test84);

        QuestionData test85 = new QuestionData("", "");
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
        test1.add(test86);

        QuestionData test87 = new QuestionData("", "");
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
        test1.add(test88);

        QuestionData test89 = new QuestionData("", "");
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
        test1.add(test90);

        QuestionData test91 = new QuestionData("", "");
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
        test1.add(test92);

        QuestionData test93 = new QuestionData("", "");
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
        test1.add(test94);

        QuestionData test95 = new QuestionData("", "");
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
        test1.add(test96);

        QuestionData test97 = new QuestionData("", "");
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
        test1.add(test98);

        QuestionData test99 = new QuestionData("", "");
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
        test1.add(test100);

        return test1;
    }


    //  Adjective - Adverb - Noun clauses
    public static ArrayList<QuestionData> makeTest3() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test_1_1 = new QuestionData("", "");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test1.add(test_1_1);

        QuestionData test_1_2 = new QuestionData("", "");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test1.add(test_1_2);

        QuestionData test_1_3 = new QuestionData("", "");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test1.add(test_1_3);

        QuestionData test4 = new QuestionData("", "");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test1.add(test4);

        QuestionData test5 = new QuestionData("", "");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test1.add(test5);

        QuestionData test6 = new QuestionData("", "");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test1.add(test6);

        QuestionData test7 = new QuestionData("", "");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test1.add(test7);

        QuestionData test8 = new QuestionData("", "");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test1.add(test8);

        QuestionData test9 = new QuestionData("", "");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test1.add(test9);

        QuestionData test10 = new QuestionData("", "");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test1.add(test10);

        QuestionData test11 = new QuestionData("", "");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test1.add(test11);

        QuestionData test12 = new QuestionData("", "");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test1.add(test12);

        QuestionData test13 = new QuestionData("", "");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test1.add(test13);

        QuestionData test14 = new QuestionData("", "");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test1.add(test14);

        QuestionData test15 = new QuestionData("", "");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test1.add(test15);

        QuestionData test16 = new QuestionData("", "");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test1.add(test16);

        QuestionData test17 = new QuestionData("", "");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test1.add(test17);

        QuestionData test18 = new QuestionData("", "");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test1.add(test18);

        QuestionData test19 = new QuestionData("", "");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test1.add(test19);

        QuestionData test20 = new QuestionData("", "");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test1.add(test20);

        QuestionData test21 = new QuestionData("", "");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test1.add(test21);

        QuestionData test22 = new QuestionData("", "");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test1.add(test22);

        QuestionData test23 = new QuestionData("", "");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test1.add(test23);

        QuestionData test24 = new QuestionData("", "");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test1.add(test24);

        QuestionData test25 = new QuestionData("", "");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test1.add(test25);

        QuestionData test26 = new QuestionData("", "");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test1.add(test26);

        QuestionData test27 = new QuestionData("", "");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test1.add(test27);

        QuestionData test28 = new QuestionData("", "");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test1.add(test28);

        QuestionData test29 = new QuestionData("", "");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test1.add(test29);

        QuestionData test30 = new QuestionData("", "");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test1.add(test30);

        QuestionData test31 = new QuestionData("", "");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test1.add(test31);

        QuestionData test32 = new QuestionData("", "");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test1.add(test32);

        QuestionData test33 = new QuestionData("", "");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test1.add(test33);

        QuestionData test34 = new QuestionData("", "");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test1.add(test34);

        QuestionData test35 = new QuestionData("", "");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test1.add(test35);

        QuestionData test36 = new QuestionData("", "");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test1.add(test36);

        QuestionData test37 = new QuestionData("", "");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test1.add(test37);

        QuestionData test38 = new QuestionData("", "");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test1.add(test38);

        QuestionData test39 = new QuestionData("", "");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test1.add(test39);

        QuestionData test40 = new QuestionData("", "");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test1.add(test40);

        QuestionData test41 = new QuestionData("", "");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test1.add(test41);

        QuestionData test42 = new QuestionData("", "");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test1.add(test42);

        QuestionData test43 = new QuestionData("", "");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test1.add(test43);

        QuestionData test44 = new QuestionData("", "");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test1.add(test44);

        QuestionData test45 = new QuestionData("", "");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test1.add(test45);

        QuestionData test46 = new QuestionData("", "");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test1.add(test46);

        QuestionData test47 = new QuestionData("", "");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test1.add(test47);

        QuestionData test48 = new QuestionData("", "");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test1.add(test48);

        QuestionData test49 = new QuestionData("", "");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test1.add(test49);

        QuestionData test50 = new QuestionData("", "");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test1.add(test50);

        QuestionData test51 = new QuestionData("", "");
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
        test1.add(test52);

        QuestionData test53 = new QuestionData("", "");
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
        test1.add(test54);

        QuestionData test55 = new QuestionData("", "");
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
        test1.add(test56);

        QuestionData test57 = new QuestionData("", "");
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
        test1.add(test58);

        QuestionData test59 = new QuestionData("", "");
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
        test1.add(test60);

        QuestionData test61 = new QuestionData("", "");
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
        test1.add(test62);

        QuestionData test63 = new QuestionData("", "");
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
        test1.add(test64);

        QuestionData test65 = new QuestionData("", "");
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
        test1.add(test66);

        QuestionData test67 = new QuestionData("", "");
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
        test1.add(test68);

        QuestionData test69 = new QuestionData("", "");
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
        test1.add(test70);

        QuestionData test71 = new QuestionData("", "");
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
        test1.add(test72);

        QuestionData test73 = new QuestionData("", "");
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
        test1.add(test74);

        QuestionData test75 = new QuestionData("", "");
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
        test1.add(test76);

        QuestionData test77 = new QuestionData("", "");
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
        test1.add(test78);

        QuestionData test79 = new QuestionData("", "");
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
        test1.add(test80);

        QuestionData test81 = new QuestionData("", "");
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
        test1.add(test82);

        QuestionData test83 = new QuestionData("", "");
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
        test1.add(test84);

        QuestionData test85 = new QuestionData("", "");
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
        test1.add(test86);

        QuestionData test87 = new QuestionData("", "");
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
        test1.add(test88);

        QuestionData test89 = new QuestionData("", "");
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
        test1.add(test90);

        QuestionData test91 = new QuestionData("", "");
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
        test1.add(test92);

        QuestionData test93 = new QuestionData("", "");
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
        test1.add(test94);

        QuestionData test95 = new QuestionData("", "");
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
        test1.add(test96);

        QuestionData test97 = new QuestionData("", "");
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
        test1.add(test98);

        QuestionData test99 = new QuestionData("", "");
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
        test1.add(test100);

        return test1;
    }


    //  Modals
    public static ArrayList<QuestionData> makeTest4() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test_1_1 = new QuestionData("", "");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test1.add(test_1_1);

        QuestionData test_1_2 = new QuestionData("", "");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test1.add(test_1_2);

        QuestionData test_1_3 = new QuestionData("", "");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test1.add(test_1_3);

        QuestionData test4 = new QuestionData("", "");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test1.add(test4);

        QuestionData test5 = new QuestionData("", "");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test1.add(test5);

        QuestionData test6 = new QuestionData("", "");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test1.add(test6);

        QuestionData test7 = new QuestionData("", "");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test1.add(test7);

        QuestionData test8 = new QuestionData("", "");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test1.add(test8);

        QuestionData test9 = new QuestionData("", "");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test1.add(test9);

        QuestionData test10 = new QuestionData("", "");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test1.add(test10);

        QuestionData test11 = new QuestionData("", "");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test1.add(test11);

        QuestionData test12 = new QuestionData("", "");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test1.add(test12);

        QuestionData test13 = new QuestionData("", "");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test1.add(test13);

        QuestionData test14 = new QuestionData("", "");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test1.add(test14);

        QuestionData test15 = new QuestionData("", "");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test1.add(test15);

        QuestionData test16 = new QuestionData("", "");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test1.add(test16);

        QuestionData test17 = new QuestionData("", "");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test1.add(test17);

        QuestionData test18 = new QuestionData("", "");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test1.add(test18);

        QuestionData test19 = new QuestionData("", "");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test1.add(test19);

        QuestionData test20 = new QuestionData("", "");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test1.add(test20);

        QuestionData test21 = new QuestionData("", "");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test1.add(test21);

        QuestionData test22 = new QuestionData("", "");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test1.add(test22);

        QuestionData test23 = new QuestionData("", "");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test1.add(test23);

        QuestionData test24 = new QuestionData("", "");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test1.add(test24);

        QuestionData test25 = new QuestionData("", "");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test1.add(test25);

        QuestionData test26 = new QuestionData("", "");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test1.add(test26);

        QuestionData test27 = new QuestionData("", "");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test1.add(test27);

        QuestionData test28 = new QuestionData("", "");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test1.add(test28);

        QuestionData test29 = new QuestionData("", "");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test1.add(test29);

        QuestionData test30 = new QuestionData("", "");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test1.add(test30);

        QuestionData test31 = new QuestionData("", "");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test1.add(test31);

        QuestionData test32 = new QuestionData("", "");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test1.add(test32);

        QuestionData test33 = new QuestionData("", "");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test1.add(test33);

        QuestionData test34 = new QuestionData("", "");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test1.add(test34);

        QuestionData test35 = new QuestionData("", "");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test1.add(test35);

        QuestionData test36 = new QuestionData("", "");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test1.add(test36);

        QuestionData test37 = new QuestionData("", "");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test1.add(test37);

        QuestionData test38 = new QuestionData("", "");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test1.add(test38);

        QuestionData test39 = new QuestionData("", "");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test1.add(test39);

        QuestionData test40 = new QuestionData("", "");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test1.add(test40);

        QuestionData test41 = new QuestionData("", "");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test1.add(test41);

        QuestionData test42 = new QuestionData("", "");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test1.add(test42);

        QuestionData test43 = new QuestionData("", "");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test1.add(test43);

        QuestionData test44 = new QuestionData("", "");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test1.add(test44);

        QuestionData test45 = new QuestionData("", "");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test1.add(test45);

        QuestionData test46 = new QuestionData("", "");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test1.add(test46);

        QuestionData test47 = new QuestionData("", "");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test1.add(test47);

        QuestionData test48 = new QuestionData("", "");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test1.add(test48);

        QuestionData test49 = new QuestionData("", "");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test1.add(test49);

        QuestionData test50 = new QuestionData("", "");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test1.add(test50);

        QuestionData test51 = new QuestionData("", "");
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
        test1.add(test52);

        QuestionData test53 = new QuestionData("", "");
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
        test1.add(test54);

        QuestionData test55 = new QuestionData("", "");
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
        test1.add(test56);

        QuestionData test57 = new QuestionData("", "");
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
        test1.add(test58);

        QuestionData test59 = new QuestionData("", "");
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
        test1.add(test60);

        QuestionData test61 = new QuestionData("", "");
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
        test1.add(test62);

        QuestionData test63 = new QuestionData("", "");
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
        test1.add(test64);

        QuestionData test65 = new QuestionData("", "");
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
        test1.add(test66);

        QuestionData test67 = new QuestionData("", "");
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
        test1.add(test68);

        QuestionData test69 = new QuestionData("", "");
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
        test1.add(test70);

        QuestionData test71 = new QuestionData("", "");
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
        test1.add(test72);

        QuestionData test73 = new QuestionData("", "");
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
        test1.add(test74);

        QuestionData test75 = new QuestionData("", "");
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
        test1.add(test76);

        QuestionData test77 = new QuestionData("", "");
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
        test1.add(test78);

        QuestionData test79 = new QuestionData("", "");
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
        test1.add(test80);

        QuestionData test81 = new QuestionData("", "");
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
        test1.add(test82);

        QuestionData test83 = new QuestionData("", "");
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
        test1.add(test84);

        QuestionData test85 = new QuestionData("", "");
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
        test1.add(test86);

        QuestionData test87 = new QuestionData("", "");
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
        test1.add(test88);

        QuestionData test89 = new QuestionData("", "");
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
        test1.add(test90);

        QuestionData test91 = new QuestionData("", "");
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
        test1.add(test92);

        QuestionData test93 = new QuestionData("", "");
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
        test1.add(test94);

        QuestionData test95 = new QuestionData("", "");
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
        test1.add(test96);

        QuestionData test97 = new QuestionData("", "");
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
        test1.add(test98);

        QuestionData test99 = new QuestionData("", "");
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
        test1.add(test100);

        return test1;
    }


    //  Prepositions
    public static ArrayList<QuestionData> makeTest5() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test_1_1 = new QuestionData("", "");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test1.add(test_1_1);

        QuestionData test_1_2 = new QuestionData("", "");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test1.add(test_1_2);

        QuestionData test_1_3 = new QuestionData("", "");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test1.add(test_1_3);

        QuestionData test4 = new QuestionData("", "");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test1.add(test4);

        QuestionData test5 = new QuestionData("", "");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test1.add(test5);

        QuestionData test6 = new QuestionData("", "");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test1.add(test6);

        QuestionData test7 = new QuestionData("", "");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test1.add(test7);

        QuestionData test8 = new QuestionData("", "");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test1.add(test8);

        QuestionData test9 = new QuestionData("", "");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test1.add(test9);

        QuestionData test10 = new QuestionData("", "");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test1.add(test10);

        QuestionData test11 = new QuestionData("", "");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test1.add(test11);

        QuestionData test12 = new QuestionData("", "");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test1.add(test12);

        QuestionData test13 = new QuestionData("", "");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test1.add(test13);

        QuestionData test14 = new QuestionData("", "");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test1.add(test14);

        QuestionData test15 = new QuestionData("", "");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test1.add(test15);

        QuestionData test16 = new QuestionData("", "");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test1.add(test16);

        QuestionData test17 = new QuestionData("", "");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test1.add(test17);

        QuestionData test18 = new QuestionData("", "");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test1.add(test18);

        QuestionData test19 = new QuestionData("", "");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test1.add(test19);

        QuestionData test20 = new QuestionData("", "");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test1.add(test20);

        QuestionData test21 = new QuestionData("", "");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test1.add(test21);

        QuestionData test22 = new QuestionData("", "");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test1.add(test22);

        QuestionData test23 = new QuestionData("", "");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test1.add(test23);

        QuestionData test24 = new QuestionData("", "");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test1.add(test24);

        QuestionData test25 = new QuestionData("", "");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test1.add(test25);

        QuestionData test26 = new QuestionData("", "");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test1.add(test26);

        QuestionData test27 = new QuestionData("", "");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test1.add(test27);

        QuestionData test28 = new QuestionData("", "");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test1.add(test28);

        QuestionData test29 = new QuestionData("", "");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test1.add(test29);

        QuestionData test30 = new QuestionData("", "");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test1.add(test30);

        QuestionData test31 = new QuestionData("", "");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test1.add(test31);

        QuestionData test32 = new QuestionData("", "");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test1.add(test32);

        QuestionData test33 = new QuestionData("", "");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test1.add(test33);

        QuestionData test34 = new QuestionData("", "");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test1.add(test34);

        QuestionData test35 = new QuestionData("", "");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test1.add(test35);

        QuestionData test36 = new QuestionData("", "");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test1.add(test36);

        QuestionData test37 = new QuestionData("", "");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test1.add(test37);

        QuestionData test38 = new QuestionData("", "");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test1.add(test38);

        QuestionData test39 = new QuestionData("", "");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test1.add(test39);

        QuestionData test40 = new QuestionData("", "");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test1.add(test40);

        QuestionData test41 = new QuestionData("", "");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test1.add(test41);

        QuestionData test42 = new QuestionData("", "");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test1.add(test42);

        QuestionData test43 = new QuestionData("", "");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test1.add(test43);

        QuestionData test44 = new QuestionData("", "");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test1.add(test44);

        QuestionData test45 = new QuestionData("", "");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test1.add(test45);

        QuestionData test46 = new QuestionData("", "");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test1.add(test46);

        QuestionData test47 = new QuestionData("", "");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test1.add(test47);

        QuestionData test48 = new QuestionData("", "");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test1.add(test48);

        QuestionData test49 = new QuestionData("", "");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test1.add(test49);

        QuestionData test50 = new QuestionData("", "");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test1.add(test50);

        QuestionData test51 = new QuestionData("", "");
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
        test1.add(test52);

        QuestionData test53 = new QuestionData("", "");
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
        test1.add(test54);

        QuestionData test55 = new QuestionData("", "");
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
        test1.add(test56);

        QuestionData test57 = new QuestionData("", "");
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
        test1.add(test58);

        QuestionData test59 = new QuestionData("", "");
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
        test1.add(test60);

        QuestionData test61 = new QuestionData("", "");
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
        test1.add(test62);

        QuestionData test63 = new QuestionData("", "");
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
        test1.add(test64);

        QuestionData test65 = new QuestionData("", "");
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
        test1.add(test66);

        QuestionData test67 = new QuestionData("", "");
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
        test1.add(test68);

        QuestionData test69 = new QuestionData("", "");
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
        test1.add(test70);

        QuestionData test71 = new QuestionData("", "");
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
        test1.add(test72);

        QuestionData test73 = new QuestionData("", "");
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
        test1.add(test74);

        QuestionData test75 = new QuestionData("", "");
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
        test1.add(test76);

        QuestionData test77 = new QuestionData("", "");
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
        test1.add(test78);

        QuestionData test79 = new QuestionData("", "");
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
        test1.add(test80);

        QuestionData test81 = new QuestionData("", "");
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
        test1.add(test82);

        QuestionData test83 = new QuestionData("", "");
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
        test1.add(test84);

        QuestionData test85 = new QuestionData("", "");
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
        test1.add(test86);

        QuestionData test87 = new QuestionData("", "");
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
        test1.add(test88);

        QuestionData test89 = new QuestionData("", "");
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
        test1.add(test90);

        QuestionData test91 = new QuestionData("", "");
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
        test1.add(test92);

        QuestionData test93 = new QuestionData("", "");
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
        test1.add(test94);

        QuestionData test95 = new QuestionData("", "");
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
        test1.add(test96);

        QuestionData test97 = new QuestionData("", "");
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
        test1.add(test98);

        QuestionData test99 = new QuestionData("", "");
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
        test1.add(test100);

        return test1;
    }


    //  Prepositions after adjectives
    public static ArrayList<QuestionData> makeTest6() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test_1_1 = new QuestionData("", "");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test1.add(test_1_1);

        QuestionData test_1_2 = new QuestionData("", "");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test1.add(test_1_2);

        QuestionData test_1_3 = new QuestionData("", "");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test1.add(test_1_3);

        QuestionData test4 = new QuestionData("", "");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test1.add(test4);

        QuestionData test5 = new QuestionData("", "");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test1.add(test5);

        QuestionData test6 = new QuestionData("", "");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test1.add(test6);

        QuestionData test7 = new QuestionData("", "");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test1.add(test7);

        QuestionData test8 = new QuestionData("", "");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test1.add(test8);

        QuestionData test9 = new QuestionData("", "");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test1.add(test9);

        QuestionData test10 = new QuestionData("", "");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test1.add(test10);

        QuestionData test11 = new QuestionData("", "");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test1.add(test11);

        QuestionData test12 = new QuestionData("", "");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test1.add(test12);

        QuestionData test13 = new QuestionData("", "");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test1.add(test13);

        QuestionData test14 = new QuestionData("", "");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test1.add(test14);

        QuestionData test15 = new QuestionData("", "");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test1.add(test15);

        QuestionData test16 = new QuestionData("", "");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test1.add(test16);

        QuestionData test17 = new QuestionData("", "");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test1.add(test17);

        QuestionData test18 = new QuestionData("", "");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test1.add(test18);

        QuestionData test19 = new QuestionData("", "");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test1.add(test19);

        QuestionData test20 = new QuestionData("", "");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test1.add(test20);

        QuestionData test21 = new QuestionData("", "");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test1.add(test21);

        QuestionData test22 = new QuestionData("", "");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test1.add(test22);

        QuestionData test23 = new QuestionData("", "");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test1.add(test23);

        QuestionData test24 = new QuestionData("", "");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test1.add(test24);

        QuestionData test25 = new QuestionData("", "");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test1.add(test25);

        QuestionData test26 = new QuestionData("", "");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test1.add(test26);

        QuestionData test27 = new QuestionData("", "");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test1.add(test27);

        QuestionData test28 = new QuestionData("", "");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test1.add(test28);

        QuestionData test29 = new QuestionData("", "");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test1.add(test29);

        QuestionData test30 = new QuestionData("", "");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test1.add(test30);

        QuestionData test31 = new QuestionData("", "");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test1.add(test31);

        QuestionData test32 = new QuestionData("", "");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test1.add(test32);

        QuestionData test33 = new QuestionData("", "");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test1.add(test33);

        QuestionData test34 = new QuestionData("", "");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test1.add(test34);

        QuestionData test35 = new QuestionData("", "");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test1.add(test35);

        QuestionData test36 = new QuestionData("", "");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test1.add(test36);

        QuestionData test37 = new QuestionData("", "");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test1.add(test37);

        QuestionData test38 = new QuestionData("", "");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test1.add(test38);

        QuestionData test39 = new QuestionData("", "");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test1.add(test39);

        QuestionData test40 = new QuestionData("", "");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test1.add(test40);

        QuestionData test41 = new QuestionData("", "");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test1.add(test41);

        QuestionData test42 = new QuestionData("", "");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test1.add(test42);

        QuestionData test43 = new QuestionData("", "");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test1.add(test43);

        QuestionData test44 = new QuestionData("", "");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test1.add(test44);

        QuestionData test45 = new QuestionData("", "");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test1.add(test45);

        QuestionData test46 = new QuestionData("", "");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test1.add(test46);

        QuestionData test47 = new QuestionData("", "");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test1.add(test47);

        QuestionData test48 = new QuestionData("", "");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test1.add(test48);

        QuestionData test49 = new QuestionData("", "");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test1.add(test49);

        QuestionData test50 = new QuestionData("", "");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test1.add(test50);

        QuestionData test51 = new QuestionData("", "");
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
        test1.add(test52);

        QuestionData test53 = new QuestionData("", "");
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
        test1.add(test54);

        QuestionData test55 = new QuestionData("", "");
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
        test1.add(test56);

        QuestionData test57 = new QuestionData("", "");
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
        test1.add(test58);

        QuestionData test59 = new QuestionData("", "");
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
        test1.add(test60);

        QuestionData test61 = new QuestionData("", "");
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
        test1.add(test62);

        QuestionData test63 = new QuestionData("", "");
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
        test1.add(test64);

        QuestionData test65 = new QuestionData("", "");
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
        test1.add(test66);

        QuestionData test67 = new QuestionData("", "");
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
        test1.add(test68);

        QuestionData test69 = new QuestionData("", "");
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
        test1.add(test70);

        QuestionData test71 = new QuestionData("", "");
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
        test1.add(test72);

        QuestionData test73 = new QuestionData("", "");
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
        test1.add(test74);

        QuestionData test75 = new QuestionData("", "");
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
        test1.add(test76);

        QuestionData test77 = new QuestionData("", "");
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
        test1.add(test78);

        QuestionData test79 = new QuestionData("", "");
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
        test1.add(test80);

        QuestionData test81 = new QuestionData("", "");
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
        test1.add(test82);

        QuestionData test83 = new QuestionData("", "");
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
        test1.add(test84);

        QuestionData test85 = new QuestionData("", "");
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
        test1.add(test86);

        QuestionData test87 = new QuestionData("", "");
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
        test1.add(test88);

        QuestionData test89 = new QuestionData("", "");
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
        test1.add(test90);

        QuestionData test91 = new QuestionData("", "");
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
        test1.add(test92);

        QuestionData test93 = new QuestionData("", "");
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
        test1.add(test94);

        QuestionData test95 = new QuestionData("", "");
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
        test1.add(test96);

        QuestionData test97 = new QuestionData("", "");
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
        test1.add(test98);

        QuestionData test99 = new QuestionData("", "");
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
        test1.add(test100);

        return test1;
    }


    //  Gerund - Infinitive
    public static ArrayList<QuestionData> makeTest7() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test_1_1 = new QuestionData("", "");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test_1_1.addVariants("");
        test1.add(test_1_1);

        QuestionData test_1_2 = new QuestionData("", "");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test_1_2.addVariants("");
        test1.add(test_1_2);

        QuestionData test_1_3 = new QuestionData("", "");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test_1_3.addVariants("");
        test1.add(test_1_3);

        QuestionData test4 = new QuestionData("", "");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test4.addVariants("");
        test1.add(test4);

        QuestionData test5 = new QuestionData("", "");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test5.addVariants("");
        test1.add(test5);

        QuestionData test6 = new QuestionData("", "");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test6.addVariants("");
        test1.add(test6);

        QuestionData test7 = new QuestionData("", "");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test7.addVariants("");
        test1.add(test7);

        QuestionData test8 = new QuestionData("", "");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test8.addVariants("");
        test1.add(test8);

        QuestionData test9 = new QuestionData("", "");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test9.addVariants("");
        test1.add(test9);

        QuestionData test10 = new QuestionData("", "");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test10.addVariants("");
        test1.add(test10);

        QuestionData test11 = new QuestionData("", "");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test11.addVariants("");
        test1.add(test11);

        QuestionData test12 = new QuestionData("", "");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test12.addVariants("");
        test1.add(test12);

        QuestionData test13 = new QuestionData("", "");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test13.addVariants("");
        test1.add(test13);

        QuestionData test14 = new QuestionData("", "");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test14.addVariants("");
        test1.add(test14);

        QuestionData test15 = new QuestionData("", "");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test15.addVariants("");
        test1.add(test15);

        QuestionData test16 = new QuestionData("", "");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test16.addVariants("");
        test1.add(test16);

        QuestionData test17 = new QuestionData("", "");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test17.addVariants("");
        test1.add(test17);

        QuestionData test18 = new QuestionData("", "");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test18.addVariants("");
        test1.add(test18);

        QuestionData test19 = new QuestionData("", "");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test19.addVariants("");
        test1.add(test19);

        QuestionData test20 = new QuestionData("", "");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test20.addVariants("");
        test1.add(test20);

        QuestionData test21 = new QuestionData("", "");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test21.addVariants("");
        test1.add(test21);

        QuestionData test22 = new QuestionData("", "");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test22.addVariants("");
        test1.add(test22);

        QuestionData test23 = new QuestionData("", "");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test23.addVariants("");
        test1.add(test23);

        QuestionData test24 = new QuestionData("", "");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test24.addVariants("");
        test1.add(test24);

        QuestionData test25 = new QuestionData("", "");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test25.addVariants("");
        test1.add(test25);

        QuestionData test26 = new QuestionData("", "");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test26.addVariants("");
        test1.add(test26);

        QuestionData test27 = new QuestionData("", "");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test27.addVariants("");
        test1.add(test27);

        QuestionData test28 = new QuestionData("", "");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test28.addVariants("");
        test1.add(test28);

        QuestionData test29 = new QuestionData("", "");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test29.addVariants("");
        test1.add(test29);

        QuestionData test30 = new QuestionData("", "");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test30.addVariants("");
        test1.add(test30);

        QuestionData test31 = new QuestionData("", "");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test31.addVariants("");
        test1.add(test31);

        QuestionData test32 = new QuestionData("", "");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test32.addVariants("");
        test1.add(test32);

        QuestionData test33 = new QuestionData("", "");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test33.addVariants("");
        test1.add(test33);

        QuestionData test34 = new QuestionData("", "");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test34.addVariants("");
        test1.add(test34);

        QuestionData test35 = new QuestionData("", "");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test35.addVariants("");
        test1.add(test35);

        QuestionData test36 = new QuestionData("", "");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test36.addVariants("");
        test1.add(test36);

        QuestionData test37 = new QuestionData("", "");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test37.addVariants("");
        test1.add(test37);

        QuestionData test38 = new QuestionData("", "");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test38.addVariants("");
        test1.add(test38);

        QuestionData test39 = new QuestionData("", "");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test39.addVariants("");
        test1.add(test39);

        QuestionData test40 = new QuestionData("", "");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test40.addVariants("");
        test1.add(test40);

        QuestionData test41 = new QuestionData("", "");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test41.addVariants("");
        test1.add(test41);

        QuestionData test42 = new QuestionData("", "");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test42.addVariants("");
        test1.add(test42);

        QuestionData test43 = new QuestionData("", "");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test43.addVariants("");
        test1.add(test43);

        QuestionData test44 = new QuestionData("", "");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test44.addVariants("");
        test1.add(test44);

        QuestionData test45 = new QuestionData("", "");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test45.addVariants("");
        test1.add(test45);

        QuestionData test46 = new QuestionData("", "");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test46.addVariants("");
        test1.add(test46);

        QuestionData test47 = new QuestionData("", "");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test47.addVariants("");
        test1.add(test47);

        QuestionData test48 = new QuestionData("", "");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test48.addVariants("");
        test1.add(test48);

        QuestionData test49 = new QuestionData("", "");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test49.addVariants("");
        test1.add(test49);

        QuestionData test50 = new QuestionData("", "");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test50.addVariants("");
        test1.add(test50);

        QuestionData test51 = new QuestionData("", "");
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
        test1.add(test52);

        QuestionData test53 = new QuestionData("", "");
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
        test1.add(test54);

        QuestionData test55 = new QuestionData("", "");
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
        test1.add(test56);

        QuestionData test57 = new QuestionData("", "");
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
        test1.add(test58);

        QuestionData test59 = new QuestionData("", "");
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
        test1.add(test60);

        QuestionData test61 = new QuestionData("", "");
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
        test1.add(test62);

        QuestionData test63 = new QuestionData("", "");
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
        test1.add(test64);

        QuestionData test65 = new QuestionData("", "");
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
        test1.add(test66);

        QuestionData test67 = new QuestionData("", "");
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
        test1.add(test68);

        QuestionData test69 = new QuestionData("", "");
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
        test1.add(test70);

        QuestionData test71 = new QuestionData("", "");
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
        test1.add(test72);

        QuestionData test73 = new QuestionData("", "");
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
        test1.add(test74);

        QuestionData test75 = new QuestionData("", "");
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
        test1.add(test76);

        QuestionData test77 = new QuestionData("", "");
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
        test1.add(test78);

        QuestionData test79 = new QuestionData("", "");
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
        test1.add(test80);

        QuestionData test81 = new QuestionData("", "");
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
        test1.add(test82);

        QuestionData test83 = new QuestionData("", "");
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
        test1.add(test84);

        QuestionData test85 = new QuestionData("", "");
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
        test1.add(test86);

        QuestionData test87 = new QuestionData("", "");
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
        test1.add(test88);

        QuestionData test89 = new QuestionData("", "");
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
        test1.add(test90);

        QuestionData test91 = new QuestionData("", "");
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
        test1.add(test92);

        QuestionData test93 = new QuestionData("", "");
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
        test1.add(test94);

        QuestionData test95 = new QuestionData("", "");
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
        test1.add(test96);

        QuestionData test97 = new QuestionData("", "");
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
        test1.add(test98);

        QuestionData test99 = new QuestionData("", "");
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
        test1.add(test100);

        return test1;
    }



}
