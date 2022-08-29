package uz.azamat.lesson_6_test_app.core.Datas;

import java.util.ArrayList;

import uz.azamat.lesson_6_test_app.core.QuestionData;

public class B3PastTenses {


    // 55
    public static ArrayList<QuestionData> makeTest1() {

        ArrayList<QuestionData> test1 = new ArrayList<>();

        QuestionData test1_1 = new QuestionData("She never ___ to eat soup.", "liked");
        test1_1.addVariants("didn’t like");
        test1_1.addVariants("like");
        test1_1.addVariants("had liked");
        test1_1.addVariants("would not like");
        test1_1.addVariants("liked");
        test1.add(test1_1);

        QuestionData test2 = new QuestionData("“I’ll drink tea from this tin mug.”\n" +
                "“Where ___ you ___ it?”", "did/find");
        test2.addVariants("did/find");
        test2.addVariants("do/find");
        test2.addVariants("did/found");
        test2.addVariants("were/found");
        test2.addVariants("are/found");
        test1.add(test2);

        QuestionData test3 = new QuestionData("It was dark and cold. At one moment he thought that he ___ his way.", "had lost");
        test3.addVariants("lost");
        test3.addVariants("will lose");
        test3.addVariants("had lost");
        test3.addVariants("was lost");
        test3.addVariants("loses");
        test1.add(test3);

        QuestionData test4 = new QuestionData("I didn’t know anyone in the city where I ___ to get.", "was trying");
        test4.addVariants("did try");
        test4.addVariants("was trying");
        test4.addVariants("would try");
        test4.addVariants("have tried");
        test4.addVariants("shall try");
        test1.add(test4);

        QuestionData test5 = new QuestionData("-Why ___ you go to the plant?\n" +
                "-I ___ no time.", "didn’t/had");
        test5.addVariants("do/had");
        test5.addVariants("will/have");
        test5.addVariants("did/hadn’t");
        test5.addVariants("didn’t/hadn’t");
        test5.addVariants("didn’t/had");
        test1.add(test5);

        QuestionData test6 = new QuestionData("A policeman ___ me crossing the street yesterday.", "saw");
        test6.addVariants("seen");
        test6.addVariants("saw");
        test6.addVariants("has seen");
        test6.addVariants("will see");
        test6.addVariants("had seen");
        test1.add(test6);

        QuestionData test7 = new QuestionData("Arthur ___ all his exams by 5 o’clock yesterday.", "had passed");
        test7.addVariants("passed");
        test7.addVariants("passes");
        test7.addVariants("has passed");
        test7.addVariants("has been passed");
        test7.addVariants("had passed");
        test1.add(test7);

        QuestionData test8 = new QuestionData("He evidently ___ his shoes for a very long time. They were worn-out.", "had been wearing");
        test8.addVariants("were wearing");
        test8.addVariants("are wearing");
        test8.addVariants("had been wearing");
        test8.addVariants("was wearing");
        test8.addVariants("had been worn");
        test1.add(test8);

        QuestionData test9 = new QuestionData("So, the invisible man ___ into the shop and ___ down.", "came/walked");
        test9.addVariants("comes/walked");
        test9.addVariants("didn’t come/walk");
        test9.addVariants("came/walked");
        test9.addVariants("will come/walked");
        test9.addVariants("comes/would walk");
        test1.add(test9);

        QuestionData test10 = new QuestionData("-We were at the theatre 2 days ago. The performance was excellent.\n" +
                "-Who ___ the leading part?", "played");
        test10.addVariants("did play");
        test10.addVariants("play");
        test10.addVariants("played");
        test10.addVariants("would play");
        test10.addVariants("has played");
        test1.add(test10);

        QuestionData test11 = new QuestionData("One day the boys found a man in the forest. He ___", "was dying");
        test11.addVariants("will die");
        test11.addVariants("had been dying");
        test11.addVariants("had died");
        test11.addVariants("was dying");
        test11.addVariants("die");
        test1.add(test11);

        QuestionData test12 = new QuestionData("His father ___ a doctor and he ___ to make his son a doctor, too.", "was/wanted");
        test12.addVariants("was/wants");
        test12.addVariants("were/wanted");
        test12.addVariants("will be/would want");
        test12.addVariants("was/wanted");
        test12.addVariants("were/wanted");
        test1.add(test12);

        QuestionData test13 = new QuestionData("During his school years Cronin ___ great interest in literature.", "took");
        test13.addVariants("take");
        test13.addVariants("took");
        test13.addVariants("has taken");
        test13.addVariants("had taken");
        test13.addVariants("would take");
        test1.add(test13);

        QuestionData test14 = new QuestionData("He ___ the box yesterday, because he had to do it.", "opened");
        test14.addVariants("would open");
        test14.addVariants("had opening");
        test14.addVariants("have opened");
        test14.addVariants("opens");
        test14.addVariants("opened");
        test1.add(test14);

        QuestionData test15 = new QuestionData("While the gentlemen ___ the recent events, the ladies ___ about the weather.", "were discussing/were talking");
        test15.addVariants("discuss/talk");
        test15.addVariants("are discussing/was talking");
        test15.addVariants("being discussed/being talked");
        test15.addVariants("were discussing/were talking");
        test15.addVariants("have discussed/have talked");
        test1.add(test15);

        QuestionData test16 = new QuestionData("She ___ you a letter three weeks ago.", "sent");
        test16.addVariants("had sent");
        test16.addVariants("has sent");
        test16.addVariants("sent");
        test16.addVariants("send");
        test16.addVariants("was sending");
        test1.add(test16);

        QuestionData test17 = new QuestionData("When he ___ home I ___ him the book.", "came/showed");
        test17.addVariants("came /shall show");
        test17.addVariants("comes/showed");
        test17.addVariants("has come/has shown");
        test17.addVariants("came/showed");
        test17.addVariants("was coming/shall show");
        test1.add(test17);

        QuestionData test18 = new QuestionData("They ___ breakfast at 7 and ___ home at eight.", "had/left");
        test18.addVariants("have/left");
        test18.addVariants("had/left");
        test18.addVariants("had/leave");
        test18.addVariants("have/leaves");
        test18.addVariants("had/had left");
        test1.add(test18);

        QuestionData test19 = new QuestionData("Long ago people ___ little about those minerals.", "knew");
        test19.addVariants("had known");
        test19.addVariants("knowed");
        test19.addVariants("will know");
        test19.addVariants("knew");
        test19.addVariants("have known");
        test1.add(test19);

        QuestionData test20 = new QuestionData("The dentist ___ two of his teeth. One of them ___ quite good.", "pulled out/was");
        test20.addVariants("pulls out/are");
        test20.addVariants("pull out/was");
        test20.addVariants("pulled out/was");
        test20.addVariants("pull out/was");
        test20.addVariants("pulled out/were");
        test1.add(test20);

        QuestionData test21 = new QuestionData("I couldn’t imagine what ___ to her.", "had happened");
        test21.addVariants("had happened");
        test21.addVariants("has been happened");
        test21.addVariants("will happen");
        test21.addVariants("has been happening");
        test21.addVariants("happens");
        test1.add(test21);

        QuestionData test22 = new QuestionData("He felt that he ___ it wrong.", "had made");
        test22.addVariants("has made");
        test22.addVariants("made");
        test22.addVariants("will make");
        test22.addVariants("was made");
        test22.addVariants("had made");
        test1.add(test22);

        QuestionData test23 = new QuestionData("I ___ my homework when my mother came.", "had already done");
        test23.addVariants("already did");
        test23.addVariants("have already done");
        test23.addVariants("had already done");
        test23.addVariants("has already done");
        test23.addVariants("already do");
        test1.add(test23);

        QuestionData test24 = new QuestionData("Turning I found my father sitting beside me on the sofa. I said " +
                "“How ___ you ___ here?”", "did/get");
        test24.addVariants("do/get");
        test24.addVariants("did/get");
        test24.addVariants("does/get");
        test24.addVariants("was/getting");
        test24.addVariants("has/been getting");
        test1.add(test24);

        QuestionData test25 = new QuestionData("Last summer we ___ a trip to Houston.", "made");
        test25.addVariants("made");
        test25.addVariants("has made");
        test25.addVariants("are making");
        test25.addVariants("shall make");
        test25.addVariants("will be making");
        test1.add(test25);

        QuestionData test26 = new QuestionData("He ___ barely ___ of him until that evening.", "had/heard");
        test26.addVariants("had/heard");
        test26.addVariants("has/heard");
        test26.addVariants("was/heard");
        test26.addVariants("did/hear");
        test26.addVariants("didn’t/hear");
        test1.add(test26);

        QuestionData test27 = new QuestionData("She ___ in Tashkent five years ago.", "lived");
        test27.addVariants("had lived");
        test27.addVariants("lived");
        test27.addVariants("has lived");
        test27.addVariants("live");
        test27.addVariants("have lived");
        test1.add(test27);

        QuestionData test28 = new QuestionData("We ___ English, so I know it a little.", "learned");
        test28.addVariants("were learning");
        test28.addVariants("learned");
        test28.addVariants("learns");
        test28.addVariants("should learn");
        test28.addVariants("were learning");
        test1.add(test28);

        QuestionData test29 = new QuestionData("Yesterday at this time it ___ .", "was snowing");
        test29.addVariants("had snowed");
        test29.addVariants("snows");
        test29.addVariants("snowed");
        test29.addVariants("was snowing");
        test29.addVariants("had been snowing");
        test1.add(test29);

        QuestionData test30 = new QuestionData("We ___ he ___ ill.", "did not know/was");
        test30.addVariants("did not know/was");
        test30.addVariants("knew/am ill");
        test30.addVariants("knew/will be");
        test30.addVariants("had known/is");
        test30.addVariants("were known/be");
        test1.add(test30);

        QuestionData test31 = new QuestionData("The plane ___ at 4 and it ___ us 20 minutes to get there.", "landed/took");
        test31.addVariants("was landing/was taking");
        test31.addVariants("was landing/was taking");
        test31.addVariants("landed/took");
        test31.addVariants("lands/was taken");
        test31.addVariants("has landed/is taking");
        test1.add(test31);

        QuestionData test32 = new QuestionData("We ___ the station by 5 o’clock yesterday.", "had reached");
        test32.addVariants("shall reach");
        test32.addVariants("were reaching");
        test32.addVariants("had reached");
        test32.addVariants("reached");
        test32.addVariants("would reach");
        test1.add(test32);

        QuestionData test33 = new QuestionData("The Browns ___ out of town last Sunday and ___ a good time there.", "went/had");
        test33.addVariants("were going/had");
        test33.addVariants("went/are having");
        test33.addVariants("went/had");
        test33.addVariants("are going/were having");
        test33.addVariants("goes/has");
        test1.add(test33);

        QuestionData test34 = new QuestionData("Before answering the telephone he ___ down the table.", "laid");
        test34.addVariants("laid");
        test34.addVariants("was lying");
        test34.addVariants("had laid");
        test34.addVariants("lay");
        test34.addVariants("has laid");
        test1.add(test34);

        QuestionData test35 = new QuestionData("Who ___ at the meeting yesterday?", "spoke");
        test35.addVariants("speak");
        test35.addVariants("speaks");
        test35.addVariants("spoke");
        test35.addVariants("had spoken");
        test35.addVariants("will speak");
        test1.add(test35);

        QuestionData test36 = new QuestionData("He met me with the bird in his hand. It ___ curiously at me.", "was looking");
        test36.addVariants("looks");
        test36.addVariants("was looking");
        test36.addVariants("has been looking");
        test36.addVariants("would look  ");
        test36.addVariants("should look");
        test1.add(test36);

        QuestionData test37 = new QuestionData("Nick ___ yesterday.", "didn’t come");
        test37.addVariants("will not come");
        test37.addVariants("hadn’t come");
        test37.addVariants("didn’t come");
        test37.addVariants("hasn’t come");
        test37.addVariants("came not");
        test1.add(test37);

        QuestionData test38 = new QuestionData("I knew that he ___ the same paper each morning.", "bought");
        test38.addVariants("was bought");
        test38.addVariants("buys");
        test38.addVariants("is buying");
        test38.addVariants("bought");
        test38.addVariants("had bought");
        test1.add(test38);

        QuestionData test39 = new QuestionData("He asked the children who ___ the book.", "had torn");
        test39.addVariants("tore");
        test39.addVariants("tear");
        test39.addVariants("tears");
        test39.addVariants("had torn");
        test39.addVariants("will tear");
        test1.add(test39);

        QuestionData test40 = new QuestionData("Who ___ on a hike yesterday?", "went");
        test40.addVariants("did go");
        test40.addVariants("will go");
        test40.addVariants("has gone");
        test40.addVariants("went");
        test40.addVariants("had went");
        test1.add(test40);

        QuestionData test41 = new QuestionData("I ___ to do it but I ___ no time. I was very busy.", "wanted/had");
        test41.addVariants("wanted/has");
        test41.addVariants("want/had have");
        test41.addVariants("wanted/had");
        test41.addVariants("would want/have");
        test41.addVariants("have wanted/shall have");
        test1.add(test41);

        QuestionData test42 = new QuestionData("- What a luck. I haven’t seen you for ages.\n" +
                "- When ___ we ___ last time?", "did / meet");
        test42.addVariants("did / meet");
        test42.addVariants("have / met");
        test42.addVariants("had / met");
        test42.addVariants("did / met");
        test42.addVariants("will / meet");
        test1.add(test42);

        QuestionData test43 = new QuestionData("In the summer of 1868, Melville Bell ___ on a lecture tour in the " +
                "USA and Canada.", "went");
        test43.addVariants("goes");
        test43.addVariants("had gone");
        test43.addVariants("went");
        test43.addVariants("have gone");
        test43.addVariants("has gone");
        test1.add(test43);

        QuestionData test44 = new QuestionData("He ___ his work before you came.", "had finished");
        test44.addVariants("finished");
        test44.addVariants("finishes");
        test44.addVariants("has finished");
        test44.addVariants("had finished");
        test44.addVariants("finish");
        test1.add(test44);

        QuestionData test45 = new QuestionData("Why ___ he go to Great Britain last month?", "did");
        test45.addVariants("did");
        test45.addVariants("was");
        test45.addVariants("will");
        test45.addVariants("had");
        test45.addVariants("has");
        test1.add(test45);

        QuestionData test46 = new QuestionData("Did you ___ or ___ the potatoes?", "mince/peel");
        test46.addVariants("mince/peeled");
        test46.addVariants("minced/peeled");
        test46.addVariants("minced/peeling");
        test46.addVariants("peels/minced");
        test46.addVariants("mince/peel");
        test1.add(test46);

        QuestionData test47 = new QuestionData("When she ___ they ___ and he left the house.", "came/quarreled");
        test47.addVariants("had come/quarreled");
        test47.addVariants("came/quarreled");
        test47.addVariants("has come/quarreled");
        test47.addVariants("comes/would quarrel");
        test47.addVariants("came/had quarreled");
        test1.add(test47);

        QuestionData test48 = new QuestionData("- Who had left the room by the time I came yesterday?", "Tom had");
        test48.addVariants("Tom did");
        test48.addVariants("Tom does");
        test48.addVariants("Tom had");
        test48.addVariants("Tom has");
        test48.addVariants("Tom was");
        test1.add(test48);

        QuestionData test49 = new QuestionData("Neither your parents nor I ___ very glad of the fact that you failed    " +
                "your Math exam.", "was");
        test49.addVariants("has been");
        test49.addVariants("have been");
        test49.addVariants("were");
        test49.addVariants("was");
        test49.addVariants("are");
        test1.add(test49);

        QuestionData test50 = new QuestionData("What ___ you ___ at 5 p.m. yesterday?", "were/doing");
        test50.addVariants("did/do");
        test50.addVariants("have/been doing");
        test50.addVariants("would/do");
        test50.addVariants("were/doing");
        test50.addVariants("will/do");
        test1.add(test50);

        QuestionData test51 = new QuestionData("Who ___ to see me last week?", "came");
        test51.addVariants("comes");
        test51.addVariants("will come");
        test51.addVariants("came");
        test51.addVariants("has come");
        test51.addVariants("have come");
        test1.add(test51);

        QuestionData test52 = new QuestionData("They didn’t believe him and ___ to laugh.", "began");
        test52.addVariants("begin");
        test52.addVariants("begins");
        test52.addVariants("began");
        test52.addVariants("had begun");
        test52.addVariants("have begun");
        test1.add(test52);

        QuestionData test53 = new QuestionData("Children didn’t ___ to school because it ___ Sunday.", "go/was");
        test53.addVariants("went/was");
        test53.addVariants("go/were");
        test53.addVariants("have gone/was");
        test53.addVariants("gone/was");
        test53.addVariants("go/was");
        test1.add(test53);

        QuestionData test54 = new QuestionData("The train ___ at 8.30 p.m. today, but as a rule it ___ at 8.00 p.m. sharp.", "left / started");
        test54.addVariants("has left / starts");
        test54.addVariants("left / started");
        test54.addVariants("left / has started");
        test54.addVariants("has left / has started");
        test54.addVariants("have left / starts");
        test1.add(test54);

        QuestionData test55 = new QuestionData("The moon ___ and it ___ surprisingly light at night yesterday.", "rose / was");
        test55.addVariants("is rising / is");
        test55.addVariants("rose / was");
        test55.addVariants("had risen / was");
        test55.addVariants("was rising / were");
        test55.addVariants("rose / had been");
        test1.add(test55);

        QuestionData test56 = new QuestionData("Who ___ him yesterday?", "saw");
        test56.addVariants("has seen");
        test56.addVariants("did see");
        test56.addVariants("saw");
        test56.addVariants("have seen");
        test56.addVariants("sees");
        test1.add(test56);

        QuestionData test57 = new QuestionData("He ___ nobody about his secret that day.", "told");
        test57.addVariants("don’t tell");
        test57.addVariants("tell");
        test57.addVariants("didn’t tell");
        test57.addVariants("told");
        test57.addVariants("doesn’t tell");
        test1.add(test57);

        return test1;

    }

}
