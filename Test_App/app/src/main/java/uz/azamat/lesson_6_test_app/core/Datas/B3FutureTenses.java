package uz.azamat.lesson_6_test_app.core.Datas;

import java.util.ArrayList;

import uz.azamat.lesson_6_test_app.core.QuestionData;

public class B3FutureTenses {

    // 23
    public static ArrayList<QuestionData> makeTest1() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test1_1 = new QuestionData("I ___ to start a new life tomorrow.", "am going");
        test1_1.addVariants("to be going");
        test1_1.addVariants("am going");
        test1_1.addVariants("shall go");
        test1_1.addVariants("is going");
        test1_1.addVariants("were going");
        test1.add(test1_1);

        QuestionData test2 = new QuestionData("Mark ___ into the army next year.", "will go");
        test2.addVariants("was going");
        test2.addVariants("goes");
        test2.addVariants("will go");
        test2.addVariants("would go");
        test2.addVariants("will be go");
        test1.add(test2);

        QuestionData test3 = new QuestionData("They ___ dinner at this time tomorrow.", "will be having");
        test3.addVariants("have");
        test3.addVariants("are having");
        test3.addVariants("will have");
        test3.addVariants("having had");
        test3.addVariants("will be having");
        test1.add(test3);

        QuestionData test4 = new QuestionData("-What’s happened to your hair?\n-Your mother ___", "won’t like");
        test4.addVariants("didn’t like");
        test4.addVariants("liked");
        test4.addVariants("likes");
        test4.addVariants("would like");
        test4.addVariants("won’t like");
        test1.add(test4);

        QuestionData test5 = new QuestionData("I ___ if you come too late tomorrow.", "shall be sleeping");
        test5.addVariants("shall be sleeping");
        test5.addVariants("will sleep");
        test5.addVariants("sleep");
        test5.addVariants("am sleeping");
        test5.addVariants("was sleeping");
        test1.add(test5);

        QuestionData test6 = new QuestionData("Be quick or we ___ for school.", "shall be late");
        test6.addVariants("are late");
        test6.addVariants("is late");
        test6.addVariants("have been late");
        test6.addVariants("shall be late");
        test6.addVariants("will not be late");
        test1.add(test6);

        QuestionData test7 = new QuestionData("What ___ you ___ next Sunday?", "are doing");
        test7.addVariants("were doing");
        test7.addVariants("have done");
        test7.addVariants("are doing");
        test7.addVariants("are done");
        test7.addVariants("were done");
        test1.add(test7);

        QuestionData test8 = new QuestionData("I think I ___ a cassette recorder and use it in class.", "shall buy");
        test8.addVariants("buy");
        test8.addVariants("am buying");
        test8.addVariants("shall buy");
        test8.addVariants("would buy");
        test8.addVariants("bought");
        test1.add(test8);

        QuestionData test9 = new QuestionData("We ___ for Niagara tomorrow.", "are leaving");
        test9.addVariants("are leaving");
        test9.addVariants("have left");
        test9.addVariants("left");
        test9.addVariants("had to leave");
        test9.addVariants("shall be left");
        test1.add(test9);

        QuestionData test10 = new QuestionData("I’ll ask him what he ___ for lunch.", "will have");
        test10.addVariants("was having");
        test10.addVariants("are having");
        test10.addVariants("would have");
        test10.addVariants("should have");
        test10.addVariants("will have");
        test1.add(test10);

        QuestionData test11 = new QuestionData("Who ___ for a walk tomorrow?", "will go");
        test11.addVariants("go");
        test11.addVariants("will go");
        test11.addVariants("didn’t go");
        test11.addVariants("doesn’t go");
        test11.addVariants("went");
        test1.add(test11);

        QuestionData test12 = new QuestionData("They ___ their English exam at this time tomorrow.", "will be taking");
        test12.addVariants("will take");
        test12.addVariants("will be taking");
        test12.addVariants("would take");
        test12.addVariants("is taking");
        test12.addVariants("take");
        test1.add(test12);

        QuestionData test13 = new QuestionData("My boss ___ some V.I.P’s tomorrow.", "is receiving");
        test13.addVariants("will be received");
        test13.addVariants("is receiving");
        test13.addVariants("will have received");
        test13.addVariants("receive");
        test13.addVariants("has received");
        test1.add(test13);

        QuestionData test14 = new QuestionData("Ask him when the engineers ___ finish the talks.", "will");
        test14.addVariants("will");
        test14.addVariants("would");
        test14.addVariants("had");
        test14.addVariants("have");
        test14.addVariants("do");
        test1.add(test14);

        QuestionData test15 = new QuestionData("He ___ to learn French next year.", "is going");
        test15.addVariants("was going");
        test15.addVariants("is going");
        test15.addVariants("are going");
        test15.addVariants("will be going");
        test15.addVariants("shall be going");
        test1.add(test15);

        QuestionData test16 = new QuestionData("All the children ___ on an excursion next week.", "will go");
        test16.addVariants("go");
        test16.addVariants("went");
        test16.addVariants("have gone");
        test16.addVariants("will go");
        test16.addVariants("has gone");
        test1.add(test16);

        QuestionData test17 = new QuestionData("___ you ___ at 6 tomorrow?", "will/be sleeping");
        test17.addVariants("will/sleep");
        test17.addVariants("were/sleeping");
        test17.addVariants("will/be sleeping");
        test17.addVariants("do/sleep");
        test17.addVariants("are/sleeping");
        test1.add(test17);

        QuestionData test18 = new QuestionData("I shall be back by 6 and I hope you ___ a good sleep by that time.", "will have had");
        test18.addVariants("will have had");
        test18.addVariants("will have");
        test18.addVariants("would have");
        test18.addVariants("have had");
        test18.addVariants("had had");
        test1.add(test18);

        QuestionData test19 = new QuestionData("This time tomorrow we ___ probably ___ fishing.", "shall/be");
        test19.addVariants("are/will");
        test19.addVariants("-/shall");
        test19.addVariants("shall/be");
        test19.addVariants("shall/-");
        test19.addVariants("do/are");
        test1.add(test19);

        QuestionData test20 = new QuestionData("What ___ you ___ at 6 tomorrow?", "will/be doing");
        test20.addVariants("will/do");
        test20.addVariants("was/doing");
        test20.addVariants("will/be doing");
        test20.addVariants("is/doing");
        test20.addVariants("will/have done");
        test1.add(test20);

        QuestionData test21 = new QuestionData("By the end of the first term we ___ many English books.", "shall have read");
        test21.addVariants("shall be read");
        test21.addVariants("read");
        test21.addVariants("shall have read");
        test21.addVariants("have read");
        test21.addVariants("shall read");
        test1.add(test21);

        QuestionData test22 = new QuestionData("What ___ you ___ at 6 tomorrow?", "will/be doing");
        test22.addVariants("did/do");
        test22.addVariants("will/be doing");
        test22.addVariants("do/do");
        test22.addVariants("do/did");
        test22.addVariants("have/done");
        test1.add(test22);

        QuestionData test23 = new QuestionData("He ___ for you at 7 in the evening next Sunday.", "will be waiting");
        test23.addVariants("was waiting");
        test23.addVariants("were waiting");
        test23.addVariants("will be waiting");
        test23.addVariants("have waited");
        test23.addVariants("had been waited");
        test1.add(test23);


        return test1;

    }

}
