package com.igalata.bubblepickerforfood;

import android.util.Log;
import android.widget.Switch;

import java.util.Arrays;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

class ItemSelector {
    private static ItemSelector ourInstance;
    private static String[] names = {"Pizza", "Sushi", "Bar Food", "Japanese", "Mexican", "Chinese", "Vietnamese", "Korean", "Italian", "American", "Comfort Food", "Greek", "Indian", "French", "Latin American", "Mediterranean", "Thai"};
    private static boolean[] isSelected = new boolean[names.length];


    public static ItemSelector getInstance() {
        if(ourInstance == null){
            ourInstance = new ItemSelector();
        }

        return ourInstance;
    }

    private ItemSelector() {
        for(int i = 0; i < isSelected.length; i++){
            isSelected[i] = FALSE;
        }
    }

    public void update(String str, Boolean b){
        for (int i = 0; i < names.length; i++){
            if(names[i].equals(str)){
                isSelected[i] = b;
            }
        }
    }

    public String[] returnSelected(){
        int count = 0;
        for(int i = 0;i < isSelected.length; i++){
            if(isSelected[i] == TRUE){
                count++;
            }
        }

        String[] str = new String[count];
        count = 0;

        for(int i = 0;i < isSelected.length; i++){
            if(isSelected[i] == TRUE){
                str[count] = names[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(str));

        return str;

    }
}
