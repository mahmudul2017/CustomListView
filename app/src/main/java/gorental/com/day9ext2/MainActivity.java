package gorental.com.day9ext2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import gorental.com.day9ext2.Adapter.CustomAdapter;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] value;
    int[] img = {R.drawable.logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv);
        value = getResources().getStringArray(R.array.text);

        CustomAdapter adapter = new CustomAdapter(this, value, img);
        listView.setAdapter(adapter);
        }
}
