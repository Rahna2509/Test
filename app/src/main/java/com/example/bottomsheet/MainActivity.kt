package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    lateinit var btnShowBottomSheet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowBottomSheet = findViewById(R.id.idBtnShowBottomSheet);

        btnShowBottomSheet.setOnClickListener {

            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.bottom_sheet, null)

            val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)
            val ok =view.findViewById<Button>(R.id.btnok)
            val ed1 = view.findViewById<EditText>(R.id.ed1)
            val ed2 = view.findViewById<EditText>(R.id.ed2)
            val ed3 = view.findViewById<EditText>(R.id.ed3)
            btnClose.setOnClickListener {
                dialog.dismiss()
            }

            ok.setOnClickListener{
                Toast.makeText(this,"Text : "+ed1.text+"---"+ed2.text+"---"+ed3.text,Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            dialog.setCancelable(false)
            dialog.setContentView(view)

            dialog.show()
        }


    }
}