package com.ray.test.testingtlxvpxfl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.ray.test.testingtlxvpxfl.R.id.result;

public class PageFragment3 extends Fragment {
    public static final String ARGS_PAGE = "args_page";
    private int mPage;

    private TextView txtResult;
    private EditText edtNum1;
    private EditText edtNum2;
    private Button btn;

    public static PageFragment3 newInstance(int page) {
        Bundle args = new Bundle();

        args.putInt(ARGS_PAGE, page);
        PageFragment3 fragment = new PageFragment3();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARGS_PAGE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f3,container,false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("Page "+mPage+".");

        txtResult = (TextView) view.findViewById(result);
        edtNum1 = (EditText) view.findViewById(R.id.num1);
        edtNum2 = (EditText) view.findViewById(R.id.num2);
        btn = (Button) view.findViewById(R.id.btn);

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                onBtn(view);
            }
        });

        return view;
    }


    public void onBtn(View view) {
        int num1 = Integer.valueOf(edtNum1.getText().toString());
        int num2 = Integer.valueOf(edtNum2.getText().toString());
        txtResult.setText((num1*num2)+"");
    }


}