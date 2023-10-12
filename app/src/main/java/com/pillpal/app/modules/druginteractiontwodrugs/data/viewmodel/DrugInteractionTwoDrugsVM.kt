package com.pillpal.app.modules.druginteractiontwodrugs.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.druginteractiontwodrugs.`data`.model.DrugInteractionTwoDrugsModel
import org.koin.core.KoinComponent

class DrugInteractionTwoDrugsVM : ViewModel(), KoinComponent {
  val drugInteractionTwoDrugsModel: MutableLiveData<DrugInteractionTwoDrugsModel> =
      MutableLiveData(DrugInteractionTwoDrugsModel())


  var navArguments: Bundle? = null
}
