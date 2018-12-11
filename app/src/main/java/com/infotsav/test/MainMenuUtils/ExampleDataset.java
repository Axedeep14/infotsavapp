package com.infotsav.test.MainMenuUtils;

import com.infotsav.test.R;
import com.ramotion.expandingcollection.ECCardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExampleDataset {

    private ArrayList<ECCardData> dataset;

    public ExampleDataset() {
        dataset = new ArrayList<>();

        CardData item7 = new CardData();
        item7.setMainBackgroundResource(R.drawable.blackwidow60port);
        item7.setHeadBackgroundResource(R.drawable.blackwidow60land);
        item7.setHeadTitle("Home");
        item7.setPersonMessage("This is the home card");
        item7.setPersonName("Marjorie Ellis");
        item7.setPersonPictureResource(R.drawable.marjorie_ellis);
        item7.setListItems(prepareCommentsArray());
        dataset.add(item7);

        CardData item6 = new CardData();
        item6.setMainBackgroundResource(R.drawable.ironman60);
        item6.setHeadBackgroundResource(R.drawable.ironman60land);
        item6.setHeadTitle("Events");
        item6.setPersonMessage("Usus de bassus buxum, desiderium index!");
        item6.setPersonName("Marjorie Ellis");
        item6.setPersonPictureResource(R.drawable.marjorie_ellis);
        item6.setListItems(prepareCommentsArray());
        dataset.add(item6);

        CardData item5 = new CardData();
        item5.setMainBackgroundResource(R.drawable.spidey60port);
        item5.setHeadBackgroundResource(R.drawable.spidey60land);
        item5.setHeadTitle("Register");
        item5.setPersonMessage("Usus de bassus buxum, desiderium index!");
        item5.setPersonName("Marjorie Ellis");
        item5.setPersonPictureResource(R.drawable.marjorie_ellis);
        item5.setListItems(prepareCommentsArray());
        dataset.add(item5);

        CardData item4 = new CardData();
        item4.setMainBackgroundResource(R.drawable.nickfurry60port);
        item4.setHeadBackgroundResource(R.drawable.nickfurry60land);
        item4.setHeadTitle("Updates");
        item4.setPersonMessage("Solems manducare, tanquam neuter verpa.");
        item4.setPersonName("Mattew Jordan");
        item4.setPersonPictureResource(R.drawable.mattew_jordan);
        item4.setListItems(prepareCommentsArray());
        dataset.add(item4);

        CardData item3 = new CardData();
        item3.setMainBackgroundResource(R.drawable.thor60port);
        item3.setHeadBackgroundResource(R.drawable.thor60land);
        item3.setHeadTitle("Treasure Hunt");
        item3.setPersonMessage("Magnum lacteas ducunt ad orexis.");
        item3.setPersonName("Ross Rodriguez");
        item3.setPersonPictureResource(R.drawable.ross_rodriguez);
        item3.setListItems(prepareCommentsArray());
        dataset.add(item3);

        CardData item2 = new CardData();
        item2.setMainBackgroundResource(R.drawable.captainamerica60port);
        item2.setHeadBackgroundResource(R.drawable.captainamerica60);
        item2.setHeadTitle("Sponsors");
        item2.setPersonName("Tina Caldwell");
        item2.setPersonMessage("Nunquam perdere clabulare.");
        item2.setListItems(prepareCommentsArray());
        item2.setPersonPictureResource(R.drawable.tina_caldwell);
        dataset.add(item2);

        CardData item1a = new CardData();
        item1a.setMainBackgroundResource(R.drawable.ultron60port);
        item1a.setHeadBackgroundResource(R.drawable.ultron60land);
        item1a.setHeadTitle("About Us");
        item1a.setPersonMessage("Cur adelphis studere?");
        item1a.setPersonName("Wallace Sutton");
        item1a.setPersonPictureResource(R.drawable.wallace_sutton);
        item1a.setListItems(prepareCommentsArray());
        dataset.add(item1a);

        CardData item1 = new CardData();
        item1.setMainBackgroundResource(R.drawable.ultron60port);
        item1.setHeadBackgroundResource(R.drawable.ultron60land);
        item1.setHeadTitle("Contact Us");
        item1.setPersonMessage("Cur adelphis studere?");
        item1.setPersonName("Wallace Sutton");
        item1.setPersonPictureResource(R.drawable.wallace_sutton);
        item1.setListItems(prepareCommentsArray());
        dataset.add(item1);

    }

    public List<ECCardData> getDataset() {
       // Collections.shuffle(dataset);
        return dataset;
    }

    private List<Comment> prepareCommentsArray() {
        Random random = new Random();
        List<Comment> comments = new ArrayList<>();
        comments.addAll(Arrays.asList(
                new Comment(R.drawable.aaron_bradley, "Aaron Bradley", "When the sensor experiments for deep space, all mermaids accelerate mysterious, vital moons.", "jan 12, 2014"),
                new Comment(R.drawable.barry_allen, "Barry Allen", "It is a cold powerdrain, sir.", "jun 1, 2015"),
                new Comment(R.drawable.bella_holmes, "Bella Holmes", "Particle of a calm shield, control the alignment!", "sep 21, 1937"),
                new Comment(R.drawable.caroline_shaw, "Caroline Shaw", "The human kahless quickly promises the phenomenan.", "may 23, 1967"),
                new Comment(R.drawable.connor_graham, "Connor Graham", "Ionic cannon at the infinity room was the sensor of voyage, imitated to a dead pathway.", "sep 1, 1972"),
               // new Comment(R.drawable.deann_hunt, "Deann Hunt", "Vital particles, to the port.", "aug 13, 1995"),
                new Comment(R.drawable.ella_cole, "Ella Cole", "Stars fly with hypnosis at the boldly infinity room!", "nov 18, 1952"),
                new Comment(R.drawable.jayden_shaw, "Jayden Shaw", "Hypnosis, definition, and powerdrain.", "apr 1, 2013"),
                new Comment(R.drawable.jerry_carrol, "Jerry Carrol", "When the queen experiments for nowhere, all particles control reliable, cold captains.", "nov 14, 1964"),
                new Comment(R.drawable.lena_lucas, "Lena Lukas", "When the c-beam experiments for astral city, all cosmonauts acquire remarkable, virtual lieutenant commanders.", "may 4, 1965"),
                new Comment(R.drawable.leonrd_kim, "Leonard Kim", "Starships walk with love at the cold parallel universe!", "jul 3, 1974"),
                new Comment(R.drawable.marc_baker, "Mark Baker", "Friendship at the bridge that is when quirky green people yell.", "dec 24, 1989")));
        Collections.shuffle(comments);
        return comments.subList(0, 6 + random.nextInt(5));
    }
}
