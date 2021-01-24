package com.kanyideveloper.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class DataSet {

    private static final List<Chats> list = new ArrayList<>();

    public static List<Chats> createChats(){

        list.add(new Chats(
                R.drawable.ic_launcher_background,
                "Kibabii University Infomatics",
                "Nani aliwacha bag yake"));

        list.add(new Chats(
                R.drawable.ic_launcher_background,
                "DSC Kibabii University",
                "For those who have not registered, you have up to tomorrow"));

        list.add(new Chats(
                R.drawable.ic_launcher_background,
                "Love Matters",
                "Be safe"));

        list.add(new Chats(
                R.drawable.ic_launcher_background,
                "Jane Muthoni",
                "Tunameet saa ngapi"));

        list.add(new Chats(
                R.drawable.ic_launcher_background,
                "Table Tennis Club",
                "Lets Meet from 4:30PM for our usual trianing"));

        list.add(new Chats(
                R.drawable.ic_launcher_background,
                "Sweetheart",
                "I Love you"));

        return list;
    }
}

