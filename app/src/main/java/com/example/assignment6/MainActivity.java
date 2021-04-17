package com.example.assignment6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private ListView lv1;
    private String[] mTitle= {
            "South Korea", "United States of America",
            "England", "Japan", "China", "Canada",
            "Sweden", "Spain", "Germany", "Israel"
    };

    private String[] mDescription= {"Population: 51,304 million", "Population: 328,2 million", "Population: 55.98 million",
            "Population: 126,3 million", "Population: 1,398 billion", "Population: 37,59 million",
            "Population: 10,23 million", "Population: 46,94 million", "Population: 83,02 million", "Population: 9,053 million",};

    int images[] = {R.drawable.korea, R.drawable.usa, R.drawable.england,
            R.drawable.japan, R.drawable.china, R.drawable.canada, R.drawable.sweden,
            R.drawable.spain, R.drawable.germany, R.drawable.israel,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1= (ListView) findViewById(R.id.lv1);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), korea.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), usa.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), england.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), japan.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), china.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), canada.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), sweden.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), spain.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), germany.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), israel.class);
                    startActivity(intent);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c,R.layout.row, R.id.tv1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.iv1);
            TextView mTitle = row.findViewById(R.id.tv1);
            TextView mDescription = row.findViewById(R.id.tv2);

            images.setImageResource(rImgs[position]);
            mTitle.setText(rTitle[position]);
            mDescription.setText(rDescription[position]);

            return row;
        }
    }
}