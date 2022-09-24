package com.t895.buttonnavigationissue;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowCompat;

import com.t895.buttonnavigationissue.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
    getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), android.R.color.transparent));

    setSupportActionBar(binding.toolbar);
  }
}