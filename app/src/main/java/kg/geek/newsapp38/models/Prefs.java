package kg.geek.newsapp38.models;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {

    private SharedPreferences preferences;

    public Prefs(Context context) {
        preferences = context.getSharedPreferences("setting", Context.MODE_PRIVATE);
    }
    public void saveImage(String imgUrl){
        preferences.edit().putString("image", imgUrl).apply();
    }
    public String getImage(){
        return preferences.getString("image", null);
    }
}
