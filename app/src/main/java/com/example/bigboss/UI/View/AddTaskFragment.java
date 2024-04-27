package com.example.bigboss.UI.View;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bigboss.Data.Models.Task;
import com.example.bigboss.R;
import com.example.bigboss.UI.VM.TaskListViewModel;

public class AddTaskFragment extends Fragment {
    public AddTaskFragment() {
        super(R.layout.fragment_add_task);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TaskListViewModel list = new ViewModelProvider(getActivity()).get(TaskListViewModel.class);
        Button bAccept = view.findViewById(R.id.b_accept);
        EditText eTaskText = view.findViewById(R.id.e_tasktext);
        EditText eTaskAnswer = view.findViewById(R.id.e_taskanswer);
        bAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.addUserTask(new Task(
                        eTaskText.getText().toString(),
                        R.drawable.un_task,
                        eTaskAnswer.getText().toString()
                        ));
            }
        });
    }
}