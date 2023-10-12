package com.pillpal.app.modules.calendardateempty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.calendardateempty.`data`.model.CalendarDateEmptyModel
import com.pillpal.app.modules.calendardateempty.`data`.model.ListtwentyRowModel
import com.pillpal.app.modules.calendardateempty.`data`.model.SpinnerLanguageTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CalendarDateEmptyVM : ViewModel(), KoinComponent {
  val calendarDateEmptyModel: MutableLiveData<CalendarDateEmptyModel> =
      MutableLiveData(CalendarDateEmptyModel())

  var navArguments: Bundle? = null

  val spinnerLanguageTwoList: MutableLiveData<MutableList<SpinnerLanguageTwoModel>> =
      MutableLiveData()

  val listtwentyList: MutableLiveData<MutableList<ListtwentyRowModel>> =
      MutableLiveData(mutableListOf())
}
