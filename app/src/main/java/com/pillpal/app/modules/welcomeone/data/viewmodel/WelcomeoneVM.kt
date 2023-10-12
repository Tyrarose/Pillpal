package com.pillpal.app.modules.welcomeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.welcomeone.`data`.model.WelcomeoneModel
import org.koin.core.KoinComponent

class WelcomeoneVM : ViewModel(), KoinComponent {
  val welcomeoneModel: MutableLiveData<WelcomeoneModel> = MutableLiveData(WelcomeoneModel())

  var navArguments: Bundle? = null
}
