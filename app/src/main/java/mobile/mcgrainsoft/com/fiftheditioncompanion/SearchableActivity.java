package mobile.mcgrainsoft.com.fiftheditioncompanion;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

import mobile.mcgrainsoft.com.fiftheditioncompanion.spells.contract.SpellDTO;

public class SearchableActivity extends Activity {

    private Gson gson = new Gson();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spell_search_result);

        // Get the intent, verify the action and get the query
        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            getSearchEvent(query);
        }
    }

    private void getSearchEvent(String query) {

        query = query.replaceAll(" ", "%20");
        final String baseUrl = "http://dndserver.us-east-1.elasticbeanstalk.com"; //"http://10.0.0.134:8080";
        final TextView nameView = (TextView) findViewById(R.id.spell_name);
        final TextView levelView = (TextView) findViewById(R.id.spell_level);

        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = baseUrl + "/spells?name=" + query;

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        List<SpellDTO> spellDTOs = gson.fromJson(response, new TypeToken<List<SpellDTO>>(){}.getType());

                        // Display the first 500 characters of the response string.
                        nameView.setText(spellDTOs.get(0).getName());
                        levelView.setText("(" + spellDTOs.get(0).getSchool() + ") Level " + spellDTOs.get(0).getLevel());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
                nameView.setText("That didn't work!");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

}
