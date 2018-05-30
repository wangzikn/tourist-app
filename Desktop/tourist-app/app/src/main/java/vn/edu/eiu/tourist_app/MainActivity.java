package vn.edu.eiu.tourist_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private List<String> touristSites = Arrays.asList("Statue", "Scenic Viewpoint", "Art Museum", "City Hall", "Central Park", "Towe");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerAdapter = new TouristRecyclerAdapter(touristSites);

        recyclerView.setAdapter(recyclerAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
