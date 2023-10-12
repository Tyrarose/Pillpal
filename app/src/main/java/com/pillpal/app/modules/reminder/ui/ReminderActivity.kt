package com.pillpal.app.modules.reminder.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.ActivityReminderBinding
import com.pillpal.app.modules.druginteractionempty.ui.DrugInteractionEmptyActivity
import com.pillpal.app.modules.reminder.`data`.model.SpinnerDurationOneModel
import com.pillpal.app.modules.reminder.`data`.model.SpinnerWeightModel
import com.pillpal.app.modules.reminder.`data`.viewmodel.ReminderVM
import kotlin.String
import kotlin.Unit

class ReminderActivity : BaseActivity<ActivityReminderBinding>(R.layout.activity_reminder) {
  private val viewModel: ReminderVM by viewModels<ReminderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerDurationOneList.value = mutableListOf(
    SpinnerDurationOneModel("Item1"),
    SpinnerDurationOneModel("Item2"),
    SpinnerDurationOneModel("Item3"),
    SpinnerDurationOneModel("Item4"),
    SpinnerDurationOneModel("Item5")
    )
    val spinnerDurationOneAdapter =
    SpinnerDurationOneAdapter(this,R.layout.spinner_item,viewModel.spinnerDurationOneList.value?:
    mutableListOf())
    binding.spinnerDurationOne.adapter = spinnerDurationOneAdapter
    viewModel.spinnerWeightList.value = mutableListOf(
    SpinnerWeightModel("Item1"),
    SpinnerWeightModel("Item2"),
    SpinnerWeightModel("Item3"),
    SpinnerWeightModel("Item4"),
    SpinnerWeightModel("Item5")
    )
    val spinnerWeightAdapter =
    SpinnerWeightAdapter(this,R.layout.spinner_item,viewModel.spinnerWeightList.value?:
    mutableListOf())
    binding.spinnerWeight.adapter = spinnerWeightAdapter
    binding.reminderVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLanguage.setOnClickListener {
      val destIntent = DrugInteractionEmptyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REMINDER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReminderActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
