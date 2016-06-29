package cn.ucai.ship.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import cn.ucai.ship.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SpecialFragment extends Fragment {
    /*目前显示的Fragment的标注数*/
    private int mCurrentlyShowingFragment = 0;

    private Special_newFragment[] fragments;



    RadioButton[] mButton;

    int index = 0;
    int currentTabIndex = 1;

    TextView[] mTabs;
    Listener listener;

    TextView tv_dress;

    public SpecialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View layout = inflater.inflate(R.layout.fragment_special, null);
        initView(layout);
        init();
        setListener();
        return layout;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction()
                    .replace(R.id.rl_special, fragments[0])
                    .commit();
            mCurrentlyShowingFragment = 0;
        } else {
            mCurrentlyShowingFragment = savedInstanceState.getInt("currently_showing_fragment");
        }
        super.onViewCreated(view, savedInstanceState);
    }

    private void setListener() {
        for (int i = 0; i < 12; i++) {
            mButton[i].setOnClickListener(listener);
        }
//        setDressListener();
    }

//    private void setDressListener() {
//        tv_dress.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getActivity(), DressActivity.class));
//            }
//        });
//    }

    private void init() {
        fragments = new Special_newFragment[12];
        listener = new Listener();
    }

    private void initView(View layout) {
        mButton = new RadioButton[12];
        mButton[0] = (RadioButton) layout.findViewById(R.id.btn0);
        mButton[1] = (RadioButton) layout.findViewById(R.id.btn1);
        mButton[2] = (RadioButton) layout.findViewById(R.id.btn2);
        mButton[3] = (RadioButton) layout.findViewById(R.id.btn3);
        mButton[4] = (RadioButton) layout.findViewById(R.id.btn4);
        mButton[5] = (RadioButton) layout.findViewById(R.id.btn5);
        mButton[6] = (RadioButton) layout.findViewById(R.id.btn6);
        mButton[7] = (RadioButton) layout.findViewById(R.id.btn7);
        mButton[8] = (RadioButton) layout.findViewById(R.id.btn8);
        mButton[9] = (RadioButton) layout.findViewById(R.id.btn9);
        mButton[10] = (RadioButton) layout.findViewById(R.id.btn10);
        mButton[11] = (RadioButton) layout.findViewById(R.id.btn11);
        mButton[0].setSelected(true);
    }

    public void setVisble(int visble) {
        for (int i = 0; i < 12; i++) {
            if (i == visble) {
                mButton[i].setSelected(true);
            } else {
                mButton[i].setSelected(false);
            }
        }
    }


    class Listener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            int id = v.getId();
            int count = 0;
            for (int i = 0; i < 12; i++) {
                if (mButton[i].getId() == id) {
                    count = i;
                }
            }
            setVisble(count);
            showNextScreen(count);
        }
    }

    private void showNextScreen(int it) {
        mCurrentlyShowingFragment = it;
        getChildFragmentManager().beginTransaction()
                .replace(R.id.rl_special, fragments[it])
                .addToBackStack(null)
                .commit();
    }



    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("currently_showing_fragment", mCurrentlyShowingFragment);
        super.onSaveInstanceState(outState);
    }
}

