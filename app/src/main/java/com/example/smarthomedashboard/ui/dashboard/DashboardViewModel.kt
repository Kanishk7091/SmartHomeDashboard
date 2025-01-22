package com.example.smarthomedashboard.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.smarthomedashboard.model.Device
class DashboardViewModel : ViewModel() {

    private val _devices = MutableLiveData<List<Device>>()
    val devices: LiveData<List<Device>> get() = _devices

    init {
        // Mock data
        _devices.value = listOf(
            Device("1", "Living Room Light", "On", "Light"),
            Device("2", "Thermostat", "22°C", "Thermostat")
        )
    }
}