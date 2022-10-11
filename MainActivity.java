package com.example.moneycurrencyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText amount;
    Spinner spinner;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount=findViewById(R.id.editAmount);
        spinner=findViewById(R.id.spinner_dropdown);
        button=findViewById(R.id.button);

        //String[] currency_dropdown={"US dollar(USD)","Singapore Dollar","Russian Rubble","Sri Lankan Rupee","Australian dollar","Malaysian Ringgit","South African Rand"};
        ArrayAdapter<String> adapter= new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.convert_rupees));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String indian_amount=amount.getText().toString().trim();
                String country=spinner.getSelectedItem().toString();
                switch (country) {
                    case "US dollar(USD)":
                        Toast.makeText(getApplicationContext(), "Currency converter of " + country + "="
                                + (Integer.parseInt(indian_amount) * 0.012), Toast.LENGTH_SHORT).show();
                        break;
                    case "Singapore Dollar":
                        Toast.makeText(getApplicationContext(), "Currency converter of " + country + "="
                                + (Integer.parseInt(indian_amount) * 0.018), Toast.LENGTH_SHORT).show();
                        break;
                    case "Russian Rubble":
                        Toast.makeText(getApplicationContext(), "Currency converter of " + country + "="
                                + (Integer.parseInt(indian_amount) * 0.70), Toast.LENGTH_SHORT).show();
                        break;
                    case "Sri Lankan Rupee":
                        Toast.makeText(getApplicationContext(), "Currency converter of " + country + "="
                                + (Integer.parseInt(indian_amount) * 4.40), Toast.LENGTH_SHORT).show();
                        break;
                    case "Euro":
                        Toast.makeText(getApplicationContext(), "Currency converter of " + country + "="
                                + (Integer.parseInt(indian_amount) * 0.013), Toast.LENGTH_SHORT).show();
                        break;
                    case "Australian dollar":
                        Toast.makeText(getApplicationContext(), "Currency converter of " + country + "="
                                + (Integer.parseInt(indian_amount) * 0.019), Toast.LENGTH_SHORT).show();
                        break;
                    case "Malaysian Ringgit":
                        Toast.makeText(getApplicationContext(), "Currency converter of " + country + "="
                                + (Integer.parseInt(indian_amount) * 0.057), Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Currency converter of " + country + "="
                                + (Integer.parseInt(indian_amount) * 0.22), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}