package com.example.transloc.ui.transformers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.transloc.databinding.FragmentAddTransformerBinding;

public class TransformersFragment extends Fragment {

    private FragmentAddTransformerBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TransformersViewModel transformersViewModel =
                new ViewModelProvider(this).get(TransformersViewModel.class);
        binding = FragmentAddTransformerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAddtrans;
        transformersViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        binding = null;
    }
}
