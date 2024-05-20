package data;

import java.util.HashMap;

public class ScenarioContext {

    private static ScenarioContext instance;
    private final HashMap<String, Object> context;

    public ScenarioContext() {
        context = new HashMap<>();
     }

     public static synchronized ScenarioContext getInstance() {
        if (instance == null) {
            instance = new ScenarioContext();
        }
        return instance;
     }

     public <T> T get(String key, Class<T> clazz) {
        return clazz.cast(context.get(key));
     }

     public void put(String key, Object value) {
        context.put(key, value);
     }

     public void remove(String key) {
        context.remove(key);
     }

     public void removeAll() {
        context.clear();
     }
}
