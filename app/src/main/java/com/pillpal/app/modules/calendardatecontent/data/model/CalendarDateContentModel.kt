package com.pillpal.app.modules.calendardatecontent.`data`.model

import com.pillpal.app.R
import com.pillpal.app.appcomponents.di.MyApp
import kotlin.String

data class CalendarDateContentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHiCharles: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_charles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_don_t_forget_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_p_llpal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEighteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_18)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMon: String? = MyApp.getInstance().resources.getString(R.string.lbl_mon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNineteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTue: String? = MyApp.getInstance().resources.getString(R.string.lbl_tue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToTake: String? = MyApp.getInstance().resources.getString(R.string.lbl_to_take)

)
