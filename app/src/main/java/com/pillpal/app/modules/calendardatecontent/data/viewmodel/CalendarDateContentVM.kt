package com.pillpal.app.modules.calendardatecontent.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.calendardatecontent.`data`.model.CalendarDateContentModel
import com.pillpal.app.modules.calendardatecontent.`data`.model.Listtwenty1RowModel
import com.pillpal.app.modules.calendardatecontent.`data`.model.ListweightRowModel
import com.pillpal.app.modules.calendardatecontent.`data`.model.SpinnerLanguageTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CalendarDateContentVM : ViewModel(), KoinComponent {
  val calendarDateContentModel: MutableLiveData<CalendarDateContentModel> =
      MutableLiveData(CalendarDateContentModel())

  var navArguments: Bundle? = null

  val spinnerLanguageTwoList: MutableLiveData<MutableList<SpinnerLanguageTwoModel>> =
      MutableLiveData()

  val listtwentyList: MutableLiveData<MutableList<Listtwenty1RowModel>> =
      MutableLiveData(mutableListOf())

  val listweightList: MutableLiveData<MutableList<ListweightRowModel>> =
      MutableLiveData(mutableListOf())
}
