package nyc.c4q.jsoninclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import controller.MessageAdapter;
import ui.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView messageRecycerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageRecycerView = findViewById(R.id.recycler_view);


        Response model = new Response();

        try {

            String json = "{\"status\":\"success\",\"message\":[\"affenpinscher\",\"african\",\"airedale\",\"akita\",\"appenzeller\",\"basenji\",\"beagle\",\"bluetick\",\"borzoi\",\"bouvier\",\"boxer\",\"brabancon\",\"briard\",\"bulldog\",\"bullterrier\",\"cairn\",\"chihuahua\",\"chow\",\"clumber\",\"collie\",\"coonhound\",\"corgi\",\"dachshund\",\"dane\",\"deerhound\",\"dhole\",\"dingo\",\"doberman\",\"elkhound\",\"entlebucher\",\"eskimo\",\"germanshepherd\",\"greyhound\",\"groenendael\",\"hound\",\"husky\",\"keeshond\",\"kelpie\",\"komondor\",\"kuvasz\",\"labrador\",\"leonberg\",\"lhasa\",\"malamute\",\"malinois\",\"maltese\",\"mastiff\",\"mexicanhairless\",\"mountain\",\"newfoundland\",\"otterhound\",\"papillon\",\"pekinese\",\"pembroke\",\"pinscher\",\"pointer\",\"pomeranian\",\"poodle\",\"pug\",\"pyrenees\",\"redbone\",\"retriever\",\"ridgeback\",\"rottweiler\",\"saluki\",\"samoyed\",\"schipperke\",\"schnauzer\",\"setter\",\"sheepdog\",\"shiba\",\"shihtzu\",\"spaniel\",\"springer\",\"stbernard\",\"terrier\",\"vizsla\",\"weimaraner\",\"whippet\",\"wolfhound\"]}";
            JSONObject jsonObject = new JSONObject(json);

            JSONArray jsonArray = jsonObject.getJSONArray("message");
            //jsonObject.get("status");

            String[] message= new String[jsonArray.length()];
            for (int i = 0; i <jsonArray.length() ; i++) {
                message[i]= (String)jsonArray.get(i);
            }
            model.setMessage(message);

            Log.d("ARRAY ", "onCreate: " + model.getMessage().length);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        MessageAdapter adapter = new MessageAdapter(model.getMessage());
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
        messageRecycerView.setLayoutManager(manager);
        messageRecycerView.setAdapter(adapter);


    }
}
