package by.it.kashayed.jd02_05;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ResMan {
    INSTANCE;
    private ResourceBundle resourceBundle;
    private final String resourceName = "by.it.kashayed.jd02_05.text.lan";
    ResMan(){
        resourceBundle = ResourceBundle.getBundle(resourceName, Locale.getDefault());
    }
    public void changeResource(Locale locale){
        resourceBundle = ResourceBundle.getBundle(resourceName,locale);
    }
    public String getString(String key){
        return resourceBundle.getString(key);
    }
}
