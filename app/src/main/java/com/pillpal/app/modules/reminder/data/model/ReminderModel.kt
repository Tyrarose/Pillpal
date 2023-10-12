package com.pillpal.app.modules.reminder.`data`.model

import com.pillpal.app.R
import com.pillpal.app.appcomponents.di.MyApp
import kotlin.String

data class ReminderModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_p_llpal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetReminder: String? = MyApp.getInstance().resources.getString(R.string.lbl_set_reminder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMedicineName: String? = MyApp.getInstance().resources.getString(R.string.lbl_medicine_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProbiotics: String? = MyApp.getInstance().resources.getString(R.string.lbl_probiotics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMedicineType: String? = MyApp.getInstance().resources.getString(R.string.lbl_medicine_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeSchedule: String? = MyApp.getInstance().resources.getString(R.string.lbl_time_schedule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_duration)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDosage: String? = MyApp.getInstance().resources.getString(R.string.lbl_dosage)

)
