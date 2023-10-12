package com.pillpal.app.modules.calendardatecontent.ui

import android.view.View
import androidx.activity.viewModels
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.ActivityCalendarDateContentBinding
import com.pillpal.app.modules.calendardatecontent.`data`.model.Listtwenty1RowModel
import com.pillpal.app.modules.calendardatecontent.`data`.model.ListweightRowModel
import com.pillpal.app.modules.calendardatecontent.`data`.model.SpinnerLanguageTwoModel
import com.pillpal.app.modules.calendardatecontent.`data`.viewmodel.CalendarDateContentVM
import com.pillpal.app.modules.calendardateempty.ui.CalendarDateEmptyActivity
import com.pillpal.app.modules.druginteractionempty.ui.DrugInteractionEmptyActivity
import com.pillpal.app.modules.reminder.ui.ReminderActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CalendarDateContentActivity :
    BaseActivity<ActivityCalendarDateContentBinding>(R.layout.activity_calendar_date_content) {
  private val viewModel: CalendarDateContentVM by viewModels<CalendarDateContentVM>()

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
    binding.spinnerLanguageTwo.adapter = spinnerLanguageTwoAdapter
    val listtwentyAdapter = ListtwentyAdapter(viewModel.listtwentyList.value?:mutableListOf())
    binding.recyclerListtwenty.adapter = listtwentyAdapter
    listtwentyAdapter.setOnItemClickListener(
    object : ListtwentyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listtwenty1RowModel) {
        onClickRecyclerListtwenty(view, position, item)
      }
    }
    )
    viewModel.listtwentyList.observe(this) {
      listtwentyAdapter.updateData(it)
    }
    val listweightAdapter = ListweightAdapter(viewModel.listweightList.value?:mutableListOf())
    binding.recyclerListweight.adapter = listweightAdapter
    listweightAdapter.setOnItemClickListener(
    object : ListweightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListweightRowModel) {
        onClickRecyclerListweight(view, position, item)
      }
    }
    )
    viewModel.listweightList.observe(this) {
      listweightAdapter.updateData(it)
    }
    binding.calendarDateContentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePlus.setOnClickListener {
      val destIntent = ReminderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLanguageOne.setOnClickListener {
      val destIntent = DrugInteractionEmptyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListtwenty(
    view: View,
    position: Int,
    item: Listtwenty1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListweight(
    view: View,
    position: Int,
    item: ListweightRowModel
  ): Unit {
    when(view.id) {
      R.id.imageVolume ->  {
        val destIntent = CalendarDateEmptyActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "CALENDAR_DATE_CONTENT_ACTIVITY"

  }
}
