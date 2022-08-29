package uz.azamat.lesson_6_test_app.core.Datas;

import java.util.ArrayList;

import uz.azamat.lesson_6_test_app.core.QuestionData;

public class B31Modals {
    //  Modal
    public static ArrayList<QuestionData> makeModalData() {
        ArrayList<QuestionData> modal = new ArrayList<>();

        QuestionData modal1 = new QuestionData("His illness got worse and worse. In the end he _____ go into hospital for an operation.",
                "had to");
        modal1.addVariants("will have to");
        modal1.addVariants("must");
        modal1.addVariants("had to");
        modal1.addVariants("ought to have");
        modal.add(modal1);

        QuestionData modal2 = new QuestionData("You _____ any more aspirins; you’ve had four already.",
                "mustn't take");
        modal2.addVariants("mustn't take");
        modal2.addVariants("needn't have taken");
        modal2.addVariants("shouldn't have taken");
        modal2.addVariants("had better not take");
        modal.add(modal2);


        QuestionData modal3 = new QuestionData("I’ve searched everywhere for Bob but I _____ to find him.",
                "haven't been able");
        modal3.addVariants("wasn't able");
        modal3.addVariants("during / for");
        modal3.addVariants("haven't been able");
        modal3.addVariants("couldn't");
        modal.add(modal3);


        QuestionData modal4 = new QuestionData("A: Mrs. Taylor was found dead with a wire around her neck.\n" +
                "B: She _____ strangled.",
                "must have been");
        modal4.addVariants("had to be");
        modal4.addVariants("ought to have been");
        modal4.addVariants("should have");
        modal4.addVariants("must have been");
        modal.add(modal4);


        QuestionData modal5 = new QuestionData("You _____ spanked her. She didn’t deserve it.",
                "shouldn't have");
        modal5.addVariants("shouldn't have");
        modal5.addVariants("needn't have");
        modal5.addVariants("mustn't have");
        modal5.addVariants("couldn't have");
        modal.add(modal5);


        QuestionData modal6 = new QuestionData("A: I wonder who took my alarm clock.\n" +
                "B: It _____ Julia. She _____ supposed to get up early.",
                "must have been / was");
        modal6.addVariants("might be / is");
        modal6.addVariants("could be / is");
        modal6.addVariants("had to be / was");
        modal6.addVariants("must have been / was");
        modal.add(modal6);


        QuestionData modal7 = new QuestionData("In a hundred years’ time we _____ out of water to drink.",
                "may have run");
        modal7.addVariants("must have run");
        modal7.addVariants("might have been/run");
        modal7.addVariants("should have run");
        modal7.addVariants("may have run");
        modal.add(modal7);


        QuestionData modal8 = new QuestionData("If you’d explained your problem to me, I _____ to help you.",
                "would have been able");
        modal8.addVariants("was able");
        modal8.addVariants("will have been able");
        modal8.addVariants("would have been able");
        modal8.addVariants("could have");
        modal.add(modal8);


        QuestionData modal9 = new QuestionData("Joe ran all the way. It wasn't necessary. Joe _____ run all the way.",
                "needn't have");
        modal9.addVariants("needn't have");
        modal9.addVariants("need have");
        modal9.addVariants("didn't need to");
        modal9.addVariants("doesn't need to");
        modal.add(modal9);


        QuestionData modal10 = new QuestionData("Tom was serious when he said he wanted to be an actor when he\n" +
                "grew up. We _____ at him. We hurt his feelings.",
                "shouldn't have laughed");
        modal10.addVariants("shouldn't have laughed");
        modal10.addVariants("needn't have laughed");
        modal10.addVariants("mustn't have laughed");
        modal10.addVariants("shouldn't have been laughed");
        modal.add(modal10);

        QuestionData modal11 = new QuestionData("At first I ___ skate well, now I ___ .","couldn’t / can");
        modal11.addVariants("couldn’t / can");
        modal11.addVariants("may / can");
        modal11.addVariants("mustn’t / can");
        modal11.addVariants("should / shouldn’t");
        modal11.addVariants("must / needn’t");
        modal.add(modal11);

        QuestionData modal12 = new QuestionData("She said they ___ go to the cinema if they liked.","could");
        modal12.addVariants("must");
        modal12.addVariants("may");
        modal12.addVariants("can");
        modal12.addVariants("had to");
        modal12.addVariants("could");
        modal.add(modal12);

        QuestionData modal13 = new QuestionData("- What is your sister doing?\n" +
                "- She ___ be watching TV.","may");
        modal13.addVariants("may");
        modal13.addVariants("can’t");
        modal13.addVariants("needn’t");
        modal13.addVariants("has to");
        modal13.addVariants("could");
        modal.add(modal13);

        QuestionData modal14 = new QuestionData("I didn’t want to go there but I ___ .","e");
        modal14.addVariants("must");
        modal14.addVariants("might");
        modal14.addVariants("shall");
        modal14.addVariants("can’t");
        modal14.addVariants("had to");
        modal.add(modal14);

        QuestionData modal15 = new QuestionData("- ___ I go there now?\n" +
                "- No, you ___ .","must / needn’t");
        modal15.addVariants("can / hadn’t to");
        modal15.addVariants("am / aren’t");
        modal15.addVariants("must / needn’t");
        modal15.addVariants("might / could");
        modal15.addVariants("should / will");
        modal.add(modal15);

        QuestionData modal16 = new QuestionData("- Where is he?\n" +
                "- He ___ be walking in the park.","must");
        modal16.addVariants("can’t");
        modal16.addVariants("is able to");
        modal16.addVariants("has to");
        modal16.addVariants("must");
        modal16.addVariants("ought to");
        modal.add(modal16);

        QuestionData modal17 = new QuestionData("Visitors ___ stay in the hospital after ten pm.","must not");
        modal17.addVariants("might not");
        modal17.addVariants("needn’t");
        modal17.addVariants("couldn’t");
        modal17.addVariants("must not");
        modal17.addVariants("didn’t have to");
        modal.add(modal17);

        QuestionData modal18 = new QuestionData("We had an appointment yesterday afternoon but he ___ see me.","wasn’t able to");
        modal18.addVariants("might not");
        modal18.addVariants("cannot");
        modal18.addVariants("have to");
        modal18.addVariants("mustn’t");
        modal18.addVariants("wasn’t able to");
        modal.add(modal18);

        QuestionData modal19 = new QuestionData("I didn’t ___ ring her up for she did it herself.","have to");
        modal19.addVariants("had to");
        modal19.addVariants("could");
        modal19.addVariants("be to");
        modal19.addVariants("have to");
        modal19.addVariants("must");
        modal.add(modal19);

        QuestionData modal20 = new QuestionData("The rain was so sudden that everybody ___ take a shelter.","had to");
        modal20.addVariants("can");
        modal20.addVariants("could");
        modal20.addVariants("have to");
        modal20.addVariants("are to");
        modal20.addVariants("had to");
        modal.add(modal20);

        QuestionData modal21 = new QuestionData("If you ___ fix a radio, you ___ repair a TV too.","can / will be able to");
        modal21.addVariants("can / will be able to");
        modal21.addVariants("must / may");
        modal21.addVariants("couldn’t / can");
        modal21.addVariants("need / has to");
        modal21.addVariants("may / needn’t to");
        modal.add(modal21);

        QuestionData modal22 = new QuestionData("-I’ve examined you very carefully. I think all you ___ is a good rest.\n" +
                "-But I’m still feeling sick. Why don’t you look at my tongue?\n" +
                "-It ___ a rest too.","need / needs");
        modal22.addVariants("must / may");
        modal22.addVariants("might / can");
        modal22.addVariants("need / could");
        modal22.addVariants("should / have to");
        modal22.addVariants("need / needs");
        modal.add(modal22);

        QuestionData modal23 = new QuestionData("You ___ do this work yourself, if you try.","can");
        modal23.addVariants("can");
        modal23.addVariants("had to");
        modal23.addVariants("must");
        modal23.addVariants("was able to");
        modal23.addVariants("were to do");
        modal.add(modal23);

        QuestionData modal24 = new QuestionData("Guests of the hotel ___ warn the clerk in advance when they leave.","must");
        modal24.addVariants("can");
        modal24.addVariants("may");
        modal24.addVariants("must");
        modal24.addVariants("is to");
        modal24.addVariants("had to");
        modal.add(modal24);

        QuestionData modal25 = new QuestionData("My mother ___ neither read nor write after the operation and\n" +
                "now I ___ help her.","could / have to");
        modal25.addVariants("have to / must");
        modal25.addVariants("could / have to");
        modal25.addVariants("couldn’t / had to");
        modal25.addVariants("were able / can");
        modal25.addVariants("might / need");
        modal.add(modal25);

        QuestionData modal26 = new QuestionData("___ I borrow your text-book? I’ve left mine at home","may");
        modal2.addVariants("am able to");
        modal2.addVariants("must");
        modal2.addVariants("have to");
        modal2.addVariants("need");
        modal2.addVariants("may");
        modal.add(modal26);

        QuestionData modal27 = new QuestionData("People ___ exercise regularly, otherwise they will get out of shape.","should");
        modal27.addVariants("must not");
        modal27.addVariants("should");
        modal27.addVariants("can");
        modal27.addVariants("might");
        modal27.addVariants("has to");
        modal.add(modal27);

        QuestionData modal28 = new QuestionData("“Ma,” said a little girl, “Willie wants the biggest piece of cake,\n" +
                "and I think I ___ have it, because he was eating cakes two years\n" +
                "before I was born.”","should");
        modal28.addVariants("couldn’t");
        modal28.addVariants("has to");
        modal28.addVariants("is to");
        modal28.addVariants("should");
        modal28.addVariants("had to");
        modal.add(modal28);

        QuestionData modal29 = new QuestionData("-I live near my work.\n" +
                "-So you ___ go to the office by crowded buses","don’t have to");
        modal29.addVariants("have to");
        modal29.addVariants("are able to");
        modal29.addVariants("don’t have to");
        modal29.addVariants("would have to");
        modal29.addVariants("can’t");
        modal.add(modal29);

        QuestionData modal30 = new QuestionData("-I ___ go to the cinema yesterday.\n" +
                "-Why?\n" +
                "-Because I ___ complete my work.","couldn’t / had to");
        modal30.addVariants("can’t / must");
        modal30.addVariants("couldn’t / had to");
        modal30.addVariants("didn’t have to / may");
        modal30.addVariants("wasn’t to / need");
        modal30.addVariants("should / have to");
        modal.add(modal30);

        QuestionData modal31 = new QuestionData("The skier broke his leg and ___ compete in the recent Olympic Games.","couldn’t");
        modal31.addVariants("couldn’t");
        modal31.addVariants("mustn’t");
        modal31.addVariants("had to");
        modal31.addVariants("can’t");
        modal31.addVariants("might");
        modal.add(modal31);

        QuestionData modal32 = new QuestionData("I ___ not translate this text yesterday. ___ you help me to translate it tonight?","could / can");
        modal32.addVariants("could / can");
        modal32.addVariants("can / can");
        modal32.addVariants("may / may");
        modal32.addVariants("had to / could");
        modal32.addVariants("can / must");
        modal.add(modal32);

        QuestionData modal33 = new QuestionData("Does Larry ___ leave home at 7.30?","have to");
        modal33.addVariants("have to");
        modal33.addVariants("must");
        modal33.addVariants("has to");
        modal33.addVariants("need");
        modal33.addVariants("should");
        modal.add(modal33);

        QuestionData modal34 = new QuestionData("-___ any of you speak Italian?\n" +
                "-No, but we are learning it and I hope we ___ speak it next year","can / shall be able to");
        modal34.addVariants("must / will have to");
        modal34.addVariants("may / have got to");
        modal34.addVariants("can / shall be able to");
        modal34.addVariants("could / could");
        modal34.addVariants("might / had to");
        modal.add(modal34);

        QuestionData modal35 = new QuestionData("- ___ I take your pen for a moment?\n" +
                "- Certainly","may");
        modal35.addVariants("must");
        modal35.addVariants("may");
        modal35.addVariants("might");
        modal35.addVariants("should");
        modal35.addVariants("will");
        modal.add(modal35);

        QuestionData modal36 = new QuestionData("I ___ speak English last year but I ___ do it now.","couldn’t / can");
        modal36.addVariants("must / can");
        modal36.addVariants("could / can");
        modal36.addVariants("might / may");
        modal36.addVariants("couldn’t / can");
        modal36.addVariants("might / could");
        modal.add(modal36);

        QuestionData modal37 = new QuestionData("Mother, ___ I go for a walk? I’ve done all my work.","may");
        modal37.addVariants("have to");
        modal37.addVariants("am to");
        modal37.addVariants("may");
        modal37.addVariants("must");
        modal37.addVariants("might");
        modal.add(modal37);

        QuestionData modal38 = new QuestionData("I was ill and ___ go to school for some days.","couldn’t");
        modal38.addVariants("can’t");
        modal38.addVariants("must");
        modal38.addVariants("could");
        modal38.addVariants("couldn’t");
        modal38.addVariants("can");
        modal.add(modal38);

        QuestionData modal39 = new QuestionData(" - ___ we do this work now?\n" +
                "- ___ . You can do it tomorrow","Must / No, you needn’t");
        modal39.addVariants("Can / Yes, you can");
        modal39.addVariants("Must / No, you needn’t");
        modal39.addVariants("May / Yes, you may");
        modal39.addVariants("Could / Yes, you must");
        modal39.addVariants("Might / No, you might not\n");
        modal.add(modal39);

        QuestionData modal40 = new QuestionData("“___ I do anything for you?”, the secretary asked the stranger","can");
        modal40.addVariants("can");
        modal40.addVariants("had to");
        modal40.addVariants("must");
        modal40.addVariants("have to");
        modal40.addVariants("am");
        modal.add(modal40);

        QuestionData modal41 = new QuestionData(" - ___ we finish our work today?\n" +
                "- No, you ___ .","Must / needn’t");
        modal41.addVariants("Can / couldn’t");
        modal41.addVariants("May / can");
        modal41.addVariants("Have to / can");
        modal41.addVariants("Must / needn’t");
        modal41.addVariants("Had / needn’t");
        modal.add(modal41);

        QuestionData modal42 = new QuestionData("I ___ go to the library for books as I often write compositions at school.","have to");
        modal42.addVariants("can");
        modal42.addVariants("could");
        modal42.addVariants("may");
        modal42.addVariants("might");
        modal42.addVariants("have to");
        modal.add(modal42);

        QuestionData modal43 = new QuestionData("It ___ rain this afternoon.","may");
        modal43.addVariants("had to");
        modal43.addVariants("may");
        modal43.addVariants("is able to");
        modal43.addVariants("could");
        modal43.addVariants("might");
        modal.add(modal43);

        QuestionData modal44 = new QuestionData(" ___ the director receive me now?","Can");
        modal44.addVariants("Have to");
        modal44.addVariants("Is able");
        modal44.addVariants("Can");
        modal44.addVariants("Is to");
        modal44.addVariants("Has to");
        modal.add(modal44);

        QuestionData modal45 = new QuestionData("Who ___ help him at 2 yesterday?","had to");
        modal45.addVariants("have to");
        modal45.addVariants("is to");
        modal45.addVariants("can");
        modal45.addVariants("need");
        modal45.addVariants("had to");
        modal.add(modal45);

        QuestionData modal46 = new QuestionData("I said that after all that had happened I ___ run away to my aunt’s.","had to");
        modal46.addVariants("could");
        modal46.addVariants("might");
        modal46.addVariants("had to");
        modal46.addVariants("need");
        modal46.addVariants("was able to");
        modal.add(modal46);

        QuestionData modal47 = new QuestionData(" - ___ I go to the cinema?\n" +
                "- No, you ___ . The film is for grown ups.","may / mustn’t");
        modal47.addVariants("may / mustn’t");
        modal47.addVariants("can / needn’t");
        modal47.addVariants("could / can’t");
        modal47.addVariants("must / may not");
        modal47.addVariants("shall / haven’t");
        modal.add(modal47);

        QuestionData modal48 = new QuestionData("Teacher: “You ___ ring me up when you ___ my advice.","may / need");
        modal48.addVariants("could / need");
        modal48.addVariants("may / need");
        modal48.addVariants("can / will need");
        modal48.addVariants("must / needed");
        modal48.addVariants("have to / need");
        modal.add(modal48);

        QuestionData modal49 = new QuestionData("“Never put off till tomorrow what you ___ do today.”","can");
        modal49.addVariants("have to");
        modal49.addVariants("must");
        modal49.addVariants("might");
        modal49.addVariants("can");
        modal49.addVariants("should");
        modal.add(modal49);

        QuestionData modal50 = new QuestionData("-I ___ understand the rule; ___ I take the examination another time?" +
                "-Yes, of course.","can’t / may");
        modal50.addVariants("could / can");
        modal50.addVariants("may / may");
        modal50.addVariants("can’t / may");
        modal50.addVariants("mustn’t / must");
        modal50.addVariants("may / can");
        modal.add(modal50);

        QuestionData modal51 = new QuestionData("Pupils ___ speak only English at their English lessons.","must");
        modal51.addVariants("must not");
        modal51.addVariants("must");
        modal51.addVariants("cannot");
        modal51.addVariants("has to");
        modal51.addVariants("had to");
        modal.add(modal51);

        QuestionData modal52 = new QuestionData("The lecturer mentioned the name of the town several times, but unfortunately I ___ remember it.","could not");
        modal52.addVariants("can");
        modal52.addVariants("could");
        modal52.addVariants("may");
        modal52.addVariants("could not");
        modal52.addVariants("may not");
        modal.add(modal52);

        QuestionData modal53 = new QuestionData("-Must I do this exercise too?\n" +
                "-No, you ___ . It isn’t necessary","needn’t");
        modal53.addVariants("can’t");
        modal53.addVariants("may not");
        modal53.addVariants("mustn’t");
        modal53.addVariants("needn’t");
        modal53.addVariants("oughtn’t to");
        modal.add(modal53);

        QuestionData modal54 = new QuestionData("Mother, look, I ___ skate well.","can");
        modal54.addVariants("can");
        modal54.addVariants("may");
        modal54.addVariants("must");
        modal54.addVariants("have to");
        modal54.addVariants("ought to");
        modal.add(modal54);

        QuestionData modal55 = new QuestionData("I’m sorry you ___ smoke here.","can’t");
        modal55.addVariants("had to");
        modal55.addVariants("can’t");
        modal55.addVariants("could");
        modal55.addVariants("must");
        modal55.addVariants("have to");
        modal.add(modal55);

        QuestionData modal56 = new QuestionData("We ___ protect our nature from pollution.","must");
        modal56.addVariants("need");
        modal56.addVariants("had to");
        modal56.addVariants("are to");
        modal56.addVariants("may");
        modal56.addVariants("must");
        modal.add(modal56);

        QuestionData modal57 = new QuestionData("He is very helpless, I ___ help him.","have to");
        modal57.addVariants("need");
        modal57.addVariants("might");
        modal57.addVariants("have to");
        modal57.addVariants("can");
        modal57.addVariants("may");
        modal.add(modal57);

        QuestionData modal58 = new QuestionData("Excuse me, ___ you tell me the time?","d");
        modal58.addVariants("may");
        modal58.addVariants("must");
        modal58.addVariants("might");
        modal58.addVariants("can");
        modal58.addVariants("are able to");
        modal.add(modal58);

        QuestionData modal59 = new QuestionData("My grandfather’s ill and I ___ go to see him today, I ___ go with you","have to / can’t");
        modal59.addVariants("can / can’t");
        modal59.addVariants("have to / can’t");
        modal59.addVariants("may / have to");
        modal59.addVariants("need / must");
        modal59.addVariants(" be able to / may not");
        modal.add(modal59);

        QuestionData modal60 = new QuestionData("The Browns ___ not return on Sunday, as the weather was bad.","could");
        modal60.addVariants("may");
        modal60.addVariants("could");
        modal60.addVariants("have to");
        modal60.addVariants("must");
        modal60.addVariants("can’t");
        modal.add(modal60);

        QuestionData modal61 = new QuestionData("I looked through this book about 2 hours, but ___ find anything interesting.","couldn’t");
        modal61.addVariants("can’t");
        modal61.addVariants("couldn’t");
        modal61.addVariants("had to");
        modal61.addVariants("can");
        modal61.addVariants("hadn’t to");
        modal.add(modal61);

        QuestionData modal62 = new QuestionData("You ___ do this for it’s necessary.","have to");
        modal62.addVariants("may");
        modal62.addVariants("can");
        modal62.addVariants("have to");
        modal62.addVariants("has");
        modal62.addVariants("could");
        modal.add(modal62);

        QuestionData modal63 = new QuestionData("You ___ work hard at your English.","must");
        modal63.addVariants("must");
        modal63.addVariants("mustn’t");
        modal63.addVariants("can’t");
        modal63.addVariants("has to");
        modal63.addVariants("may not");
        modal.add(modal63);

        QuestionData modal64 = new QuestionData("We ___ read much in the original if we want to learn a foreign language.","must");
        modal64.addVariants("had to");
        modal64.addVariants("can");
        modal64.addVariants("must");
        modal64.addVariants("may");
        modal64.addVariants("could");
        modal.add(modal64);

        QuestionData modal65 = new QuestionData("We ___ do it by midday if we had the instruments","could");
        modal65.addVariants("may");
        modal65.addVariants("can");
        modal65.addVariants("must");
        modal65.addVariants("could");
        modal65.addVariants("might");
        modal.add(modal65);

        QuestionData modal66 = new QuestionData("You ___ get a visa before you go abroad next summer.","will have to");
        modal66.addVariants("may");
        modal66.addVariants("can");
        modal66.addVariants("could");
        modal66.addVariants("have to");
        modal66.addVariants("will have to");
        modal.add(modal66);

        // Page 126

        return modal;

    }
}
