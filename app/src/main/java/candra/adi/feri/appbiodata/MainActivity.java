package candra.adi.feri.appbiodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cellphone (View view){
        Uri uri = Uri.parse("tel: 087742137961");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void email (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"bestamaharsigata.kk@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT,  "Email dari App Biodata");

        try{
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email"));
        }catch  (android.content.ActivityNotFoundException ex){

        }
    }

    public void showMap (View view){
        Uri uri = Uri.parse("geo: -7.0094193,110.4560006");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
}
