package com.t895.buttonnavigationissue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.t895.buttonnavigationissue.databinding.FragmentMainBinding;

public class FirstFragment extends Fragment
{

  private FragmentMainBinding binding;

  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
  {

    binding = FragmentMainBinding.inflate(inflater, container, false);
    return binding.getRoot();

  }

  public void onViewCreated(@NonNull View view, Bundle savedInstanceState)
  {
    super.onViewCreated(view, savedInstanceState);

    binding.buttonFirst.setOnClickListener(new View.OnClickListener()
    {
      @Override
      public void onClick(View view)
      {
        Toast.makeText(getContext(), "Button pressed!", Toast.LENGTH_SHORT).show();
      }
    });
  }

  @Override
  public void onDestroyView()
  {
    super.onDestroyView();
    binding = null;
  }

}