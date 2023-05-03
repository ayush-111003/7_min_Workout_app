package com.example.a7minutesworkoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a7minutesworkoutapp.databinding.ActivityHistoryBinding
import com.example.a7minutesworkoutapp.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class HistoryActivity : AppCompatActivity() {
    var binding : ActivityHistoryBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarHistoryActivity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) //set back button
        supportActionBar?.title = "HISTORY" // Setting a title in the action bar.
        binding?.toolbarHistoryActivity?.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val Dao = (application as WorkOutApp).db.historyDao()
        getAllCompletedDates(Dao)
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }

    private fun getAllCompletedDates(historyDao: HistoryDao){
        lifecycleScope.launch{
            historyDao.fetchAllDates().collect{allCompletedDatesList->

                if (allCompletedDatesList.isNotEmpty()){
                    binding?.tvHistory?.visibility = View.VISIBLE
                    binding?.rvHistory?.visibility = View.VISIBLE
                    binding?.tvNoDataAvailable?.visibility = View.INVISIBLE

                    binding?.rvHistory?.layoutManager = LinearLayoutManager(this@HistoryActivity)

                    val dates = ArrayList<String>()
                    for (date in allCompletedDatesList){
                        dates.add(date.date)
                    }
                    val historyAdapter = HistoryAdapter(dates)
                    binding?.rvHistory?.adapter =  historyAdapter
                }else{
                    binding?.tvHistory?.visibility = View.GONE
                    binding?.rvHistory?.visibility = View.GONE
                    binding?.tvNoDataAvailable?.visibility = View.VISIBLE
                }
            }

        }

    }
}