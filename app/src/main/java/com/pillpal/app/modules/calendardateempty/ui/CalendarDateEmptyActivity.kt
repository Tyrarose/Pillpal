package com.pillpal.app.modules.calendardateempty.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.ActivityCalendarDateEmptyBinding
import com.pillpal.app.modules.calendardateempty.`data`.model.ListtwentyRowModel
import com.pillpal.app.modules.calendardateempty.`data`.model.SpinnerLanguageTwoModel
import com.pillpal.app.modules.calendardateempty.`data`.viewmodel.CalendarDateEmptyVM
import com.pillpal.app.modules.druginteractionempty.ui.DrugInteractionEmptyActivity
import com.pillpal.app.modules.reminder.ui.ReminderActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CalendarDateEmptyActivity :
    BaseActivity<ActivityCalendarDateEmptyBinding>(R.layout.activity_calendar_date_empty) {
  private val viewModel: CalendarDateEmptyVM by viewModels<CalendarDateEmptyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerLanguageTwoList.value = mutableListOf(
    SpinnerLanguageTwoModel("Item1"),
    SpinnerLanguageTwoModel("Item2"),
    SpinnerLanguageTwoModel("Item3"),
    SpinnerLanguageTwoModel("Item4"),
    SpinnerLanguageTwoModel("Item5")
    )
    val spinnerLanguageTwoAdapter =
    SpinnerLanguageTwoAdapter(this,R.layout.spinner_item,viewModel.spinnerLanguageTwoList.value?:
    mutableListOf())
    val listtwentyAdapter = ListtwentyAdapter(viewModel.listtwentyList.value?:mutableListOf())
    binding.recyclerListtwenty.adapter = listtwentyAdapter
    listtwentyAdapter.setOnItemClickListener(
    object : ListtwentyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtwentyRowModel) {
        onClickRecyclerListtwenty(view, position, item)
      }
    }
    )
    viewModel.listtwentyList.observe(this) {
      listtwentyAdapter.updateData(it)
    }
    binding.calendarDateEmptyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePlus.setOnClickListener {
      val destIntent = ReminderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListtwenty(
    view: View,
    position: Int,
    item: ListtwentyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CALENDAR_DATE_EMPTY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CalendarDateEmptyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
