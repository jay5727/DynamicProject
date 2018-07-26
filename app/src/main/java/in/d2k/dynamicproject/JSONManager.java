package in.d2k.dynamicproject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONManager {
    public static JSONObject getJSONObjectByKeyValue(JSONArray jsonArray, String key, String value) throws JSONException {
        JSONObject jsonObject = null;

        for (int index = 0; index < jsonArray.length(); index++) {
            if (jsonArray.getJSONObject(index).getString(key).equalsIgnoreCase(value))
                return jsonArray.getJSONObject(index);
        }

        return jsonObject;
    }
}
