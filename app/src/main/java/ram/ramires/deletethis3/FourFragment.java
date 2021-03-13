package ram.ramires.deletethis3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class FourFragment extends Fragment {
    private ActionBar actionBar;
    private View view;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        actionBar.show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        actionBar=((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.hide();

        view=inflater.inflate(R.layout.fragment_four, container,false);
        // Inflate the layout for this fragment

        MaterialToolbar toolbar=view.findViewById(R.id.toolbar2);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action1:
                        Toast.makeText(requireContext(), "action1", Toast.LENGTH_SHORT).show();
                        Log.d("myLog","action 1 ");
                        return true;
                    case R.id.action2:
                        Toast.makeText(requireContext(), "action2", Toast.LENGTH_SHORT).show();
                        Log.d("myLog","action 2 ");
                        return true;
                    case R.id.action3:
                        Toast.makeText(requireContext(), "action3", Toast.LENGTH_SHORT).show();
                        Log.d("myLog","action 3 ");
                        return true;
                    default:
                        return false;
                }
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).popBackStack();
            }
        });
        return view;
    }
}