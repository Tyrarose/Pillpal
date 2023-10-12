package com.pillpal.app.modules.druginteractiononendrug.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.druginteractiononendrug.`data`.model.DrugInteractionOnenDrugModel
import org.koin.core.KoinComponent

class DrugInteractionOnenDrugVM : ViewModel(), KoinComponent {
  val drugInteractionOnenDrugModel: MutableLiveData<DrugInteractionOnenDrugModel> =
      MutableLiveData(DrugInteractionOnenDrugModel())

  var navArguments: Bundle? = null
}
