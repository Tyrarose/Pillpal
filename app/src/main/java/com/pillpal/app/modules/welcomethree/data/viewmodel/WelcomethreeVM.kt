package com.pillpal.app.modules.welcomethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.welcomethree.`data`.model.WelcomethreeModel
import org.koin.core.KoinComponent

class WelcomethreeVM : ViewModel(), KoinComponent {
  val welcomethreeModel: MutableLiveData<WelcomethreeModel> = MutableLiveData(WelcomethreeModel())

  var navArguments: Bundle? = null
}
