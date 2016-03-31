package yipengy.com.artist.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import yipengy.com.artist.R;
import yipengy.com.artist.adapter.ImageAdapter;

/**
 * Wallpaper Fragment.
 */
public class WallpaperFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_wallpaper, container, false);

        GridView gridView = (GridView) v.findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(getContext()));
        return v;
    }
}
