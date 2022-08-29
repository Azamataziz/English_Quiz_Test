package uz.azamat.lesson_6_test_app.core.Datas;

import java.util.ArrayList;

import uz.azamat.lesson_6_test_app.core.QuestionData;

public class A2IntermediateData {

    //  40 - Auxiliary verbs (do, be have) - Prepositions
    public static ArrayList<QuestionData> makeTest1() {
        ArrayList<QuestionData> inter_1 = new ArrayList<>();

        QuestionData inter1 = new QuestionData("_____ you ever stayed at the Ritz?","Have");
        inter1.addVariants("Did");
        inter1.addVariants("Have");
        inter1.addVariants("Was");
        inter1.addVariants("Were");
        inter_1.add(inter1);

        QuestionData inter2 = new QuestionData("We _____ breakfast in bed.","had");
        inter2.addVariants("were have");
        inter2.addVariants("has");
        inter2.addVariants("was having");
        inter2.addVariants("had");
        inter_1.add(inter2);

        QuestionData inter3 = new QuestionData("_____ John give you those flowers?","Did");
        inter3.addVariants("Did");
        inter3.addVariants("Have");
        inter3.addVariants("Was");
        inter3.addVariants("Is");
        inter_1.add(inter3);

        QuestionData inter4 = new QuestionData("I _____ my homework very quickly last night.","did");
        inter4.addVariants("do");
        inter4.addVariants("have");
        inter4.addVariants("did");
        inter4.addVariants("am");
        inter_1.add(inter4);

        QuestionData inter5 = new QuestionData("She _____ a shower every morning before school.","has");
        inter5.addVariants("does");
        inter5.addVariants("has");
        inter5.addVariants("did");
        inter5.addVariants("is");
        inter_1.add(inter5);

        QuestionData inter6 = new QuestionData("We _____ talking to James about his exam.","aren't");
        inter6.addVariants("don't");
        inter6.addVariants("haven't");
        inter6.addVariants("wasn't");
        inter6.addVariants("aren't");
        inter_1.add(inter6);

        QuestionData inter7 = new QuestionData("Lots of trees _____ blown down by the wind.","were");
        inter7.addVariants("were");
        inter7.addVariants("has");
        inter7.addVariants("did");
        inter7.addVariants("is");
        inter_1.add(inter7);

        QuestionData inter8 = new QuestionData("Where _____ you yesterday?","were");
        inter8.addVariants("was");
        inter8.addVariants("were");
        inter8.addVariants("did");
        inter8.addVariants("were");
        inter_1.add(inter8);

        QuestionData inter9 = new QuestionData("Mary never _____ the washing up.","does");
        inter9.addVariants("does");
        inter9.addVariants("has");
        inter9.addVariants("did");
        inter9.addVariants("is");
        inter_1.add(inter9);

        QuestionData inter10 = new QuestionData("Thank goodness we _____ a dishwasher!","have");
        inter10.addVariants("was");
        inter10.addVariants("have");
        inter10.addVariants("did");
        inter10.addVariants("were");
        inter_1.add(inter10);

        QuestionData inter11 = new QuestionData("How many people _____ you invited to the party?","have");
        inter11.addVariants("was");
        inter11.addVariants("have");
        inter11.addVariants("did");
        inter11.addVariants("were");
        inter_1.add(inter11);

        QuestionData inter12 = new QuestionData("Why _____ you leaving so early?","are");
        inter12.addVariants("was");
        inter12.addVariants("have");
        inter12.addVariants("is");
        inter12.addVariants("are");
        inter_1.add(inter12);

        QuestionData inter13 = new QuestionData("We _____ got a beautiful puppy called Molly.","have");
        inter13.addVariants("was");
        inter13.addVariants("have");
        inter13.addVariants("did");
        inter13.addVariants("were");
        inter_1.add(inter13);

        QuestionData inter14 = new QuestionData("We _____ a beautiful puppy called Molly.","had");
        inter14.addVariants("was");
        inter14.addVariants("having");
        inter14.addVariants("did");
        inter14.addVariants("had");
        inter_1.add(inter14);

        QuestionData inter15 = new QuestionData("I have been to Australia but Anna _____ .","hasn't");
        inter15.addVariants("haven't");
        inter15.addVariants("hasn't");
        inter15.addVariants("isn't");
        inter15.addVariants("doesn't");
        inter_1.add(inter15);

        QuestionData inter16 = new QuestionData("Anna likes ice-cream but John _____ .","doesn't");
        inter16.addVariants("haven't");
        inter16.addVariants("hasn't");
        inter16.addVariants("isn't");
        inter16.addVariants("doesn't");
        inter_1.add(inter16);

        QuestionData inter17 = new QuestionData("I don’t like ice-cream but Jill _____ .","does");
        inter17.addVariants("have");
        inter17.addVariants("has");
        inter17.addVariants("is");
        inter17.addVariants("does");
        inter_1.add(inter17);

        QuestionData inter18 = new QuestionData("Maria isn’t studying hard but I _____ .","am");
        inter18.addVariants("have");
        inter18.addVariants("has");
        inter18.addVariants("am");
        inter18.addVariants("are");
        inter_1.add(inter18);

        QuestionData inter19 = new QuestionData("John loves flying but we _____ .","don't");
        inter19.addVariants("haven't");
        inter19.addVariants("don't");
        inter19.addVariants("isn't");
        inter19.addVariants("doesn't");
        inter_1.add(inter19);

        QuestionData inter20 = new QuestionData("I watched TV last night but my sister _____ .","didn't");
        inter20.addVariants("hasn't");
        inter20.addVariants("didn't");
        inter20.addVariants("isn't");
        inter20.addVariants("doesn't");
        inter_1.add(inter20);

        QuestionData inter21 = new QuestionData("Bill hasn’t finished his work but we _____ .","have");
        inter21.addVariants("have");
        inter21.addVariants("do");
        inter21.addVariants("don't");
        inter21.addVariants("doesn't");
        inter_1.add(inter21);

        QuestionData inter22 = new QuestionData("We don’t want to leave early but they _____ .","do");
        inter22.addVariants("have");
        inter22.addVariants("do");
        inter22.addVariants("is");
        inter22.addVariants("does");
        inter_1.add(inter22);

        QuestionData inter23 = new QuestionData("They didn't remember my birthday but you _____ .","did");
        inter23.addVariants("have");
        inter23.addVariants("don't");
        inter23.addVariants("did");
        inter23.addVariants("does");
        inter_1.add(inter23);

        QuestionData inter24 = new QuestionData("Your English is really improving but mine _____ .","isn't");
        inter24.addVariants("haven't");
        inter24.addVariants("don't");
        inter24.addVariants("isn't");
        inter24.addVariants("doesn't");
        inter_1.add(inter24);

        QuestionData inter25 = new QuestionData("_____ you speak three languages?","Do");
        inter25.addVariants("Do");
        inter25.addVariants("Does");
        inter25.addVariants("Did");
        inter25.addVariants("Are");
        inter_1.add(inter25);

        QuestionData inter26 = new QuestionData("_____ you having a holiday soon?","Are");
        inter26.addVariants("Do");
        inter26.addVariants("Does");
        inter26.addVariants("Did");
        inter26.addVariants("Are");
        inter_1.add(inter26);

        QuestionData inter27 = new QuestionData("_____ you have a good holiday last year?","Did");
        inter27.addVariants("Do");
        inter27.addVariants("Does");
        inter27.addVariants("Did");
        inter27.addVariants("Are");
        inter_1.add(inter27);

        QuestionData inter28 = new QuestionData("_____ you ever been to Amsterdam?","Have");
        inter28.addVariants("Do");
        inter28.addVariants("Does");
        inter28.addVariants("Have");
        inter28.addVariants("Did");
        inter_1.add(inter28);

        QuestionData inter29 = new QuestionData("_____ you often travel abroad?","Does");
        inter29.addVariants("Do");
        inter29.addVariants("Does");
        inter29.addVariants("Have");
        inter29.addVariants("Did");
        inter_1.add(inter29);

        QuestionData inter30 = new QuestionData("_____ your best friend sometimes go on holiday with you?","Does");
        inter30.addVariants("Do");
        inter30.addVariants("Does");
        inter30.addVariants("Have");
        inter30.addVariants("Did");
        inter_1.add(inter30);

        QuestionData inter31 = new QuestionData("I think you’re wrong. I don’t agree _____ you at all.","with");
        inter31.addVariants("to");
        inter31.addVariants("on");
        inter31.addVariants("with");
        inter31.addVariants("about");
        inter_1.add(inter31);

        QuestionData inter32 = new QuestionData("I’m not interested _____ what you think or what you want.","in");
        inter32.addVariants("to");
        inter32.addVariants("on");
        inter32.addVariants("with");
        inter32.addVariants("in");
        inter_1.add(inter32);

        QuestionData inter33 = new QuestionData("We might have a picnic. It depends _____ the weather.","on");
        inter33.addVariants("to");
        inter33.addVariants("on");
        inter33.addVariants("with");
        inter33.addVariants("about");
        inter_1.add(inter33);

        QuestionData inter34 = new QuestionData("What are you listening _____ ?","to");
        inter34.addVariants("to");
        inter34.addVariants("on");
        inter34.addVariants("with");
        inter34.addVariants("about");
        inter_1.add(inter34);

        QuestionData inter35 = new QuestionData("If you have a problem, talk _____ the teacher.","to");
        inter35.addVariants("to");
        inter35.addVariants("on");
        inter35.addVariants("at");
        inter35.addVariants("in");
        inter_1.add(inter35);

        QuestionData inter36 = new QuestionData("What did you talk _____ ?\nOh, this and that.","about");
        inter36.addVariants("to");
        inter36.addVariants("on");
        inter36.addVariants("with");
        inter36.addVariants("about");
        inter_1.add(inter36);

        QuestionData inter37 = new QuestionData("You aren't concentrating on your work. What are you thinking _____?","about");
        inter37.addVariants("to");
        inter37.addVariants("on");
        inter37.addVariants("with");
        inter37.addVariants("about");
        inter_1.add(inter37);

        QuestionData inter38 = new QuestionData("What do you think _____ Pete?\nI really like him.","d");
        inter38.addVariants("to");
        inter38.addVariants("at");
        inter38.addVariants("with");
        inter38.addVariants("of");
        inter_1.add(inter38);

        QuestionData inter39 = new QuestionData("Where’s the cash desk? I’d like to pay _____ this book.","for");
        inter39.addVariants("to");
        inter39.addVariants("for");
        inter39.addVariants("with");
        inter39.addVariants("about");
        inter_1.add(inter39);

        QuestionData inter40 = new QuestionData("I’ve lost your pen. Sorry ...\nIt’s all right. Don’t worry _____ it.","about");
        inter40.addVariants("to");
        inter40.addVariants("on");
        inter40.addVariants("with");
        inter40.addVariants("about");
        inter_1.add(inter40);

        return inter_1;
    }

    //  35 - Present Simple and Continuous - Present Passive - Prepositions
    public static ArrayList<QuestionData> makeTest2() {

        ArrayList<QuestionData> test2 = new ArrayList<>();

        QuestionData test2_1 = new QuestionData("Sue and Geoff _____ a shop.", "run");
        test2_1.addVariants("work");
        test2_1.addVariants("study");
        test2_1.addVariants("run");
        test2_1.addVariants("runs");
        test2.add(test2_1);

        QuestionData test2_2 = new QuestionData("This kind of shop _____ a milk bar.", "is called");
        test2_2.addVariants("is called");
        test2_2.addVariants("called");
        test2_2.addVariants("is calling");
        test2_2.addVariants("is being called");
        test2.add(test2_2);

        QuestionData test2_3 = new QuestionData("Most days the shop _____ at 10.00 p.m.", "closes");
        test2_3.addVariants("sells");
        test2_3.addVariants("opened");
        test2_3.addVariants("closes");
        test2_3.addVariants("run");
        test2.add(test2_3);

        QuestionData test2_4 = new QuestionData("They _____ camping any more.", "don’t go");
        test2_4.addVariants("go");
        test2_4.addVariants("doesn’t go");
        test2_4.addVariants("don’t go");
        test2_4.addVariants("have gone");
        test2.add(test2_4);

        QuestionData test2_5 = new QuestionData("Ursula _____ four brothers and sisters.", "has");
        test2_5.addVariants("have");
        test2_5.addVariants("has");
        test2_5.addVariants("haven’t");
        test2_5.addVariants("having");
        test2.add(test2_5);

        QuestionData test2_6 = new QuestionData("It _____ her fifteen minutes _____ to school.", "takes / to walk");
        test2_6.addVariants("took / go");
        test2_6.addVariants("has taken / walk");
        test2_6.addVariants("takes / walk");
        test2_6.addVariants("takes / to walk");
        test2.add(test2_6);

        QuestionData test2_7 = new QuestionData("She _____ school at 7:45 a.m.", "starts");
        test2_7.addVariants("go");
        test2_7.addVariants("begin");
        test2_7.addVariants("starts");
        test2_7.addVariants("goes");
        test2.add(test2_7);

        QuestionData test2_8 = new QuestionData("I _____ lunch in the university canteen.", "have");
        test2_8.addVariants("eats");
        test2_8.addVariants("have");
        test2_8.addVariants("drink");
        test2_8.addVariants("has");
        test2.add(test2_8);

        QuestionData test2_9 = new QuestionData("I _____ extra money teaching computer studies.", "earn");
        test2_9.addVariants("earn");
        test2_9.addVariants("earns");
        test2_9.addVariants("win");
        test2_9.addVariants("buy");
        test2.add(test2_9);

        QuestionData test2_10 = new QuestionData("I _____ the traffic in Bangkok.", "hate");
        test2_10.addVariants("play");
        test2_10.addVariants("have");
        test2_10.addVariants("hate");
        test2_10.addVariants("has");
        test2.add(test2_10);

        QuestionData test2_11 = new QuestionData("English is _____ here.", "spoken");
        test2_11.addVariants("speak");
        test2_11.addVariants("spoke");
        test2_11.addVariants("is speaking");
        test2_11.addVariants("spoken");
        test2.add(test2_11);

        QuestionData test2_12 = new QuestionData("Volvos are _____ in Sweden.", "produced");
        test2_12.addVariants("produced");
        test2_12.addVariants("produce");
        test2_12.addVariants("produces");
        test2_12.addVariants("producing");
        test2.add(test2_12);

        QuestionData test2_13 = new QuestionData("Is service _____ in the bill?", "included");
        test2_13.addVariants("including");
        test2_13.addVariants("include");
        test2_13.addVariants("to include");
        test2_13.addVariants("included");
        test2.add(test2_13);

        QuestionData test2_14 = new QuestionData("Our kitchen _____ decorated at the moment.", "is being");
        test2_14.addVariants("is");
        test2_14.addVariants("is being");
        test2_14.addVariants("being");
        test2_14.addVariants("was being");
        test2.add(test2_14);

        QuestionData test2_15 = new QuestionData("Our factory is being _____ over by an American company.", "taken");
        test2_15.addVariants("taken");
        test2_15.addVariants("bought");
        test2_15.addVariants("sold");
        test2_15.addVariants("run");
        test2.add(test2_15);

        QuestionData test2_16 = new QuestionData("About one thousand people are _____ in the factory.", "employed");
        test2_16.addVariants("taken");
        test2_16.addVariants("cleaned");
        test2_16.addVariants("employed");
        test2_16.addVariants("worked");
        test2.add(test2_16);

        QuestionData test2_17 = new QuestionData("Lots of tulips are _____ in Holland.", "grown");
        test2_17.addVariants("grown");
        test2_17.addVariants("growing");
        test2_17.addVariants("grow");
        test2_17.addVariants("grew");
        test2.add(test2_17);

        QuestionData test2_18 = new QuestionData("That block of flats is being _____ because it is unsafe.", "pulled down");
        test2_18.addVariants("pulled down");
        test2_18.addVariants("pulled");
        test2_18.addVariants("pulled up");
        test2_18.addVariants("pulling down");
        test2.add(test2_18);

        QuestionData test2_19 = new QuestionData("In Britain milk is _____ to your doorstep.", "delivered");
        test2_19.addVariants("shown");
        test2_19.addVariants("sold");
        test2_19.addVariants("bought");
        test2_19.addVariants("delivered");
        test2.add(test2_19);

        QuestionData test2_20 = new QuestionData("When you __(20)__ at an airport, you should go straight to the checkin\n" +
                "desk where your ticket and luggage __(21)__. You __(22)__ your\n" +
                "hand luggage with you but your suitcases __(23)__ to the plane on\n" +
                "a conveyor belt. You can now go to the departure lounge.", "arrive");
        test2_20.addVariants("start");
        test2_20.addVariants("started");
        test2_20.addVariants("arrive");
        test2_20.addVariants("are arrived");
        test2.add(test2_20);

        QuestionData test2_21 = new QuestionData("When you __(20)__ at an airport, you should go straight to the checkin\n" +
                "desk where your ticket and luggage __(21)__. You __(22)__ your\n" +
                "hand luggage with you but your suitcases __(23)__ to the plane on\n" +
                "a conveyor belt. You can now go to the departure lounge.", "are checked");
        test2_21.addVariants("are checked");
        test2_21.addVariants("control");
        test2_21.addVariants("check");
        test2_21.addVariants("is changed");
        test2.add(test2_21);

        QuestionData test2_22 = new QuestionData("When you __(20)__ at an airport, you should go straight to the checkin\n" +
                "desk where your ticket and luggage __(21)__. You __(22)__ your\n" +
                "hand luggage with you but your suitcases __(23)__ to the plane on\n" +
                "a conveyor belt. You can now go to the departure lounge.", "d");
        test2_22.addVariants("kept");
        test2_22.addVariants("keeping");
        test2_22.addVariants("wait");
        test2_22.addVariants("keep");
        test2.add(test2_22);

        QuestionData test2_23 = new QuestionData("When you __(20)__ at an airport, you should go straight to the checkin\n" +
                "desk where your ticket and luggage __(21)__. You __(22)__ your\n" +
                "hand luggage with you but your suitcases __(23)__ to the plane on\n" +
                "a conveyor belt. You can now go to the departure lounge.", "are taken");
        test2_23.addVariants("take");
        test2_23.addVariants("took");
        test2_23.addVariants("are taken");
        test2_23.addVariants("taking");
        test2.add(test2_23);

        QuestionData test2_33 = new QuestionData("Hello. Can I speak to Mr. James, please?\n" +
                "I’m sorry. He isn’t _____ at the moment. Can I take a message?", "in");
        test2_33.addVariants("in");
        test2_33.addVariants("on");
        test2_33.addVariants("at");
        test2_33.addVariants("off");
        test2.add(test2_33);

        QuestionData test2_34 = new QuestionData("Hello. Can I speak to Mr. James, please?\n" +
                "I’m sorry. He is _____ on holiday at the moment. Can I help you?", "away");
        test2_34.addVariants("in");
        test2_34.addVariants("on");
        test2_34.addVariants("away");
        test2_34.addVariants("off");
        test2.add(test2_34);

        QuestionData test2_35 = new QuestionData("I feel like going to the cinema tonight.\n" +
                "Good idea! What’s _____ at the moment?", "on");
        test2_35.addVariants("in");
        test2_35.addVariants("on");
        test2_35.addVariants("at");
        test2_35.addVariants("off");
        test2.add(test2_35);

        QuestionData test2_36 = new QuestionData("I think this milk’s _____ . It smells horrid.", "off");
        test2_36.addVariants("in");
        test2_36.addVariants("on");
        test2_36.addVariants("at");
        test2_36.addVariants("off");
        test2.add(test2_36);

        QuestionData test2_37 = new QuestionData("Where shall we go for a meal?\n" +
                "It’s _____ you. It’s your birthday. You choose.", "up to");
        test2_37.addVariants("in");
        test2_37.addVariants("at");
        test2_37.addVariants("on");
        test2_37.addVariants("up to");
        test2.add(test2_37);

        QuestionData test2_38 = new QuestionData("Come on, kids! Aren’t you _____ yet? Breakfast’s on the table.", "c");
        test2_38.addVariants("in");
        test2_38.addVariants("on");
        test2_38.addVariants("up");
        test2_38.addVariants("off");
        test2.add(test2_38);

        QuestionData test2_39 = new QuestionData("I wonder why they aren’t answering the door. There must be\n" +
                "someone _____ .", "a");
        test2_39.addVariants("in");
        test2_39.addVariants("on");
        test2_39.addVariants("at");
        test2_39.addVariants("off");
        test2.add(test2_39);

        QuestionData test2_40 = new QuestionData("All the lights are _____ . I can see nothing.", "off");
        test2_40.addVariants("in");
        test2_40.addVariants("on");
        test2_40.addVariants("at");
        test2_40.addVariants("off");
        test2.add(test2_40);

        QuestionData test2_41 = new QuestionData("I must be _____ soon. I want to get to the shops before they close.", "off");
        test2_41.addVariants("in");
        test2_41.addVariants("on");
        test2_41.addVariants("at");
        test2_41.addVariants("off");
        test2.add(test2_41);

        QuestionData test2_42 = new QuestionData("Why isn’t there any hot water?\n" +
                "The central heating is _____ . That’s why.", "off");
        test2_42.addVariants("in");
        test2_42.addVariants("on");
        test2_42.addVariants("at");
        test2_42.addVariants("off");
        test2.add(test2_42);

        QuestionData test2_43 = new QuestionData("You’re crying. What’s _____ ?\nI’m just a bit sad. That’s all.", "up");
        test2_43.addVariants("in");
        test2_43.addVariants("on");
        test2_43.addVariants("up");
        test2_43.addVariants("off");
        test2.add(test2_43);

        return test2;
    }

    //  39 - While, during, for - Past Simple - Continuous - Perfect - Past Passive - Prepositions
    public static ArrayList<QuestionData> makeTest3() {

        ArrayList<QuestionData> test_3 = new ArrayList<>();

        QuestionData test3_1 = new QuestionData("My uncle died _____ the war.", "in");
        test3_1.addVariants("via");
        test3_1.addVariants("during");
        test3_1.addVariants("for");
        test3_1.addVariants("in");
        test_3.add(test3_1);

        QuestionData test3_2 = new QuestionData("The phone rang _____ I was having supper.", "while");
        test3_2.addVariants("while");
        test3_2.addVariants("during");
        test3_2.addVariants("for");
        test3_2.addVariants("in");
        test_3.add(test3_2);

        QuestionData test3_3 = new QuestionData("I lived in Paris _____ several years.", "c");
        test3_3.addVariants("while");
        test3_3.addVariants("during");
        test3_3.addVariants("for");
        test3_3.addVariants("in");
        test_3.add(test3_3);

        QuestionData test3_4 = new QuestionData("_____ I was in Paris, I made a lot of friends.", "While");
        test3_4.addVariants("While");
        test3_4.addVariants("During");
        test3_4.addVariants("For");
        test3_4.addVariants("In");
        test_3.add(test3_4);

        QuestionData test3_5 = new QuestionData("I was in hospital _____ three weeks.", "for");
        test3_5.addVariants("while");
        test3_5.addVariants("during");
        test3_5.addVariants("for");
        test3_5.addVariants("in");
        test_3.add(test3_5);

        QuestionData test3_6 = new QuestionData("_____ my stay in hospital, the nurses looked after me very well.", "During");
        test3_6.addVariants("While");
        test3_6.addVariants("During");
        test3_6.addVariants("For");
        test3_6.addVariants("In");
        test_3.add(test3_6);

        QuestionData test3_7 = new QuestionData("A football match lasts _____ ninety minutes.", "for");
        test3_7.addVariants("while");
        test3_7.addVariants("during");
        test3_7.addVariants("for");
        test3_7.addVariants("in");
        test_3.add(test3_7);

        QuestionData test3_8 = new QuestionData("I hurt my leg _____ I was playing football yesterday.", "while");
        test3_8.addVariants("while");
        test3_8.addVariants("during");
        test3_8.addVariants("for");
        test3_8.addVariants("in");
        test_3.add(test3_8);

        QuestionData test3_9 = new QuestionData("I hurt my leg _____ the second half of the match.", "in");
        test3_9.addVariants("via");
        test3_9.addVariants("until");
        test3_9.addVariants("for");
        test3_9.addVariants("in");
        test_3.add(test3_9);

        QuestionData test3_10 = new QuestionData("Traffic is always bad _____ the rush hour.", "during");
        test3_10.addVariants("while");
        test3_10.addVariants("during");
        test3_10.addVariants("for");
        test3_10.addVariants("in");
        test_3.add(test3_10);

        QuestionData test3_11 = new QuestionData("Last week I was held up _____ three hours.", "for");
        test3_11.addVariants("while");
        test3_11.addVariants("during");
        test3_11.addVariants("for");
        test3_11.addVariants("in");
        test_3.add(test3_11);

        QuestionData test3_12 = new QuestionData("Peter came round _____ we were eating.", "while");
        test3_12.addVariants("while");
        test3_12.addVariants("during");
        test3_12.addVariants("for");
        test3_12.addVariants("in");
        test_3.add(test3_12);

        QuestionData test3_13 = new QuestionData("Peter came round _____ the meal.", "during");
        test3_13.addVariants("while");
        test3_13.addVariants("during");
        test3_13.addVariants("on");
        test3_13.addVariants("in");
        test_3.add(test3_13);

        QuestionData test3_14 = new QuestionData("It’s my birthday _____ next week.", "*");
        test3_14.addVariants("at");
        test3_14.addVariants("in");
        test3_14.addVariants("on");
        test3_14.addVariants("*");
        test_3.add(test3_14);

        QuestionData test3_15 = new QuestionData("When?\n_____ Monday.", "On");
        test3_15.addVariants("At");
        test3_15.addVariants("In");
        test3_15.addVariants("On");
        test3_15.addVariants("*");
        test_3.add(test3_15);

        QuestionData test3_16 = new QuestionData("_____ when were you born?", "*");
        test3_16.addVariants("At");
        test3_16.addVariants("In");
        test3_16.addVariants("On");
        test3_16.addVariants("*");
        test_3.add(test3_16);

        QuestionData test3_17 = new QuestionData("_____ 8.00 _____ the morning.", "At / in");
        test3_17.addVariants("At / in");
        test3_17.addVariants("In / in");
        test3_17.addVariants("On / in");
        test3_17.addVariants("* / in");
        test_3.add(test3_17);

        QuestionData test3_18 = new QuestionData("I’m meeting Alan _____ this evening.", "*");
        test3_18.addVariants("at");
        test3_18.addVariants("in");
        test3_18.addVariants("on");
        test3_18.addVariants("*");
        test_3.add(test3_18);

        QuestionData test3_19 = new QuestionData("What time?\n_____ six.", "At");
        test3_19.addVariants("At");
        test3_19.addVariants("In");
        test3_19.addVariants("On");
        test3_19.addVariants("*");
        test_3.add(test3_19);

        QuestionData test3_20 = new QuestionData("What did you do _____ the weekend?", "at");
        test3_20.addVariants("at");
        test3_20.addVariants("in");
        test3_20.addVariants("with");
        test3_20.addVariants("*");
        test_3.add(test3_20);

        QuestionData test3_21 = new QuestionData("_____ Friday evening we went to a party.", "On");
        test3_21.addVariants("At");
        test3_21.addVariants("In");
        test3_21.addVariants("On");
        test3_21.addVariants("*");
        test_3.add(test3_21);

        QuestionData test3_22 = new QuestionData("We slept late _____ Saturday morning.", "on");
        test3_22.addVariants("at");
        test3_22.addVariants("in");
        test3_22.addVariants("on");
        test3_22.addVariants("*");
        test_3.add(test3_22);

        QuestionData test3_23 = new QuestionData("_____ the afternoon we went shopping.", "In");
        test3_23.addVariants("At");
        test3_23.addVariants("In");
        test3_23.addVariants("On");
        test3_23.addVariants("*");
        test_3.add(test3_23);

        QuestionData test3_24 = new QuestionData("____ 7:00 some friends came round for a drink.", "At");
        test3_24.addVariants("At");
        test3_24.addVariants("In");
        test3_24.addVariants("On");
        test3_24.addVariants("*");
        test_3.add(test3_24);

        QuestionData test3_25 = new QuestionData("We didn’t do anything _____ Sunday.", "on");
        test3_25.addVariants("at");
        test3_25.addVariants("in");
        test3_25.addVariants("on");
        test3_25.addVariants("*");
        test_3.add(test3_25);

        QuestionData test3_26 = new QuestionData("The weather in England is unreliable. _____ summer it can be hot,\n" +
                "but it often rains _____ April and June.", "In / in");
        test3_26.addVariants("At / in");
        test3_26.addVariants("In / in");
        test3_26.addVariants("On / in");
        test3_26.addVariants("* / in");
        test_3.add(test3_26);

        QuestionData test3_27 = new QuestionData("_____ last year the summer was awful.", "*");
        test3_27.addVariants("At");
        test3_27.addVariants("In");
        test3_27.addVariants("On");
        test3_27.addVariants("*");
        test_3.add(test3_27);

        QuestionData test3_28 = new QuestionData("The best English weather is _____ spring and autumn.", "in");
        test3_28.addVariants("at");
        test3_28.addVariants("in");
        test3_28.addVariants("on");
        test3_28.addVariants("*");
        test_3.add(test3_28);

        QuestionData test3_29 = new QuestionData("I learned to drive _____ 1980 _____ the age of 17.", "in / at");
        test3_29.addVariants("at / at");
        test3_29.addVariants("in / at");
        test3_29.addVariants("on / at");
        test3_29.addVariants("* / at");
        test_3.add(test3_29);

        QuestionData test3_30 = new QuestionData("My brother learned _____ the same time as me, but I passed first.", "at");
        test3_30.addVariants("at");
        test3_30.addVariants("in");
        test3_30.addVariants("on");
        test3_30.addVariants("*");
        test_3.add(test3_30);

        QuestionData test3_31 = new QuestionData("I’ll phone you _____ next week. _____ Thursday.", "* / On");
        test3_31.addVariants("at / On");
        test3_31.addVariants("in / On");
        test3_31.addVariants("on / On");
        test3_31.addVariants("* / On");
        test_3.add(test3_31);

        QuestionData test3_32 = new QuestionData("I’ll phone you _____ about 3.00.", "at");
        test3_32.addVariants("at");
        test3_32.addVariants("in");
        test3_32.addVariants("on");
        test3_32.addVariants("*");
        test_3.add(test3_32);

        QuestionData test3_33 = new QuestionData("Helen Keller’s deafness and blindness __(33)__ by a severe illness\n" +
                "when she was a baby. Her parents __(34)__ what to do, and they\n" +
                "__(35)__ it difficult to control their growing daughter. One day they\n" +
                "__(36)__ about a brilliant young teacher called Anne Sullivan. She\n" +
                "__(37)__ to work with Helen. Very firmly and patiently, she __(38)__\n" +
                "her that every object __(39)__ a name.", "were caused");
        test3_33.addVariants("cause");
        test3_33.addVariants("caused");
        test3_33.addVariants("were caused");
        test3_33.addVariants("has caused");
        test_3.add(test3_33);

        QuestionData test3_34 = new QuestionData("Helen Keller’s deafness and blindness __(33)__ by a severe illness\n" +
                "when she was a baby. Her parents __(34)__ what to do, and they\n" +
                "__(35)__ it difficult to control their growing daughter. One day they\n" +
                "__(36)__ about a brilliant young teacher called Anne Sullivan. She\n" +
                "__(37)__ to work with Helen. Very firmly and patiently, she __(38)__\n" +
                "her that every object __(39)__ a name.", "didn’t know");
        test3_34.addVariants("didn’t know");
        test3_34.addVariants("doesn’t know");
        test3_34.addVariants("knew");
        test3_34.addVariants("knows");
        test_3.add(test3_34);

        QuestionData test3_35 = new QuestionData("Helen Keller’s deafness and blindness __(33)__ by a severe illness\n" +
                "when she was a baby. Her parents __(34)__ what to do, and they\n" +
                "__(35)__ it difficult to control their growing daughter. One day they\n" +
                "__(36)__ about a brilliant young teacher called Anne Sullivan. She\n" +
                "__(37)__ to work with Helen. Very firmly and patiently, she __(38)__\n" +
                "her that every object __(39)__ a name.", "found");
        test3_35.addVariants("find");
        test3_35.addVariants("finds");
        test3_35.addVariants("were found");
        test3_35.addVariants("found");
        test_3.add(test3_35);

        QuestionData test3_36 = new QuestionData("Helen Keller’s deafness and blindness __(33)__ by a severe illness\n" +
                "when she was a baby. Her parents __(34)__ what to do, and they\n" +
                "__(35)__ it difficult to control their growing daughter. One day they\n" +
                "__(36)__ about a brilliant young teacher called Anne Sullivan. She\n" +
                "__(37)__ to work with Helen. Very firmly and patiently, she __(38)__\n" +
                "her that every object __(39)__ a name.", "were told");
        test3_36.addVariants("tell");
        test3_36.addVariants("were told");
        test3_36.addVariants("telling");
        test3_36.addVariants("told");
        test_3.add(test3_36);

        QuestionData test3_37 = new QuestionData("Helen Keller’s deafness and blindness __(33)__ by a severe illness\n" +
                "when she was a baby. Her parents __(34)__ what to do, and they\n" +
                "__(35)__ it difficult to control their growing daughter. One day they\n" +
                "__(36)__ about a brilliant young teacher called Anne Sullivan. She\n" +
                "__(37)__ to work with Helen. Very firmly and patiently, she __(38)__\n" +
                "her that every object __(39)__ a name.", "came");
        test3_37.addVariants("came");
        test3_37.addVariants("begin");
        test3_37.addVariants("start");
        test3_37.addVariants("helping");
        test_3.add(test3_37);

        QuestionData test3_38 = new QuestionData("Helen Keller’s deafness and blindness __(33)__ by a severe illness\n" +
                "when she was a baby. Her parents __(34)__ what to do, and they\n" +
                "__(35)__ it difficult to control their growing daughter. One day they\n" +
                "__(36)__ about a brilliant young teacher called Anne Sullivan. She\n" +
                "__(37)__ to work with Helen. Very firmly and patiently, she __(38)__\n" +
                "her that every object __(39)__ a name.", "taught");
        test3_38.addVariants("studied");
        test3_38.addVariants("helped");
        test3_38.addVariants("thought");
        test3_38.addVariants("taught");
        test_3.add(test3_38);

        QuestionData test3_39 = new QuestionData("Helen Keller’s deafness and blindness __(33)__ by a severe illness\n" +
                "when she was a baby. Her parents __(34)__ what to do, and they\n" +
                "__(35)__ it difficult to control their growing daughter. One day they\n" +
                "__(36)__ about a brilliant young teacher called Anne Sullivan. She\n" +
                "__(37)__ to work with Helen. Very firmly and patiently, she __(38)__\n" +
                "her that every object __(39)__ a name.", "had");
        test3_39.addVariants("has");
        test3_39.addVariants("had");
        test3_39.addVariants("have");
        test3_39.addVariants("having");
        test_3.add(test3_39);

        return test_3;
    }


}
