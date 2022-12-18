package com.example.ejemplofragment.alertdialogs;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejemplofragment.R;
import com.example.ejemplofragment.databinding.ActivityDialogsBinding;

import java.util.ArrayList;

public class DialogsActivity extends AppCompatActivity {

    ActivityDialogsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDialogsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.mainToolbar.setNavigationOnClickListener(v -> showMultipleChoiceAlert());
    }

    private void showAlertDialog() {
        new AlertDialog.Builder(this)
                .setCancelable(false)
                .setIcon(R.drawable.ic_baseline_assist_walker_24)
                .setTitle("Ejemplo AlertDialog")
                .setMessage("Este es el mensaje que deseamos compartir")
                .setPositiveButton("Entendido", (dialog, which) -> {
                    Toast.makeText(this, "Entendido!!!", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                })
                .setNegativeButton("Cancelar", (dialog, which) -> {
                    Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show();
                    dialog.cancel();
                }).create().show();
    }

    private void showMultiAlert() {
        String[] frutas = new String[]{"Manzana", "Piña", "Pera", "Melocotón"};
        new AlertDialog.Builder(this)
                .setCancelable(false)
                .setTitle("AlertDialog MultiOpciones")
                .setItems(frutas, (dialog, which) -> {
                    binding.mainToolbar.setTitle(frutas[which]);
                    dialog.dismiss();
                }).create().show();
    }

    private void showMultipleChoiceAlert() {
        String[] frutas = new String[]{"Manzana", "Piña", "Pera", "Melocotón"};
        ArrayList<String> lista = new ArrayList<>();
        new AlertDialog.Builder(this)
                .setCancelable(false)
                .setTitle("Selecciona frutas")
                .setMultiChoiceItems(frutas, null, (dialog, which, isChecked) -> {
                    if (isChecked) {
                        lista.add(frutas[which]);
                    } else {
                        lista.remove(frutas[which]);
                    }
                }).setPositiveButton("OK", (dialog, which) -> {
                    for (String fruta : lista) {
                        Toast.makeText(this, fruta, Toast.LENGTH_SHORT).show();
                    }
                }).create().show();
    }
}