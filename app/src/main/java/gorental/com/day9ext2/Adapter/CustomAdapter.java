package gorental.com.day9ext2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import gorental.com.day9ext2.R;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] value;
    int[] img;
    LayoutInflater inflater;

    public CustomAdapter(Context context, String[] value, int[] img) {
        this.context = context;
        this.value = value;
        this.img = img;
    }

    @Override
    public int getCount() {
        return value.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_view, parent, false);
            }

            TextView textView = convertView.findViewById(R.id.tv);
            ImageView imageView = convertView.findViewById(R.id.Iv);

            textView.setText(value[position]);
            imageView.setImageResource(img[0]);

        return convertView;
    }
}
