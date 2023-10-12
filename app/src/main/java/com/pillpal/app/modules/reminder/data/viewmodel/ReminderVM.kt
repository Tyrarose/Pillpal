package com.pillpal.app.modules.reminder.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.reminder.`data`.model.ReminderModel
import com.pillpal.app.modules.reminder.`data`.model.SpinnerDurationOneModel
import com.pillpal.app.modules.reminder.`data`.model.SpinnerWeightModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReminderVM : ViewModel(), KoinComponent {
  val reminderModel: MutableLiveData<ReminderModel> = MutableLiveData(ReminderModel())

  var navArguments: Bundle? = null

  val spinnerDurationOneList: MutableLiveData<MutableList<SpinnerDurationOneModel>> =
      MutableLiveData()

  val spinnerWeightList: MutableLiveData<MutableList<SpinnerWeightModel>> = MutableLiveData()
}
