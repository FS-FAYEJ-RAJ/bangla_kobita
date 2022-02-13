package com.example.banglaikobita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class KobitaActivity extends AppCompatActivity {
    private TextView datareciv;
    private TextView kobitaname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kobita);

         datareciv=findViewById(R.id.datarecivID);
        kobitaname=  findViewById(R.id.kobitanameid);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            String KObita=bundle.getString("name");
            Showkobita(KObita);
        }

    }

    private void Showkobita(String kObita) {
        if (kObita.equals("valobasavalu"))
        {

            kobitaname.setText(R.string.kobi);
           datareciv.setText(R.string.valobasa);

        }

        if (kObita.equals("nondoavalu"))
        {

            kobitaname.setText(R.string.nondonal);
            datareciv.setText(R.string.nondonalkobita);

        }

        if (kObita.equals("hattimavalu"))
        {

            kobitaname.setText(R.string.hattima);
            datareciv.setText(R.string.hattimakobi);

        }

        if (kObita.equals("jonmodinvalu"))
        {

            kobitaname.setText(R.string.jonmodin);
            datareciv.setText(R.string.jonmodinkobi);

        }

        if (kObita.equals("amonjodivalu"))
        {

            kobitaname.setText(R.string.amonjodihoto);
            datareciv.setText(R.string.amonjodihotokobi);

        }

        if (kObita.equals("bongbonduvalu"))
        {

            kobitaname.setText(R.string.bongobondu);
            datareciv.setText(R.string.bongokobi);

        }
        if (kObita.equals("posvalu"))
        {

            kobitaname.setText(R.string.pos);
            datareciv.setText(R.string.poskobi);

        }
        if (kObita.equals("sitalovalu"))
        {

            kobitaname.setText(R.string.sitalo);
            datareciv.setText(R.string.sitalokobi);

        }
        if (kObita.equals("sitbidayvalu"))
        {

            kobitaname.setText(R.string.sitbiday);
            datareciv.setText(R.string.sitbidaykobi);

        }
        if (kObita.equals("nittovalu"))
        {

            kobitaname.setText(R.string.nitto);
            datareciv.setText(R.string.nettokobi);

        }
        if (kObita.equals("banglervalu"))
        {

            kobitaname.setText(R.string.banglarmuk);
            datareciv.setText(R.string.banglarkobi);

        }
        if (kObita.equals("jovalu"))
        {

            kobitaname.setText(R.string.jo);
            datareciv.setText(R.string.jokobi);

        }

        if (kObita.equals("ajtmrjonmovalu"))
        {

            kobitaname.setText(R.string.ajtmrjo);
            datareciv.setText(R.string.ajmtrjokobi);

        }

        if (kObita.equals("amrajonnovalu"))
        {

            kobitaname.setText(R.string.amarAjo);
            datareciv.setText(R.string.amrAjokobi);

        }

        if (kObita.equals("joase"))
        {

            kobitaname.setText(R.string.jonmoasebarebare);
            datareciv.setText(R.string.jonmoasebarebarekobi);

        }

    }
}