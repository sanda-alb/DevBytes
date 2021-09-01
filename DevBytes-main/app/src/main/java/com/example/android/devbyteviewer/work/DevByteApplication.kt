package com.example.android.devbyteviewer.work

import android.app.Application
import androidx.work.PeriodicWorkRequestBuilder
import java.util.concurrent.TimeUnit

class DevByteApplication : Application() {
    /**
     * Setup WorkManager background job to 'fetch' new network data daily.
     */
    private fun setupRecurringWork() {
        val repeatingRequest = PeriodicWorkRequestBuilder<RefreshDataWorker>(1, TimeUnit.DAYS)
            .build()
    }
}
