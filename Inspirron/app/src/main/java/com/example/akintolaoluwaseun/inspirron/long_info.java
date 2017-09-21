package com.example.akintolaoluwaseun.inspirron;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * Created by AKINTOLA OLUWASEUN on 7/8/2015.
 */
public class long_info extends AppCompatActivity {
        private static final int SWIPE_MIN_DISTANCE = 120;
        private static final int SWIPE_THRESHOLD_VELOCITY = 200;
        private TextView mTextView;
        private RelativeLayout mRelativeLayout;
    public String b;
    public int sd;

        private Animation.AnimationListener mAnimationListener;
    TextView translateTextView;
    private Context mContext;


    @SuppressWarnings("deprecation")
    private final GestureDetector detector = new GestureDetector(new SwipeGestureDetector());

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.long_info);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mContext = this;
        mTextView = (TextView) this.findViewById(R.id.textView3);
        mTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(final View view, final MotionEvent event) {
                detector.onTouchEvent(event);
                return true;
            }
        });



        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(getIntent().getExtras().getString("thetext"));
        sd = R.array.characters;
        Spinner spinnerCountShoes = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> spinnerCountShoesArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(sd));
        spinnerCountShoes.setAdapter(spinnerCountShoesArrayAdapter);

        TextView tv2 = (TextView) findViewById(R.id.textView3);
        tv2.setText(getIntent().getExtras().getString("thetext2"));

        // Intent intent = getIntent();
        //if (intent != null && intent.hasExtra("thetext2")) {
        //  String forecastStr = intent.getStringExtra("thetext2");
        //  ((TextView) findViewById(R.id.textView3))
        //         .setText(forecastStr);  }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

        public void onTranslateClick(View view) {
            TextView translateTextView = (TextView) findViewById(R.id.textView3);

            Toast.makeText(this, "Getting Translations",
                    Toast.LENGTH_SHORT).show();
            new SaveTheFeed().execute();

        }

        class SaveTheFeed extends AsyncTask<Void, Void, Void> {
            final Spinner Language = (Spinner)findViewById(R.id.spinner);

            String lan = Language.getSelectedItem().toString();
            String ln = "";

            {
                if (lan.equals("French"))
                {
                    ln = "fr";
                }
                else if (lan.equals("German")){
                    ln = "ge";
                }
                else if (ln.equals("Spanish")){
                    ln = "sp";
                }
                else if (ln.equals("Danish")){
                    ln = "da";
                }
                else if (lan.equals("Greek")){
                    ln = "gr";
                }
                else if (lan.equals("Czech")){
                    ln = "cz";
                }
                else if (lan.equals("Estonian")){
                    ln = "es";
                }
                else if (lan.equals("Portuguese")){
                    ln = "po";
                }
                else if (lan.equals("Russian")){
                    ln = "ru";
                }
                else if (lan.equals("Slovak")){
                    ln = "sk";
                }
                else if (lan.equals("Swedish")){
                    ln = "sw";
                }
                else if (lan.equals("Turkish")){
                    ln = "tu";
                }
                else if (lan.equals("Ukrainian")){
                    ln = "uk";
                }
                else if (lan.equals("Dutch")){
                    ln = "du";
                }

                else if (lan.equals("Polish")){
                    ln = "pl";
                }
                else if (lan.equals("Estonian")){
                    ln = "es";
                }
                else if (lan.equals("Italian")){
                    ln = "it";
                }
                else {
                    ln= "";
                    Toast.makeText(long_info.this, "Please Select a Language to Translate to",
                            Toast.LENGTH_SHORT).show();
                }
            }
            String a = lan.trim();

            Intent intent = getIntent();
            String forecastStr = intent.getStringExtra("thetext2");
            String jsonString = "";
            String result = forecastStr + "\n" + "\n";



            @Override
            protected Void doInBackground(Void... voids) {

                TextView translateTextView = (TextView) findViewById(R.id.textView3);
                String wordsToTranslate = forecastStr;
                wordsToTranslate = wordsToTranslate.replace(" ", "+");
                wordsToTranslate = wordsToTranslate.replace("\n", "+");
                wordsToTranslate = wordsToTranslate.replace("$", "%24");
                DefaultHttpClient httpClient = new DefaultHttpClient(new BasicHttpParams());
                HttpPost httpPost = new HttpPost("https://translate.yandex.net/api/v1.5/tr.json/translate?key=trnsl.1.1.20150730T114109Z.462bc3525bd52a40.e160a7889ba190cd0321acfdfef3a7051a1200cc&lang=en-" + ln + "&text=" + wordsToTranslate);
                httpPost.setHeader("Content-type", "application/json");
                InputStream inputStream = null;


                try {

                    HttpResponse response = httpClient.execute(httpPost);

                    HttpEntity entity = response.getEntity();
                    inputStream = entity.getContent();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), 8);
                    StringBuilder sb = new StringBuilder();
                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        sb.append(line + "\n");
                    }
                    jsonString = sb.toString();
                    JSONObject jObject = new JSONObject(jsonString);
                    JSONArray jArray = jObject.getJSONArray("text");
                    String d = jArray.getString(0);




                    result = result + lan + " : " +
                            d + "\n" + "\n";

                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }


            @Override
            protected void onPostExecute(Void aVoid) {
                TextView translationTextView = (TextView) findViewById(R.id.textView3);
                translationTextView.setText(result);
            }




        }

        class SwipeGestureDetector extends GestureDetector.SimpleOnGestureListener {
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                try {
                    if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                        finish();

                        return true;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

                return false;
            }
        }

}



