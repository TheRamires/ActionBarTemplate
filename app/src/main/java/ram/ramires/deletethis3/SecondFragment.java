package ram.ramires.deletethis3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {
    private ActionBar actionBar;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        actionBar=((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle("fragment 2");
        View view=inflater.inflate(R.layout.fragment_second, container,false);

        View mActionBarView = getLayoutInflater().inflate(R.layout.custom_view, null);

        TextView title=actionBar.getCustomView().findViewById(R.id.title);
        TextView date=actionBar.getCustomView().findViewById(R.id.date);

        title.setText("Fragment 2");
        date.setText("01.04");

        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .popBackStack();
            }
        });
    }
}