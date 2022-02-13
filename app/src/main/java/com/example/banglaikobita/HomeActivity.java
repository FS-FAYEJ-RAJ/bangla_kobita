package com.example.banglaikobita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeActivity extends AppCompatActivity {
    private ListView homelistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String[] subname=getResources().getStringArray(R.array.sub_name);

        homelistview=findViewById(R.id.homelistview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(HomeActivity.this,R.layout.sub_layout,R.id.subtextviewId,subname);
        homelistview.setAdapter(adapter);

         homelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value=subname[position];

                if (position==0)
                {
                    Intent valobasa=new Intent(HomeActivity.this,KobitaActivity.class);
                    valobasa.putExtra("name","valobasavalu");
                    startActivity(valobasa);

                }


              else if (position==1)
                {
                    Intent nondonal=new Intent(HomeActivity.this,KobitaActivity.class);
                    nondonal.putExtra("name","nondoavalu");
                    startActivity(nondonal);

                }

                else if (position==2)
                {
                    Intent hattima=new Intent(HomeActivity.this,KobitaActivity.class);
                    hattima.putExtra("name","hattimavalu");
                    startActivity(hattima);

                }

                else if (position==3)
                {
                    Intent jonmodin=new Intent(HomeActivity.this,KobitaActivity.class);
                    jonmodin.putExtra("name","jonmodinvalu");
                    startActivity(jonmodin);

                }

                else if (position==4)
                {
                    Intent amonjodi=new Intent(HomeActivity.this,KobitaActivity.class);
                    amonjodi.putExtra("name","amonjodivalu");
                    startActivity(amonjodi);

                }

                else if (position==5)
                {
                    Intent bongo=new Intent(HomeActivity.this,KobitaActivity.class);
                    bongo.putExtra("name","bongbonduvalu");
                    startActivity(bongo);

                }
                else if (position==6)
                {
                    Intent pos=new Intent(HomeActivity.this,KobitaActivity.class);
                    pos.putExtra("name","posvalu");
                    startActivity(pos);

                }

                else if (position==7)
                {
                    Intent sitalobuji=new Intent(HomeActivity.this,KobitaActivity.class);
                    sitalobuji.putExtra("name","sitalovalu");
                    startActivity(sitalobuji);

                }

                else if (position==8)
                {
                    Intent sitBiday=new Intent(HomeActivity.this,KobitaActivity.class);
                    sitBiday.putExtra("name","sitbidayvalu");
                    startActivity(sitBiday);

                }

                else if (position==9)
                {
                    Intent nit=new Intent(HomeActivity.this,KobitaActivity.class);
                    nit.putExtra("name","nittovalu");
                    startActivity(nit);

                }

                else if (position==10)
                {
                    Intent bangler=new Intent(HomeActivity.this,KobitaActivity.class);
                    bangler.putExtra("name","banglervalu");
                    startActivity(bangler);

                }
                else if (position==11)
                {
                    Intent jo=new Intent(HomeActivity.this,KobitaActivity.class);
                    jo.putExtra("name","jovalu");
                    startActivity(jo);

                }
                else if (position==12)
                {
                    Intent ajtmrjo=new Intent(HomeActivity.this,KobitaActivity.class);
                    ajtmrjo.putExtra("name","ajtmrjonmovalu");
                    startActivity(ajtmrjo);

                }
                else if (position==13)
                {
                    Intent amrjo=new Intent(HomeActivity.this,KobitaActivity.class);
                    amrjo.putExtra("name","amrajonnovalu");
                    startActivity(amrjo);

                }
                else if (position==14)
                {
                    Intent jonmogase=new Intent(HomeActivity.this,KobitaActivity.class);
                    jonmogase.putExtra("name","joase");
                    startActivity(jonmogase);

                }






            }
        });


    }
}