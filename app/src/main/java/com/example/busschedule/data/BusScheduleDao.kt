package com.example.busschedule.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {

    /**
     * All database operations run in the separate thread.
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(busSchedule: BusSchedule)

    @Update
    suspend fun update(busSchedule: BusSchedule)

    @Delete
    suspend fun delete(busSchedule: BusSchedule)

    @Query("SELECT * from schedule WHERE id = :id")
    fun getBusSchedule(id: Int): Flow<BusSchedule>

    @Query("SELECT * from schedule ORDER BY arrival_time ASC")
    fun getAllBusSchedule(): Flow<List<BusSchedule>>

    @Query("SELECT * from schedule WHERE stop_name = :name ORDER BY arrival_time ASC")
    fun getByStopName(name: String): Flow<List<BusSchedule>>

}