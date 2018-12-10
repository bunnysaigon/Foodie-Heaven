package com.example.hc.design;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class List extends AppCompatActivity {

    private Button tianjia,xiayifen;
    private ImageView dangao;
    private int i,zongjia;
    private TextView jiage,danjia,mingcheng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        tianjia=(Button)findViewById(R.id.button3);
        xiayifen=(Button)findViewById(R.id.button2);
        dangao=(ImageView) findViewById(R.id.imageView3);
        jiage=(TextView)findViewById(R.id.textView6);
        mingcheng=(TextView)findViewById(R.id.textView8);
        danjia=(TextView)findViewById(R.id.textView10);
        Button goumai=(Button)findViewById(R.id.button4);
        i=1;
        dangao.setImageResource(R.drawable.a);
        zongjia=0;
        if(i==1)
        {
            mingcheng.setText("Pork Ramen");
            danjia.setText("$10");
        }

    goumai.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent=new Intent(List.this,Payment.class);
            intent.putExtra("price1",zongjia);
            startActivityForResult(intent,1);
        }
    });
        tianjia.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                        i=i;
                                        if(i==1) {
                                            zongjia = zongjia + 10;
                                            jiage.setText("$"+zongjia);

                                        }
                                        else if(i==2) {

                                            zongjia = zongjia + 8;
                                            jiage.setText("$"+zongjia);

                                        }

                                        else if(i==3)   {
                                            zongjia+=20;
                                            jiage.setText("$"+zongjia);

                                        }
                                        else if(i==4) {
                                            zongjia += 13;
                                            jiage.setText("$"+zongjia);

                                        }




                                       }
        }
        );
        xiayifen.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                            i=i+1;
                                            if(i==2)
                                            {

                                                mingcheng.setText("Bacon Egg");
                                                danjia.setText("$8");
                                                dangao.setImageResource(R.drawable.b);
                                            }
                                            else if(i==3) {

                                                mingcheng.setText("Seafood Tofu");
                                                danjia.setText("$20");
                                                dangao.setImageResource(R.drawable.c);
                                            }
                                            else if(i==4) {
                                                mingcheng.setText("Veggie Box");
                                                danjia.setText("$13");
                                                dangao.setImageResource(R.drawable.d);
                                            }
                                            else if(i==5)
                                            {
                                                i=1;
                                                dangao.setImageResource(R.drawable.e);
                                                mingcheng.setText("Omurice");
                                                danjia.setText("$15");
                                            }
                                       }
                                   }
        );
        String url = "http://www.hochmuth.com/mp3/Haydn_Cello_Concerto_D-1.mp3"; // your URL here
        final MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }
        final Button play = (Button) findViewById(R.id.button_stop);
        play.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        final Button pause = (Button) findViewById(R.id.button13);
        pause.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
    }
}
