package com.pillpal.app.modules.druginteractionresult.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.druginteractionresult.`data`.model.DrugInteractionResultModel
import org.koin.core.KoinComponent

class DrugInteractionResultVM : ViewModel(), KoinComponent {
  val drugInteractionResultModel: MutableLiveData<DrugInteractionResultModel> =
      MutableLiveData(DrugInteractionResultModel())

  var navArguments: Bundle? = null
}
