package com.cg.hbm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.entity.RoomDetails;
import com.cg.hbm.repository.IRoomDetailsRepository;

@Service
public class IRoomDeatilsServiceImpl implements IRoomDetailsService{
	@Autowired
	IRoomDetailsRepository iDao;

	@Override
	public RoomDetails addRoomDetails(RoomDetails roomDetails) {
		iDao.saveAndFlush(roomDetails);
		return roomDetails;
	}

	@Override
	public RoomDetails updateRoomDetails(RoomDetails roomDetails) {
		iDao.saveAndFlush(roomDetails);
		return roomDetails;
	}

	@Override
	public RoomDetails removeRoomDetails(RoomDetails roomDetails) {
		iDao.deleteById(roomDetails.getRoom_id());
		return roomDetails;
	}

	@Override
	public List<RoomDetails> showAllRoomDetails() {
		return iDao.findAll();
	}

	@Override
	public RoomDetails showRoomDetails(int roomDetails_id) {
		return iDao.findById(roomDetails_id).get();
	}

}
