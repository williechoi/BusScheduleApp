package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

class OfflineBusScheduleRepository(private val busScheduleDao: BusScheduleDao) :
    BusScheduleRepository {
    override fun getAllBusScheduleStream(): Flow<List<BusSchedule>> =
        busScheduleDao.getAllBusSchedule()

    override fun getBusScheduleStream(id: Int): Flow<BusSchedule?> =
        busScheduleDao.getBusSchedule(id)

    override suspend fun insertItem(busSchedule: BusSchedule) = busScheduleDao.insert(busSchedule)

    override suspend fun updateItem(busSchedule: BusSchedule) = busScheduleDao.update(busSchedule)

    override suspend fun deleteItem(busSchedule: BusSchedule) = busScheduleDao.delete(busSchedule)

}