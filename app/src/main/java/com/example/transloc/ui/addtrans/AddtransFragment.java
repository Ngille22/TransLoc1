package com.example.transloc.ui.addtrans;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.transloc.databinding.FragmentAddTransformerBinding;

public class AddtransFragment extends Fragment {

    private static final int RESULT_LOAD_IMAGE = 1;
    private FragmentAddTransformerBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AddtransViewModel addtransViewModel =
                new ViewModelProvider(this).get(AddtransViewModel.class);
        binding = FragmentAddTransformerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAddtrans;
        addtransViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        binding.button.setOnClickListener(v -> openGallery());
        return root;
    }

    public void openGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, RESULT_LOAD_IMAGE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == getActivity().RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            // Use the selected image URI as needed
        }
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        binding = null;
    }
}
