package com.example.busschedule.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

interface BusScheduleRepository {

    /** Retrieve all items from the given data source */
    fun getAllBusScheduleStream(): Flow<List<BusSchedule>>

    /** Retrieve an item from the given data source that matches with the [id] */
    fun getBusScheduleStream(id: Int): Flow<BusSchedule?>

    /** Insert item in the data source */
    suspend fun insertItem(busSchedule: BusSchedule)

    /** Update item in the data source */
    suspend fun updateItem(busSchedule: BusSchedule)

    /** Delete item from the data source */
    suspend fun deleteItem(busSchedule: BusSchedule)

}