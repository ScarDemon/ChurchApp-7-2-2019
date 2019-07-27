package com.ebookfrenzy.sampleimagebutton;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MawPrayer.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MawPrayer#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MawPrayer extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private MainViewModel mViewModel;

    private OnFragmentInteractionListener mListener;

    public MawPrayer() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MawPrayer.
     */
    // TODO: Rename and change types and number of parameters
    public static MawPrayer newInstance(String param1, String param2) {
        MawPrayer fragment = new MawPrayer();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_maw_prayer, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

        ImageButton button8 = getView().findViewById(R.id.LeftArrowMaw);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MawPrayerDirections.ActionMawPrayer2ToPrayerRepentancePage action =
                MawPrayerDirections.actionMawPrayer2ToPrayerRepentancePage();
                Navigation.findNavController(v).navigate(action);
            }
        });

        ImageButton button9 = getView().findViewById(R.id.RightArrowMaw);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MawPrayerDirections.ActionMawPrayer2ToActOfContritionPage action =
                        MawPrayerDirections.actionMawPrayer2ToActOfContritionPage();
                Navigation.findNavController(v).navigate(action);
            }
        });
    }
    }
