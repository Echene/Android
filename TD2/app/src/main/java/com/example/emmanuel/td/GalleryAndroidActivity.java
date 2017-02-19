package com.example.emmanuel.td;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.emmanuel.td.R.mipmap.nougat;
import static com.example.emmanuel.td.R.mipmap.donut;
import static com.example.emmanuel.td.R.mipmap.lollipop;
import static com.example.emmanuel.td.R.mipmap.eclair;
import static com.example.emmanuel.td.R.mipmap.cupcake;
import static com.example.emmanuel.td.R.mipmap.marshmallow;

public class GalleryAndroidActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // appel de la méthode initiale d’une Activity
        //assure le fonctionnement normal de l’application
        super.onCreate(savedInstanceState);
        // initialisation de la vue avec gallery.xml
        setContentView(R.layout.gallery);
        // récupération de l’objet graphique gallery contenu
        // dans gallery.xml
        Gallery g = (Gallery) findViewById(R.id.gallery);
        // initialisation de l’objet gallery avec un ’adapter’
        // ImageAdapter à créer (voir suite)
        g.setAdapter(new ImageAdapter(this));
        // implémentation de la méthode de click
        // sur un élément de ImageAdapter
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v,
                                    int position, long id) {
                Toast.makeText(GalleryAndroidActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }



    public class ImageAdapter extends BaseAdapter {

        int mGalleryItemBackground;
        private Context mContext;

        // tous les éléments de ImageAdapter
        // les références vers les ressources d’images
        private Integer[] mImageIds = { donut,
                eclair,
                lollipop,
                nougat,
                cupcake,
                marshmallow};

        public ImageAdapter(Context c) {
            // le contexte correspond à l’Ativity en cours d’exécution
            // ici c’est GalleryAndroidActivity
            mContext = c;
            // initialisation de la gallery avec un style
            // fichier attrs.xml à créer (voir suite)
            TypedArray a = mContext.obtainStyledAttributes(
                    R.styleable.GalleryAndroid);
            mGalleryItemBackground = a.getResourceId(
                    R.styleable.GalleryAndroid_android_galleryItemBackground, 0);
            a.recycle();
        }
        // implémentation des méthodes de BaseAdapter
        public int getCount() {
            return mImageIds.length;
        }
        public Object getItem(int position) {
            return position;
        }
        public long getItemId(int position) {
            return position;
        }
        // cette méthode renvoit la vue pour un élément de BaseAdapter
        public View getView(int position, View convertView,
                            ViewGroup parent) {
            ImageView i = new ImageView(mContext);
            i.setImageResource(mImageIds[position]);
            i.setLayoutParams(new Gallery.LayoutParams(150, 170));
            i.setScaleType(ImageView.ScaleType.FIT_XY);
            i.setBackgroundResource(mGalleryItemBackground);
            return i;
        }
    }
}