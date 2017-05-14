package id.sch.smktelkom_mlg.privateassignment.xirpl419.pocket_movies.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.privateassignment.xirpl419.pocket_movies.R;
import id.sch.smktelkom_mlg.privateassignment.xirpl419.pocket_movies.adapter.SourceAdapter;
import id.sch.smktelkom_mlg.privateassignment.xirpl419.pocket_movies.model.Source;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    ArrayList<Source> mList = new ArrayList<>();
    SourceAdapter mAdapter;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

}
