package com.pillpal.app.modules.welcometwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.welcometwo.`data`.model.WelcometwoModel
import org.koin.core.KoinComponent

class WelcometwoVM : ViewModel(), KoinComponent {
  val welcometwoModel: MutableLiveData<WelcometwoModel> = MutableLiveData(WelcometwoModel())

  var navArguments: Bundle? = null
}
