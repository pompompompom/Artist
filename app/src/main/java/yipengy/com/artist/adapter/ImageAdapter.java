package yipengy.com.artist.adapter;

import yipengy.com.artist.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * ImageAdapter for GridView to display images
 */
public class ImageAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;

    public ImageAdapter(Context c) {
        context = c;
        inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = (ImageView) inflater.inflate(R.layout.image_view, parent, false);
        imageView.setImageResource(mThumbIds[position]);

        /*
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        */
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.mouse, R.drawable.ox,
            R.drawable.tiger, R.drawable.rabbit,
            R.drawable.dragon, R.drawable.snake,
            R.drawable.horse, R.drawable.goat,
            R.drawable.monkey, R.drawable.rooster,
            R.drawable.dog, R.drawable.pig
    };
}