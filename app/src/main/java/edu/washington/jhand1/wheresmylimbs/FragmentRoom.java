package edu.washington.jhand1.wheresmylimbs;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentRoom.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentRoom#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentRoom extends Fragment {

    public static FragmentRoom newInstance(String param1, String param2) {
        FragmentRoom fragment = new FragmentRoom();
        return fragment;
    }

    public FragmentRoom() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_room, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}