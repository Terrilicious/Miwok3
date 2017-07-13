package com.example.terry.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TERRY on 2017/07/10.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word>words, int colorResourceId){

        super(context,0,words);
        mColorResourceId=colorResourceId;
    }



    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View ListItemView=convertView;
        if(ListItemView==null){
            ListItemView= LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item,parent,false);
        }
        Word currentWord=getItem(position);
        TextView miworkTextView=(TextView)ListItemView.findViewById(R.id.miwok_textView);
        miworkTextView.setText(currentWord.getmMiwokTranlation());

        TextView defaultTextView=(TextView)ListItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTraslation());

        ImageView imageView=(ImageView)ListItemView.findViewById(R.id.image);
if (currentWord.HasImage()) {
    imageView.setImageResource((currentWord.getmImageResoursedId()));
    imageView.setVisibility(View.VISIBLE);
}
else{
       imageView.setVisibility(View.GONE);
    }
    View textContainer=ListItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);
        return ListItemView;
    }
}
