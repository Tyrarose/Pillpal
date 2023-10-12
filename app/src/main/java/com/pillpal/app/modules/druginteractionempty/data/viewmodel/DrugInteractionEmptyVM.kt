package com.pillpal.app.modules.druginteractionempty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.druginteractionempty.`data`.model.DrugInteractionEmptyModel
import org.koin.core.KoinComponent

class DrugInteractionEmptyVM : ViewModel(), KoinComponent {
  val drugInteractionEmptyModel: MutableLiveData<DrugInteractionEmptyModel> =
      MutableLiveData(DrugInteractionEmptyModel())

  var navArguments: Bundle? = null
}
