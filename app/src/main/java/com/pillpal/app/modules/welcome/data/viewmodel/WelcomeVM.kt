package com.pillpal.app.modules.welcome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.welcome.`data`.model.WelcomeModel
import org.koin.core.KoinComponent

class WelcomeVM : ViewModel(), KoinComponent {
  val welcomeModel: MutableLiveData<WelcomeModel> = MutableLiveData(WelcomeModel())

  var navArguments: Bundle? = null
}
