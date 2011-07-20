package com.waveface;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainEntry extends Activity implements OnClickListener {
	//Controls
	Gallery gallery;
	Button btnPrev;
	Button btnNext;
	TextView txt;
	
	//Variable to store the number of items in the gallery
	int ItemsInGallery=0;
	int CurrentIndex=0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        gallery=(Gallery)findViewById(R.id.gallery);
        btnPrev=(Button)findViewById(R.id.btnPrev);
        btnNext=(Button)findViewById(R.id.btnNext);
        txt=(TextView)findViewById(R.id.txt);
        
        
        //String array holding the values
        final String [] text=new String[]{"Hello","Hi","Alloha","Bonjour","Hallo","°Hola"};
        //Array adapter to display our values in the gallery control
        ArrayAdapter<String> arr=new ArrayAdapter<String>(this, android.R.layout.simple_gallery_item, text);
        ItemsInGallery=text.length;
        
        gallery.setAdapter(arr);
        
        gallery.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				TextView txt=(TextView)findViewById(R.id.txt);
				txt.setText(text[position].toString());
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.btnNext:
			//Increase the index
			CurrentIndex++;
			//if reached the end of the gallery, then start from the first item
			if(CurrentIndex>ItemsInGallery-1)
				CurrentIndex=0;
			gallery.setSelection(CurrentIndex,true);
			txt.setText(String.valueOf(CurrentIndex));
			break;
		case R.id.btnPrev:
			//Decrease the index
			CurrentIndex=CurrentIndex-1;
			//If reached the first item, then return to the last item in the gallery
			if(CurrentIndex<0)
				CurrentIndex=ItemsInGallery-1;
			gallery.setSelection(CurrentIndex,true);
			txt.setText(String.valueOf(CurrentIndex));
			break;
		}
	}
}