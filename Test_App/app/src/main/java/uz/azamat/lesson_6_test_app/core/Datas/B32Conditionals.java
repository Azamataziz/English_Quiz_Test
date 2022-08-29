package uz.azamat.lesson_6_test_app.core.Datas;

import java.util.ArrayList;

import uz.azamat.lesson_6_test_app.core.QuestionData;

public class B32Conditionals {

    public static ArrayList<QuestionData> makeType1() {

        ArrayList<QuestionData> type1 = new ArrayList<>();

        QuestionData test1 = new QuestionData("If I ___ my entrance exams I ___ the happiest man in the world.", "pass / shall be");
        test1.addVariants("shall pass / would be");
        test1.addVariants("passed / am");
        test1.addVariants("passed / would have been");
        test1.addVariants("will pass / be");
        test1.addVariants("pass / shall be");
        type1.add(test1);

        QuestionData test2 = new QuestionData("We ___ to see you next Sunday, if I ___ well.", "will come / get");
        test2.addVariants("shall come / shall get");
        test2.addVariants("come / get");
        test2.addVariants("comes / will get");
        test2.addVariants("will come / get");
        test2.addVariants("will come / will get");
        type1.add(test2);

        QuestionData test3 = new QuestionData("What ___ you ___ if the train ___ in time?", "will / do / doesn’t come");
        test3.addVariants("will be / doing / come");
        test3.addVariants("did / will not come");
        test3.addVariants("do / didn’t / come");
        test3.addVariants("have / done / came");
        test3.addVariants("will / do / doesn’t come");
        type1.add(test3);

        QuestionData test4 = new QuestionData("If I ___ time I ___ you", "have / shall help");
        test4.addVariants("have / help");
        test4.addVariants("shall have / shall help");
        test4.addVariants("shall have / help");
        test4.addVariants("have / shall help");
        test4.addVariants("has / help");
        type1.add(test4);

        QuestionData test5 = new QuestionData("If you ___ tickets we ___ Paris.", "buy / shall visit");
        test5.addVariants("will buy / shall visit");
        test5.addVariants("bought / visit");
        test5.addVariants("buys / visited");
        test5.addVariants("were buying / should visit");
        test5.addVariants("buy / shall visit");
        type1.add(test5);

        QuestionData test6 = new QuestionData("Tomorrow if the weather ___ fine we ___ out of the town for hours.", "is / shall get");
        test6.addVariants("is / shall get");
        test6.addVariants("will be / shall get");
        test6.addVariants("be / will get");
        test6.addVariants("were / get");
        test6.addVariants("was / get");
        type1.add(test6);

        QuestionData test7 = new QuestionData("If you are free, watch the film they ___ on TV.", "are showing");
        test7.addVariants("shows");
        test7.addVariants("showed");
        test7.addVariants("are showing");
        test7.addVariants("had showed");
        test7.addVariants("have showed");
        type1.add(test7);

        QuestionData test8 = new QuestionData("If the weather ___ fine we ___ to the park.", "is / shall go");
        test8.addVariants("is / shall go");
        test8.addVariants("was / go");
        test8.addVariants("are / go");
        test8.addVariants("was / shall go");
        test8.addVariants("would / should go");
        type1.add(test8);

        QuestionData test9 = new QuestionData("If my friend ___ to our town next year I ___ him the sights of the city.", "comes / shall show");
        test9.addVariants("shall come / show");
        test9.addVariants("comes / shall show");
        test9.addVariants("has come / is showing");
        test9.addVariants("is coming / will show");
        test9.addVariants("come / shows");
        type1.add(test9);

        QuestionData test10 = new QuestionData("They ___ not object to your plan if you ___ it up perfectly.", "will / make");
        test10.addVariants("do / will make");
        test10.addVariants("did / won’t make");
        test10.addVariants("will / make");
        test10.addVariants("would / don’t make");
        test10.addVariants("don’t / shall make");
        type1.add(test10);

        QuestionData test11 = new QuestionData("If ___ rings me up, tell him that I’ll be in at 5.", "somebody");
        test11.addVariants("anything");
        test11.addVariants("nobody");
        test11.addVariants("everything");
        test11.addVariants("something");
        test11.addVariants("somebody");
        type1.add(test11);

        QuestionData test12 = new QuestionData("Hark will play tennis if he ___ his work in time.", "finishes");
        test12.addVariants("finish");
        test12.addVariants("finished");
        test12.addVariants("finishing");
        test12.addVariants("finishes");
        test12.addVariants("will finish");
        type1.add(test12);

        QuestionData test13 = new QuestionData("If you ___ after two hares you ___ none.", "run / will catch");
        test13.addVariants("run / catch");
        test13.addVariants("run / will catch");
        test13.addVariants("will run / will catch");
        test13.addVariants("will run / catch");
        test13.addVariants("ran / catch");
        type1.add(test13);

        QuestionData test14 = new QuestionData("If we ___ English four times a week we’ll learn it.", "have");
        test14.addVariants("are having");
        test14.addVariants("had");
        test14.addVariants("have");
        test14.addVariants("will have");
        test14.addVariants("shall have");
        type1.add(test14);

        QuestionData test15 = new QuestionData("If you ___ in a hurry, leave that to me.", "are");
        test15.addVariants("will be");
        test15.addVariants("was");
        test15.addVariants("are");
        test15.addVariants("were");
        test15.addVariants("are being");
        type1.add(test15);

        QuestionData test16 = new QuestionData(" If you ___ to please an English person, be very polite about his garden.", "want");
        test16.addVariants("want");
        test16.addVariants("wanted");
        test16.addVariants("are wanting");
        test16.addVariants("will want");
        test16.addVariants("wants");
        type1.add(test16);

        QuestionData test17 = new QuestionData("You ___ miss the train if you ___ a taxi.", "will / don’t take");
        test17.addVariants("will / don’t take");
        test17.addVariants(" - / don’t take");
        test17.addVariants("will / won’t take");
        test17.addVariants("don’t / take");
        test17.addVariants("will / would not take");
        type1.add(test17);

        QuestionData test18 = new QuestionData("We ___ if they ___ .", "don’t know / will come");
        test18.addVariants("shall not know / come");
        test18.addVariants("don’t know / will come");
        test18.addVariants("didn’t know / will come");
        test18.addVariants("haven’t known / come");
        test18.addVariants("knew / will come");
        type1.add(test18);

        QuestionData test19 = new QuestionData("If you want to be healthy you should ___ .", "go in for sports");
        test19.addVariants("sleep much");
        test19.addVariants("attend all your classes");
        test19.addVariants("go in for sports");
        test19.addVariants("give up sport");
        test19.addVariants("take up art");
        type1.add(test19);

        QuestionData test20 = new QuestionData("If you ___ Oxford you ___ some interesting old buildings.", "visit / will see");
        test20.addVariants("will visit / will see");
        test20.addVariants("visit / see");
        test20.addVariants("visited / will see");
        test20.addVariants("visits / see");
        test20.addVariants("visit / will see");
        type1.add(test20);

        QuestionData test21 = new QuestionData("He ___ the picture if it ___ him.", "will buy / impresses");
        test21.addVariants("will buy / impressed");
        test21.addVariants("would buy / impresses");
        test21.addVariants("will buy / impresses");
        test21.addVariants("will buy / will impress");
        test21.addVariants("has bought / impress");
        type1.add(test21);

        QuestionData test22 = new QuestionData("If you ___ Ann tomorrow, can you tell her to phone?", "see");
        test22.addVariants("saw");
        test22.addVariants("see");
        test22.addVariants("will see");
        test22.addVariants("had seen");
        test22.addVariants("shall see");
        type1.add(test22);

        QuestionData test23 = new QuestionData("They are expecting us. They will be disappointed if we ___ .", "don’t come");
        test23.addVariants("won’t come");
        test23.addVariants("didn’t come");
        test23.addVariants("haven’t come");
        test23.addVariants("don’t come");
        test23.addVariants("came");
        type1.add(test23);

        QuestionData test24 = new QuestionData("I wonder whether he ___ if nothing unexpected ___", "will come / detains");
        test24.addVariants("comes / detains");
        test24.addVariants("will come / detain");
        test24.addVariants("comes / will detain");
        test24.addVariants("will come / will detain");
        test24.addVariants("will come / detains");
        type1.add(test24);

        QuestionData test25 = new QuestionData("I ___ my work in time if you ___ me.", "shall do / help");
        test25.addVariants("shall do / help");
        test25.addVariants("should do / helps");
        test25.addVariants("do / will help");
        test25.addVariants("have done / help");
        test25.addVariants("had done / would help");
        type1.add(test25);

        QuestionData test26 = new QuestionData("The British people think, if you ___ tea ___ you.", "are depressed / will cheer");
        test26.addVariants("were depressed / cheers");
        test26.addVariants("are depressed / will cheer");
        test26.addVariants("shall be depressed / will cheer");
        test26.addVariants("have been depressed / cheered");
        test26.addVariants("had been depressed / was cheered");
        type1.add(test26);

        QuestionData test27 = new QuestionData("If you ___ wisely you ___ cheerfully.", "command / will be obeyed");
        test27.addVariants("command / will be obeyed");
        test27.addVariants("commanded / would have been obeyed");
        test27.addVariants("had commanded / would be obeyed");
        test27.addVariants("command / will obey");
        test27.addVariants("will command / are obeyed");
        type1.add(test27);

        QuestionData test28 = new QuestionData("If it ___ this winter, we ___ skiing.", "snows / shall go");
        test28.addVariants("snow / go");
        test28.addVariants("snows / shall go");
        test28.addVariants("snowed / went");
        test28.addVariants("snowed / had gone");
        test28.addVariants("had snowed / had gone");
        type1.add(test28);

        QuestionData test29 = new QuestionData("I ___ them some money if they ___ me for.", "shall send / ask");
        test29.addVariants("send / ask");
        test29.addVariants("sent / asked");
        test29.addVariants("will send / will ask");
        test29.addVariants("would send / ask");
        test29.addVariants("shall send / ask");
        type1.add(test29);

        QuestionData test30 = new QuestionData("If I ___ shopping I ___ some food tomorrow.", "go / shall buy");
        test30.addVariants("went / shall buy");
        test30.addVariants("go / buy");
        test30.addVariants("am going / would buy");
        test30.addVariants("go / shall buy");
        test30.addVariants("had gone / would buy");
        type1.add(test30);

        QuestionData test31 = new QuestionData("We ___ for a walk if the weather___ fine.", "shall go / is");
        test31.addVariants("shall go / will be");
        test31.addVariants("go / is");
        test31.addVariants("shall go / is");
        test31.addVariants("go / will be");
        test31.addVariants("goes / will be");
        type1.add(test31);

        QuestionData test32 = new QuestionData("If the weather ___ fine we ___ for a walk.", "is / shall go");
        test32.addVariants("was / shall go");
        test32.addVariants("is / shall go");
        test32.addVariants("will be / shall go");
        test32.addVariants("is / go");
        test32.addVariants("was / went");
        type1.add(test32);

        QuestionData test33 = new QuestionData("Mike ___ certainly if he ___ not busy.", "will come / is");
        test33.addVariants("comes / is");
        test33.addVariants("will come / will be");
        test33.addVariants("will come / is");
        test33.addVariants("comes / will be");
        test33.addVariants("come / will be");
        type1.add(test33);

        QuestionData test34 = new QuestionData("I ___ next week if I can ___ a train ticket.", "shall go / get");
        test34.addVariants("go / get");
        test34.addVariants("shall go / got");
        test34.addVariants("went / got");
        test34.addVariants("shall go / get");
        test34.addVariants("was going / get");
        type1.add(test34);

        QuestionData test35 = new QuestionData("I ___ happy if I ___ the university.", "shall be / enter");
        test35.addVariants("shall be / shall enter");
        test35.addVariants("am / shall enter");
        test35.addVariants("am / enter");
        test35.addVariants("shall be / enter");
        test35.addVariants("was / enter");
        type1.add(test35);

        QuestionData test36 = new QuestionData("Our fate is in her hands now. If she ___ tickets we ___ away.", "buys / shall fly");
        test36.addVariants("has bought / would fly");
        test36.addVariants("buys / shall fly");
        test36.addVariants("buy / fly");
        test36.addVariants("bought / fly");
        test36.addVariants("bought / would have flown");
        type1.add(test36);

        QuestionData test37 = new QuestionData("If you ___ in their talk they ___ .", "don’t interfere / will quarrel");
        test37.addVariants("don’t interfere / will quarrel");
        test37.addVariants("didn’t interfere / have quarreled");
        test37.addVariants("doesn’t interfere / will quarrel");
        test37.addVariants("interfere / should have quarreled");
        test37.addVariants("interfere / are quarrelling");
        type1.add(test37);

        return type1;
    }

    public static ArrayList<QuestionData> makeType2() {

        ArrayList<QuestionData> type2 = new ArrayList<>();

        QuestionData test1 = new QuestionData("If he ___ in Tokyo he ___ us.", "were / would visit");
        test1.addVariants("was / will visit");
        test1.addVariants("were / would visit");
        test1.addVariants("will be / will visit");
        test1.addVariants("is / would visit");
        test1.addVariants("are / will visit");
        type2.add(test1);

        QuestionData test2 = new QuestionData("If he ___ ill, he would stay at home.", "were");
        test2.addVariants("is");
        test2.addVariants("be");
        test2.addVariants("were");
        test2.addVariants("am");
        test2.addVariants("are");
        type2.add(test2);

        QuestionData test3 = new QuestionData("What would you do if a millionaire ___ you a lot of money.", "gave");
        test3.addVariants("gave");
        test3.addVariants("give");
        test3.addVariants("will give");
        test3.addVariants("giving");
        test3.addVariants("gives");
        type2.add(test3);

        QuestionData test4 = new QuestionData("If it ___ not so late I should go with you.", "b");
        test4.addVariants("was");
        test4.addVariants("were");
        test4.addVariants("is");
        test4.addVariants("be");
        test4.addVariants("are");
        type2.add(test4);

        QuestionData test5 = new QuestionData("If I ___ the car myself I ___ you use it.", "didn’t need / would let");
        test5.addVariants("needed / would let");
        test5.addVariants("don’t need / would let");
        test5.addVariants("didn’t need / wouldn’t let");
        test5.addVariants("didn’t need / would let");
        test5.addVariants("doesn’t need / would let");
        type2.add(test5);

        QuestionData test6 = new QuestionData("This house ___ better if they ___ it, ___ the grass and ___ flowers.", "would look / painted / cut / planted");
        test6.addVariants("will look / painted / cut / plant");
        test6.addVariants("would look / paint / cut / planted");
        test6.addVariants("looks / painted / cut / planted");
        test6.addVariants("looked / painted / cut / planted");
        test6.addVariants("would look / painted / cut / planted");
        type2.add(test6);

        QuestionData test7 = new QuestionData("If I ___ you I ___ never her.", "were / would forgive");
        test7.addVariants("am / shall forgive");
        test7.addVariants("was / don’t forgive");
        test7.addVariants("were / would forgive");
        test7.addVariants("had been / forgave");
        test7.addVariants("shall be / would have forgiven");
        type2.add(test7);

        QuestionData test8 = new QuestionData("I am sure Mike will lend you some money. I ___ if he refused.", "would be surprised");
        test8.addVariants("will be surprised");
        test8.addVariants("am surprised");
        test8.addVariants("would have been surprised");
        test8.addVariants("would be surprised");
        test8.addVariants("were surprised");
        type2.add(test8);

        QuestionData test9 = new QuestionData("Many people would be out of work if that factory ___ down.", "were closed");
        test9.addVariants("had been closed");
        test9.addVariants("were closed");
        test9.addVariants("was closing");
        test9.addVariants("is closed");
        test9.addVariants("will be closed");
        type2.add(test9);

        QuestionData test10 = new QuestionData("I ___ living in England if the weather ___ better.", "wouldn’t mind / were");
        test10.addVariants("don’t mind / was");
        test10.addVariants("didn’t mind / is");
        test10.addVariants("wouldn’t mind / is");
        test10.addVariants("wouldn’t mind / were");
        test10.addVariants("wouldn’t mind / will be");
        type2.add(test10);

        QuestionData test11 = new QuestionData("She promised that nothing ___ till he ___ home.", "would be done / came");
        test11.addVariants("would be done / came");
        test11.addVariants("is done / came");
        test11.addVariants("will be done / comes");
        test11.addVariants("has been done / came");
        test11.addVariants("have been done / comes");
        type2.add(test11);

        QuestionData test12 = new QuestionData("If he ___ generous, he ___ the poor.", "were/would help");
        test12.addVariants("were/would have helped");
        test12.addVariants("is/would have helped");
        test12.addVariants("was/would help");
        test12.addVariants("was/will help");
        test12.addVariants("were/would help");
        type2.add(test12);

        QuestionData test13 = new QuestionData("If I ___ you I ___ French next year.", "were / should learn");
        test13.addVariants("am / learn");
        test13.addVariants("was / shall learn");
        test13.addVariants("am / should learn");
        test13.addVariants("were / should learn");
        test13.addVariants("were / learned");
        type2.add(test13);

        QuestionData test14 = new QuestionData("I ___ so upset, if I ___ you.", "wouldn’t be / were");
        test14.addVariants("am / am ");
        test14.addVariants("wouldn’t be / were");
        test14.addVariants("was / were");
        test14.addVariants("won’t be / are");
        test14.addVariants("shall be / would be");
        type2.add(test14);

        QuestionData test15 = new QuestionData("If you ___ the Prime Minister what ___ you ___ ?", "were / would / do");
        test15.addVariants("are / would / have done");
        test15.addVariants("were / would / do");
        test15.addVariants("will be/will / do");
        test15.addVariants("have been / are / doing");
        test15.addVariants("will have been / would / be doing");
        type2.add(test15);

        QuestionData test16 = new QuestionData("If he ___ here he ___ help you.", "were / would help");
        test16.addVariants("is / would help");
        test16.addVariants("were / would help");
        test16.addVariants("would be / helped");
        test16.addVariants("was / helps");
        test16.addVariants("are / helping");
        type2.add(test16);

        QuestionData test17 = new QuestionData("I hoped if I ___ by the 10 o’clock train I ___ change for a bus.", "went / shouldn’t");
        test17.addVariants("went / shan’t");
        test17.addVariants("should go / hadn’t");
        test17.addVariants("go / shan’t");
        test17.addVariants("went / shouldn’t");
        test17.addVariants("go / shouldn’t");
        type2.add(test17);

        QuestionData test18 = new QuestionData("Mr. Bond said if Mr. Blake ___ at 10 o’clock he ___ to see him later.", "was busy / would come");
        test18.addVariants("is busy / will come");
        test18.addVariants("will be busy / will come");
        test18.addVariants("was busy / came");
        test18.addVariants("was busy / would come");
        test18.addVariants("is busy / comes");
        type2.add(test18);

        QuestionData test19 = new QuestionData("___ your mother wouldn’t be angry with you.", "If you didn’t get bad marks.");
        test19.addVariants("If you didn’t get bad marks.");
        test19.addVariants("If you got bad marks.");
        test19.addVariants("If you haven’t got bad marks.");
        test19.addVariants("If you get bad marks.");
        test19.addVariants("If you don’t get bad marks.");
        type2.add(test19);

        QuestionData test20 = new QuestionData("If I were you ___ .", "I would wait");
        test20.addVariants("I shall wait");
        test20.addVariants("I wait");
        test20.addVariants("I would wait");
        test20.addVariants("I waited");
        test20.addVariants("I’m waiting");
        type2.add(test20);

        QuestionData test21 = new QuestionData("If all the seas ___ one sea, what a great sea it ___ .", "were/would be");
        test21.addVariants("were/would be");
        test21.addVariants("is/will be");
        test21.addVariants("would be/were will");
        test21.addVariants("be/will be");
        test21.addVariants("were / will be");
        type2.add(test21);

        QuestionData test22 = new QuestionData("___ you really ___ me if I ___ away?", "would / follow / went");
        test22.addVariants("would / follow / go");
        test22.addVariants("will / follow / am going");
        test22.addVariants("would / follow / went");
        test22.addVariants("will / follow / would have gone");
        test22.addVariants("will / follow / goes");
        type2.add(test22);

        QuestionData test23 = new QuestionData("If I ___ you I ___ him.", "were / would help");
        test23.addVariants("am / will help");
        test23.addVariants("to be / would help");
        test23.addVariants("were / would help");
        test23.addVariants("is / would have helped");
        test23.addVariants("are / will help");
        type2.add(test23);

        QuestionData test24 = new QuestionData("If my brothers ___ time now they ___ help me.", "had / would help");
        test24.addVariants("has / helps");
        test24.addVariants("have had / have helped");
        test24.addVariants("have / help");
        test24.addVariants("is having / helped");
        test24.addVariants("had / would help");
        type2.add(test24);

        QuestionData test25 = new QuestionData("If I ___ the power I ___ people smoking at school and public places.", "had / would stop");
        test25.addVariants("had / stop");
        test25.addVariants("could have / would stop");
        test25.addVariants("had / stopped");
        test25.addVariants("had / would stop");
        test25.addVariants("have / would stop");
        type2.add(test25);

        QuestionData test26 = new QuestionData("If Helen ___ anywhere in the world she ___ in India.", "could live / would live");
        test26.addVariants("lived / live");
        test26.addVariants("live / would live");
        test26.addVariants("could live / would live");
        test26.addVariants("didn’t live / would live");
        test26.addVariants("lives / would live");
        type2.add(test26);

        QuestionData test27 = new QuestionData("If I ___ you I ___ harder.", "were / would work");
        test27.addVariants("am / will work");
        test27.addVariants("will be / work");
        test27.addVariants("be / shall work");
        test27.addVariants("were / would work");
        test27.addVariants("am / would have worked");
        type2.add(test27);

        QuestionData test28 = new QuestionData("If I ___ you I ___ it.", "were / wouldn’t regret");
        test28.addVariants("am / regretted");
        test28.addVariants("am / regrets");
        test28.addVariants("were / wouldn’t regret");
        test28.addVariants("is / didn’t regret");
        test28.addVariants("was / regret");
        type2.add(test28);

        return type2;
    }

    public static ArrayList<QuestionData> makeType3() {

        ArrayList<QuestionData> type3 = new ArrayList<>();

        QuestionData test1 = new QuestionData("The boy ___ at home an hour before, if he ___ his school at one o’clock last Monday.", "would have been / had left");
        test1.addVariants("would be / had left");
        test1.addVariants("was / would leave");
        test1.addVariants("had been / had left");
        test1.addVariants("has been / left");
        test1.addVariants("would have been / had left");
        type3.add(test1);

        QuestionData test2 = new QuestionData(" ___ he would have signed his name in the corner.", "If he had painted the picture");
        test2.addVariants("If he would have painted the picture");
        test2.addVariants("If he paints the picture");
        test2.addVariants("If he painted the picture");
        test2.addVariants("If he shall paint the picture");
        test2.addVariants("If he had painted the picture");
        type3.add(test2);

        QuestionData test3 = new QuestionData("If you ___ him yesterday he ___ you everything.", "had asked / would have told");
        test3.addVariants("asked / told");
        test3.addVariants("has asked / will tell");
        test3.addVariants("asked / would tell");
        test3.addVariants("had asked / would have told");
        test3.addVariants("would ask / would have told");
        type3.add(test3);

        QuestionData test4 = new QuestionData("If you had worked more, you ___ to translate this article yesterday.", "would have been able");
        test4.addVariants("are able");
        test4.addVariants("was able");
        test4.addVariants("were able");
        test4.addVariants("would have been able");
        test4.addVariants("has been able");
        type3.add(test4);

        QuestionData test5 = new QuestionData("If you ___ to me yesterday, we ___ this article.", "had come / should have translated");
        test5.addVariants("came / shall translate");
        test5.addVariants("would come / should translate");
        test5.addVariants("had come / should have translated");
        test5.addVariants("come / having translated");
        test5.addVariants("were coming / should be translating");
        type3.add(test5);

        QuestionData test6 = new QuestionData("If you ___ in time yesterday we ___ this work.", "had come / would have done");
        test6.addVariants("had come / would have done");
        test6.addVariants("came / would have done");
        test6.addVariants("come / shall go");
        test6.addVariants("will come / shall go");
        test6.addVariants("come / would go");
        type3.add(test6);

        QuestionData test7 = new QuestionData("She ___ if she ___ that she was ill.", "wouldn’t have gone out / had known");
        test7.addVariants("won’t go out / knows");
        test7.addVariants("didn’t go out / knew");
        test7.addVariants("hasn’t gone out / has known");
        test7.addVariants("wouldn’t have gone out / had known");
        test7.addVariants("doesn’t go out / knows");
        type3.add(test7);

        QuestionData test8 = new QuestionData(" -He failed his exam and he has to take it again in summer.\n" +
                "-If he ___ so many lessons he ___ it. But he didn’t follow the teacher’s advice.", "hadn’t missed / would have passed");
        test8.addVariants("didn’t miss / would pass");
        test8.addVariants("hadn’t missed / would have passed");
        test8.addVariants("doesn’t miss / won’t pass");
        test8.addVariants("has missed / will pass");
        test8.addVariants("will miss / doesn’t pass");
        type3.add(test8);

        QuestionData test9 = new QuestionData("“I ___ my work if you___ me then. Thank you.”", "shouldn’t have finished / hadn’t helped.");
        test9.addVariants("shan’t finish / don’t help.");
        test9.addVariants("haven’t finished / don’t help.");
        test9.addVariants("shouldn’t have finished / hadn’t helped.");
        test9.addVariants("don’t finish / won’t help.");
        test9.addVariants("didn’t finish / helped.");
        type3.add(test9);

        QuestionData test10 = new QuestionData("- Why didn’t you do the task?\n" +
                "- If he ___ everything from the start we ___ it earlier.", "hadn’t spoilt / would have done");
        test10.addVariants("hadn’t spoilt / would have done");
        test10.addVariants("didn’t spoil / would have done");
        test10.addVariants("doesn’t spoil / will do");
        test10.addVariants("wouldn’t spoil / did");
        test10.addVariants("spoils / shall have done");
        type3.add(test10);

        QuestionData test11 = new QuestionData("The children ___ in the open air if the weather ___ better last Sunday.", "would have played / had been");
        test11.addVariants("had played / was");
        test11.addVariants("played / was");
        test11.addVariants("would have played / had been");
        test11.addVariants("will play / is");
        test11.addVariants("would play / were");
        type3.add(test11);

        QuestionData test12 = new QuestionData("If we ___ a letter at 8 o’clock yesterday, we ___ on the same day.", "had got / should have started");
        test12.addVariants("got / started");
        test12.addVariants("had got / had started");
        test12.addVariants("would get / had started");
        test12.addVariants("had got / should have started");
        test12.addVariants("should have got / had started");
        type3.add(test12);

        QuestionData test13 = new QuestionData("If you ___ so many lessons you ___ all the exams.", "hadn’t missed / would have passed");
        test13.addVariants("didn’t miss / passed");
        test13.addVariants("hadn’t missed / would have passed");
        test13.addVariants("haven’t missed / would pass");
        test13.addVariants("missed / will pass");
        test13.addVariants("had missed / would have passed");
        type3.add(test13);

        QuestionData test14 = new QuestionData("I would have sent you a postcard while I was on holiday if I ___ your address.", "had had");
        test14.addVariants("had");
        test14.addVariants("was having");
        test14.addVariants("had had");
        test14.addVariants("will have");
        test14.addVariants("would have");
        type3.add(test14);

        QuestionData test15 = new QuestionData("If the driver ___ the accident wouldn’t have happened.", "hadn’t stopped");
        test15.addVariants("didn’t");
        test15.addVariants("doesn’t stop");
        test15.addVariants("won’t stop");
        test15.addVariants("hadn’t stopped");
        test15.addVariants("hasn’t stopped");
        type3.add(test15);

        QuestionData test16 = new QuestionData("If he ___ all right, he ___ with us yesterday.", "were / would be");
        test16.addVariants("was / was");
        test16.addVariants("had been / would have been");
        test16.addVariants("were / would be");
        test16.addVariants("had been / would be");
        test16.addVariants("would be / would have been");
        type3.add(test16);

        QuestionData test17 = new QuestionData("If she ___ a new dress, I ___ her then.", "hadn’t been wearing / might have recognized");
        test17.addVariants("hadn’t been wearing / might have recognized");
        test17.addVariants("didn’t wear / might recognize");
        test17.addVariants("wasn’t wearing / might recognize");
        test17.addVariants("wouldn’t wear / would recognize");
        test17.addVariants("hadn’t been wearing / might recognize");
        type3.add(test17);

        QuestionData test18 = new QuestionData("They ___ for the examination better if they ___ about it earlier.", "would have prepared / had known");
        test18.addVariants("would prepare / knew");
        test18.addVariants("prepare / know");
        test18.addVariants("prepared / knew");
        test18.addVariants("would have prepared / had known");
        test18.addVariants("will prepare / know");
        type3.add(test18);

        return type3;
    }





}
