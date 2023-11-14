package com.pillpal.app

import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.LayoutProgressDialogBinding

class MainActivity : BaseActivity<LayoutProgressDialogBinding>(R.layout.layout_progress_dialog) {

    /*
    NOTE SURE DITO DI NAMAN NEDETECT yung Day Scroll Date Picker, tas Java kase gamit nung nag-basehan ko hehe

    private lateinit var dayDatePicker: DayScrollDatePicker
    private var selectedDate: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dayDatePicker = findViewById(R.id.dayDatepicker)
        dayDatePicker.setStartDate(14, 11, 2023)

        dayDatePicker.setOnDateSelectedListener(object : UnDateSelectedListener {
            override fun onDateSelected(@Nullable date: Date?) {
                selectedDate = date?.toString()
                Toast.makeText(this@MainActivity, selectedDate, Toast.LENGTH_SHORT).show()
            }
        })
    }

    */

    override fun onInitialized() {

    }

    override fun setUpClicks() {

    }
}