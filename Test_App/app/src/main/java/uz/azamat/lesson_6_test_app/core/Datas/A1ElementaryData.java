package uz.azamat.lesson_6_test_app.core.Datas;

import java.util.ArrayList;

import uz.azamat.lesson_6_test_app.core.QuestionData;

public class A1ElementaryData {

    // 44 - Verb to be: am/is/are - Possessive adjectives: my, your, his, her - Subject Pronouns - Plural nouns & Numbers
    public static ArrayList<QuestionData> makeTest1() {
        ArrayList<QuestionData> test_1 = new ArrayList<>();

        QuestionData data1 = new QuestionData("Hello, what ______ your name?", "is");
        data1.addVariants("is");
        data1.addVariants("am");
        data1.addVariants("my");
        data1.addVariants("be");
        test_1.add(data1);

        QuestionData data2 = new QuestionData("______ name is John. And my ______ is Johnson.", "My / surname");
        data2.addVariants("Your / surname");
        data2.addVariants("My / surname");
        data2.addVariants("I / surname");
        data2.addVariants("I / name");
        test_1.add(data2);

        QuestionData data3 = new QuestionData("My name is Lisa. ______ Lisa Peterson.", "I am");
        data3.addVariants("My am");
        data3.addVariants("I is");
        data3.addVariants("I am");
        data3.addVariants("I");
        test_1.add(data3);


        QuestionData data4 = new QuestionData("______ name is Apple. ______ Ann Apple.", "Her / She’s");
        data4.addVariants("His / She");
        data4.addVariants("His / He’s");
        data4.addVariants("Her / She’s");
        data4.addVariants("His / His");
        test_1.add(data4);


        QuestionData data5 = new QuestionData("“Where ______ John from?” “______ from the US.”", "is / He’s");
        data5.addVariants("is / He’s");
        data5.addVariants("is / His");
        data5.addVariants("am / He’s");
        data5.addVariants("is / She’s");
        test_1.add(data5);


        QuestionData data6 = new QuestionData("______ are you from? Japan.", "Where");
        data6.addVariants("What");
        data6.addVariants("Who");
        data6.addVariants("Where");
        data6.addVariants("When");
        test_1.add(data6);


        QuestionData data7 = new QuestionData("Where ______ you ______ ?", "are / from");
        data7.addVariants("is / from");
        data7.addVariants("are / in");
        data7.addVariants("are / is");
        data7.addVariants("are / from");
        test_1.add(data7);

        QuestionData data8 = new QuestionData("______ from Spain. I’m Rodriguez.", "I’m");
        data8.addVariants("I’m");
        data8.addVariants("He’s");
        data8.addVariants("You’re");
        data8.addVariants("She’s");
        test_1.add(data8);

        QuestionData data9 = new QuestionData("Pierre is a French boy. ______ from ______ .", "He’s / France");
        data9.addVariants("He’s / France");
        data9.addVariants("His’s / French");
        data9.addVariants("His / France");
        data9.addVariants("He / France");
        test_1.add(data9);

        QuestionData data10 = new QuestionData("Lisa and Max are Americans. ______ from U.S.A.", "They’re");
        data10.addVariants("There");
        data10.addVariants("Their");
        data10.addVariants("They’re");
        data10.addVariants("Their’re");
        test_1.add(data10);


        QuestionData data11 = new QuestionData("What ____ their _____?\nAlexander and Philip.", "are / names");
        data11.addVariants("are / name");
        data11.addVariants("is / name");
        data11.addVariants("is / names");
        data11.addVariants("are / names");
        test_1.add(data11);


        QuestionData data12 = new QuestionData("I ______ 22 years old, but Andrew ______ 20.", "am / is");
        data12.addVariants("am / am");
        data12.addVariants("are / am");
        data12.addVariants("am / is");
        data12.addVariants("are / are");
        test_1.add(data12);


        QuestionData data13 = new QuestionData("Mark______ 19, but Brian and Denis ______ 26 and 28.", "is / are");
        data13.addVariants("is / are");
        data13.addVariants("are / is");
        data13.addVariants("are / are");
        data13.addVariants("am / are");
        test_1.add(data13);


        QuestionData data14 = new QuestionData("What ______ this?\nIt’s ______ umbrella.", "is / an");
        data14.addVariants("are / a");
        data14.addVariants("is / a");
        data14.addVariants("is / an");
        data14.addVariants("its / an");
        test_1.add(data11);


        QuestionData data15 = new QuestionData("Oxford is ______ English university.", "an");
        data15.addVariants("an");
        data15.addVariants("the");
        data15.addVariants("a");
        data15.addVariants("*");
        test_1.add(data15);


        QuestionData data16 = new QuestionData("Toyotas ______ Japanese ______ .", "are / cars");
        data16.addVariants("is a / car");
        data16.addVariants("is / car");
        data16.addVariants("are / cars");
        data16.addVariants("is / cars");
        test_1.add(data16);


        QuestionData data17 = new QuestionData("What is ______ ?\nShe is a bank manager.", "her job");
        data17.addVariants("his job");
        data17.addVariants("she job");
        data17.addVariants("he job");
        data17.addVariants("her job");
        test_1.add(data17);


        QuestionData data18 = new QuestionData("0/2/11/18/20 Find the correct alternative.", "zero / two / eleven / eighteen / twenty");
        data18.addVariants("oh / twelve / eighteen / twenty");
        data18.addVariants("zero / two / one-one / eighteen / twenty");
        data18.addVariants("zero / two / eleven / eighteen / twenty");
        data18.addVariants("zero / two / eleven / eighty / twenty");
        test_1.add(data18);


        QuestionData data19 = new QuestionData("How old is your aunt?\n______ is 29.", "She’s");
        data19.addVariants("She");
        data19.addVariants("He");
        data19.addVariants("She’s");
        data19.addVariants("He’s");
        test_1.add(data19);


        QuestionData data20 = new QuestionData("Where ______ she from?\nShe ______ from Japan.", "is / is");
        data20.addVariants("are / is");
        data20.addVariants("is / is");
        data20.addVariants("is / am");
        data20.addVariants("are / are");
        test_1.add(data20);

        QuestionData data21 = new QuestionData("This ______ my friend. ______ name’s Richard.", "is / His");
        data21.addVariants("are / His");
        data21.addVariants("is / My");
        data21.addVariants("is / His");
        data21.addVariants("his / His");
        test_1.add(data21);

        QuestionData data22 = new QuestionData("What is ______ name?\nMy name’s Carlos.", "your");
        data22.addVariants("his");
        data22.addVariants("her");
        data22.addVariants("your");
        data22.addVariants("my");
        test_1.add(data22);

        QuestionData data23 = new QuestionData("They ______ Lisa and Max. They ______ from the USA.", "are / are");
        data23.addVariants("is / are");
        data23.addVariants("are / is");
        data23.addVariants("are / are");
        data23.addVariants("is / is");
        test_1.add(data23);

        QuestionData data24 = new QuestionData("This is my sister. ______ name is Laura.", "Her");
        data24.addVariants("His");
        data24.addVariants("My");
        data24.addVariants("Her");
        data24.addVariants("Its");
        test_1.add(data24);

        QuestionData data25 = new QuestionData("I have ______ brother. ______ name is David", "a / His");
        data25.addVariants("an / His");
        data25.addVariants("a / Her");
        data25.addVariants("a / His");
        data25.addVariants("* / His");
        test_1.add(data25);

        QuestionData data26 = new QuestionData("Hello! My ___ ___ Maria. I ___ ___ Mexico.", "name is / am from");
        data26.addVariants("name is / from am");
        data26.addVariants("is name / from am");
        data26.addVariants("name is / am from");
        data26.addVariants("name am / is from");
        test_1.add(data26);

        QuestionData data27 = new QuestionData("Is Catherine ______ sister?", "your");
        data27.addVariants("he");
        data27.addVariants("you");
        data27.addVariants("your");
        data27.addVariants("yours");
        test_1.add(data27);

        QuestionData data28 = new QuestionData("We ______ students.", "are");
        data28.addVariants("are a");
        data28.addVariants("is");
        data28.addVariants("are");
        data28.addVariants("am");
        test_1.add(data28);

        QuestionData data29 = new QuestionData("I ______ student.", "am / a");
        data29.addVariants("is / an");
        data29.addVariants("am / *");
        data29.addVariants("am / a");
        data29.addVariants("am / the");
        test_1.add(data29);

        QuestionData data30 = new QuestionData("She ______ Italy.", "is from");
        data30.addVariants("are from");
        data30.addVariants("is at");
        data30.addVariants("is from");
        data30.addVariants("am from");
        test_1.add(data30);

        QuestionData data31 = new QuestionData("He is ______ teacher.", "a");
        data31.addVariants("a");
        data31.addVariants("an");
        data31.addVariants("*");
        data31.addVariants("the");
        test_1.add(data31);

        QuestionData data32 = new QuestionData("I live ______ a house ______ Los Angeles.", "in / in");
        data32.addVariants("* / in");
        data32.addVariants("in / in");
        data32.addVariants("in / *");
        data32.addVariants("at / in");
        test_1.add(data32);

        QuestionData data33 = new QuestionData("______ is your phone number?\nIt’s 2229", "What");
        data33.addVariants("Where");
        data33.addVariants("How");
        data33.addVariants("What");
        data33.addVariants("Who");
        test_1.add(data33);

        QuestionData data34 = new QuestionData("“______ are you?\nI’m Alex.", "Who");
        data34.addVariants("Which");
        data34.addVariants("How");
        data34.addVariants("What");
        data34.addVariants("Who");
        test_1.add(data34);

        QuestionData data35 = new QuestionData("What’s this ______ English?", "in");
        data35.addVariants("*");
        data35.addVariants("in");
        data35.addVariants("at");
        data35.addVariants("on");
        test_1.add(data35);

        QuestionData data36 = new QuestionData("Champaigne is ______ French drink.", "a");
        data36.addVariants("a");
        data36.addVariants("the");
        data36.addVariants("an");
        data36.addVariants("*");
        test_1.add(data36);

        QuestionData data37 = new QuestionData("Oxford is ______ English university.", "an");
        data37.addVariants("a");
        data37.addVariants("an");
        data37.addVariants("the");
        data37.addVariants("*");
        test_1.add(data37);

        QuestionData data38 = new QuestionData("A Mercedes is ______ German car.", "a");
        data38.addVariants("a");
        data38.addVariants("an");
        data38.addVariants("the");
        data38.addVariants("*");
        test_1.add(data38);

        QuestionData data39 = new QuestionData("English is ______ international language.", "an");
        data39.addVariants("a");
        data39.addVariants("an");
        data39.addVariants("the");
        data39.addVariants("*");
        test_1.add(data39);

        QuestionData data40 = new QuestionData("Milan is ______ Italian city.", "an");
        data40.addVariants("a");
        data40.addVariants("an");
        data40.addVariants("the");
        data40.addVariants("*");
        test_1.add(data40);

        QuestionData data41 = new QuestionData("A JVC is ______ Japanese camera.", "a");
        data41.addVariants("a");
        data41.addVariants("an");
        data41.addVariants("the");
        data41.addVariants("*");
        test_1.add(data41);

        QuestionData data42 = new QuestionData("I have two ______ .", "sisters");
        data42.addVariants("sister");
        data42.addVariants("sisters");
        data42.addVariants("a sister");
        data42.addVariants("sister’s");
        test_1.add(data42);

        QuestionData data43 = new QuestionData("It’s ______ Spanish orange.", "a");
        data43.addVariants("a");
        data43.addVariants("an");
        data43.addVariants("the");
        data43.addVariants("*");
        test_1.add(data43);

        QuestionData data44 = new QuestionData("It’s ______ green apple.", "a");
        data44.addVariants("a");
        data44.addVariants("an");
        data44.addVariants("the");
        data44.addVariants("*");
        test_1.add(data44);

        return test_1;
    }


    // 57 - Verb to be: questions and negatives - Short answers - Prepositions - Possessive‘s - Opposite adjectives - The family - Food and drink
    public static ArrayList<QuestionData> makeTest2() {
        ArrayList<QuestionData> test2 = new ArrayList<>();

        QuestionData test2_1 = new QuestionData("_____ her name Eliza?\nNo, _____ .", "Is / it isn’t");
        test2_1.addVariants("What / it isn’t");
        test2_1.addVariants("Is / she isn’t");
        test2_1.addVariants("Is / it is not");
        test2_1.addVariants("Is / it isn’t");
        test2.add(test2_1);

        QuestionData test2_2 = new QuestionData("Is your surname Anderson?", "Yes, it is.");
        test2_2.addVariants("Yes, you are.");
        test2_2.addVariants("Yes, it is.");
        test2_2.addVariants("Yes, I am.");
        test2_2.addVariants("Yes, my is.");
        test2.add(test2_2);

        QuestionData test2_3 = new QuestionData("____ their names Jack & Benny?\nYes, _____ .", "Are / they are");
        test2_3.addVariants("Are / they are");
        test2_3.addVariants("Aren't / there are");
        test2_3.addVariants("Am / their");
        test2_3.addVariants("Is / they’re");
        test2.add(test2_3);

        QuestionData test2_4 = new QuestionData("Is she American?\nNo, _____ .", "she isn't");
        test2_4.addVariants("hers isn't");
        test2_4.addVariants("she isn't");
        test2_4.addVariants("she is not");
        test2_4.addVariants("she her isn't");
        test2.add(test2_4);

        QuestionData test2_5 = new QuestionData("Is your dog 2 years old?\nYes, _____ .", "it is");
        test2_5.addVariants("it's");
        test2_5.addVariants("dog is");
        test2_5.addVariants("it is");
        test2_5.addVariants("its");
        test2.add(test2_5);

        QuestionData test2_6 = new QuestionData("Is your elder brother married?\nNo, _____ .", "he isn't");
        test2_6.addVariants("brother isn't");
        test2_6.addVariants("he isn't");
        test2_6.addVariants("he is not");
        test2_6.addVariants("she isn't");
        test2.add(test2_6);

        QuestionData test2_7 = new QuestionData("Are you from Senegal?\nNo, _____ .", "I'm not");
        test2_7.addVariants("I'm not");
        test2_7.addVariants("I amn't");
        test2_7.addVariants("I are not");
        test2_7.addVariants("I not");
        test2.add(test2_7);

        QuestionData test2_8 = new QuestionData("_____ Martha English?\nYes, she _____ .", "Is / is");
        test2_8.addVariants("Is / isn’t");
        test2_8.addVariants("Are / is");
        test2_8.addVariants("Is / is");
        test2_8.addVariants("Is / are");
        test2.add(test2_8);

        QuestionData test2_9 = new QuestionData("_____ her surname Smith?\nNo, it _____ .", "Is / isn’t");
        test2_9.addVariants("What / isn’t");
        test2_9.addVariants("Is / is");
        test2_9.addVariants("Is / isn’t");
        test2_9.addVariants("Are / isn’t");
        test2.add(test2_9);

        QuestionData test2_10 = new QuestionData("Are you a student?\nYes, I _____ .", "am");
        test2_10.addVariants("am");
        test2_10.addVariants("have");
        test2_10.addVariants("is");
        test2_10.addVariants("'m not");
        test2.add(test2_10);

        QuestionData test2_11 = new QuestionData("_____ you married?\nNo, I _____ .", "Are / ’m not");
        test2_11.addVariants("Aren't / am");
        test2_11.addVariants("Are / am");
        test2_11.addVariants("Is / am not");
        test2_11.addVariants("Are / ’m not");
        test2.add(test2_11);

        QuestionData test2_12 = new QuestionData("_____ you from Barcelona?\nNo, I’m not.", "Are");
        test2_12.addVariants("Is");
        test2_12.addVariants("Are");
        test2_12.addVariants("Do");
        test2_12.addVariants("Where");
        test2.add(test2_12);

        QuestionData test2_13 = new QuestionData("_____ is Brenda?\nShe’s Patrick’s wife.", "Who");
        test2_13.addVariants("What");
        test2_13.addVariants("Who");
        test2_13.addVariants("Which");
        test2_13.addVariants("Where");
        test2.add(test2_13);

        QuestionData test2_14 = new QuestionData("My teacher’s name _____ John.", "is");
        test2_14.addVariants("are");
        test2_14.addVariants("is");
        test2_14.addVariants("am");
        test2_14.addVariants("not");
        test2.add(test2_14);

        QuestionData test2_15 = new QuestionData("Marcus and Carlos _____ my brothers.", "are");
        test2_15.addVariants("is");
        test2_15.addVariants("am");
        test2_15.addVariants("are");
        test2_15.addVariants("be");
        test2.add(test2_15);

        QuestionData test2_16 = new QuestionData("My mother and father _____ at work.", "are");
        test2_16.addVariants("is");
        test2_16.addVariants("am");
        test2_16.addVariants("are");
        test2_16.addVariants("*");
        test2.add(test2_16);

        QuestionData test2_17 = new QuestionData("It _____ Monday today.", "is");
        test2_17.addVariants("is");
        test2_17.addVariants("am");
        test2_17.addVariants("are");
        test2_17.addVariants("*");
        test2.add(test2_17);

        QuestionData test2_18 = new QuestionData("This is the photo _____ my family.", "of");
        test2_18.addVariants("in");
        test2_18.addVariants("at");
        test2_18.addVariants("of");
        test2_18.addVariants("on");
        test2.add(test2_18);

        QuestionData test2_19 = new QuestionData("It’s good practice _____ you.", "for");
        test2_19.addVariants("for");
        test2_19.addVariants("at");
        test2_19.addVariants("of");
        test2_19.addVariants("in");
        test2.add(test2_19);

        QuestionData test2_20 = new QuestionData("I’m _____ home.", "at");
        test2_20.addVariants("in");
        test2_20.addVariants("on");
        test2_20.addVariants("at");
        test2_20.addVariants("from");
        test2.add(test2_20);

        QuestionData test2_21 = new QuestionData("I’m _____ La Guardia Community College.", "at");
        test2_21.addVariants("in");
        test2_21.addVariants("on");
        test2_21.addVariants("at");
        test2_21.addVariants("of");
        test2.add(test2_21);

        QuestionData test2_22 = new QuestionData("I’m _____ New York.", "in");
        test2_22.addVariants("in");
        test2_22.addVariants("for");
        test2_22.addVariants("at");
        test2_22.addVariants("of");
        test2.add(test2_22);

        QuestionData test2_23 = new QuestionData("I’m _____ a class _____ eight other students.", "in / with");
        test2_23.addVariants("in / for");
        test2_23.addVariants("at / of");
        test2_23.addVariants("in / with");
        test2_23.addVariants("at / off");
        test2.add(test2_23);

        QuestionData test2_24 = new QuestionData("I live _____ an apartment _____ two American boys.", "in / with");
        test2_24.addVariants("in / of");
        test2_24.addVariants("at / with");
        test2_24.addVariants("in / with");
        test2_24.addVariants("of / with");
        test2.add(test2_24);

        QuestionData test2_25 = new QuestionData("Central Park is lovely _____ the snow.", "in");
        test2_25.addVariants("at");
        test2_25.addVariants("in");
        test2_25.addVariants("of");
        test2_25.addVariants("with");
        test2.add(test2_25);

        QuestionData test2_26 = new QuestionData("_____ is his job?\nHe _____ a policeman.", "What / is");
        test2_26.addVariants("Which / is");
        test2_26.addVariants("What / are");
        test2_26.addVariants("What / is");
        test2_26.addVariants("Where / is");
        test2.add(test2_26);

        QuestionData test2_27 = new QuestionData("He _____ from Argentina. He is _____ Mexico.", "isn't / from");
        test2_27.addVariants("is / from");
        test2_27.addVariants("isn't / from");
        test2_27.addVariants("isn't / in");
        test2_27.addVariants("aren't / in");
        test2.add(test2_27);

        QuestionData test2_28 = new QuestionData("_____ _____ is a hamburger and chips?\nThree pounds fifty.", "How much");
        test2_28.addVariants("How many");
        test2_28.addVariants("How often");
        test2_28.addVariants("How much");
        test2_28.addVariants("How long");
        test2.add(test2_28);

        QuestionData test2_29 = new QuestionData("Find the opposite word.\n\neasy - ______", "difficult");
        test2_29.addVariants("cold");
        test2_29.addVariants("cheap");
        test2_29.addVariants("difference");
        test2_29.addVariants("difficult");
        test2.add(test2_29);

        QuestionData test2_30 = new QuestionData("Find the opposite word.\n\nlovely - ______", "horrible");
        test2_30.addVariants("old");
        test2_30.addVariants("expensive");
        test2_30.addVariants("horrible");
        test2_30.addVariants("quick");
        test2.add(test2_30);

        QuestionData test2_31 = new QuestionData("Find the opposite word.\n\nfast - ______", "slow");
        test2_31.addVariants("slow");
        test2_31.addVariants("small");
        test2_31.addVariants("quick");
        test2_31.addVariants("warm");
        test2.add(test2_31);

        QuestionData test2_32 = new QuestionData("Find the opposite word.\n\nexpensive - ______", "cheap");
        test2_32.addVariants("big");
        test2_32.addVariants("cheap");
        test2_32.addVariants("cold");
        test2_32.addVariants("hot");
        test2.add(test2_32);

        QuestionData test2_33 = new QuestionData("Find the opposite word.\n\nhot - ______", "cold");
        test2_33.addVariants("cold");
        test2_33.addVariants("new");
        test2_33.addVariants("warm");
        test2_33.addVariants("small");
        test2.add(test2_33);

        QuestionData test2_34 = new QuestionData("Find the opposite word.\n\nbig - ______", "small");
        test2_34.addVariants("high");
        test2_34.addVariants("small");
        test2_34.addVariants("tall");
        test2_34.addVariants("slow");
        test2.add(test2_34);

        QuestionData test2_35 = new QuestionData("Find the opposite word.\n\nyoung - ______", "old");
        test2_35.addVariants("old");
        test2_35.addVariants("big");
        test2_35.addVariants("small");
        test2_35.addVariants("quick");
        test2.add(test2_35);

        QuestionData test2_36 = new QuestionData("Are you married?\nNo, _____ .", "I'm not");
        test2_36.addVariants("I not");
        test2_36.addVariants("I'm not");
        test2_36.addVariants("I amn't");
        test2_36.addVariants("I m not");
        test2.add(test2_36);

        QuestionData test2_37 = new QuestionData("Brazil ____ in Asia. ____ in South America.", "isn't / It's");
        test2_37.addVariants("is / It isn't");
        test2_37.addVariants("is / It's");
        test2_37.addVariants("is / Is");
        test2_37.addVariants("isn't / It's");
        test2.add(test2_37);

        QuestionData test2_38 = new QuestionData("Snow is _____ .", "cold");
        test2_38.addVariants("cold");
        test2_38.addVariants("hot");
        test2_38.addVariants("small");
        test2_38.addVariants("cheap");
        test2.add(test2_38);

        QuestionData test2_39 = new QuestionData("A: _____ Greek?\n" +
                "B: Yes, I am.", "Are you");
        test2_39.addVariants("You");
        test2_39.addVariants("Are you");
        test2_39.addVariants("Am I");
        test2_39.addVariants("I");
        test2.add(test2_39);

        QuestionData test2_40 = new QuestionData("We _____ in a Russian class.\n" +
                "We _____ in an English class.", "aren't / are");
        test2_40.addVariants("are / are");
        test2_40.addVariants("are / not");
        test2_40.addVariants("aren't / are");
        test2_40.addVariants("are / am");
        test2.add(test2_40);

        QuestionData test2_41 = new QuestionData("Rolls-Royce cars are _____ .", "expensive");
        test2_41.addVariants("cheap");
        test2_41.addVariants("blue");
        test2_41.addVariants("expensive");
        test2_41.addVariants("tall");
        test2.add(test2_41);

        QuestionData test2_42 = new QuestionData("_____ your teachers married?\nYes, _____ .", "Are / they are");
        test2_42.addVariants("Is / he is");
        test2_42.addVariants("Is / he’s");
        test2_42.addVariants("Is / she is");
        test2_42.addVariants("Are / they are");
        test2.add(test2_42);

        QuestionData test2_43 = new QuestionData("Is it hot today?\nNo, _____ .", "it isn’t");
        test2_43.addVariants("it isn’t");
        test2_43.addVariants("it is not");
        test2_43.addVariants("it’s not");
        test2_43.addVariants("it not");
        test2.add(test2_43);

        QuestionData test2_44 = new QuestionData("Are _____ your parents?\nYes, ______ .", "c");
        test2_44.addVariants("they-their are");
        test2_44.addVariants("their-they are");
        test2_44.addVariants("they-they are");
        test2_44.addVariants("they-they");
        test2.add(test2_44);

        QuestionData test2_45 = new QuestionData("Eliza _____ from Greece. _____ from Poland.", "isn’t / She’s");
        test2_45.addVariants("is / Is");
        test2_45.addVariants("isn’t / She’s");
        test2_45.addVariants("is / Isn’t");
        test2_45.addVariants("is / Is not");
        test2.add(test2_45);

        QuestionData test2_46 = new QuestionData("Ann is _____ wife.", "John’s");
        test2_46.addVariants("John’s");
        test2_46.addVariants("John is");
        test2_46.addVariants("John’s is");
        test2_46.addVariants("John");
        test2.add(test2_46);

        QuestionData test2_47 = new QuestionData("This is not just my computer. It is 4 _____ computer.", "students’");
        test2_47.addVariants("students’");
        test2_47.addVariants("students’s");
        test2_47.addVariants("student’s");
        test2_47.addVariants("student");
        test2.add(test2_47);

        QuestionData test2_48 = new QuestionData("A: What is _____ ?\n" +
                "B: She is a bank manager.", "her job");
        test2_48.addVariants("his job");
        test2_48.addVariants("she job");
        test2_48.addVariants("he job");
        test2_48.addVariants("her job");
        test2.add(test2_48);

        QuestionData test2_49 = new QuestionData("How old is your brother?\n_____ 29.", "He is");
        test2_49.addVariants("They are");
        test2_49.addVariants("I am");
        test2_49.addVariants("It is");
        test2_49.addVariants("He is");
        test2.add(test2_49);

        QuestionData test2_50 = new QuestionData("How old _____ Mr. & Mrs. White?\n_____ 50 and 48.", "are / They’re");
        test2_50.addVariants("is / They");
        test2_50.addVariants("are / They’re");
        test2_50.addVariants("are / They");
        test2_50.addVariants("*/ They are");
        test2.add(test2_50);

        QuestionData test2_51 = new QuestionData("How old ___, Andrew?\n_____ 21 years old.", "are you / I’m");
        test2_51.addVariants("are you / I’m");
        test2_51.addVariants("is he / He’s");
        test2_51.addVariants("is / He is");
        test2_51.addVariants("are / I");
        test2.add(test2_51);

        QuestionData test2_52 = new QuestionData("_____ you now?\nI’m at the school.", "Where’re are");
        test2_52.addVariants("Where’s");
        test2_52.addVariants("Where’re are");
        test2_52.addVariants("Where’re are");
        test2_52.addVariants("Where");
        test2.add(test2_52);

        QuestionData test2_53 = new QuestionData("Where _____ now?\nIn her office.", "is she");
        test2_53.addVariants("is he");
        test2_53.addVariants("is she");
        test2_53.addVariants("is it");
        test2_53.addVariants("is");
        test2.add(test2_53);

        QuestionData test2_54 = new QuestionData("_____ is his father’s job?\nHe’s a teacher.", "What");
        test2_54.addVariants("Who");
        test2_54.addVariants("When");
        test2_54.addVariants("Why");
        test2_54.addVariants("What");
        test2.add(test2_54);

        QuestionData test2_55 = new QuestionData("This is those _____ toy.", "kids’");
        test2_55.addVariants("kid’s");
        test2_55.addVariants("kid");
        test2_55.addVariants("kids’s");
        test2_55.addVariants("kids’");
        test2.add(test2_55);

        QuestionData test2_56 = new QuestionData("They are not my _____ books.", "children’s");
        test2_56.addVariants("children’s");
        test2_56.addVariants("child's");
        test2_56.addVariants("children’");
        test2_56.addVariants("children of");
        test2.add(test2_56);

        QuestionData test2_57 = new QuestionData("They’re not his _____ mistakes.", "friend’s");
        test2_57.addVariants("friend’s");
        test2_57.addVariants("friend");
        test2_57.addVariants("friends");
        test2_57.addVariants("friends’s");
        test2.add(test2_57);




        return test2;
    }


    // 60 - Present Simple: Positive, Negative, Question - Verbs - Jobs - Personal pronouns and possessive adjectives
    public static ArrayList<QuestionData> makeTest3() {

        ArrayList<QuestionData> test3 = new ArrayList<>();

        QuestionData test3_1 = new QuestionData("She _____ a uniform.", "wears");
        test3_1.addVariants("wear");
        test3_1.addVariants("to wear");
        test3_1.addVariants("wearing");
        test3_1.addVariants("wears");
        test3.add(test3_1);

        QuestionData test3_2 = new QuestionData("He _____ his car every weekend.", "washes");
        test3_2.addVariants("wash");
        test3_2.addVariants("washes");
        test3_2.addVariants("washing");
        test3_2.addVariants("washed");
        test3.add(test3_2);

        QuestionData test3_3 = new QuestionData("Rosemary _____ three languages.", "speaks");
        test3_3.addVariants("speaks");
        test3_3.addVariants("talks");
        test3_3.addVariants("tells");
        test3_3.addVariants("know");
        test3.add(test3_3);

        QuestionData test3_4 = new QuestionData("My dad _____ at 7 o’clock everyday.", "gets up");
        test3_4.addVariants("stands up");
        test3_4.addVariants("looks up");
        test3_4.addVariants("gets up");
        test3_4.addVariants("jumps up");
        test3.add(test3_4);

        QuestionData test3_5 = new QuestionData("Isabel is a flight attendant. She _____ passengers.", "serves");
        test3_5.addVariants("serve");
        test3_5.addVariants("to serve");
        test3_5.addVariants("serves");
        test3_5.addVariants("serving");
        test3.add(test3_5);

        QuestionData test3_6 = new QuestionData("Their son _____ in this hospital.", "works");
        test3_6.addVariants("works");
        test3_6.addVariants("begins");
        test3_6.addVariants("starts");
        test3_6.addVariants("likes");
        test3.add(test3_6);

        QuestionData test3_7 = new QuestionData("Jim’s a postman. He _____ letters to people.", "delivers");
        test3_7.addVariants("answers");
        test3_7.addVariants("works");
        test3_7.addVariants("delivers");
        test3_7.addVariants("serves");
        test3.add(test3_7);

        QuestionData test3_8 = new QuestionData("Jane’s a doctor. She _____ ill people.", "helps");
        test3_8.addVariants("looks at");
        test3_8.addVariants("speaks to");
        test3_8.addVariants("helps");
        test3_8.addVariants("serves drinks");
        test3.add(test3_8);

        QuestionData test3_9 = new QuestionData("Bern _____ in a flat in Birmingham.", "lives");
        test3_9.addVariants("lives");
        test3_9.addVariants("stands");
        test3_9.addVariants("has");
        test3_9.addVariants("wants");
        test3.add(test3_9);

        QuestionData test3_10 = new QuestionData("Nancy’s uncle is a pilot. He _____ all over the world.", "travels");
        test3_10.addVariants("goes");
        test3_10.addVariants("sees");
        test3_10.addVariants("travels");
        test3_10.addVariants("delivers");
        test3.add(test3_10);

        QuestionData test3_11 = new QuestionData("In winter Sheila _____ skiing and in summer _____ tennis.", "goes / plays");
        test3_11.addVariants("makes / plays");
        test3_11.addVariants("goes / plays");
        test3_11.addVariants("does / plays");
        test3_11.addVariants("starts / *");
        test3.add(test3_11);

        QuestionData test3_12 = new QuestionData("My friend’s son _____ Turkish and English at university.", "studies");
        test3_12.addVariants("has");
        test3_12.addVariants("plays");
        test3_12.addVariants("studies");
        test3_12.addVariants("goes");
        test3.add(test3_12);

        QuestionData test3_13 = new QuestionData("Most of the people _____ work at 8 o’clock every morning.", "starts");
        test3_13.addVariants("finishes");
        test3_13.addVariants("goes");
        test3_13.addVariants("does");
        test3_13.addVariants("starts");
        test3.add(test3_13);

        QuestionData test3_14 = new QuestionData("A: _____ does Tony Blair live?\n" +
                "B: In Great Britain.", "Where");
        test3_14.addVariants("When");
        test3_14.addVariants("Where");
        test3_14.addVariants("What time");
        test3_14.addVariants("How");
        test3.add(test3_14);

        QuestionData test3_15 = new QuestionData("_____ does your father do in his free time?", "What");
        test3_15.addVariants("Why");
        test3_15.addVariants("What kind");
        test3_15.addVariants("How many");
        test3_15.addVariants("What");
        test3.add(test3_15);

        QuestionData test3_16 = new QuestionData("_____ does Andy’s little brother play with?", "Who");
        test3_16.addVariants("Who");
        test3_16.addVariants("Why");
        test3_16.addVariants("How old");
        test3_16.addVariants("Where");
        test3.add(test3_16);

        QuestionData test3_17 = new QuestionData("A: _____ does Natalie’s nephew do?\n" +
                "B: He’s an architect.", "What");
        test3_17.addVariants("How");
        test3_17.addVariants("Whom");
        test3_17.addVariants("When");
        test3_17.addVariants("What");
        test3.add(test3_17);

        QuestionData test3_18 = new QuestionData("A: _____ does it rain here?\n" +
                "B: Mostly in summer and winter.\n" +
                "A: _____ snow?\n" +
                "B: In winter.", "When / What about");
        test3_18.addVariants("When / Why");
        test3_18.addVariants("Why / How");
        test3_18.addVariants("What time / Whom");
        test3_18.addVariants("When / What about");
        test3.add(test3_18);

        QuestionData test3_19 = new QuestionData("A: _____ does Anthony go to work?\n" +
                "B: _____ bus.", "How / By");
        test3_19.addVariants("How / By");
        test3_19.addVariants("How well / On");
        test3_19.addVariants("What kind / In");
        test3_19.addVariants("How / In");
        test3.add(test3_19);

        QuestionData test3_20 = new QuestionData("She _____ from England.", "comes");
        test3_20.addVariants("come");
        test3_20.addVariants("comes");
        test3_20.addVariants("don’t come");
        test3_20.addVariants("goes");
        test3.add(test3_20);

        QuestionData test3_21 = new QuestionData("_____ she _____ French?", "Does / speak");
        test3_21.addVariants("Do / speaks");
        test3_21.addVariants("Does / speaks");
        test3_21.addVariants("Does / speak");
        test3_21.addVariants("Is / speak");
        test3.add(test3_21);

        QuestionData test3_22 = new QuestionData("She _____ _____ from America.", "doesn’t come");
        test3_22.addVariants("don’t comes");
        test3_22.addVariants("doesn’t come");
        test3_22.addVariants("doesn’t comes");
        test3_22.addVariants("does comes");
        test3.add(test3_22);

        QuestionData test3_23 = new QuestionData("Every time he _____ a glass of lemonade before breakfast.", "has");
        test3_23.addVariants("is");
        test3_23.addVariants("have");
        test3_23.addVariants("has");
        test3_23.addVariants("does");
        test3.add(test3_23);

        QuestionData test3_24 = new QuestionData("_____ he _____ three children?", "Does / have");
        test3_24.addVariants("Does / have");
        test3_24.addVariants("Does / has");
        test3_24.addVariants("Do / have");
        test3_24.addVariants("Has / have");
        test3.add(test3_24);

        QuestionData test3_25 = new QuestionData("_____ a shower.", "Have");
        test3_25.addVariants("Come");
        test3_25.addVariants("Go");
        test3_25.addVariants("Have");
        test3_25.addVariants("Has");
        test3.add(test3_25);

        QuestionData test3_26 = new QuestionData("_____ the phone.", "Answer");
        test3_26.addVariants("Go");
        test3_26.addVariants("Read");
        test3_26.addVariants("Look");
        test3_26.addVariants("Answer");
        test3.add(test3_26);

        QuestionData test3_27 = new QuestionData("She _____ a white coat.", "wears");
        test3_27.addVariants("wear");
        test3_27.addVariants("wears");
        test3_27.addVariants("does wear");
        test3_27.addVariants("have");
        test3.add(test3_27);

        QuestionData test3_28 = new QuestionData("_____ a magazine.", "Read");
        test3_28.addVariants("Go");
        test3_28.addVariants("Read");
        test3_28.addVariants("Live");
        test3_28.addVariants("Has");
        test3.add(test3_28);

        QuestionData test3_29 = new QuestionData("Our teacher gives _____ a lot of homework.", "us");
        test3_29.addVariants("our");
        test3_29.addVariants("us");
        test3_29.addVariants("her");
        test3_29.addVariants("his");
        test3.add(test3_29);

        QuestionData test3_30 = new QuestionData("He _____ television every evening.", "watches");
        test3_30.addVariants("watch");
        test3_30.addVariants("watches");
        test3_30.addVariants("see");
        test3_30.addVariants("buy");
        test3.add(test3_30);

        QuestionData test3_31 = new QuestionData("At ten we go _____ bed.", "to");
        test3_31.addVariants("in");
        test3_31.addVariants("on");
        test3_31.addVariants("to");
        test3_31.addVariants("sleep");
        test3.add(test3_31);

        QuestionData test3_32 = new QuestionData("He picks up the apples _____ the tree.", "from");
        test3_32.addVariants("for");
        test3_32.addVariants("from");
        test3_32.addVariants("on");
        test3_32.addVariants("at");
        test3.add(test3_32);

        QuestionData test3_33 = new QuestionData("Get _____ the bus.", "on");
        test3_33.addVariants("on");
        test3_33.addVariants("in");
        test3_33.addVariants("to");
        test3_33.addVariants("out");
        test3.add(test3_33);

        QuestionData test3_35 = new QuestionData("A nurse looks _____ people in hospital.", "after");
        test3_35.addVariants("at");
        test3_35.addVariants("for");
        test3_35.addVariants("after");
        test3_35.addVariants("helps");
        test3.add(test3_35);

        QuestionData test3_34 = new QuestionData("She lives _____ Switzerland.", "in");
        test3_34.addVariants("at");
        test3_34.addVariants("on");
        test3_34.addVariants("in");
        test3_34.addVariants("city");
        test3.add(test3_34);

        QuestionData test3_36 = new QuestionData("There’s a letter _____ you.", "for");
        test3_36.addVariants("for");
        test3_36.addVariants("to");
        test3_36.addVariants("about");
        test3_36.addVariants("on");
        test3.add(test3_36);

        QuestionData test3_37 = new QuestionData("Tourists come _____ boat.", "by");
        test3_37.addVariants("by");
        test3_37.addVariants("to");
        test3_37.addVariants("of");
        test3_37.addVariants("with");
        test3.add(test3_37);

        QuestionData test3_38 = new QuestionData("He drives the children _____ school.", "to");
        test3_38.addVariants("of");
        test3_38.addVariants("at");
        test3_38.addVariants("to");
        test3_38.addVariants("go");
        test3.add(test3_38);

        QuestionData test3_39 = new QuestionData("He speaks to people _____ his radio.", "on");
        test3_39.addVariants("at");
        test3_39.addVariants("on");
        test3_39.addVariants("of");
        test3_39.addVariants("in");
        test3.add(test3_39);

        QuestionData test3_40 = new QuestionData("She likes going _____ walks _____ summer.", "for / in");
        test3_40.addVariants("for / at");
        test3_40.addVariants("to / at");
        test3_40.addVariants("for / in");
        test3_40.addVariants("on / at");
        test3.add(test3_40);

        QuestionData test3_41 = new QuestionData("She goes skiing _____ her free time.", "in");
        test3_41.addVariants("in");
        test3_41.addVariants("on");
        test3_41.addVariants("at");
        test3_41.addVariants("of");
        test3.add(test3_41);

        QuestionData test3_42 = new QuestionData("He works _____ an undertaker.", "as");
        test3_42.addVariants("as");
        test3_42.addVariants("for");
        test3_42.addVariants("of");
        test3_42.addVariants("in");
        test3.add(test3_42);

        QuestionData test3_43 = new QuestionData("Does she live in Australia?\nNo, she _____.", "doesn’t");
        test3_43.addVariants("do");
        test3_43.addVariants("does");
        test3_43.addVariants("don’t");
        test3_43.addVariants("doesn’t");
        test3.add(test3_43);

        QuestionData test3_44 = new QuestionData("We _____ _____ watching television.", "don’t like");
        test3_44.addVariants("doesn’t like");
        test3_44.addVariants("do like");
        test3_44.addVariants("doesn’t like");
        test3_44.addVariants("don’t like");
        test3.add(test3_44);

        QuestionData test3_45 = new QuestionData("He _____ to help people.", "likes");
        test3_45.addVariants("flies");
        test3_45.addVariants("likes");
        test3_45.addVariants("runs");
        test3_45.addVariants("swims");
        test3.add(test3_45);

        QuestionData test3_46 = new QuestionData("_____ _____ languages does she speak?", "How many");
        test3_46.addVariants("How much");
        test3_46.addVariants("How many");
        test3_46.addVariants("Why");
        test3_46.addVariants("Where");
        test3.add(test3_46);

        QuestionData test3_47 = new QuestionData("_____ sells things.", "A shopkeeper");
        test3_47.addVariants("A postman");
        test3_47.addVariants("A nurse");
        test3_47.addVariants("A doctor");
        test3_47.addVariants("A shopkeeper");
        test3.add(test3_47);

        QuestionData test3_48 = new QuestionData("A barman _____.", "serves drinks");
        test3_48.addVariants("sells things");
        test3_48.addVariants("serves drinks");
        test3_48.addVariants("delivers letters");
        test3_48.addVariants("drinks a lot");
        test3.add(test3_48);

        QuestionData test3_49 = new QuestionData("_____ _____ looks after money.", "An accountant");
        test3_49.addVariants("A nurse");
        test3_49.addVariants("A postman");
        test3_49.addVariants("An accountant");
        test3_49.addVariants("A dentist");
        test3.add(test3_49);

        QuestionData test3_50 = new QuestionData("__________ designs buildings.", "An architect");
        test3_50.addVariants("A pilot");
        test3_50.addVariants("An architect");
        test3_50.addVariants("An interpreter");
        test3_50.addVariants("An engineer");
        test3.add(test3_50);

        QuestionData test3_51 = new QuestionData("He lives ____ an island _____ the west of Scotland.", "on / in");
        test3_51.addVariants("on / in");
        test3_51.addVariants("in / in");
        test3_51.addVariants("on / on");
        test3_51.addVariants("in / at");
        test3.add(test3_51);

        QuestionData test3_52 = new QuestionData("She’s married _____ an American man.", "to");
        test3_52.addVariants("with");
        test3_52.addVariants("for");
        test3_52.addVariants("to");
        test3_52.addVariants("on");
        test3.add(test3_52);

        QuestionData test3_53 = new QuestionData("He _____ listening _____ music.", "likes / to");
        test3_53.addVariants("like / to");
        test3_53.addVariants("likes / to");
        test3_53.addVariants("likes / of");
        test3_53.addVariants("likes / with");
        test3.add(test3_53);

        QuestionData test3_54 = new QuestionData("How _____ he _____ to work?\nBy car.", "does / go");
        test3_54.addVariants("do / go");
        test3_54.addVariants("does / goes");
        test3_54.addVariants("does / go");
        test3_54.addVariants("does / play");
        test3.add(test3_54);

        QuestionData test3_55 = new QuestionData("Anna likes Joanna, but Maria doesn’t like _____.", "her");
        test3_55.addVariants("her");
        test3_55.addVariants("them");
        test3_55.addVariants("your");
        test3_55.addVariants("their");
        test3.add(test3_55);

        QuestionData test3_56 = new QuestionData("That’s my dictionary. Can I have ___ back please?", "it");
        test3_56.addVariants("it");
        test3_56.addVariants("you");
        test3_56.addVariants("them");
        test3_56.addVariants("my");
        test3.add(test3_56);

        QuestionData test3_57 = new QuestionData("Philippe _____ in London.", "lives");
        test3_57.addVariants("work");
        test3_57.addVariants("starts");
        test3_57.addVariants("comes");
        test3_57.addVariants("lives");
        test3.add(test3_57);

        QuestionData test3_58 = new QuestionData("_____ he married?\nNo, he _____.", "Is / isn’t");
        test3_58.addVariants("Is / doesn’t");
        test3_58.addVariants("Does / isn’t");
        test3_58.addVariants("Is / isn’t");
        test3_58.addVariants("Does / is");
        test3.add(test3_58);

        QuestionData test3_59 = new QuestionData("What _____ she do?\nShe is an interpreter.", "does");
        test3_59.addVariants("is");
        test3_59.addVariants("do");
        test3_59.addVariants("does");
        test3_59.addVariants("are");
        test3.add(test3_59);

        QuestionData test3_60 = new QuestionData("_____ he sleep well?", "Does");
        test3_60.addVariants("Has");
        test3_60.addVariants("Have");
        test3_60.addVariants("Do");
        test3_60.addVariants("Does");
        test3.add(test3_60);


        return test3;
    }




}
